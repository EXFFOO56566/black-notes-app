package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* access modifiers changed from: package-private */
@TargetApi(19)
public final class g92 extends h92 {
    private final AudioTimestamp j = new AudioTimestamp();
    private long k;
    private long l;
    private long m;

    public g92() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.h92
    public final void a(AudioTrack audioTrack, boolean z) {
        super.a(audioTrack, z);
        this.k = 0;
        this.l = 0;
        this.m = 0;
    }

    @Override // com.google.android.gms.internal.ads.h92
    public final boolean b() {
        boolean timestamp = this.f2883a.getTimestamp(this.j);
        if (timestamp) {
            long j2 = this.j.framePosition;
            if (this.l > j2) {
                this.k++;
            }
            this.l = j2;
            this.m = j2 + (this.k << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.h92
    public final long c() {
        return this.j.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.h92
    public final long d() {
        return this.m;
    }
}
