package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import b.c.b.a.d.b;

public final class yw0 implements mt0<ck0, qc, uu0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5662a;

    /* renamed from: b  reason: collision with root package name */
    private final fk0 f5663b;

    public yw0(Context context, fk0 fk0) {
        this.f5662a = context;
        this.f5663b = fk0;
    }

    @Override // com.google.android.gms.internal.ads.mt0
    public final void a(vd1 vd1, id1 id1, lt0<qc, uu0> lt0) {
        try {
            lt0.f3600b.r(id1.Q);
            if (vd1.f5092a.f4150a.n.f3532a == qd1.f4320c) {
                lt0.f3600b.b(id1.K, id1.s.toString(), vd1.f5092a.f4150a.d, b.a(this.f5662a), new ax0(this, lt0), (xa) lt0.f3601c);
            } else {
                lt0.f3600b.a(id1.K, id1.s.toString(), vd1.f5092a.f4150a.d, b.a(this.f5662a), new ax0(this, lt0), (xa) lt0.f3601c);
            }
        } catch (RemoteException e) {
            wk.e("Remote exception loading a rewarded RTB ad", e);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.vd1, com.google.android.gms.internal.ads.id1, com.google.android.gms.internal.ads.lt0] */
    @Override // com.google.android.gms.internal.ads.mt0
    public final /* synthetic */ ck0 b(vd1 vd1, id1 id1, lt0<qc, uu0> lt0) {
        fv0 fv0 = new fv0(id1, lt0.f3600b, true);
        ek0 a2 = this.f5663b.a(new d30(vd1, id1, lt0.f3599a), new dk0(fv0));
        fv0.a(a2.d());
        ((uu0) lt0.f3601c).a((xa) a2.n());
        return a2.k();
    }
}
