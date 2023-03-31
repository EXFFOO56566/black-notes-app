package com.google.android.gms.internal.ads;

public final class zw {

    /* renamed from: a  reason: collision with root package name */
    private nv f5814a;

    /* renamed from: b  reason: collision with root package name */
    private ix f5815b;

    /* renamed from: c  reason: collision with root package name */
    private ai1 f5816c;
    private sx d;
    private pe1 e;

    private zw() {
    }

    public final kv a() {
        y42.a(this.f5814a, nv.class);
        y42.a(this.f5815b, ix.class);
        if (this.f5816c == null) {
            this.f5816c = new ai1();
        }
        if (this.d == null) {
            this.d = new sx();
        }
        if (this.e == null) {
            this.e = new pe1();
        }
        return new iw(this.f5814a, this.f5815b, this.f5816c, this.d, this.e);
    }

    public final zw a(ix ixVar) {
        y42.a(ixVar);
        this.f5815b = ixVar;
        return this;
    }

    public final zw a(nv nvVar) {
        y42.a(nvVar);
        this.f5814a = nvVar;
        return this;
    }
}
