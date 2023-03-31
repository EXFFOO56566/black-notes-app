package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

public final class oy extends c42 {
    private Date k;
    private Date l;
    private long m;
    private long n;
    private double o = 1.0d;
    private float p = 1.0f;
    private m42 q = m42.j;
    private long r;

    public oy() {
        super("mvhd");
    }

    @Override // com.google.android.gms.internal.ads.a42
    public final void a(ByteBuffer byteBuffer) {
        long j;
        b(byteBuffer);
        if (b() == 1) {
            this.k = f42.a(mu.c(byteBuffer));
            this.l = f42.a(mu.c(byteBuffer));
            this.m = mu.a(byteBuffer);
            j = mu.c(byteBuffer);
        } else {
            this.k = f42.a(mu.a(byteBuffer));
            this.l = f42.a(mu.a(byteBuffer));
            this.m = mu.a(byteBuffer);
            j = mu.a(byteBuffer);
        }
        this.n = j;
        this.o = mu.d(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.p = ((float) ((short) ((bArr[1] & 255) | ((short) (0 | ((bArr[0] << 8) & 65280)))))) / 256.0f;
        mu.b(byteBuffer);
        mu.a(byteBuffer);
        mu.a(byteBuffer);
        this.q = m42.a(byteBuffer);
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.r = mu.a(byteBuffer);
    }

    public final long c() {
        return this.n;
    }

    public final long d() {
        return this.m;
    }

    public final String toString() {
        return "MovieHeaderBox[" + "creationTime=" + this.k + ";" + "modificationTime=" + this.l + ";" + "timescale=" + this.m + ";" + "duration=" + this.n + ";" + "rate=" + this.o + ";" + "volume=" + this.p + ";" + "matrix=" + this.q + ";" + "nextTrackId=" + this.r + "]";
    }
}
