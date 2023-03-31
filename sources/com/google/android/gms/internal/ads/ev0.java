package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class ev0 implements mt0<ac0, le1, uu0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2483a;

    /* renamed from: b  reason: collision with root package name */
    private final ad0 f2484b;

    /* renamed from: c  reason: collision with root package name */
    private final fo f2485c;
    private final Executor d;

    public ev0(Context context, fo foVar, ad0 ad0, Executor executor) {
        this.f2483a = context;
        this.f2485c = foVar;
        this.f2484b = ad0;
        this.d = executor;
    }

    @Override // com.google.android.gms.internal.ads.mt0
    public final void a(vd1 vd1, id1 id1, lt0<le1, uu0> lt0) {
        if (this.f2485c.d < 4100000) {
            lt0.f3600b.a(this.f2483a, vd1.f5092a.f4150a.d, id1.s.toString(), (xa) lt0.f3601c);
        } else {
            lt0.f3600b.a(this.f2483a, vd1.f5092a.f4150a.d, id1.s.toString(), an.a((bn) id1.p), (xa) lt0.f3601c);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.vd1, com.google.android.gms.internal.ads.id1, com.google.android.gms.internal.ads.lt0] */
    @Override // com.google.android.gms.internal.ads.mt0
    public final /* synthetic */ ac0 b(vd1 vd1, id1 id1, lt0<le1, uu0> lt0) {
        cc0 a2 = this.f2484b.a(new d30(vd1, id1, lt0.f3599a), new fc0(new hv0(lt0)));
        a2.a().a(new ry(lt0.f3600b), this.d);
        ((uu0) lt0.f3601c).a((xa) a2.f());
        return a2.i();
    }
}
