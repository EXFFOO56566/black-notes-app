package com.google.android.gms.internal.ads;

final class ob2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3974a;

    /* renamed from: b  reason: collision with root package name */
    public int f3975b;

    /* renamed from: c  reason: collision with root package name */
    public int f3976c;
    public long d;
    private final boolean e;
    private final xf2 f;
    private final xf2 g;
    private int h;
    private int i;

    public ob2(xf2 xf2, xf2 xf22, boolean z) {
        this.g = xf2;
        this.f = xf22;
        this.e = z;
        xf22.c(12);
        this.f3974a = xf22.o();
        xf2.c(12);
        this.i = xf2.o();
        mf2.b(xf2.d() != 1 ? false : true, "first_chunk must be 1");
        this.f3975b = -1;
    }

    public final boolean a() {
        int i2 = this.f3975b + 1;
        this.f3975b = i2;
        if (i2 == this.f3974a) {
            return false;
        }
        this.d = this.e ? this.f.p() : this.f.l();
        if (this.f3975b == this.h) {
            this.f3976c = this.g.o();
            this.g.d(4);
            int i3 = this.i - 1;
            this.i = i3;
            this.h = i3 > 0 ? this.g.o() - 1 : -1;
        }
        return true;
    }
}
