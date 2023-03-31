package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.sk;

final class l extends sk {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f1426c;

    private l(c cVar) {
        this.f1426c = cVar;
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void a() {
        Bitmap a2 = q.v().a(Integer.valueOf(this.f1426c.f1414c.p.g));
        if (a2 != null) {
            ll e = q.e();
            c cVar = this.f1426c;
            Activity activity = cVar.f1413b;
            g gVar = cVar.f1414c.p;
            gl.h.post(new k(this, e.a(activity, a2, gVar.e, gVar.f)));
        }
    }
}
