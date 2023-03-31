package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public class z32 extends b42 implements mt {
    private String i;
    private boolean j;

    public z32(String str) {
        this.i = str;
    }

    @Override // com.google.android.gms.internal.ads.b42
    public final void a(d42 d42, long j2, ls lsVar) {
        this.f1861c = d42;
        this.e = d42.position();
        if (!this.j) {
            int i2 = ((8 + j2) > 4294967296L ? 1 : ((8 + j2) == 4294967296L ? 0 : -1));
        }
        d42.b(d42.position() + j2);
        this.f = d42.position();
        this.f1860b = lsVar;
    }

    @Override // com.google.android.gms.internal.ads.mt
    public final void a(d42 d42, ByteBuffer byteBuffer, long j2, ls lsVar) {
        d42.position();
        byteBuffer.remaining();
        this.j = byteBuffer.remaining() == 16;
        a(d42, j2, lsVar);
    }

    @Override // com.google.android.gms.internal.ads.mt
    public final void a(mw mwVar) {
    }

    @Override // com.google.android.gms.internal.ads.mt
    public final String m() {
        return this.i;
    }
}
