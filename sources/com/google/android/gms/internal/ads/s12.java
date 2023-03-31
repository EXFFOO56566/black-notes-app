package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public final class s12 extends dy1 {
    static final int[] j = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int e;
    private final dy1 f;
    private final dy1 g;
    private final int h;
    private final int i;

    private s12(dy1 dy1, dy1 dy12) {
        this.f = dy1;
        this.g = dy12;
        int size = dy1.size();
        this.h = size;
        this.e = size + dy12.size();
        this.i = Math.max(dy1.i(), dy12.i()) + 1;
    }

    /* synthetic */ s12(dy1 dy1, dy1 dy12, v12 v12) {
        this(dy1, dy12);
    }

    static dy1 a(dy1 dy1, dy1 dy12) {
        if (dy12.size() == 0) {
            return dy1;
        }
        if (dy1.size() == 0) {
            return dy12;
        }
        int size = dy1.size() + dy12.size();
        if (size < 128) {
            return b(dy1, dy12);
        }
        if (dy1 instanceof s12) {
            s12 s12 = (s12) dy1;
            if (s12.g.size() + dy12.size() < 128) {
                return new s12(s12.f, b(s12.g, dy12));
            } else if (s12.f.i() > s12.g.i() && s12.i() > dy12.i()) {
                return new s12(s12.f, new s12(s12.g, dy12));
            }
        }
        return size >= i(Math.max(dy1.i(), dy12.i()) + 1) ? new s12(dy1, dy12) : u12.a(new u12(null), dy1, dy12);
    }

    private static dy1 b(dy1 dy1, dy1 dy12) {
        int size = dy1.size();
        int size2 = dy12.size();
        byte[] bArr = new byte[(size + size2)];
        dy1.a(bArr, 0, 0, size);
        dy12.a(bArr, 0, size, size2);
        return dy1.b(bArr);
    }

    static int i(int i2) {
        int[] iArr = j;
        if (i2 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.dy1
    public final int a(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.h;
        if (i5 <= i6) {
            return this.f.a(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.g.a(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.g.a(this.f.a(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final dy1 a(int i2, int i3) {
        int c2 = dy1.c(i2, i3, this.e);
        if (c2 == 0) {
            return dy1.f2334c;
        }
        if (c2 == this.e) {
            return this;
        }
        int i4 = this.h;
        if (i3 <= i4) {
            return this.f.a(i2, i3);
        }
        if (i2 >= i4) {
            return this.g.a(i2 - i4, i3 - i4);
        }
        dy1 dy1 = this.f;
        return new s12(dy1.a(i2, dy1.size()), this.g.a(0, i3 - this.h));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.dy1
    public final String a(Charset charset) {
        return new String(a(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.dy1
    public final void a(ey1 ey1) {
        this.f.a(ey1);
        this.g.a(ey1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.dy1
    public final int b(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.h;
        if (i5 <= i6) {
            return this.f.b(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.g.b(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.g.b(this.f.b(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.android.gms.internal.ads.dy1
    /* renamed from: b */
    public final my1 iterator() {
        return new v12(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.dy1
    public final void b(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.h;
        if (i5 <= i6) {
            this.f.b(bArr, i2, i3, i4);
        } else if (i2 >= i6) {
            this.g.b(bArr, i2 - i6, i3, i4);
        } else {
            int i7 = i6 - i2;
            this.f.b(bArr, i2, i3, i7);
            this.g.b(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final boolean e() {
        int a2 = this.f.a(0, 0, this.h);
        dy1 dy1 = this.g;
        return dy1.a(a2, 0, dy1.size()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dy1)) {
            return false;
        }
        dy1 dy1 = (dy1) obj;
        if (this.e != dy1.size()) {
            return false;
        }
        if (this.e == 0) {
            return true;
        }
        int l = l();
        int l2 = dy1.l();
        if (l != 0 && l2 != 0 && l != l2) {
            return false;
        }
        x12 x12 = new x12(this, null);
        py1 py1 = (py1) x12.next();
        x12 x122 = new x12(dy1, null);
        py1 py12 = (py1) x122.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = py1.size() - i2;
            int size2 = py12.size() - i3;
            int min = Math.min(size, size2);
            if (!(i2 == 0 ? py1.a(py12, i3, min) : py12.a(py1, i2, min))) {
                return false;
            }
            i4 += min;
            int i5 = this.e;
            if (i4 < i5) {
                if (min == size) {
                    py1 = (py1) x12.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
                if (min == size2) {
                    py12 = (py1) x122.next();
                    i3 = 0;
                } else {
                    i3 += min;
                }
            } else if (i4 == i5) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final byte f(int i2) {
        dy1.b(i2, this.e);
        return g(i2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.dy1
    public final byte g(int i2) {
        int i3 = this.h;
        return i2 < i3 ? this.f.g(i2) : this.g.g(i2 - i3);
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final ty1 g() {
        return new uy1(new w12(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.dy1
    public final int i() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.dy1
    public final boolean k() {
        return this.e >= i(this.i);
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final int size() {
        return this.e;
    }
}
