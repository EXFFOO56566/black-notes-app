package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ SpassFingerprint.c f6068a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FingerprintEvent f6069b;

    f(SpassFingerprint.c cVar, FingerprintEvent fingerprintEvent) {
        this.f6068a = cVar;
        this.f6069b = fingerprintEvent;
    }

    public final void run() {
        if (this.f6068a.f6055a != null) {
            int i = this.f6069b.eventId;
            if (i == 11) {
                this.f6068a.f6055a.onReady();
            } else if (i == 12) {
                this.f6068a.f6055a.onStarted();
            }
        }
    }
}
