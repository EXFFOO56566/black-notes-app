package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import b.c.b.a.d.b;

public final class gu0 implements mt0<n00, qc, uu0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2811a;

    /* renamed from: b  reason: collision with root package name */
    private final k10 f2812b;

    /* renamed from: c  reason: collision with root package name */
    private View f2813c;

    public gu0(Context context, k10 k10) {
        this.f2811a = context;
        this.f2812b = k10;
    }

    static final /* synthetic */ rp2 a(lt0 lt0) {
        try {
            return lt0.f3600b.getVideoController();
        } catch (RemoteException e) {
            throw new fe1(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.mt0
    public final void a(vd1 vd1, id1 id1, lt0<qc, uu0> lt0) {
        try {
            lt0.f3600b.r(id1.Q);
            lt0.f3600b.a(id1.K, id1.s.toString(), vd1.f5092a.f4150a.d, b.a(this.f2811a), new hu0(this, lt0), (xa) lt0.f3601c, vd1.f5092a.f4150a.e);
        } catch (RemoteException e) {
            throw new fe1(e);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.vd1, com.google.android.gms.internal.ads.id1, com.google.android.gms.internal.ads.lt0] */
    @Override // com.google.android.gms.internal.ads.mt0
    public final /* synthetic */ n00 b(vd1 vd1, id1 id1, lt0<qc, uu0> lt0) {
        m00 a2 = this.f2812b.a(new d30(vd1, id1, lt0.f3599a), new r00(this.f2813c, null, new fu0(lt0), id1.r.get(0)));
        a2.j().a(this.f2813c);
        ((uu0) lt0.f3601c).a((xa) a2.g());
        return a2.i();
    }
}
