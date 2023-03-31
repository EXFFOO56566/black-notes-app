package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

public final class f92 {
    private long A;
    private long B;
    private boolean C;
    private long D;
    private Method E;
    private int F;
    private long G;
    private long H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private long N;
    private long O;
    private long P;
    private float Q;
    private u82[] R;
    private ByteBuffer[] S;
    private ByteBuffer T;
    private ByteBuffer U;
    private byte[] V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final r82 f2560a = null;
    private int a0;

    /* renamed from: b  reason: collision with root package name */
    private final m92 f2561b;
    private boolean b0;

    /* renamed from: c  reason: collision with root package name */
    private final v92 f2562c;
    private boolean c0;
    private final u82[] d;
    private long d0;
    private final l92 e;
    private final ConditionVariable f;
    private final long[] g;
    private final h92 h;
    private final LinkedList<k92> i;
    private AudioTrack j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private long r;
    private k82 s;
    private k82 t;
    private long u;
    private long v;
    private ByteBuffer w;
    private int x;
    private int y;
    private int z;

    public f92(r82 r82, u82[] u82Arr, l92 l92) {
        this.e = l92;
        this.f = new ConditionVariable(true);
        if (ag2.f1751a >= 18) {
            try {
                this.E = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (ag2.f1751a >= 19) {
            this.h = new g92();
        } else {
            this.h = new h92(null);
        }
        this.f2561b = new m92();
        this.f2562c = new v92();
        u82[] u82Arr2 = new u82[(u82Arr.length + 3)];
        this.d = u82Arr2;
        u82Arr2[0] = new t92();
        u82[] u82Arr3 = this.d;
        u82Arr3[1] = this.f2561b;
        System.arraycopy(u82Arr, 0, u82Arr3, 2, u82Arr.length);
        this.d[u82Arr.length + 2] = this.f2562c;
        this.g = new long[10];
        this.Q = 1.0f;
        this.M = 0;
        this.o = 3;
        this.a0 = 0;
        this.t = k82.d;
        this.X = -1;
        this.R = new u82[0];
        this.S = new ByteBuffer[0];
        this.i = new LinkedList<>();
    }

    private final void a(long j2) {
        ByteBuffer byteBuffer;
        int length = this.R.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.S[i2 - 1];
            } else {
                byteBuffer = this.T;
                if (byteBuffer == null) {
                    byteBuffer = u82.f4914a;
                }
            }
            if (i2 == length) {
                b(byteBuffer, j2);
            } else {
                u82 u82 = this.R[i2];
                u82.a(byteBuffer);
                ByteBuffer e2 = u82.e();
                this.S[i2] = e2;
                if (e2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static int b(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 5;
        }
        if (c2 == 1) {
            return 6;
        }
        if (c2 != 2) {
            return c2 != 3 ? 0 : 8;
        }
        return 7;
    }

    private final long b(long j2) {
        return (j2 * 1000000) / ((long) this.k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r11 < r10) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(java.nio.ByteBuffer r9, long r10) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f92.b(java.nio.ByteBuffer, long):boolean");
    }

    private final long c(long j2) {
        return (j2 * ((long) this.k)) / 1000000;
    }

    private final boolean k() {
        return this.j != null;
    }

    private final void l() {
        ArrayList arrayList = new ArrayList();
        u82[] u82Arr = this.d;
        for (u82 u82 : u82Arr) {
            if (u82.c()) {
                arrayList.add(u82);
            } else {
                u82.flush();
            }
        }
        int size = arrayList.size();
        this.R = (u82[]) arrayList.toArray(new u82[size]);
        this.S = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            u82 u822 = this.R[i2];
            u822.flush();
            this.S[i2] = u822.e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m() {
        /*
            r9 = this;
            int r0 = r9.X
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.p
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.u82[] r0 = r9.R
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.X = r0
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.X
            com.google.android.gms.internal.ads.u82[] r5 = r9.R
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0036
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.d()
        L_0x0028:
            r9.a(r7)
            boolean r0 = r4.E()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.X
            int r0 = r0 + r2
            goto L_0x0010
        L_0x0036:
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L_0x0042
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L_0x0042
            return r3
        L_0x0042:
            r9.X = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f92.m():boolean");
    }

    private final void n() {
        if (!k()) {
            return;
        }
        if (ag2.f1751a >= 21) {
            this.j.setVolume(this.Q);
            return;
        }
        AudioTrack audioTrack = this.j;
        float f2 = this.Q;
        audioTrack.setStereoVolume(f2, f2);
    }

    private final long o() {
        return this.p ? this.K : this.J / ((long) this.I);
    }

    private final void p() {
        this.A = 0;
        this.z = 0;
        this.y = 0;
        this.B = 0;
        this.C = false;
        this.D = 0;
    }

    private final boolean q() {
        if (ag2.f1751a >= 23) {
            return false;
        }
        int i2 = this.n;
        return i2 == 5 || i2 == 6;
    }

    public final long a(boolean z2) {
        long j2;
        long j3;
        long j4;
        long j5;
        StringBuilder sb;
        String str;
        if (!(k() && this.M != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.j.getPlayState() == 3) {
            long f2 = this.h.f();
            if (f2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.B >= 30000) {
                    long[] jArr = this.g;
                    int i2 = this.y;
                    jArr[i2] = f2 - nanoTime;
                    this.y = (i2 + 1) % 10;
                    int i3 = this.z;
                    if (i3 < 10) {
                        this.z = i3 + 1;
                    }
                    this.B = nanoTime;
                    this.A = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.z;
                        if (i4 >= i5) {
                            break;
                        }
                        this.A += this.g[i4] / ((long) i5);
                        i4++;
                    }
                }
                if (!q() && nanoTime - this.D >= 500000) {
                    boolean b2 = this.h.b();
                    this.C = b2;
                    if (b2) {
                        long c2 = this.h.c() / 1000;
                        long d2 = this.h.d();
                        if (c2 >= this.O) {
                            if (Math.abs(c2 - nanoTime) > 5000000) {
                                sb = new StringBuilder(136);
                                str = "Spurious audio timestamp (system clock mismatch): ";
                            } else if (Math.abs(b(d2) - f2) > 5000000) {
                                sb = new StringBuilder(138);
                                str = "Spurious audio timestamp (frame position mismatch): ";
                            }
                            sb.append(str);
                            sb.append(d2);
                            sb.append(", ");
                            sb.append(c2);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(f2);
                            Log.w("AudioTrack", sb.toString());
                        }
                        this.C = false;
                    }
                    Method method = this.E;
                    if (method != null && !this.p) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.j, null)).intValue()) * 1000) - this.r;
                            this.P = intValue;
                            long max = Math.max(intValue, 0L);
                            this.P = max;
                            if (max > 5000000) {
                                StringBuilder sb2 = new StringBuilder(61);
                                sb2.append("Ignoring impossibly large audio latency: ");
                                sb2.append(max);
                                Log.w("AudioTrack", sb2.toString());
                                this.P = 0;
                            }
                        } catch (Exception unused) {
                            this.E = null;
                        }
                    }
                    this.D = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.C) {
            j2 = b(this.h.d() + c(nanoTime2 - (this.h.c() / 1000)));
        } else {
            j2 = this.z == 0 ? this.h.f() : nanoTime2 + this.A;
            if (!z2) {
                j2 -= this.P;
            }
        }
        long j6 = this.N;
        while (!this.i.isEmpty() && j2 >= k92.b(this.i.getFirst())) {
            k92 remove = this.i.remove();
            this.t = k92.a(remove);
            this.v = k92.b(remove);
            this.u = k92.c(remove) - this.N;
        }
        if (this.t.f3342a == 1.0f) {
            j3 = (j2 + this.u) - this.v;
        } else {
            if (!this.i.isEmpty() || this.f2562c.h() < 1024) {
                j4 = this.u;
                j5 = (long) (((double) this.t.f3342a) * ((double) (j2 - this.v)));
            } else {
                j4 = this.u;
                j5 = ag2.a(j2 - this.v, this.f2562c.g(), this.f2562c.h());
            }
            j3 = j5 + j4;
        }
        return j6 + j3;
    }

    public final k82 a(k82 k82) {
        if (this.p) {
            k82 k822 = k82.d;
            this.t = k822;
            return k822;
        }
        float a2 = this.f2562c.a(k82.f3342a);
        v92 v92 = this.f2562c;
        float f2 = k82.f3343b;
        v92.b(f2);
        k82 k823 = new k82(a2, f2);
        k82 k824 = this.s;
        if (k824 == null) {
            k824 = !this.i.isEmpty() ? k92.a(this.i.getLast()) : this.t;
        }
        if (!k823.equals(k824)) {
            if (k()) {
                this.s = k823;
            } else {
                this.t = k823;
            }
        }
        return this.t;
    }

    public final void a() {
        this.Z = false;
        if (k()) {
            p();
            this.h.a();
        }
    }

    public final void a(float f2) {
        if (this.Q != f2) {
            this.Q = f2;
            n();
        }
    }

    public final void a(int i2) {
        if (this.o != i2) {
            this.o = i2;
            if (!this.b0) {
                d();
                this.a0 = 0;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) {
        /*
        // Method dump skipped, instructions count: 352
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f92.a(java.lang.String, int, int, int, int, int[]):void");
    }

    public final boolean a(String str) {
        r82 r82 = this.f2560a;
        return r82 != null && r82.a(b(str));
    }

    public final boolean a(ByteBuffer byteBuffer, long j2) {
        int i2;
        int i3;
        ByteBuffer byteBuffer2 = this.T;
        mf2.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!k()) {
            this.f.block();
            this.j = this.b0 ? new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.l).setEncoding(this.n).setSampleRate(this.k).build(), this.q, 1, this.a0) : this.a0 == 0 ? new AudioTrack(this.o, this.k, this.l, this.n, this.q, 1) : new AudioTrack(this.o, this.k, this.l, this.n, this.q, 1, this.a0);
            int state = this.j.getState();
            if (state == 1) {
                int audioSessionId = this.j.getAudioSessionId();
                if (this.a0 != audioSessionId) {
                    this.a0 = audioSessionId;
                    this.e.a(audioSessionId);
                }
                this.h.a(this.j, q());
                n();
                this.c0 = false;
                if (this.Z) {
                    b();
                }
            } else {
                try {
                    this.j.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.j = null;
                    throw th;
                }
                this.j = null;
                throw new i92(state, this.k, this.l, this.q);
            }
        }
        if (q()) {
            if (this.j.getPlayState() == 2) {
                this.c0 = false;
                return false;
            } else if (this.j.getPlayState() == 1 && this.h.e() != 0) {
                return false;
            }
        }
        boolean z2 = this.c0;
        boolean h2 = h();
        this.c0 = h2;
        if (z2 && !h2 && this.j.getPlayState() != 1) {
            this.e.a(this.q, p72.a(this.r), SystemClock.elapsedRealtime() - this.d0);
        }
        if (this.T == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.p && this.L == 0) {
                int i4 = this.n;
                if (i4 == 7 || i4 == 8) {
                    i3 = p92.a(byteBuffer);
                } else if (i4 == 5) {
                    i3 = s82.a();
                } else if (i4 == 6) {
                    i3 = s82.a(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i4);
                    throw new IllegalStateException(sb.toString());
                }
                this.L = i3;
            }
            if (this.s != null) {
                if (!m()) {
                    return false;
                }
                this.i.add(new k92(this.s, Math.max(0L, j2), b(o()), null));
                this.s = null;
                l();
            }
            if (this.M == 0) {
                this.N = Math.max(0L, j2);
                this.M = 1;
            } else {
                long b2 = this.N + b(this.p ? this.H : this.G / ((long) this.F));
                if (this.M != 1 || Math.abs(b2 - j2) <= 200000) {
                    i2 = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(b2);
                    sb2.append(", got ");
                    sb2.append(j2);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i2 = 2;
                    this.M = 2;
                }
                if (this.M == i2) {
                    this.N += j2 - b2;
                    this.M = 1;
                    this.e.a();
                }
            }
            if (this.p) {
                this.H += (long) this.L;
            } else {
                this.G += (long) byteBuffer.remaining();
            }
            this.T = byteBuffer;
        }
        if (this.p) {
            b(this.T, j2);
        } else {
            a(j2);
        }
        if (this.T.hasRemaining()) {
            return false;
        }
        this.T = null;
        return true;
    }

    public final void b() {
        this.Z = true;
        if (k()) {
            this.O = System.nanoTime() / 1000;
            this.j.play();
        }
    }

    public final void b(int i2) {
        mf2.b(ag2.f1751a >= 21);
        if (!this.b0 || this.a0 != i2) {
            this.b0 = true;
            this.a0 = i2;
            d();
        }
    }

    public final void c() {
        d();
        for (u82 u82 : this.d) {
            u82.a();
        }
        this.a0 = 0;
        this.Z = false;
    }

    public final void d() {
        if (k()) {
            this.G = 0;
            this.H = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            k82 k82 = this.s;
            if (k82 != null) {
                this.t = k82;
                this.s = null;
            } else if (!this.i.isEmpty()) {
                this.t = k92.a(this.i.getLast());
            }
            this.i.clear();
            this.u = 0;
            this.v = 0;
            this.T = null;
            this.U = null;
            int i2 = 0;
            while (true) {
                u82[] u82Arr = this.R;
                if (i2 >= u82Arr.length) {
                    break;
                }
                u82 u82 = u82Arr[i2];
                u82.flush();
                this.S[i2] = u82.e();
                i2++;
            }
            this.Y = false;
            this.X = -1;
            this.w = null;
            this.x = 0;
            this.M = 0;
            this.P = 0;
            p();
            if (this.j.getPlayState() == 3) {
                this.j.pause();
            }
            AudioTrack audioTrack = this.j;
            this.j = null;
            this.h.a(null, false);
            this.f.close();
            new e92(this, audioTrack).start();
        }
    }

    public final boolean e() {
        if (k()) {
            return this.Y && !h();
        }
        return true;
    }

    public final void f() {
        if (this.M == 1) {
            this.M = 2;
        }
    }

    public final void g() {
        if (!this.Y && k() && m()) {
            this.h.a(o());
            this.x = 0;
            this.Y = true;
        }
    }

    public final boolean h() {
        if (k()) {
            if (o() <= this.h.e()) {
                if (q() && this.j.getPlayState() == 2 && this.j.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final k82 i() {
        return this.t;
    }

    public final void j() {
        if (this.b0) {
            this.b0 = false;
            this.a0 = 0;
            d();
        }
    }
}
