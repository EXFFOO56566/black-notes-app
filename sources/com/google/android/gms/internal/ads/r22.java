package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;
import java.util.Arrays;

public final class r22 {
    private static final r22 f = new r22(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f4434a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f4435b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f4436c;
    private int d;
    private boolean e;

    private r22() {
        this(0, new int[8], new Object[8], true);
    }

    private r22(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.f4434a = i;
        this.f4435b = iArr;
        this.f4436c = objArr;
        this.e = z;
    }

    static r22 a(r22 r22, r22 r222) {
        int i = r22.f4434a + r222.f4434a;
        int[] copyOf = Arrays.copyOf(r22.f4435b, i);
        System.arraycopy(r222.f4435b, 0, copyOf, r22.f4434a, r222.f4434a);
        Object[] copyOf2 = Arrays.copyOf(r22.f4436c, i);
        System.arraycopy(r222.f4436c, 0, copyOf2, r22.f4434a, r222.f4434a);
        return new r22(i, copyOf, copyOf2, true);
    }

    private static void a(int i, Object obj, l32 l32) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            l32.b(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            l32.a(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            l32.a(i2, (dy1) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                l32.a(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(b02.f());
        } else if (l32.a() == rz1.f.k) {
            l32.a(i2);
            ((r22) obj).b(l32);
            l32.b(i2);
        } else {
            l32.b(i2);
            ((r22) obj).b(l32);
            l32.a(i2);
        }
    }

    public static r22 d() {
        return f;
    }

    static r22 e() {
        return new r22();
    }

    public final void a() {
        this.e = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        if (this.e) {
            int i2 = this.f4434a;
            if (i2 == this.f4435b.length) {
                int i3 = this.f4434a + (i2 < 4 ? 8 : i2 >> 1);
                this.f4435b = Arrays.copyOf(this.f4435b, i3);
                this.f4436c = Arrays.copyOf(this.f4436c, i3);
            }
            int[] iArr = this.f4435b;
            int i4 = this.f4434a;
            iArr[i4] = i;
            this.f4436c[i4] = obj;
            this.f4434a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final void a(l32 l32) {
        if (l32.a() == rz1.f.l) {
            for (int i = this.f4434a - 1; i >= 0; i--) {
                l32.a(this.f4435b[i] >>> 3, this.f4436c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f4434a; i2++) {
            l32.a(this.f4435b[i2] >>> 3, this.f4436c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f4434a; i2++) {
            d12.a(sb, i, String.valueOf(this.f4435b[i2] >>> 3), this.f4436c[i2]);
        }
    }

    public final int b() {
        int i;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f4434a; i4++) {
            int i5 = this.f4435b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = xy1.e(i6, ((Long) this.f4436c[i4]).longValue());
            } else if (i7 == 1) {
                i = xy1.g(i6, ((Long) this.f4436c[i4]).longValue());
            } else if (i7 == 2) {
                i = xy1.c(i6, (dy1) this.f4436c[i4]);
            } else if (i7 == 3) {
                i = (xy1.e(i6) << 1) + ((r22) this.f4436c[i4]).b();
            } else if (i7 == 5) {
                i = xy1.i(i6, ((Integer) this.f4436c[i4]).intValue());
            } else {
                throw new IllegalStateException(b02.f());
            }
            i3 += i;
        }
        this.d = i3;
        return i3;
    }

    public final void b(l32 l32) {
        if (this.f4434a != 0) {
            if (l32.a() == rz1.f.k) {
                for (int i = 0; i < this.f4434a; i++) {
                    a(this.f4435b[i], this.f4436c[i], l32);
                }
                return;
            }
            for (int i2 = this.f4434a - 1; i2 >= 0; i2--) {
                a(this.f4435b[i2], this.f4436c[i2], l32);
            }
        }
    }

    public final int c() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4434a; i3++) {
            i2 += xy1.d(this.f4435b[i3] >>> 3, (dy1) this.f4436c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r22)) {
            return false;
        }
        r22 r22 = (r22) obj;
        int i = this.f4434a;
        if (i == r22.f4434a) {
            int[] iArr = this.f4435b;
            int[] iArr2 = r22.f4435b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f4436c;
                Object[] objArr2 = r22.f4436c;
                int i3 = this.f4434a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f4434a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f4435b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f4436c;
        int i7 = this.f4434a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
