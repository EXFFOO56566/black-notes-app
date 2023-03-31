package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public abstract class ec2 extends n72 {
    private static final byte[] U = ag2.e("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private ByteBuffer[] E;
    private ByteBuffer[] F;
    private long G;
    private int H;
    private int I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    protected y92 T;
    private final gc2 i;
    private final ga2<ia2> j;
    private final boolean k;
    private final ca2 l;
    private final ca2 m;
    private final g82 n;
    private final List<Long> o;
    private final MediaCodec.BufferInfo p;
    private e82 q;
    private ea2<ia2> r;
    private ea2<ia2> s;
    private MediaCodec t;
    private fc2 u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ec2(int i2, gc2 gc2, ga2<ia2> ga2, boolean z2) {
        super(i2);
        mf2.b(ag2.f1751a >= 16);
        mf2.a(gc2);
        this.i = gc2;
        this.j = ga2;
        this.k = z2;
        this.l = new ca2(0);
        this.m = new ca2(0);
        this.n = new g82();
        this.o = new ArrayList();
        this.p = new MediaCodec.BufferInfo();
        this.L = 0;
        this.M = 0;
    }

    private final void a(hc2 hc2) {
        throw o72.a(hc2, d());
    }

    private final boolean b(long j2, long j3) {
        boolean z2;
        boolean z3;
        if (this.I < 0) {
            if (!this.A || !this.O) {
                this.I = this.t.dequeueOutputBuffer(this.p, 0);
            } else {
                try {
                    this.I = this.t.dequeueOutputBuffer(this.p, 0);
                } catch (IllegalStateException unused) {
                    p();
                    if (this.Q) {
                        n();
                    }
                    return false;
                }
            }
            int i2 = this.I;
            if (i2 >= 0) {
                if (this.D) {
                    this.D = false;
                    this.t.releaseOutputBuffer(i2, false);
                    this.I = -1;
                    return true;
                }
                MediaCodec.BufferInfo bufferInfo = this.p;
                if ((bufferInfo.flags & 4) != 0) {
                    p();
                    this.I = -1;
                    return false;
                }
                ByteBuffer byteBuffer = this.F[i2];
                if (byteBuffer != null) {
                    byteBuffer.position(bufferInfo.offset);
                    MediaCodec.BufferInfo bufferInfo2 = this.p;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                long j4 = this.p.presentationTimeUs;
                int size = this.o.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z3 = false;
                        break;
                    } else if (this.o.get(i3).longValue() == j4) {
                        this.o.remove(i3);
                        z3 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                this.J = z3;
            } else if (i2 == -2) {
                MediaFormat outputFormat = this.t.getOutputFormat();
                if (this.x && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.D = true;
                } else {
                    if (this.B) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    a(this.t, outputFormat);
                }
                return true;
            } else if (i2 == -3) {
                this.F = this.t.getOutputBuffers();
                return true;
            } else {
                if (this.y && (this.P || this.M == 2)) {
                    p();
                }
                return false;
            }
        }
        if (!this.A || !this.O) {
            MediaCodec mediaCodec = this.t;
            ByteBuffer[] byteBufferArr = this.F;
            int i4 = this.I;
            ByteBuffer byteBuffer2 = byteBufferArr[i4];
            MediaCodec.BufferInfo bufferInfo3 = this.p;
            z2 = a(j2, j3, mediaCodec, byteBuffer2, i4, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.J);
        } else {
            try {
                z2 = a(j2, j3, this.t, this.F[this.I], this.I, this.p.flags, this.p.presentationTimeUs, this.J);
            } catch (IllegalStateException unused2) {
                p();
                if (this.Q) {
                    n();
                }
                return false;
            }
        }
        if (!z2) {
            return false;
        }
        long j5 = this.p.presentationTimeUs;
        this.I = -1;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0147 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean o() {
        /*
        // Method dump skipped, instructions count: 467
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ec2.o():boolean");
    }

    private final void p() {
        if (this.M == 2) {
            n();
            k();
            return;
        }
        this.Q = true;
        j();
    }

    @Override // com.google.android.gms.internal.ads.j82
    public boolean D() {
        if (this.q == null || this.R) {
            return false;
        }
        if (i() || this.I >= 0) {
            return true;
        }
        return this.G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.G;
    }

    @Override // com.google.android.gms.internal.ads.j82
    public boolean E() {
        return this.Q;
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int a(e82 e82) {
        try {
            return a(this.i, e82);
        } catch (mc2 e) {
            throw o72.a(e, d());
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a(gc2 gc2, e82 e82);

    /* access modifiers changed from: protected */
    public fc2 a(gc2 gc2, e82 e82, boolean z2) {
        return gc2.a(e82.g, z2);
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final void a(long j2, long j3) {
        if (this.Q) {
            j();
            return;
        }
        if (this.q == null) {
            this.m.a();
            int a2 = a(this.n, this.m, true);
            if (a2 == -5) {
                b(this.n.f2723a);
            } else if (a2 == -4) {
                mf2.b(this.m.c());
                this.P = true;
                p();
                return;
            } else {
                return;
            }
        }
        k();
        if (this.t != null) {
            bg2.a("drainAndFeed");
            do {
            } while (b(j2, j3));
            do {
            } while (o());
            bg2.a();
        } else {
            b(j2);
            this.m.a();
            int a3 = a(this.n, this.m, false);
            if (a3 == -5) {
                b(this.n.f2723a);
            } else if (a3 == -4) {
                mf2.b(this.m.c());
                this.P = true;
                p();
            }
        }
        this.T.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.n72
    public void a(long j2, boolean z2) {
        this.P = false;
        this.Q = false;
        if (this.t != null) {
            this.G = -9223372036854775807L;
            this.H = -1;
            this.I = -1;
            this.S = true;
            this.R = false;
            this.J = false;
            this.o.clear();
            this.C = false;
            this.D = false;
            if (this.w || ((this.z && this.O) || this.M != 0)) {
                n();
                k();
            } else {
                this.t.flush();
                this.N = false;
            }
            if (this.K && this.q != null) {
                this.L = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* access modifiers changed from: protected */
    public void a(ca2 ca2) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(fc2 fc2, MediaCodec mediaCodec, e82 e82, MediaCrypto mediaCrypto);

    /* access modifiers changed from: protected */
    public abstract void a(String str, long j2, long j3);

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.n72
    public void a(boolean z2) {
        this.T = new y92();
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z2);

    /* access modifiers changed from: protected */
    public boolean a(MediaCodec mediaCodec, boolean z2, e82 e82, e82 e822) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a(fc2 fc2) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r5.l == r0.l) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.gms.internal.ads.e82 r5) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ec2.b(com.google.android.gms.internal.ads.e82):void");
    }

    @Override // com.google.android.gms.internal.ads.m82
    public final int c() {
        return 4;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.n72
    public void e() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.n72
    public void f() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.n72
    public void g() {
        this.q = null;
        try {
            n();
            try {
                if (this.r != null) {
                    this.j.a(this.r);
                }
                try {
                    if (!(this.s == null || this.s == this.r)) {
                        this.j.a(this.s);
                    }
                } finally {
                    this.r = null;
                    this.s = null;
                }
            } catch (Throwable th) {
                if (!(this.s == null || this.s == this.r)) {
                    this.j.a(this.s);
                }
                throw th;
            } finally {
                this.r = null;
                this.s = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.s == null || this.s == this.r)) {
                    this.j.a(this.s);
                }
                throw th2;
            } finally {
                this.r = null;
                this.s = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public final void k() {
        e82 e82;
        if (this.t == null && (e82 = this.q) != null) {
            ea2<ia2> ea2 = this.s;
            this.r = ea2;
            String str = e82.g;
            if (ea2 != null) {
                int state = ea2.getState();
                if (state == 0) {
                    throw o72.a(this.r.b(), d());
                } else if (state == 3 || state == 4) {
                    this.r.a();
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.u == null) {
                    try {
                        this.u = a(this.i, e82, false);
                        if (this.u == null) {
                            a(new hc2(this.q, (Throwable) null, false, -49999));
                            throw null;
                        }
                    } catch (mc2 e) {
                        a(new hc2(this.q, (Throwable) e, false, -49998));
                        throw null;
                    }
                }
                if (a(this.u)) {
                    String str2 = this.u.f2572a;
                    this.v = ag2.f1751a < 21 && this.q.i.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    int i2 = ag2.f1751a;
                    this.w = i2 < 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (ag2.f1751a == 19 && ag2.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.x = ag2.f1751a < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(ag2.f1752b) || "flounder_lte".equals(ag2.f1752b) || "grouper".equals(ag2.f1752b) || "tilapia".equals(ag2.f1752b));
                    this.y = ag2.f1751a <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                    this.z = (ag2.f1751a <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (ag2.f1751a <= 19 && "hb2000".equals(ag2.f1752b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                    this.A = ag2.f1751a == 21 && "OMX.google.aac.decoder".equals(str2);
                    this.B = ag2.f1751a <= 18 && this.q.s == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String valueOf = String.valueOf(str2);
                        bg2.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                        this.t = MediaCodec.createByCodecName(str2);
                        bg2.a();
                        bg2.a("configureCodec");
                        a(this.u, this.t, this.q, (MediaCrypto) null);
                        bg2.a();
                        bg2.a("startCodec");
                        this.t.start();
                        bg2.a();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        a(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.E = this.t.getInputBuffers();
                        this.F = this.t.getOutputBuffers();
                        this.G = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                        this.H = -1;
                        this.I = -1;
                        this.S = true;
                        this.T.f5558a++;
                    } catch (Exception e2) {
                        a(new hc2(this.q, (Throwable) e2, false, str2));
                        throw null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final MediaCodec l() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    public final fc2 m() {
        return this.u;
    }

    /* access modifiers changed from: protected */
    public void n() {
        this.G = -9223372036854775807L;
        this.H = -1;
        this.I = -1;
        this.R = false;
        this.J = false;
        this.o.clear();
        this.E = null;
        this.F = null;
        this.u = null;
        this.K = false;
        this.N = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.O = false;
        this.L = 0;
        this.M = 0;
        this.l.f2092c = null;
        MediaCodec mediaCodec = this.t;
        if (mediaCodec != null) {
            this.T.f5559b++;
            try {
                mediaCodec.stop();
                try {
                    this.t.release();
                    this.t = null;
                    ea2<ia2> ea2 = this.r;
                    if (ea2 != null && this.s != ea2) {
                        try {
                            this.j.a(ea2);
                        } finally {
                            this.r = null;
                        }
                    }
                } catch (Throwable th) {
                    this.t = null;
                    ea2<ia2> ea22 = this.r;
                    if (!(ea22 == null || this.s == ea22)) {
                        this.j.a(ea22);
                    }
                    throw th;
                } finally {
                    this.r = null;
                }
            } catch (Throwable th2) {
                this.t = null;
                ea2<ia2> ea23 = this.r;
                if (!(ea23 == null || this.s == ea23)) {
                    try {
                        this.j.a(ea23);
                    } finally {
                        this.r = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }
}
