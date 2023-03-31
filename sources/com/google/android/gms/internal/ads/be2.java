package com.google.android.gms.internal.ads;

public final class be2 extends o82 {
    private static final Object e = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final long f1931b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1932c;
    private final boolean d;

    private be2(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f1931b = j;
        this.f1932c = j2;
        this.d = z;
    }

    public be2(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    @Override // com.google.android.gms.internal.ads.o82
    public final int a(Object obj) {
        return e.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.o82
    public final p82 a(int i, p82 p82, boolean z, long j) {
        mf2.a(i, 0, 1);
        boolean z2 = this.d;
        long j2 = this.f1932c;
        p82.f4125a = null;
        p82.f4126b = -9223372036854775807L;
        p82.f4127c = -9223372036854775807L;
        p82.d = z2;
        p82.e = false;
        p82.h = 0;
        p82.i = j2;
        p82.f = 0;
        p82.g = 0;
        p82.j = 0;
        return p82;
    }

    @Override // com.google.android.gms.internal.ads.o82
    public final q82 a(int i, q82 q82, boolean z) {
        mf2.a(i, 0, 1);
        Object obj = z ? e : null;
        q82.a(obj, obj, 0, this.f1931b, 0, false);
        return q82;
    }

    @Override // com.google.android.gms.internal.ads.o82
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.o82
    public final int c() {
        return 1;
    }
}
