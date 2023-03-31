package com.samsung.android.sdk.pass;

import android.util.Log;
import com.samsung.android.fingerprint.FingerprintManager;
import com.samsung.android.sdk.pass.SpassFingerprint;

final class d implements FingerprintManager.EnrollFinishListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SpassFingerprint.RegisterListener f6064a;

    d(SpassFingerprint.RegisterListener registerListener) {
        this.f6064a = registerListener;
    }

    public final void onEnrollFinish() {
        Log.d(SpassFingerprint.TAG, "onEnrollFinish called");
        this.f6064a.onFinished();
    }
}
