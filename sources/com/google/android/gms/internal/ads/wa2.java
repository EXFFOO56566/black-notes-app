package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.Stack;

/* access modifiers changed from: package-private */
public final class wa2 implements cb2 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5235a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final Stack<ya2> f5236b = new Stack<>();

    /* renamed from: c  reason: collision with root package name */
    private final hb2 f5237c = new hb2();
    private ab2 d;
    private int e;
    private int f;
    private long g;

    wa2() {
    }

    private final long a(ma2 ma2, int i) {
        ma2.b(this.f5235a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f5235a[i2] & 255));
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final void a() {
        this.e = 0;
        this.f5236b.clear();
        this.f5237c.a();
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final void a(ab2 ab2) {
        this.d = ab2;
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final boolean a(ma2 ma2) {
        String str;
        int a2;
        int a3;
        mf2.b(this.d != null);
        while (true) {
            if (this.f5236b.isEmpty() || ma2.c() < ya2.a(this.f5236b.peek())) {
                if (this.e == 0) {
                    long a4 = this.f5237c.a(ma2, true, false, 4);
                    if (a4 == -2) {
                        ma2.b();
                        while (true) {
                            ma2.c(this.f5235a, 0, 4);
                            a2 = hb2.a(this.f5235a[0]);
                            if (a2 != -1 && a2 <= 4) {
                                a3 = (int) hb2.a(this.f5235a, a2, false);
                                if (this.d.c(a3)) {
                                    break;
                                }
                            }
                            ma2.b(1);
                        }
                        ma2.b(a2);
                        a4 = (long) a3;
                    }
                    if (a4 == -1) {
                        return false;
                    }
                    this.f = (int) a4;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.f5237c.a(ma2, false, true, 8);
                    this.e = 2;
                }
                int b2 = this.d.b(this.f);
                if (b2 == 0) {
                    ma2.b((int) this.g);
                    this.e = 0;
                } else if (b2 == 1) {
                    long c2 = ma2.c();
                    this.f5236b.add(new ya2(this.f, this.g + c2));
                    this.d.a(this.f, c2, this.g);
                    this.e = 0;
                    return true;
                } else if (b2 == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.a(this.f, a(ma2, (int) j));
                        this.e = 0;
                        return true;
                    }
                    long j2 = this.g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw new h82(sb.toString());
                } else if (b2 == 3) {
                    long j3 = this.g;
                    if (j3 <= 2147483647L) {
                        ab2 ab2 = this.d;
                        int i = this.f;
                        int i2 = (int) j3;
                        if (i2 == 0) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            byte[] bArr = new byte[i2];
                            ma2.b(bArr, 0, i2);
                            str = new String(bArr);
                        }
                        ab2.a(i, str);
                        this.e = 0;
                        return true;
                    }
                    long j4 = this.g;
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j4);
                    throw new h82(sb2.toString());
                } else if (b2 == 4) {
                    this.d.a(this.f, (int) this.g, ma2);
                    this.e = 0;
                    return true;
                } else if (b2 == 5) {
                    long j5 = this.g;
                    if (j5 == 4 || j5 == 8) {
                        ab2 ab22 = this.d;
                        int i3 = this.f;
                        int i4 = (int) this.g;
                        long a5 = a(ma2, i4);
                        ab22.a(i3, i4 == 4 ? (double) Float.intBitsToFloat((int) a5) : Double.longBitsToDouble(a5));
                        this.e = 0;
                        return true;
                    }
                    long j6 = this.g;
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Invalid float size: ");
                    sb3.append(j6);
                    throw new h82(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(b2);
                    throw new h82(sb4.toString());
                }
            } else {
                this.d.a(ya2.b(this.f5236b.pop()));
                return true;
            }
        }
    }
}
