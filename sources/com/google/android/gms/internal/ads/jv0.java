package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import b.c.b.a.d.b;

public final class jv0 implements mt0<ac0, qc, uu0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3280a;

    /* renamed from: b  reason: collision with root package name */
    private final ad0 f3281b;

    public jv0(Context context, ad0 ad0) {
        this.f3280a = context;
        this.f3281b = ad0;
    }

    @Override // com.google.android.gms.internal.ads.mt0
    public final void a(vd1 vd1, id1 id1, lt0<qc, uu0> lt0) {
        try {
            lt0.f3600b.r(id1.Q);
            lt0.f3600b.a(id1.K, id1.s.toString(), vd1.f5092a.f4150a.d, b.a(this.f3280a), new lv0(this, lt0), (xa) lt0.f3601c);
        } catch (RemoteException e) {
            throw new fe1(e);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.vd1, com.google.android.gms.internal.ads.id1, com.google.android.gms.internal.ads.lt0] */
    @Override // com.google.android.gms.internal.ads.mt0
    public final /* synthetic */ ac0 b(vd1 vd1, id1 id1, lt0<qc, uu0> lt0) {
        fv0 fv0 = new fv0(id1, lt0.f3600b, false);
        cc0 a2 = this.f3281b.a(new d30(vd1, id1, lt0.f3599a), new fc0(fv0));
        fv0.a(a2.d());
        ((uu0) lt0.f3601c).a((xa) a2.g());
        return a2.i();
    }
}
