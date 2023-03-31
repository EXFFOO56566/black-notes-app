package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class o92 extends ec2 implements qf2 {
    private final v82 V;
    private final f92 W;
    private boolean X;
    private boolean Y;
    private MediaFormat Z;
    private int a0;
    private int b0;
    private long c0;
    private boolean d0;

    public o92(gc2 gc2) {
        this(gc2, null, true);
    }

    private o92(gc2 gc2, ga2<ia2> ga2, boolean z) {
        this(gc2, null, true, null, null);
    }

    private o92(gc2 gc2, ga2<ia2> ga2, boolean z, sk1 sk1, w82 w82) {
        this(gc2, null, true, null, null, null, new u82[0]);
    }

    private o92(gc2 gc2, ga2<ia2> ga2, boolean z, sk1 sk1, w82 w82, r82 r82, u82... u82Arr) {
        super(1, gc2, ga2, z);
        this.W = new f92(null, u82Arr, new q92(this));
        this.V = new v82(null, null);
    }

    protected static void a(int i, long j, long j2) {
    }

    private final boolean a(String str) {
        return this.W.a(str);
    }

    protected static void b(int i) {
    }

    protected static void o() {
    }

    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.j82
    public final boolean D() {
        return this.W.h() || super.D();
    }

    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.j82
    public final boolean E() {
        return super.E() && this.W.e();
    }

    @Override // com.google.android.gms.internal.ads.j82, com.google.android.gms.internal.ads.n72
    public final qf2 J() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final int a(gc2 gc2, e82 e82) {
        int i;
        int i2;
        String str = e82.g;
        boolean z = false;
        if (!tf2.a(str)) {
            return 0;
        }
        int i3 = ag2.f1751a >= 21 ? 16 : 0;
        int i4 = 3;
        if (a(str) && gc2.a() != null) {
            return i3 | 4 | 3;
        }
        fc2 a2 = gc2.a(str, false);
        if (a2 == null) {
            return 1;
        }
        if (ag2.f1751a < 21 || (((i = e82.t) == -1 || a2.a(i)) && ((i2 = e82.s) == -1 || a2.b(i2)))) {
            z = true;
        }
        if (!z) {
            i4 = 2;
        }
        return i3 | 4 | i4;
    }

    @Override // com.google.android.gms.internal.ads.qf2
    public final long a() {
        long a2 = this.W.a(E());
        if (a2 != Long.MIN_VALUE) {
            if (!this.d0) {
                a2 = Math.max(this.c0, a2);
            }
            this.c0 = a2;
            this.d0 = false;
        }
        return this.c0;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final fc2 a(gc2 gc2, e82 e82, boolean z) {
        fc2 a2;
        if (!a(e82.g) || (a2 = gc2.a()) == null) {
            this.X = false;
            return super.a(gc2, e82, z);
        }
        this.X = true;
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.qf2
    public final k82 a(k82 k82) {
        return this.W.a(k82);
    }

    @Override // com.google.android.gms.internal.ads.t72, com.google.android.gms.internal.ads.n72
    public final void a(int i, Object obj) {
        if (i == 2) {
            this.W.a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.a(i, obj);
        } else {
            this.W.a(((Integer) obj).intValue());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.n72
    public final void a(long j, boolean z) {
        super.a(j, z);
        this.W.d();
        this.c0 = j;
        this.d0 = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int[] iArr;
        int i;
        boolean z = this.Z != null;
        String string = z ? this.Z.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.Z;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.Y || integer != 6 || (i = this.b0) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.b0; i2++) {
                iArr[i2] = i2;
            }
        }
        try {
            this.W.a(string, integer, integer2, this.a0, 0, iArr);
        } catch (j92 e) {
            throw o72.a(e, d());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void a(fc2 fc2, MediaCodec mediaCodec, e82 e82, MediaCrypto mediaCrypto) {
        this.Y = ag2.f1751a < 24 && "OMX.SEC.aac.dec".equals(fc2.f2572a) && "samsung".equals(ag2.f1753c) && (ag2.f1752b.startsWith("zeroflte") || ag2.f1752b.startsWith("herolte") || ag2.f1752b.startsWith("heroqlte"));
        if (this.X) {
            MediaFormat b2 = e82.b();
            this.Z = b2;
            b2.setString("mime", "audio/raw");
            mediaCodec.configure(this.Z, (Surface) null, (MediaCrypto) null, 0);
            this.Z.setString("mime", e82.g);
            return;
        }
        mediaCodec.configure(e82.b(), (Surface) null, (MediaCrypto) null, 0);
        this.Z = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void a(String str, long j, long j2) {
        this.V.a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.n72
    public final void a(boolean z) {
        super.a(z);
        this.V.a(this.T);
        int i = h().f3508a;
        if (i != 0) {
            this.W.b(i);
        } else {
            this.W.j();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.X && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.T.e++;
            this.W.f();
            return true;
        } else {
            try {
                if (!this.W.a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.T.d++;
                return true;
            } catch (i92 | n92 e) {
                throw o72.a(e, d());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qf2
    public final k82 b() {
        return this.W.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void b(e82 e82) {
        super.b(e82);
        this.V.a(e82);
        this.a0 = "audio/raw".equals(e82.g) ? e82.u : 2;
        this.b0 = e82.s;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.n72
    public final void e() {
        super.e();
        this.W.b();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.n72
    public final void f() {
        this.W.a();
        super.f();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.n72
    public final void g() {
        try {
            this.W.c();
            try {
                super.g();
            } finally {
                this.T.a();
                this.V.b(this.T);
            }
        } catch (Throwable th) {
            super.g();
            throw th;
        } finally {
            this.T.a();
            this.V.b(this.T);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void j() {
        try {
            this.W.g();
        } catch (n92 e) {
            throw o72.a(e, d());
        }
    }
}
