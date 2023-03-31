package com.google.android.gms.internal.ads;

public final class qw0 implements r42<nw0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<he1> f4403a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ml0> f4404b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<tn0> f4405c;

    private qw0(e52<he1> e52, e52<ml0> e522, e52<tn0> e523) {
        this.f4403a = e52;
        this.f4404b = e522;
        this.f4405c = e523;
    }

    public static qw0 a(e52<he1> e52, e52<ml0> e522, e52<tn0> e523) {
        return new qw0(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new nw0(this.f4403a.get(), this.f4404b.get(), this.f4405c.get());
    }
}
