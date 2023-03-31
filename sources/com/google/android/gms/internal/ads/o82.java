package com.google.android.gms.internal.ads;

public abstract class o82 {

    /* renamed from: a  reason: collision with root package name */
    public static final o82 f3963a = new n82();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((b() - 1) == 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r3, com.google.android.gms.internal.ads.q82 r4, com.google.android.gms.internal.ads.p82 r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.a(r3, r4, r0)
            r2.a(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L_0x0031
            r3 = -1
            if (r6 == 0) goto L_0x0022
            if (r6 == r4) goto L_0x0020
            r1 = 2
            if (r6 != r1) goto L_0x001a
            int r6 = r2.b()
            int r6 = r6 - r4
            if (r6 != 0) goto L_0x002a
            goto L_0x0020
        L_0x001a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0020:
            r4 = 0
            goto L_0x002a
        L_0x0022:
            int r6 = r2.b()
            int r6 = r6 - r4
            if (r6 != 0) goto L_0x002a
            r4 = -1
        L_0x002a:
            if (r4 != r3) goto L_0x002d
            return r3
        L_0x002d:
            r2.a(r4, r5, r0)
            return r0
        L_0x0031:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o82.a(int, com.google.android.gms.internal.ads.q82, com.google.android.gms.internal.ads.p82, int):int");
    }

    public abstract int a(Object obj);

    public final p82 a(int i, p82 p82, boolean z) {
        return a(i, p82, false, 0L);
    }

    public abstract p82 a(int i, p82 p82, boolean z, long j);

    public abstract q82 a(int i, q82 q82, boolean z);

    public final boolean a() {
        return b() == 0;
    }

    public abstract int b();

    public abstract int c();
}
