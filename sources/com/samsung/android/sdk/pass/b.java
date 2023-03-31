package com.samsung.android.sdk.pass;

import com.samsung.android.sdk.pass.SpassFingerprint;

/* access modifiers changed from: package-private */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ SpassFingerprint f6061a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ SpassFingerprint.IdentifyListener f6062b;

    b(SpassFingerprint spassFingerprint, SpassFingerprint.IdentifyListener identifyListener) {
        this.f6061a = spassFingerprint;
        this.f6062b = identifyListener;
    }

    public final void run() {
        SpassFingerprint.a(this.f6061a, this.f6062b, null, 7);
        this.f6062b.onCompleted();
    }
}
