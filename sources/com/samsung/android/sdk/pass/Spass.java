package com.samsung.android.sdk.pass;

import android.content.Context;
import android.util.Log;
import com.samsung.android.sdk.SsdkInterface;
import com.samsung.android.sdk.SsdkUnsupportedException;
import com.samsung.android.sdk.SsdkVendorCheck;

public class Spass implements SsdkInterface {
    public static final int DEVICE_FINGERPRINT = 0;
    public static final int DEVICE_FINGERPRINT_AVAILABLE_PASSWORD = 4;
    public static final int DEVICE_FINGERPRINT_CUSTOMIZED_DIALOG = 2;
    public static final int DEVICE_FINGERPRINT_FINGER_INDEX = 1;
    public static final int DEVICE_FINGERPRINT_UNIQUE_ID = 3;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6045a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6046b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6047c = false;
    private static boolean d = false;
    private Context e;

    @Override // com.samsung.android.sdk.SsdkInterface
    public int getVersionCode() {
        return 12;
    }

    @Override // com.samsung.android.sdk.SsdkInterface
    public String getVersionName() {
        return "1.2.6";
    }

    @Override // com.samsung.android.sdk.SsdkInterface
    public void initialize(Context context) {
        if (this.e == null) {
            if (context == null) {
                throw new IllegalArgumentException("context passed is null.");
            } else if (SsdkVendorCheck.isSamsungDevice()) {
                try {
                    boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("com.sec.feature.fingerprint_manager_service");
                    f6045a = hasSystemFeature;
                    if (hasSystemFeature) {
                        SpassFingerprint spassFingerprint = new SpassFingerprint(context);
                        f6047c = SpassFingerprint.a();
                        f6046b = spassFingerprint.b();
                        d = spassFingerprint.c();
                        this.e = context;
                        Log.i(SpassFingerprint.TAG, "initialize : BP=" + d + ",CD=" + f6047c + ",ID=" + f6046b + ",GT=false");
                        SpassFingerprint.a(context, null);
                        return;
                    }
                    throw new SsdkUnsupportedException("This device does not provide FingerprintService.", 1);
                } catch (NullPointerException unused) {
                    throw new IllegalArgumentException("context is not valid.");
                }
            } else {
                throw new SsdkUnsupportedException("This is not Samsung device.", 0);
            }
        }
    }

    @Override // com.samsung.android.sdk.SsdkInterface
    public boolean isFeatureEnabled(int i) {
        if (this.e == null) {
            throw new IllegalStateException("initialize() is not Called first.");
        } else if (i == 0) {
            return f6045a;
        } else {
            if (i == 1 || i == 2) {
                return f6047c;
            }
            if (i == 3) {
                return f6046b;
            }
            if (i == 4) {
                return d;
            }
            throw new IllegalArgumentException("type passed is not valid");
        }
    }
}
