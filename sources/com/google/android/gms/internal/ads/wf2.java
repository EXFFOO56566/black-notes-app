package com.google.android.gms.internal.ads;

public final class wf2 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f5264a;

    /* renamed from: b  reason: collision with root package name */
    private int f5265b;

    /* renamed from: c  reason: collision with root package name */
    private int f5266c;
    private int d = 0;

    public wf2(byte[] bArr, int i, int i2) {
        this.f5264a = bArr;
        this.f5266c = i;
        this.f5265b = i2;
        e();
    }

    private final boolean c(int i) {
        if (2 > i || i >= this.f5265b) {
            return false;
        }
        byte[] bArr = this.f5264a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
    }

    private final int d() {
        int i = 0;
        int i2 = 0;
        while (!a()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = a(i2);
        }
        return i3 + i;
    }

    private final void e() {
        int i;
        int i2;
        int i3 = this.f5266c;
        mf2.b(i3 >= 0 && (i = this.d) >= 0 && i < 8 && (i3 < (i2 = this.f5265b) || (i3 == i2 && i == 0)));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x003a */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        if (r0 == 8) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r10) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wf2.a(int):int");
    }

    public final boolean a() {
        return a(1) == 1;
    }

    public final int b() {
        return d();
    }

    public final void b(int i) {
        int i2 = this.f5266c;
        int i3 = (i / 8) + i2;
        this.f5266c = i3;
        int i4 = this.d + (i % 8);
        this.d = i4;
        if (i4 > 7) {
            this.f5266c = i3 + 1;
            this.d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f5266c) {
                e();
                return;
            } else if (c(i2)) {
                this.f5266c++;
                i2 += 2;
            }
        }
    }

    public final int c() {
        int d2 = d();
        return (d2 % 2 == 0 ? -1 : 1) * ((d2 + 1) / 2);
    }
}
