package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public class oy1 extends py1 {
    protected final byte[] e;

    oy1(byte[] bArr) {
        if (bArr != null) {
            this.e = bArr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.dy1
    public final int a(int i, int i2, int i3) {
        int n = n() + i2;
        return a32.a(i, this.e, n, i3 + n);
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final dy1 a(int i, int i2) {
        int c2 = dy1.c(i, i2, size());
        return c2 == 0 ? dy1.f2334c : new ky1(this.e, n() + i, c2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.dy1
    public final String a(Charset charset) {
        return new String(this.e, n(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.dy1
    public final void a(ey1 ey1) {
        ey1.a(this.e, n(), size());
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.py1
    public final boolean a(dy1 dy1, int i, int i2) {
        if (i2 <= dy1.size()) {
            int i3 = i + i2;
            if (i3 > dy1.size()) {
                int size = dy1.size();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(size);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(dy1 instanceof oy1)) {
                return dy1.a(i, i3).equals(a(0, i2));
            } else {
                oy1 oy1 = (oy1) dy1;
                byte[] bArr = this.e;
                byte[] bArr2 = oy1.e;
                int n = n() + i2;
                int n2 = n();
                int n3 = oy1.n() + i;
                while (n2 < n) {
                    if (bArr[n2] != bArr2[n3]) {
                        return false;
                    }
                    n2++;
                    n3++;
                }
                return true;
            }
        } else {
            int size2 = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.dy1
    public final int b(int i, int i2, int i3) {
        return uz1.a(i, this.e, n() + i2, i3);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.dy1
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.e, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final boolean e() {
        int n = n();
        return a32.a(this.e, n, size() + n);
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dy1) || size() != ((dy1) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof oy1)) {
            return obj.equals(this);
        }
        oy1 oy1 = (oy1) obj;
        int l = l();
        int l2 = oy1.l();
        if (l == 0 || l2 == 0 || l == l2) {
            return a(oy1, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public byte f(int i) {
        return this.e[i];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.dy1
    public byte g(int i) {
        return this.e[i];
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final ty1 g() {
        return ty1.a(this.e, n(), size(), true);
    }

    /* access modifiers changed from: protected */
    public int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public int size() {
        return this.e.length;
    }
}
