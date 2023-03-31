package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class uv0 implements mt0<xe0, le1, uu0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5008a;

    /* renamed from: b  reason: collision with root package name */
    private final zd0 f5009b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f5010c;

    public uv0(Context context, zd0 zd0, Executor executor) {
        this.f5008a = context;
        this.f5009b = zd0;
        this.f5010c = executor;
    }

    private static boolean a(vd1 vd1, int i) {
        return vd1.f5092a.f4150a.g.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.mt0
    public final void a(vd1 vd1, id1 id1, lt0<le1, uu0> lt0) {
        zd1 zd1 = vd1.f5092a.f4150a;
        lt0.f3600b.a(this.f5008a, vd1.f5092a.f4150a.d, id1.s.toString(), an.a((bn) id1.p), (xa) lt0.f3601c, zd1.i, zd1.g);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.vd1, com.google.android.gms.internal.ads.id1, com.google.android.gms.internal.ads.lt0] */
    @Override // com.google.android.gms.internal.ads.mt0
    public final /* synthetic */ xe0 b(vd1 vd1, id1 id1, lt0<le1, uu0> lt0) {
        if0 if0;
        ab i = lt0.f3600b.i();
        gb j = lt0.f3600b.j();
        hb l = lt0.f3600b.l();
        if (l != null && a(vd1, 6)) {
            if0 = if0.a(l);
        } else if (i != null && a(vd1, 6)) {
            if0 = if0.b(i);
        } else if (i != null && a(vd1, 2)) {
            if0 = if0.a(i);
        } else if (j != null && a(vd1, 6)) {
            if0 = if0.b(j);
        } else if (j == null || !a(vd1, 1)) {
            throw new pw0("No native ad mappers", 0);
        } else {
            if0 = if0.a(j);
        }
        if (vd1.f5092a.f4150a.g.contains(Integer.toString(if0.o()))) {
            jf0 a2 = this.f5009b.a(new d30(vd1, id1, lt0.f3599a), new wf0(if0), new ah0(j, i, l));
            ((uu0) lt0.f3601c).a((xa) a2.f());
            a2.a().a(new ry(lt0.f3600b), this.f5010c);
            return a2.h();
        }
        throw new pw0("No corresponding native ad listener", 0);
    }
}
