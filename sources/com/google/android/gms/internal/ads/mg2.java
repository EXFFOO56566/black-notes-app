package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class mg2 extends ec2 {
    private static final int[] B0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private int A0;
    private final Context V;
    private final qg2 W;
    private final rg2 X;
    private final long Y;
    private final int Z;
    private final boolean a0;
    private final long[] b0;
    private e82[] c0;
    private og2 d0;
    private Surface e0;
    private Surface f0;
    private int g0;
    private boolean h0;
    private long i0;
    private long j0;
    private int k0;
    private int l0;
    private int m0;
    private float n0;
    private int o0;
    private int p0;
    private int q0;
    private float r0;
    private int s0;
    private int t0;
    private int u0;
    private float v0;
    private boolean w0;
    private int x0;
    ng2 y0;
    private long z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private mg2(Context context, gc2 gc2, long j, ga2<ia2> ga2, boolean z, sk1 sk1, sg2 sg2, int i) {
        super(2, gc2, null, false);
        boolean z2 = false;
        this.Y = 0;
        this.Z = -1;
        this.V = context.getApplicationContext();
        this.W = new qg2(context);
        this.X = new rg2(sk1, sg2);
        if (ag2.f1751a <= 22 && "foster".equals(ag2.f1752b) && "NVIDIA".equals(ag2.f1753c)) {
            z2 = true;
        }
        this.a0 = z2;
        this.b0 = new long[10];
        this.z0 = -9223372036854775807L;
        this.i0 = -9223372036854775807L;
        this.o0 = -1;
        this.p0 = -1;
        this.r0 = -1.0f;
        this.n0 = -1.0f;
        this.g0 = 1;
        r();
    }

    public mg2(Context context, gc2 gc2, long j, sk1 sk1, sg2 sg2, int i) {
        this(context, gc2, 0, null, false, sk1, sg2, -1);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(String str, int i, int i2) {
        char c2;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (!(c2 == 0 || c2 == 1)) {
            if (c2 != 2) {
                if (c2 != 3) {
                    if (c2 != 4 && c2 != 5) {
                        return -1;
                    }
                    i3 = i * i2;
                    return (i3 * 3) / (i4 * 2);
                }
            } else if ("BRAVIA 4K 2015".equals(ag2.d)) {
                return -1;
            } else {
                i3 = ((ag2.a(i, 16) * ag2.a(i2, 16)) << 4) << 4;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    private final void a(MediaCodec mediaCodec, int i, long j) {
        bg2.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        bg2.a();
        this.T.e++;
    }

    @TargetApi(21)
    private final void a(MediaCodec mediaCodec, int i, long j, long j2) {
        s();
        bg2.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        bg2.a();
        this.T.d++;
        this.l0 = 0;
        o();
    }

    private static boolean a(boolean z, e82 e82, e82 e822) {
        if (!e82.g.equals(e822.g) || d(e82) != d(e822)) {
            return false;
        }
        if (!z) {
            return e82.k == e822.k && e82.l == e822.l;
        }
        return true;
    }

    private final void b(MediaCodec mediaCodec, int i, long j) {
        s();
        bg2.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        bg2.a();
        this.T.d++;
        this.l0 = 0;
        o();
    }

    private final boolean b(boolean z) {
        if (ag2.f1751a < 23 || this.w0) {
            return false;
        }
        return !z || ig2.a(this.V);
    }

    private static int c(e82 e82) {
        int i = e82.h;
        return i != -1 ? i : a(e82.g, e82.k, e82.l);
    }

    private static boolean c(long j) {
        return j < -30000;
    }

    private static int d(e82 e82) {
        int i = e82.n;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private final void p() {
        this.i0 = this.Y > 0 ? SystemClock.elapsedRealtime() + this.Y : -9223372036854775807L;
    }

    private final void q() {
        MediaCodec l;
        this.h0 = false;
        if (ag2.f1751a >= 23 && this.w0 && (l = l()) != null) {
            this.y0 = new ng2(this, l);
        }
    }

    private final void r() {
        this.s0 = -1;
        this.t0 = -1;
        this.v0 = -1.0f;
        this.u0 = -1;
    }

    private final void s() {
        if (this.s0 != this.o0 || this.t0 != this.p0 || this.u0 != this.q0 || this.v0 != this.r0) {
            this.X.a(this.o0, this.p0, this.q0, this.r0);
            this.s0 = this.o0;
            this.t0 = this.p0;
            this.u0 = this.q0;
            this.v0 = this.r0;
        }
    }

    private final void t() {
        if (this.s0 != -1 || this.t0 != -1) {
            this.X.a(this.o0, this.p0, this.q0, this.r0);
        }
    }

    private final void u() {
        if (this.k0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.X.a(this.k0, elapsedRealtime - this.j0);
            this.k0 = 0;
            this.j0 = elapsedRealtime;
        }
    }

    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.j82
    public final boolean D() {
        Surface surface;
        if (super.D() && (this.h0 || (((surface = this.f0) != null && this.e0 == surface) || l() == null))) {
            this.i0 = -9223372036854775807L;
            return true;
        } else if (this.i0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.i0) {
                return true;
            }
            this.i0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final int a(gc2 gc2, e82 e82) {
        boolean z;
        int i;
        int i2;
        String str = e82.g;
        int i3 = 0;
        if (!tf2.b(str)) {
            return 0;
        }
        ba2 ba2 = e82.j;
        if (ba2 != null) {
            z = false;
            for (int i4 = 0; i4 < ba2.d; i4++) {
                z |= ba2.a(i4).f;
            }
        } else {
            z = false;
        }
        fc2 a2 = gc2.a(str, z);
        boolean z2 = true;
        if (a2 == null) {
            return 1;
        }
        boolean a3 = a2.a(e82.d);
        if (a3 && (i = e82.k) > 0 && (i2 = e82.l) > 0) {
            if (ag2.f1751a >= 21) {
                a3 = a2.a(i, i2, (double) e82.m);
            } else {
                if (i * i2 > ic2.b()) {
                    z2 = false;
                }
                if (!z2) {
                    int i5 = e82.k;
                    int i6 = e82.l;
                    String str2 = ag2.e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
                a3 = z2;
            }
        }
        int i7 = a2.f2573b ? 8 : 4;
        if (a2.f2574c) {
            i3 = 16;
        }
        return (a3 ? 3 : 2) | i7 | i3;
    }

    @Override // com.google.android.gms.internal.ads.t72, com.google.android.gms.internal.ads.n72
    public final void a(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f0;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    fc2 m = m();
                    if (m != null && b(m.d)) {
                        surface = ig2.a(this.V, m.d);
                        this.f0 = surface;
                    }
                }
            }
            if (this.e0 != surface) {
                this.e0 = surface;
                int state = getState();
                if (state == 1 || state == 2) {
                    MediaCodec l = l();
                    if (ag2.f1751a < 23 || l == null || surface == null) {
                        n();
                        k();
                    } else {
                        l.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f0) {
                    r();
                    q();
                    return;
                }
                t();
                q();
                if (state == 2) {
                    p();
                }
            } else if (surface != null && surface != this.f0) {
                t();
                if (this.h0) {
                    this.X.a(this.e0);
                }
            }
        } else if (i == 4) {
            this.g0 = ((Integer) obj).intValue();
            MediaCodec l2 = l();
            if (l2 != null) {
                l2.setVideoScalingMode(this.g0);
            }
        } else {
            super.a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.n72
    public final void a(long j, boolean z) {
        super.a(j, z);
        q();
        this.l0 = 0;
        int i = this.A0;
        if (i != 0) {
            this.z0 = this.b0[i - 1];
            this.A0 = 0;
        }
        if (z) {
            p();
        } else {
            this.i0 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.o0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.p0 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.r0 = this.n0;
        if (ag2.f1751a >= 21) {
            int i = this.m0;
            if (i == 90 || i == 270) {
                int i2 = this.o0;
                this.o0 = this.p0;
                this.p0 = i2;
                this.r0 = 1.0f / this.r0;
            }
        } else {
            this.q0 = this.m0;
        }
        mediaCodec.setVideoScalingMode(this.g0);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void a(ca2 ca2) {
        if (ag2.f1751a < 23 && this.w0) {
            o();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void a(fc2 fc2, MediaCodec mediaCodec, e82 e82, MediaCrypto mediaCrypto) {
        og2 og2;
        Point point;
        e82[] e82Arr = this.c0;
        int i = e82.k;
        int i2 = e82.l;
        int c2 = c(e82);
        if (e82Arr.length == 1) {
            og2 = new og2(i, i2, c2);
        } else {
            boolean z = false;
            for (e82 e822 : e82Arr) {
                if (a(fc2.f2573b, e82, e822)) {
                    z |= e822.k == -1 || e822.l == -1;
                    i = Math.max(i, e822.k);
                    i2 = Math.max(i2, e822.l);
                    c2 = Math.max(c2, c(e822));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = e82.l > e82.k;
                int i3 = z2 ? e82.l : e82.k;
                int i4 = z2 ? e82.k : e82.l;
                float f = ((float) i4) / ((float) i3);
                int[] iArr = B0;
                int length = iArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    int i6 = iArr[i5];
                    int i7 = (int) (((float) i6) * f);
                    if (i6 <= i3 || i7 <= i4) {
                        break;
                    }
                    if (ag2.f1751a >= 21) {
                        int i8 = z2 ? i7 : i6;
                        if (!z2) {
                            i6 = i7;
                        }
                        Point a2 = fc2.a(i8, i6);
                        if (fc2.a(a2.x, a2.y, (double) e82.m)) {
                            point = a2;
                            break;
                        }
                    } else {
                        int a3 = ag2.a(i6, 16) << 4;
                        int a4 = ag2.a(i7, 16) << 4;
                        if (a3 * a4 <= ic2.b()) {
                            int i9 = z2 ? a4 : a3;
                            if (!z2) {
                                a3 = a4;
                            }
                            point = new Point(i9, a3);
                        }
                    }
                    i5++;
                    length = length;
                    iArr = iArr;
                    i3 = i3;
                    i4 = i4;
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    c2 = Math.max(c2, a(e82.g, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            og2 = new og2(i, i2, c2);
        }
        this.d0 = og2;
        boolean z3 = this.a0;
        int i10 = this.x0;
        MediaFormat b2 = e82.b();
        b2.setInteger("max-width", og2.f3990a);
        b2.setInteger("max-height", og2.f3991b);
        int i11 = og2.f3992c;
        if (i11 != -1) {
            b2.setInteger("max-input-size", i11);
        }
        if (z3) {
            b2.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            b2.setFeatureEnabled("tunneled-playback", true);
            b2.setInteger("audio-session-id", i10);
        }
        if (this.e0 == null) {
            mf2.b(b(fc2.d));
            if (this.f0 == null) {
                this.f0 = ig2.a(this.V, fc2.d);
            }
            this.e0 = this.f0;
        }
        mediaCodec.configure(b2, this.e0, (MediaCrypto) null, 0);
        if (ag2.f1751a >= 23 && this.w0) {
            this.y0 = new ng2(this, mediaCodec);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void a(String str, long j, long j2) {
        this.X.a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.n72
    public final void a(boolean z) {
        super.a(z);
        int i = h().f3508a;
        this.x0 = i;
        this.w0 = i != 0;
        this.X.a(this.T);
        this.W.b();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.n72
    public final void a(e82[] e82Arr, long j) {
        this.c0 = e82Arr;
        if (this.z0 == -9223372036854775807L) {
            this.z0 = j;
        } else {
            int i = this.A0;
            long[] jArr = this.b0;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.A0 = i + 1;
            }
            this.b0[this.A0 - 1] = j;
        }
        super.a(e82Arr, j);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.A0;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.b0;
            if (j3 < jArr[0]) {
                break;
            }
            this.z0 = jArr[0];
            int i4 = i3 - 1;
            this.A0 = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j4 = j3 - this.z0;
        if (z) {
            a(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.e0 == this.f0) {
            if (!c(j5)) {
                return false;
            }
            a(mediaCodec, i, j4);
            return true;
        } else if (!this.h0) {
            if (ag2.f1751a >= 21) {
                a(mediaCodec, i, j4, System.nanoTime());
            } else {
                b(mediaCodec, i, j4);
            }
            return true;
        } else if (getState() != 2) {
            return false;
        } else {
            long elapsedRealtime = j5 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long a2 = this.W.a(j3, (elapsedRealtime * 1000) + nanoTime);
            long j6 = (a2 - nanoTime) / 1000;
            if (c(j6)) {
                bg2.a("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i, false);
                bg2.a();
                y92 y92 = this.T;
                y92.f++;
                this.k0++;
                int i5 = this.l0 + 1;
                this.l0 = i5;
                y92.g = Math.max(i5, y92.g);
                if (this.k0 == this.Z) {
                    u();
                }
                return true;
            }
            if (ag2.f1751a >= 21) {
                if (j6 < 50000) {
                    a(mediaCodec, i, j4, a2);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                b(mediaCodec, i, j4);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final boolean a(MediaCodec mediaCodec, boolean z, e82 e82, e82 e822) {
        if (!a(z, e82, e822)) {
            return false;
        }
        int i = e822.k;
        og2 og2 = this.d0;
        return i <= og2.f3990a && e822.l <= og2.f3991b && e822.h <= og2.f3992c;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final boolean a(fc2 fc2) {
        return this.e0 != null || b(fc2.d);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void b(e82 e82) {
        super.b(e82);
        this.X.a(e82);
        float f = e82.o;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.n0 = f;
        this.m0 = d(e82);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.n72
    public final void e() {
        super.e();
        this.k0 = 0;
        this.j0 = SystemClock.elapsedRealtime();
        this.i0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.n72
    public final void f() {
        u();
        super.f();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2, com.google.android.gms.internal.ads.n72
    public final void g() {
        this.o0 = -1;
        this.p0 = -1;
        this.r0 = -1.0f;
        this.n0 = -1.0f;
        this.z0 = -9223372036854775807L;
        this.A0 = 0;
        r();
        q();
        this.W.a();
        this.y0 = null;
        this.w0 = false;
        try {
            super.g();
        } finally {
            this.T.a();
            this.X.b(this.T);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ec2
    public final void n() {
        try {
            super.n();
        } finally {
            Surface surface = this.f0;
            if (surface != null) {
                if (this.e0 == surface) {
                    this.e0 = null;
                }
                this.f0.release();
                this.f0 = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        if (!this.h0) {
            this.h0 = true;
            this.X.a(this.e0);
        }
    }
}
