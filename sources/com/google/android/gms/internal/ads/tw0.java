package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class tw0 implements mt0<ck0, le1, uu0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4866a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4867b;

    /* renamed from: c  reason: collision with root package name */
    private final fk0 f4868c;

    public tw0(Context context, Executor executor, fk0 fk0) {
        this.f4866a = context;
        this.f4867b = executor;
        this.f4868c = fk0;
    }

    @Override // com.google.android.gms.internal.ads.mt0
    public final void a(vd1 vd1, id1 id1, lt0<le1, uu0> lt0) {
        try {
            zd1 zd1 = vd1.f5092a.f4150a;
            if (zd1.n.f3532a == qd1.f4320c) {
                lt0.f3600b.c(this.f4866a, zd1.d, id1.s.toString(), (xa) lt0.f3601c);
            } else {
                lt0.f3600b.b(this.f4866a, zd1.d, id1.s.toString(), (xa) lt0.f3601c);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(lt0.f3599a);
            co.c(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.vd1, com.google.android.gms.internal.ads.id1, com.google.android.gms.internal.ads.lt0] */
    @Override // com.google.android.gms.internal.ads.mt0
    public final /* synthetic */ ck0 b(vd1 vd1, id1 id1, lt0<le1, uu0> lt0) {
        ek0 a2 = this.f4868c.a(new d30(vd1, id1, lt0.f3599a), new dk0(new ww0(lt0)));
        a2.a().a(new ry(lt0.f3600b), this.f4867b);
        ((uu0) lt0.f3601c).a((xa) a2.m());
        return a2.k();
    }
}
