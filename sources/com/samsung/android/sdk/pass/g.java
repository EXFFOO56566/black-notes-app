package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* access modifiers changed from: package-private */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ SpassFingerprint.c f6070a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FingerprintEvent f6071b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ SpassFingerprint.IdentifyListener f6072c;

    g(SpassFingerprint.c cVar, FingerprintEvent fingerprintEvent, SpassFingerprint.IdentifyListener identifyListener) {
        this.f6070a = cVar;
        this.f6071b = fingerprintEvent;
        this.f6072c = identifyListener;
    }

    public final void run() {
        if (this.f6071b.eventId == 13) {
            SpassFingerprint.a(SpassFingerprint.this, this.f6072c, this.f6071b, -1);
            this.f6072c.onCompleted();
        }
    }
}
