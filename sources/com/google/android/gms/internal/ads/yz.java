package com.google.android.gms.internal.ads;

public final class yz {

    /* renamed from: a  reason: collision with root package name */
    private final tn0 f5670a;

    /* renamed from: b  reason: collision with root package name */
    private final vd1 f5671b;

    public yz(tn0 tn0, vd1 vd1) {
        this.f5670a = tn0;
        this.f5671b = vd1;
    }

    public final void a(long j) {
        sn0 a2 = this.f5670a.a();
        a2.a(this.f5671b.f5093b.f4642b);
        a2.a("action", "ad_closed");
        a2.a("show_time", String.valueOf(j));
        a2.a("ad_format", "appopen");
        a2.a();
    }
}
