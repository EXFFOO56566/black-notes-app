package com.google.android.gms.internal.ads;

public final class lu {

    /* renamed from: a  reason: collision with root package name */
    private final int f3603a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3604b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3605c;

    private lu(int i, int i2, int i3) {
        this.f3603a = i;
        this.f3605c = i2;
        this.f3604b = i3;
    }

    public static lu a(int i, int i2) {
        return new lu(1, i, i2);
    }

    public static lu a(um2 um2) {
        return um2.e ? new lu(3, 0, 0) : um2.j ? new lu(2, 0, 0) : um2.i ? f() : a(um2.g, um2.d);
    }

    public static lu f() {
        return new lu(0, 0, 0);
    }

    public static lu g() {
        return new lu(4, 0, 0);
    }

    public static lu h() {
        return new lu(5, 0, 0);
    }

    public final boolean a() {
        return this.f3603a == 2;
    }

    public final boolean b() {
        return this.f3603a == 3;
    }

    public final boolean c() {
        return this.f3603a == 0;
    }

    public final boolean d() {
        return this.f3603a == 4;
    }

    public final boolean e() {
        return this.f3603a == 5;
    }
}
