package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ SpassFingerprint.b f6065a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FingerprintEvent f6066b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ SpassFingerprint.IdentifyListener f6067c;

    e(SpassFingerprint.b bVar, FingerprintEvent fingerprintEvent, SpassFingerprint.IdentifyListener identifyListener) {
        this.f6065a = bVar;
        this.f6066b = fingerprintEvent;
        this.f6067c = identifyListener;
    }

    public final void run() {
        int i = this.f6066b.eventId;
        if (i != 16) {
            if (i != 100000) {
                switch (i) {
                    case 11:
                        this.f6067c.onReady();
                        return;
                    case 12:
                        this.f6067c.onStarted();
                        return;
                    case 13:
                        SpassFingerprint.a(SpassFingerprint.this, this.f6067c, this.f6066b, -1);
                        if (!SpassFingerprint.o) {
                            this.f6067c.onCompleted();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                this.f6067c.onFinished(7);
                this.f6067c.onCompleted();
            }
        } else if (SpassFingerprint.o) {
            this.f6067c.onCompleted();
        }
    }
}
