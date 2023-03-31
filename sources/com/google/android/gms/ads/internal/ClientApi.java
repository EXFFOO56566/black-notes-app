package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.r;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.overlay.u;
import com.google.android.gms.ads.internal.overlay.x;
import com.google.android.gms.ads.internal.overlay.z;
import com.google.android.gms.internal.ads.be;
import com.google.android.gms.internal.ads.bg0;
import com.google.android.gms.internal.ads.bh;
import com.google.android.gms.internal.ads.eg0;
import com.google.android.gms.internal.ads.eo2;
import com.google.android.gms.internal.ads.fa1;
import com.google.android.gms.internal.ads.fo;
import com.google.android.gms.internal.ads.h2;
import com.google.android.gms.internal.ads.kv;
import com.google.android.gms.internal.ads.me;
import com.google.android.gms.internal.ads.mz0;
import com.google.android.gms.internal.ads.oz0;
import com.google.android.gms.internal.ads.ra;
import com.google.android.gms.internal.ads.ro2;
import com.google.android.gms.internal.ads.um2;
import com.google.android.gms.internal.ads.vo2;
import com.google.android.gms.internal.ads.xh;
import com.google.android.gms.internal.ads.xn2;
import com.google.android.gms.internal.ads.xz0;
import com.google.android.gms.internal.ads.z1;
import com.google.android.gms.internal.ads.zc1;
import java.util.HashMap;

public class ClientApi extends ro2 {
    @Override // com.google.android.gms.internal.ads.oo2
    public final vo2 I(a aVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final eo2 a(a aVar, um2 um2, String str, int i) {
        return new l((Context) b.Q(aVar), um2, str, new fo(201004000, i, true, false));
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final eo2 a(a aVar, um2 um2, String str, ra raVar, int i) {
        Context context = (Context) b.Q(aVar);
        fa1 j = kv.a(context, raVar, i).j();
        j.a(str);
        j.a(context);
        return j.a().a();
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final bh b(a aVar, ra raVar, int i) {
        Context context = (Context) b.Q(aVar);
        zc1 n = kv.a(context, raVar, i).n();
        n.a(context);
        return n.a().a();
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final eo2 b(a aVar, um2 um2, String str, ra raVar, int i) {
        Context context = (Context) b.Q(aVar);
        return new xz0(kv.a(context, raVar, i), context, um2, str);
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final h2 b(a aVar, a aVar2, a aVar3) {
        return new bg0((View) b.Q(aVar), (HashMap) b.Q(aVar2), (HashMap) b.Q(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final xn2 b(a aVar, String str, ra raVar, int i) {
        Context context = (Context) b.Q(aVar);
        return new mz0(kv.a(context, raVar, i), context, str);
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final eo2 c(a aVar, um2 um2, String str, ra raVar, int i) {
        Context context = (Context) b.Q(aVar);
        return new oz0(kv.a(context, raVar, i), context, um2, str);
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final xh c(a aVar, String str, ra raVar, int i) {
        Context context = (Context) b.Q(aVar);
        zc1 n = kv.a(context, raVar, i).n();
        n.a(context);
        n.a(str);
        return n.a().b();
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final vo2 d(a aVar, int i) {
        return kv.a((Context) b.Q(aVar), i).g();
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final z1 d(a aVar, a aVar2) {
        return new eg0((FrameLayout) b.Q(aVar), (FrameLayout) b.Q(aVar2), 201004000);
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final be g(a aVar) {
        Activity activity = (Activity) b.Q(aVar);
        AdOverlayInfoParcel a2 = AdOverlayInfoParcel.a(activity.getIntent());
        if (a2 == null) {
            return new r(activity);
        }
        int i = a2.l;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new r(activity) : new u(activity, a2) : new z(activity) : new x(activity) : new s(activity);
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final me w(a aVar) {
        return null;
    }
}
