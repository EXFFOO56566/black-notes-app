package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* access modifiers changed from: package-private */
public final class e92 extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AudioTrack f2388b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f92 f2389c;

    e92(f92 f92, AudioTrack audioTrack) {
        this.f2389c = f92;
        this.f2388b = audioTrack;
    }

    public final void run() {
        try {
            this.f2388b.flush();
            this.f2388b.release();
        } finally {
            this.f2389c.f.open();
        }
    }
}
