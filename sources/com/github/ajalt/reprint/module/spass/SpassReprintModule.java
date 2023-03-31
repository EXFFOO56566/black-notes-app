package com.github.ajalt.reprint.module.spass;

import a.g.h.a;
import android.content.Context;
import b.b.a.b.a.b;
import b.b.a.b.a.c;
import b.b.a.b.a.e;
import com.samsung.android.sdk.pass.Spass;
import com.samsung.android.sdk.pass.SpassFingerprint;

public class SpassReprintModule implements e {
    public static final int STATUS_AUTHENTICATION_FAILED = 16;
    public static final int STATUS_AUTHENTICATION_SUCCESS = 0;
    public static final int STATUS_HW_UNAVAILABLE = 1002;
    public static final int STATUS_LOCKED_OUT = 1003;
    public static final int STATUS_NO_REGISTERED_FINGERPRINTS = 1001;
    public static final int STATUS_QUALITY_FAILED = 12;
    public static final int STATUS_SENSOR_FAILED = 7;
    public static final int STATUS_TIMEOUT_FAILED = 4;
    public static final int STATUS_USER_CANCELLED = 8;
    public static final int TAG = 2;
    private final Context context;
    private final c.a logger;
    private final Spass spass;
    private SpassFingerprint spassFingerprint;

    public SpassReprintModule(Context context2, c.a aVar) {
        Spass spass2;
        this.context = context2.getApplicationContext();
        this.logger = aVar;
        try {
            spass2 = new Spass();
            spass2.initialize(this.context);
        } catch (SecurityException e) {
            throw e;
        } catch (Exception unused) {
            spass2 = null;
        }
        this.spass = spass2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void authenticate(final a aVar, final b bVar, final c.b bVar2, final int i) {
        if (this.spassFingerprint == null) {
            this.spassFingerprint = new SpassFingerprint(this.context);
        }
        try {
            if (!this.spassFingerprint.hasRegisteredFinger()) {
                bVar.a(b.b.a.b.a.a.NO_FINGERPRINTS_REGISTERED, true, this.context.getString(R.string.fingerprint_error_hw_not_available), 2, 1001);
                return;
            }
            cancelFingerprintRequest(this.spassFingerprint);
            try {
                this.spassFingerprint.startIdentify(new SpassFingerprint.IdentifyListener() {
                    /* class com.github.ajalt.reprint.module.spass.SpassReprintModule.AnonymousClass1 */

                    private void fail(b.b.a.b.a.a aVar, boolean z, int i, int i2) {
                        fail(aVar, z, SpassReprintModule.this.context.getString(i), i2);
                    }

                    private void fail(b.b.a.b.a.a aVar, boolean z, String str, int i) {
                        bVar.a(aVar, z, str, 2, i);
                        if ((!z || aVar == b.b.a.b.a.a.TIMEOUT) && bVar2.a(aVar, i)) {
                            SpassReprintModule.this.authenticate(aVar, bVar, bVar2, i + 1);
                        }
                    }

                    @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
                    public void onCompleted() {
                    }

                    @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
                    public void onFinished(int i) {
                        int i2;
                        b.b.a.b.a.a aVar;
                        b.b.a.b.a.a aVar2;
                        int i3;
                        if (i != 0) {
                            if (i != 4) {
                                if (i == 12) {
                                    aVar2 = b.b.a.b.a.a.SENSOR_FAILED;
                                    i3 = R.string.fingerprint_acquired_partial;
                                } else if (i == 16) {
                                    aVar2 = b.b.a.b.a.a.AUTHENTICATION_FAILED;
                                    i3 = R.string.fingerprint_not_recognized;
                                } else if (i != 100) {
                                    if (i == 7) {
                                        aVar2 = b.b.a.b.a.a.SENSOR_FAILED;
                                        i3 = R.string.fingerprint_acquired_insufficient;
                                    } else if (i != 8) {
                                        aVar = b.b.a.b.a.a.UNKNOWN;
                                        i2 = R.string.fingerprint_error_hw_not_available;
                                    } else {
                                        return;
                                    }
                                }
                                fail(aVar2, false, i3, i);
                                return;
                            }
                            aVar = b.b.a.b.a.a.TIMEOUT;
                            i2 = R.string.fingerprint_error_timeout;
                            fail(aVar, true, i2, i);
                            return;
                        }
                        bVar.a(2);
                    }

                    @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
                    public void onReady() {
                    }

                    @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
                    public void onStarted() {
                    }
                });
                aVar.a(new a.AbstractC0010a() {
                    /* class com.github.ajalt.reprint.module.spass.SpassReprintModule.AnonymousClass2 */

                    @Override // a.g.h.a.AbstractC0010a
                    public void onCancel() {
                        SpassReprintModule.cancelFingerprintRequest(SpassReprintModule.this.spassFingerprint);
                    }
                });
            } catch (Throwable th) {
                this.logger.a(th, "SpassReprintModule: fingerprint identification would not start");
                bVar.a(b.b.a.b.a.a.LOCKED_OUT, true, null, 2, STATUS_LOCKED_OUT);
            }
        } catch (Throwable unused) {
            bVar.a(b.b.a.b.a.a.HARDWARE_UNAVAILABLE, true, this.context.getString(R.string.fingerprint_error_hw_not_available), 2, STATUS_HW_UNAVAILABLE);
        }
    }

    /* access modifiers changed from: private */
    public static void cancelFingerprintRequest(SpassFingerprint spassFingerprint2) {
        try {
            spassFingerprint2.cancelIdentify();
        } catch (Throwable unused) {
        }
    }

    @Override // b.b.a.b.a.e
    public void authenticate(a aVar, b bVar, c.b bVar2) {
        authenticate(aVar, bVar, bVar2, 0);
    }

    @Override // b.b.a.b.a.e
    public boolean hasFingerprintRegistered() {
        try {
            if (!isHardwarePresent()) {
                return false;
            }
            if (this.spassFingerprint == null) {
                this.spassFingerprint = new SpassFingerprint(this.context);
            }
            return this.spassFingerprint.hasRegisteredFinger();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // b.b.a.b.a.e
    public boolean isHardwarePresent() {
        try {
            return this.spass != null && this.spass.isFeatureEnabled(0);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // b.b.a.b.a.e
    public int tag() {
        return 2;
    }
}
