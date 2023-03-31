package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.a0;
import java.util.concurrent.Executor;

public final class bu0 implements mt0<n00, le1, uu0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2012a;

    /* renamed from: b  reason: collision with root package name */
    private final fo f2013b;

    /* renamed from: c  reason: collision with root package name */
    private final k10 f2014c;
    private final Executor d;

    public bu0(Context context, fo foVar, k10 k10, Executor executor) {
        this.f2012a = context;
        this.f2013b = foVar;
        this.f2014c = k10;
        this.d = executor;
    }

    @Override // com.google.android.gms.internal.ads.mt0
    public final void a(vd1 vd1, id1 id1, lt0<le1, uu0> lt0) {
        um2 um2 = vd1.f5092a.f4150a.e;
        um2 um22 = um2.o ? new um2(this.f2012a, a0.a(um2.f, um2.f4977c)) : ce1.a(this.f2012a, id1.r);
        if (this.f2013b.d < 4100000) {
            lt0.f3600b.a(this.f2012a, um22, vd1.f5092a.f4150a.d, id1.s.toString(), (xa) lt0.f3601c);
        } else {
            lt0.f3600b.a(this.f2012a, um22, vd1.f5092a.f4150a.d, id1.s.toString(), an.a((bn) id1.p), (xa) lt0.f3601c);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.vd1, com.google.android.gms.internal.ads.id1, com.google.android.gms.internal.ads.lt0] */
    @Override // com.google.android.gms.internal.ads.mt0
    public final /* synthetic */ n00 b(vd1 vd1, id1 id1, lt0<le1, uu0> lt0) {
        k10 k10 = this.f2014c;
        d30 d30 = new d30(vd1, id1, lt0.f3599a);
        View c2 = lt0.f3600b.c();
        AdapterT adaptert = lt0.f3600b;
        adaptert.getClass();
        m00 a2 = k10.a(d30, new r00(c2, null, eu0.a(adaptert), id1.r.get(0)));
        a2.j().a(lt0.f3600b.c());
        a2.a().a(new ry(lt0.f3600b), this.d);
        ((uu0) lt0.f3601c).a((xa) a2.f());
        return a2.i();
    }
}
