package com.samsung.android.sdk.pass;

import com.samsung.android.sdk.pass.SpassFingerprint;

/* access modifiers changed from: package-private */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ SpassFingerprint f6059a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ SpassFingerprint.IdentifyListener f6060b;

    a(SpassFingerprint spassFingerprint, SpassFingerprint.IdentifyListener identifyListener) {
        this.f6059a = spassFingerprint;
        this.f6060b = identifyListener;
    }

    public final void run() {
        SpassFingerprint.a(this.f6059a, this.f6060b, null, 8);
        this.f6060b.onCompleted();
    }
}
