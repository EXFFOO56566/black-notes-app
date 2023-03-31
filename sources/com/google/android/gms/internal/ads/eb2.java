package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.ba2;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public final class eb2 implements na2 {
    private static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID b0 = new UUID(72057594037932032L, -9223371306706625679L);
    private long A;
    private rf2 B;
    private rf2 C;
    private boolean D;
    private int E;
    private long F;
    private long G;
    private int H;
    private int I;
    private int[] J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private byte S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private boolean X;
    private pa2 Y;

    /* renamed from: a  reason: collision with root package name */
    private final cb2 f2393a;

    /* renamed from: b  reason: collision with root package name */
    private final hb2 f2394b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<fb2> f2395c;
    private final boolean d;
    private final xf2 e;
    private final xf2 f;
    private final xf2 g;
    private final xf2 h;
    private final xf2 i;
    private final xf2 j;
    private final xf2 k;
    private final xf2 l;
    private final xf2 m;
    private ByteBuffer n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private fb2 t;
    private boolean u;
    private int v;
    private long w;
    private boolean x;
    private long y;
    private long z;

    static {
        new db2();
    }

    public eb2() {
        this(0);
    }

    private eb2(int i2) {
        this(new wa2(), 0);
    }

    private eb2(cb2 cb2, int i2) {
        this.p = -1;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.y = -1;
        this.z = -1;
        this.A = -9223372036854775807L;
        this.f2393a = cb2;
        cb2.a(new gb2(this, null));
        this.d = true;
        this.f2394b = new hb2();
        this.f2395c = new SparseArray<>();
        this.g = new xf2(4);
        this.h = new xf2(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new xf2(4);
        this.e = new xf2(sf2.f4651a);
        this.f = new xf2(4);
        this.j = new xf2();
        this.k = new xf2();
        this.l = new xf2(8);
        this.m = new xf2();
    }

    private final int a(ma2 ma2, ua2 ua2, int i2) {
        int i3;
        int j2 = this.j.j();
        if (j2 > 0) {
            i3 = Math.min(i2, j2);
            ua2.a(this.j, i3);
        } else {
            i3 = ua2.a(ma2, i2, false);
        }
        this.N += i3;
        this.V += i3;
        return i3;
    }

    private final long a(long j2) {
        long j3 = this.q;
        if (j3 != -9223372036854775807L) {
            return ag2.a(j2, j3, 1000);
        }
        throw new h82("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void a(fb2 fb2, long j2) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(fb2.f2566a)) {
            byte[] bArr2 = this.k.f5423a;
            long j3 = this.G;
            if (j3 == -9223372036854775807L) {
                bArr = a0;
            } else {
                int i2 = (int) (j3 / 3600000000L);
                long j4 = j3 - (((long) i2) * 3600000000L);
                int i3 = (int) (j4 / 60000000);
                long j5 = j4 - ((long) (60000000 * i3));
                int i4 = (int) (j5 / 1000000);
                bArr = ag2.c(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - ((long) (1000000 * i4))) / 1000))));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            ua2 ua2 = fb2.O;
            xf2 xf2 = this.k;
            ua2.a(xf2, xf2.c());
            this.V += this.k.c();
        }
        fb2.O.a(j2, this.M, this.V, 0, fb2.g);
        this.W = true;
        b();
    }

    private final void a(ma2 ma2, int i2) {
        if (this.g.c() < i2) {
            if (this.g.a() < i2) {
                xf2 xf2 = this.g;
                byte[] bArr = xf2.f5423a;
                xf2.a(Arrays.copyOf(bArr, Math.max(bArr.length << 1, i2)), this.g.c());
            }
            xf2 xf22 = this.g;
            ma2.b(xf22.f5423a, xf22.c(), i2 - this.g.c());
            this.g.b(i2);
        }
    }

    private final void a(ma2 ma2, fb2 fb2, int i2) {
        int i3;
        if ("S_TEXT/UTF8".equals(fb2.f2566a)) {
            int length = Z.length + i2;
            if (this.k.a() < length) {
                this.k.f5423a = Arrays.copyOf(Z, length + i2);
            }
            ma2.b(this.k.f5423a, Z.length, i2);
            this.k.c(0);
            this.k.b(length);
            return;
        }
        ua2 ua2 = fb2.O;
        if (!this.O) {
            if (fb2.e) {
                this.M &= -1073741825;
                int i4 = 128;
                if (!this.P) {
                    ma2.b(this.g.f5423a, 0, 1);
                    this.N++;
                    byte[] bArr = this.g.f5423a;
                    if ((bArr[0] & 128) != 128) {
                        this.S = bArr[0];
                        this.P = true;
                    } else {
                        throw new h82("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.S;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        ma2.b(this.l.f5423a, 0, 8);
                        this.N += 8;
                        this.Q = true;
                        byte[] bArr2 = this.g.f5423a;
                        if (!z2) {
                            i4 = 0;
                        }
                        bArr2[0] = (byte) (i4 | 8);
                        this.g.c(0);
                        ua2.a(this.g, 1);
                        this.V++;
                        this.l.c(0);
                        ua2.a(this.l, 8);
                        this.V += 8;
                    }
                    if (z2) {
                        if (!this.R) {
                            ma2.b(this.g.f5423a, 0, 1);
                            this.N++;
                            this.g.c(0);
                            this.T = this.g.g();
                            this.R = true;
                        }
                        int i5 = this.T << 2;
                        this.g.a(i5);
                        ma2.b(this.g.f5423a, 0, i5);
                        this.N += i5;
                        short s2 = (short) ((this.T / 2) + 1);
                        int i6 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.n;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.n = ByteBuffer.allocate(i6);
                        }
                        this.n.position(0);
                        this.n.putShort(s2);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i3 = this.T;
                            if (i7 >= i3) {
                                break;
                            }
                            int o2 = this.g.o();
                            if (i7 % 2 == 0) {
                                this.n.putShort((short) (o2 - i8));
                            } else {
                                this.n.putInt(o2 - i8);
                            }
                            i7++;
                            i8 = o2;
                        }
                        int i9 = (i2 - this.N) - i8;
                        int i10 = i3 % 2;
                        ByteBuffer byteBuffer2 = this.n;
                        if (i10 == 1) {
                            byteBuffer2.putInt(i9);
                        } else {
                            byteBuffer2.putShort((short) i9);
                            this.n.putInt(0);
                        }
                        this.m.a(this.n.array(), i6);
                        ua2.a(this.m, i6);
                        this.V += i6;
                    }
                }
            } else {
                byte[] bArr3 = fb2.f;
                if (bArr3 != null) {
                    this.j.a(bArr3, bArr3.length);
                }
            }
            this.O = true;
        }
        int c2 = i2 + this.j.c();
        if (!"V_MPEG4/ISO/AVC".equals(fb2.f2566a) && !"V_MPEGH/ISO/HEVC".equals(fb2.f2566a)) {
            while (true) {
                int i11 = this.N;
                if (i11 >= c2) {
                    break;
                }
                a(ma2, ua2, c2 - i11);
            }
        } else {
            byte[] bArr4 = this.f.f5423a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i12 = fb2.P;
            int i13 = 4 - i12;
            while (this.N < c2) {
                int i14 = this.U;
                if (i14 == 0) {
                    int min = Math.min(i12, this.j.j());
                    ma2.b(bArr4, i13 + min, i12 - min);
                    if (min > 0) {
                        this.j.a(bArr4, i13, min);
                    }
                    this.N += i12;
                    this.f.c(0);
                    this.U = this.f.o();
                    this.e.c(0);
                    ua2.a(this.e, 4);
                    this.V += 4;
                } else {
                    this.U = i14 - a(ma2, ua2, i14);
                }
            }
        }
        if ("A_VORBIS".equals(fb2.f2566a)) {
            this.h.c(0);
            ua2.a(this.h, 4);
            this.V += 4;
        }
    }

    private static int[] a(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length << 1, i2)];
    }

    static int b(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    private final void b() {
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = 0;
        this.Q = false;
        this.j.i();
    }

    static boolean c(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.na2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.android.gms.internal.ads.ma2 r9, com.google.android.gms.internal.ads.ta2 r10) {
        /*
            r8 = this;
            r0 = 0
            r8.W = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003a
            boolean r3 = r8.W
            if (r3 != 0) goto L_0x003a
            com.google.android.gms.internal.ads.cb2 r2 = r8.f2393a
            boolean r2 = r2.a(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.c()
            boolean r5 = r8.x
            if (r5 == 0) goto L_0x0025
            r8.z = r3
            long r3 = r8.y
            r10.f4776a = r3
            r8.x = r0
        L_0x0023:
            r3 = 1
            goto L_0x0037
        L_0x0025:
            boolean r3 = r8.u
            if (r3 == 0) goto L_0x0036
            long r3 = r8.z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            r10.f4776a = r3
            r8.z = r5
            goto L_0x0023
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            return r0
        L_0x003d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eb2.a(com.google.android.gms.internal.ads.ma2, com.google.android.gms.internal.ads.ta2):int");
    }

    @Override // com.google.android.gms.internal.ads.na2
    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        sa2 sa2;
        rf2 rf2;
        rf2 rf22;
        int i3;
        int i4 = 0;
        if (i2 != 160) {
            if (i2 == 174) {
                String str = this.t.f2566a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i4 = 1;
                }
                if (i4 != 0) {
                    fb2 fb2 = this.t;
                    fb2.a(this.Y, fb2.f2567b);
                    SparseArray<fb2> sparseArray = this.f2395c;
                    fb2 fb22 = this.t;
                    sparseArray.put(fb22.f2567b, fb22);
                }
                this.t = null;
            } else if (i2 == 19899) {
                int i5 = this.v;
                if (i5 != -1) {
                    long j2 = this.w;
                    if (j2 != -1) {
                        if (i5 == 475249515) {
                            this.y = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new h82("Mandatory element SeekID or SeekPosition not found");
            } else if (i2 == 25152) {
                fb2 fb23 = this.t;
                if (!fb23.e) {
                    return;
                }
                if (fb23.g != null) {
                    fb23.i = new ba2(new ba2.a(p72.f4122b, "video/webm", this.t.g.f5397b));
                    return;
                }
                throw new h82("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i2 == 28032) {
                fb2 fb24 = this.t;
                if (fb24.e && fb24.f != null) {
                    throw new h82("Combining encryption and compression is not supported");
                }
            } else if (i2 == 357149030) {
                if (this.q == -9223372036854775807L) {
                    this.q = 1000000;
                }
                long j3 = this.r;
                if (j3 != -9223372036854775807L) {
                    this.s = a(j3);
                }
            } else if (i2 != 374648427) {
                if (i2 == 475249515 && !this.u) {
                    pa2 pa2 = this.Y;
                    if (this.p == -1 || this.s == -9223372036854775807L || (rf2 = this.B) == null || rf2.a() == 0 || (rf22 = this.C) == null || rf22.a() != this.B.a()) {
                        this.B = null;
                        this.C = null;
                        sa2 = new va2(this.s);
                    } else {
                        int a2 = this.B.a();
                        int[] iArr = new int[a2];
                        long[] jArr = new long[a2];
                        long[] jArr2 = new long[a2];
                        long[] jArr3 = new long[a2];
                        for (int i6 = 0; i6 < a2; i6++) {
                            jArr3[i6] = this.B.a(i6);
                            jArr[i6] = this.p + this.C.a(i6);
                        }
                        while (true) {
                            i3 = a2 - 1;
                            if (i4 >= i3) {
                                break;
                            }
                            int i7 = i4 + 1;
                            iArr[i4] = (int) (jArr[i7] - jArr[i4]);
                            jArr2[i4] = jArr3[i7] - jArr3[i4];
                            i4 = i7;
                        }
                        iArr[i3] = (int) ((this.p + this.o) - jArr[i3]);
                        jArr2[i3] = this.s - jArr3[i3];
                        this.B = null;
                        this.C = null;
                        sa2 = new la2(iArr, jArr, jArr2, jArr3);
                    }
                    pa2.a(sa2);
                    this.u = true;
                }
            } else if (this.f2395c.size() != 0) {
                this.Y.d();
            } else {
                throw new h82("No valid tracks were found");
            }
        } else if (this.E == 2) {
            if (!this.X) {
                this.M |= 1;
            }
            a(this.f2395c.get(this.K), this.F);
            this.E = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, double d2) {
        if (i2 == 181) {
            this.t.I = (int) d2;
        } else if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    this.t.w = (float) d2;
                    return;
                case 21970:
                    this.t.x = (float) d2;
                    return;
                case 21971:
                    this.t.y = (float) d2;
                    return;
                case 21972:
                    this.t.z = (float) d2;
                    return;
                case 21973:
                    this.t.A = (float) d2;
                    return;
                case 21974:
                    this.t.B = (float) d2;
                    return;
                case 21975:
                    this.t.C = (float) d2;
                    return;
                case 21976:
                    this.t.D = (float) d2;
                    return;
                case 21977:
                    this.t.E = (float) d2;
                    return;
                case 21978:
                    this.t.F = (float) d2;
                    return;
                default:
                    return;
            }
        } else {
            this.r = (long) d2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, ma2 ma2) {
        char c2;
        int i4;
        int i5;
        int[] iArr;
        int i6 = 4;
        int i7 = 0;
        int i8 = 1;
        if (i2 == 161 || i2 == 163) {
            if (this.E == 0) {
                this.K = (int) this.f2394b.a(ma2, false, true, 8);
                this.L = this.f2394b.b();
                this.G = -9223372036854775807L;
                this.E = 1;
                this.g.i();
            }
            fb2 fb2 = this.f2395c.get(this.K);
            if (fb2 == null) {
                ma2.b(i3 - this.L);
                this.E = 0;
                return;
            }
            if (this.E == 1) {
                a(ma2, 3);
                int i9 = (this.g.f5423a[2] & 6) >> 1;
                byte b2 = 255;
                if (i9 == 0) {
                    this.I = 1;
                    int[] a2 = a(this.J, 1);
                    this.J = a2;
                    a2[0] = (i3 - this.L) - 3;
                } else if (i2 == 163) {
                    a(ma2, 4);
                    int i10 = (this.g.f5423a[3] & 255) + 1;
                    this.I = i10;
                    int[] a3 = a(this.J, i10);
                    this.J = a3;
                    if (i9 == 2) {
                        int i11 = this.I;
                        Arrays.fill(a3, 0, i11, ((i3 - this.L) - 4) / i11);
                    } else if (i9 == 1) {
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i4 = this.I;
                            if (i12 >= i4 - 1) {
                                break;
                            }
                            this.J[i12] = 0;
                            do {
                                i6++;
                                a(ma2, i6);
                                i5 = this.g.f5423a[i6 - 1] & 255;
                                iArr = this.J;
                                iArr[i12] = iArr[i12] + i5;
                            } while (i5 == 255);
                            i13 += iArr[i12];
                            i12++;
                        }
                        this.J[i4 - 1] = ((i3 - this.L) - i6) - i13;
                    } else if (i9 == 3) {
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            int i16 = this.I;
                            if (i14 >= i16 - 1) {
                                c2 = 1;
                                this.J[i16 - 1] = ((i3 - this.L) - i6) - i15;
                                break;
                            }
                            this.J[i14] = i7;
                            i6++;
                            a(ma2, i6);
                            int i17 = i6 - 1;
                            if (this.g.f5423a[i17] != 0) {
                                long j2 = 0;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 8) {
                                        break;
                                    }
                                    int i19 = i8 << (7 - i18);
                                    if ((this.g.f5423a[i17] & i19) != 0) {
                                        i6 += i18;
                                        a(ma2, i6);
                                        long j3 = (long) ((~i19) & this.g.f5423a[i17] & b2);
                                        int i20 = i17 + 1;
                                        while (true) {
                                            j2 = j3;
                                            if (i20 >= i6) {
                                                break;
                                            }
                                            j3 = (j2 << 8) | ((long) (this.g.f5423a[i20] & b2));
                                            i20++;
                                            b2 = 255;
                                        }
                                        if (i14 > 0) {
                                            j2 -= (1 << ((i18 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i18++;
                                        i8 = 1;
                                        b2 = 255;
                                    }
                                }
                                if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                    int i21 = (int) j2;
                                    int[] iArr2 = this.J;
                                    if (i14 != 0) {
                                        i21 += iArr2[i14 - 1];
                                    }
                                    iArr2[i14] = i21;
                                    i15 += this.J[i14];
                                    i14++;
                                    i7 = 0;
                                    i8 = 1;
                                    b2 = 255;
                                }
                            } else {
                                throw new h82("No valid varint length mask found");
                            }
                        }
                        throw new h82("EBML lacing sample size out of range.");
                    } else {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(i9);
                        throw new h82(sb.toString());
                    }
                } else {
                    throw new h82("Lacing only supported in SimpleBlocks.");
                }
                c2 = 1;
                byte[] bArr = this.g.f5423a;
                this.F = this.A + a((long) ((bArr[c2] & 255) | (bArr[0] << 8)));
                this.M = ((this.g.f5423a[2] & 8) == 8 ? RecyclerView.UNDEFINED_DURATION : 0) | ((fb2.f2568c == 2 || (i2 == 163 && (this.g.f5423a[2] & 128) == 128)) ? 1 : 0);
                this.E = 2;
                this.H = 0;
            }
            if (i2 == 163) {
                while (true) {
                    int i22 = this.H;
                    if (i22 < this.I) {
                        a(ma2, fb2, this.J[i22]);
                        a(fb2, this.F + ((long) ((this.H * fb2.d) / 1000)));
                        this.H++;
                    } else {
                        this.E = 0;
                        return;
                    }
                }
            } else {
                a(ma2, fb2, this.J[0]);
            }
        } else if (i2 == 16981) {
            byte[] bArr2 = new byte[i3];
            this.t.f = bArr2;
            ma2.b(bArr2, 0, i3);
        } else if (i2 == 18402) {
            byte[] bArr3 = new byte[i3];
            ma2.b(bArr3, 0, i3);
            this.t.g = new xa2(1, bArr3);
        } else if (i2 == 21419) {
            Arrays.fill(this.i.f5423a, (byte) 0);
            ma2.b(this.i.f5423a, 4 - i3, i3);
            this.i.c(0);
            this.v = (int) this.i.l();
        } else if (i2 == 25506) {
            byte[] bArr4 = new byte[i3];
            this.t.h = bArr4;
            ma2.b(bArr4, 0, i3);
        } else if (i2 == 30322) {
            byte[] bArr5 = new byte[i3];
            this.t.o = bArr5;
            ma2.b(bArr5, 0, i3);
        } else {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unexpected id: ");
            sb2.append(i2);
            throw new h82(sb2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2) {
        if (i2 != 20529) {
            if (i2 != 20530) {
                boolean z2 = false;
                switch (i2) {
                    case 131:
                        this.t.f2568c = (int) j2;
                        return;
                    case 136:
                        fb2 fb2 = this.t;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        fb2.L = z2;
                        return;
                    case 155:
                        this.G = a(j2);
                        return;
                    case 159:
                        this.t.G = (int) j2;
                        return;
                    case 176:
                        this.t.j = (int) j2;
                        return;
                    case 179:
                        this.B.a(a(j2));
                        return;
                    case 186:
                        this.t.k = (int) j2;
                        return;
                    case 215:
                        this.t.f2567b = (int) j2;
                        return;
                    case 231:
                        this.A = a(j2);
                        return;
                    case 241:
                        if (!this.D) {
                            this.C.a(j2);
                            this.D = true;
                            return;
                        }
                        return;
                    case 251:
                        this.X = true;
                        return;
                    case 16980:
                        if (j2 != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j2);
                            sb.append(" not supported");
                            throw new h82(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j2 < 1 || j2 > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j2);
                            sb2.append(" not supported");
                            throw new h82(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j2 != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j2);
                            sb3.append(" not supported");
                            throw new h82(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j2 != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j2);
                            sb4.append(" not supported");
                            throw new h82(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j2 != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j2);
                            sb5.append(" not supported");
                            throw new h82(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.w = j2 + this.p;
                        return;
                    case 21432:
                        int i3 = (int) j2;
                        if (i3 == 0) {
                            this.t.p = 0;
                            return;
                        } else if (i3 == 1) {
                            this.t.p = 2;
                            return;
                        } else if (i3 == 3) {
                            this.t.p = 1;
                            return;
                        } else if (i3 == 15) {
                            this.t.p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.t.l = (int) j2;
                        return;
                    case 21682:
                        this.t.n = (int) j2;
                        return;
                    case 21690:
                        this.t.m = (int) j2;
                        return;
                    case 21930:
                        fb2 fb22 = this.t;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        fb22.M = z2;
                        return;
                    case 22186:
                        this.t.J = j2;
                        return;
                    case 22203:
                        this.t.K = j2;
                        return;
                    case 25188:
                        this.t.H = (int) j2;
                        return;
                    case 2352003:
                        this.t.d = (int) j2;
                        return;
                    case 2807729:
                        this.q = j2;
                        return;
                    default:
                        switch (i2) {
                            case 21945:
                                int i4 = (int) j2;
                                if (i4 == 1) {
                                    this.t.t = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.t.t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i5 = (int) j2;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.t.s = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.t.s = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.t.s = 3;
                                return;
                            case 21947:
                                fb2 fb23 = this.t;
                                fb23.q = true;
                                int i6 = (int) j2;
                                if (i6 == 1) {
                                    fb23.r = 1;
                                    return;
                                } else if (i6 == 9) {
                                    fb23.r = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    this.t.r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.t.u = (int) j2;
                                return;
                            case 21949:
                                this.t.v = (int) j2;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j2 != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new h82(sb6.toString());
            }
        } else if (j2 != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j2);
            sb7.append(" not supported");
            throw new h82(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2, long j3) {
        if (i2 == 160) {
            this.X = false;
        } else if (i2 == 174) {
            this.t = new fb2(null);
        } else if (i2 == 187) {
            this.D = false;
        } else if (i2 == 19899) {
            this.v = -1;
            this.w = -1;
        } else if (i2 == 20533) {
            this.t.e = true;
        } else if (i2 == 21968) {
            this.t.q = true;
        } else if (i2 == 408125543) {
            long j4 = this.p;
            if (j4 == -1 || j4 == j2) {
                this.p = j2;
                this.o = j3;
                return;
            }
            throw new h82("Multiple Segment elements not supported");
        } else if (i2 == 475249515) {
            this.B = new rf2();
            this.C = new rf2();
        } else if (i2 != 524531317 || this.u) {
        } else {
            if (!this.d || this.y == -1) {
                this.Y.a(new va2(this.s));
                this.u = true;
                return;
            }
            this.x = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str) {
        if (i2 == 134) {
            this.t.f2566a = str;
        } else if (i2 != 17026) {
            if (i2 == 2274716) {
                fb2.a(this.t, str);
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new h82(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.na2
    public final void a(long j2, long j3) {
        this.A = -9223372036854775807L;
        this.E = 0;
        this.f2393a.a();
        this.f2394b.a();
        b();
    }

    @Override // com.google.android.gms.internal.ads.na2
    public final void a(pa2 pa2) {
        this.Y = pa2;
    }

    @Override // com.google.android.gms.internal.ads.na2
    public final boolean a(ma2 ma2) {
        return new ib2().a(ma2);
    }
}
