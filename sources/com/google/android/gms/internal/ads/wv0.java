package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import b.c.b.a.d.b;

public final class wv0 implements mt0<xe0, qc, uu0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5320a;

    /* renamed from: b  reason: collision with root package name */
    private final zd0 f5321b;

    /* renamed from: c  reason: collision with root package name */
    private hb f5322c;

    public wv0(Context context, zd0 zd0) {
        this.f5320a = context;
        this.f5321b = zd0;
    }

    @Override // com.google.android.gms.internal.ads.mt0
    public final void a(vd1 vd1, id1 id1, lt0<qc, uu0> lt0) {
        try {
            lt0.f3600b.r(id1.Q);
            lt0.f3600b.a(id1.K, id1.s.toString(), vd1.f5092a.f4150a.d, b.a(this.f5320a), new yv0(this, lt0), (xa) lt0.f3601c);
        } catch (RemoteException e) {
            throw new fe1(e);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.vd1, com.google.android.gms.internal.ads.id1, com.google.android.gms.internal.ads.lt0] */
    @Override // com.google.android.gms.internal.ads.mt0
    public final /* synthetic */ xe0 b(vd1 vd1, id1 id1, lt0<qc, uu0> lt0) {
        if (vd1.f5092a.f4150a.g.contains(Integer.toString(6))) {
            if0 a2 = if0.a(this.f5322c);
            if (vd1.f5092a.f4150a.g.contains(Integer.toString(a2.o()))) {
                jf0 a3 = this.f5321b.a(new d30(vd1, id1, lt0.f3599a), new wf0(a2), new ah0(null, null, this.f5322c));
                ((uu0) lt0.f3601c).a((xa) a3.g());
                return a3.h();
            }
            throw new pw0("No corresponding native ad listener", 0);
        }
        throw new pw0("Unified must be used for RTB.", 1);
    }
}
