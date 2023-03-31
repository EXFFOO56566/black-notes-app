package com.github.ajalt.reprint.module.marshmallow;

import a.g.h.a;
import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import b.b.a.b.a.b;
import b.b.a.b.a.c;
import b.b.a.b.a.e;

@TargetApi(23)
public class MarshmallowReprintModule implements e {
    public static final int FINGERPRINT_ACQUIRED_GOOD = 0;
    public static final int FINGERPRINT_ACQUIRED_IMAGER_DIRTY = 3;
    public static final int FINGERPRINT_ACQUIRED_INSUFFICIENT = 2;
    public static final int FINGERPRINT_ACQUIRED_PARTIAL = 1;
    public static final int FINGERPRINT_ACQUIRED_TOO_FAST = 5;
    public static final int FINGERPRINT_ACQUIRED_TOO_SLOW = 4;
    public static final int FINGERPRINT_AUTHENTICATION_FAILED = 1001;
    public static final int FINGERPRINT_ERROR_CANCELED = 5;
    public static final int FINGERPRINT_ERROR_HW_UNAVAILABLE = 1;
    public static final int FINGERPRINT_ERROR_LOCKOUT = 7;
    public static final int FINGERPRINT_ERROR_NO_SPACE = 4;
    public static final int FINGERPRINT_ERROR_TIMEOUT = 3;
    public static final int FINGERPRINT_ERROR_UNABLE_TO_PROCESS = 2;
    public static final int TAG = 1;
    private final Context context;
    private final c.a logger;

    /* access modifiers changed from: package-private */
    public class AuthCallback extends FingerprintManager.AuthenticationCallback {
        private final a cancellationSignal;
        private b listener;
        private int restartCount;
        private final c.b restartPredicate;

        private AuthCallback(int i, c.b bVar, a aVar, b bVar2) {
            this.restartCount = i;
            this.restartPredicate = bVar;
            this.cancellationSignal = aVar;
            this.listener = bVar2;
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            if (this.listener != null) {
                b.b.a.b.a.a aVar = b.b.a.b.a.a.UNKNOWN;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            aVar = b.b.a.b.a.a.TIMEOUT;
                        } else if (i != 4) {
                            if (i == 5) {
                                return;
                            }
                            if (i == 7) {
                                aVar = b.b.a.b.a.a.LOCKED_OUT;
                            }
                        }
                    }
                    aVar = b.b.a.b.a.a.SENSOR_FAILED;
                } else {
                    aVar = b.b.a.b.a.a.HARDWARE_UNAVAILABLE;
                }
                if (i != 3 || !this.restartPredicate.a(aVar, this.restartCount)) {
                    this.listener.a(aVar, true, charSequence, 1, i);
                    this.listener = null;
                    return;
                }
                MarshmallowReprintModule.this.authenticate(this.cancellationSignal, this.listener, this.restartPredicate, this.restartCount);
            }
        }

        public void onAuthenticationFailed() {
            b bVar = this.listener;
            if (bVar != null) {
                bVar.a(b.b.a.b.a.a.AUTHENTICATION_FAILED, false, MarshmallowReprintModule.this.context.getString(b.b.a.a.a.fingerprint_not_recognized), 1, 1001);
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            if (this.listener != null) {
                c.b bVar = this.restartPredicate;
                b.b.a.b.a.a aVar = b.b.a.b.a.a.SENSOR_FAILED;
                int i2 = this.restartCount;
                this.restartCount = i2 + 1;
                if (!bVar.a(aVar, i2)) {
                    this.cancellationSignal.a();
                }
                this.listener.a(b.b.a.b.a.a.SENSOR_FAILED, false, charSequence, 1, i);
            }
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            b bVar = this.listener;
            if (bVar != null) {
                bVar.a(1);
                this.listener = null;
            }
        }
    }

    public MarshmallowReprintModule(Context context2, c.a aVar) {
        this.context = context2.getApplicationContext();
        this.logger = aVar;
    }

    private FingerprintManager fingerprintManager() {
        try {
            return (FingerprintManager) this.context.getSystemService(FingerprintManager.class);
        } catch (Exception e) {
            this.logger.a(e, "Could not get fingerprint system service on API that should support it.");
            return null;
        } catch (NoClassDefFoundError unused) {
            this.logger.a("FingerprintManager not available on this device");
            return null;
        }
    }

    @Override // b.b.a.b.a.e
    public void authenticate(a aVar, b bVar, c.b bVar2) {
        authenticate(aVar, bVar, bVar2, 0);
    }

    /* access modifiers changed from: package-private */
    public void authenticate(a aVar, b bVar, c.b bVar2, int i) {
        FingerprintManager fingerprintManager = fingerprintManager();
        if (fingerprintManager == null) {
            bVar.a(b.b.a.b.a.a.UNKNOWN, true, this.context.getString(b.b.a.a.a.fingerprint_error_hw_not_available), 1, 5);
            return;
        }
        try {
            fingerprintManager.authenticate(null, aVar == null ? null : (CancellationSignal) aVar.b(), 0, new AuthCallback(i, bVar2, aVar, bVar), null);
        } catch (NullPointerException e) {
            this.logger.a(e, "MarshmallowReprintModule: authenticate failed unexpectedly");
            bVar.a(b.b.a.b.a.a.UNKNOWN, true, this.context.getString(b.b.a.a.a.fingerprint_error_unable_to_process), 1, 5);
        }
    }

    @Override // b.b.a.b.a.e
    public boolean hasFingerprintRegistered() {
        FingerprintManager fingerprintManager = fingerprintManager();
        if (fingerprintManager == null) {
            return false;
        }
        try {
            return fingerprintManager.hasEnrolledFingerprints();
        } catch (IllegalStateException e) {
            this.logger.a(e, "MarshmallowReprintModule: hasEnrolledFingerprints failed unexpectedly");
            return false;
        }
    }

    @Override // b.b.a.b.a.e
    public boolean isHardwarePresent() {
        FingerprintManager fingerprintManager = fingerprintManager();
        if (fingerprintManager == null) {
            return false;
        }
        try {
            return fingerprintManager.isHardwareDetected();
        } catch (NullPointerException | SecurityException e) {
            this.logger.a(e, "MarshmallowReprintModule: isHardwareDetected failed unexpectedly");
            return false;
        }
    }

    @Override // b.b.a.b.a.e
    public int tag() {
        return 1;
    }
}
