package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class ox0 implements mt0<ck0, le1, tu0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4062a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4063b;

    /* renamed from: c  reason: collision with root package name */
    private final fk0 f4064c;

    public ox0(Context context, Executor executor, fk0 fk0) {
        this.f4062a = context;
        this.f4063b = executor;
        this.f4064c = fk0;
    }

    /* access modifiers changed from: private */
    public static void c(vd1 vd1, id1 id1, lt0<le1, tu0> lt0) {
        try {
            lt0.f3600b.a(vd1.f5092a.f4150a.d, id1.s.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(lt0.f3599a);
            co.c(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.mt0
    public final void a(vd1 vd1, id1 id1, lt0<le1, tu0> lt0) {
        if (!lt0.f3600b.d()) {
            ((tu0) lt0.f3601c).a(new qx0(this, vd1, id1, lt0));
            lt0.f3600b.a(this.f4062a, vd1.f5092a.f4150a.d, null, (ph) lt0.f3601c, id1.s.toString());
            return;
        }
        c(vd1, id1, lt0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.vd1, com.google.android.gms.internal.ads.id1, com.google.android.gms.internal.ads.lt0] */
    @Override // com.google.android.gms.internal.ads.mt0
    public final /* synthetic */ ck0 b(vd1 vd1, id1 id1, lt0<le1, tu0> lt0) {
        ek0 a2 = this.f4064c.a(new d30(vd1, id1, lt0.f3599a), new dk0(new rx0(lt0)));
        a2.a().a(new ry(lt0.f3600b), this.f4063b);
        v60 b2 = a2.b();
        t50 c2 = a2.c();
        ((tu0) lt0.f3601c).a((ph) new sx0(this, a2.i(), c2, b2, a2.l()));
        return a2.k();
    }
}
