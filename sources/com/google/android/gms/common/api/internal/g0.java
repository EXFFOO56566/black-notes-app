package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b.c.b.a.c.b;
import b.c.b.a.g.b.e;
import b.c.b.a.g.b.l;
import b.c.b.a.g.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import java.util.Set;

public final class g0 extends e implements f.a, f.b {
    private static a.AbstractC0069a<? extends b.c.b.a.g.e, b.c.b.a.g.a> i = d.f1221c;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1574b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f1575c;
    private final a.AbstractC0069a<? extends b.c.b.a.g.e, b.c.b.a.g.a> d;
    private Set<Scope> e;
    private com.google.android.gms.common.internal.d f;
    private b.c.b.a.g.e g;
    private h0 h;

    public g0(Context context, Handler handler, com.google.android.gms.common.internal.d dVar) {
        this(context, handler, dVar, i);
    }

    public g0(Context context, Handler handler, com.google.android.gms.common.internal.d dVar, a.AbstractC0069a<? extends b.c.b.a.g.e, b.c.b.a.g.a> aVar) {
        this.f1574b = context;
        this.f1575c = handler;
        r.a(dVar, "ClientSettings must not be null");
        this.f = dVar;
        this.e = dVar.h();
        this.d = aVar;
    }

    /* access modifiers changed from: private */
    public final void b(l lVar) {
        b d2 = lVar.d();
        if (d2.j()) {
            t e2 = lVar.e();
            d2 = e2.e();
            if (!d2.j()) {
                String valueOf = String.valueOf(d2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.h.a(e2.d(), this.e);
                this.g.i();
            }
        }
        this.h.b(d2);
        this.g.i();
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final void a(b bVar) {
        this.h.b(bVar);
    }

    @Override // b.c.b.a.g.b.d
    public final void a(l lVar) {
        this.f1575c.post(new i0(this, lVar));
    }

    public final void a(h0 h0Var) {
        b.c.b.a.g.e eVar = this.g;
        if (eVar != null) {
            eVar.i();
        }
        this.f.a(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0069a<? extends b.c.b.a.g.e, b.c.b.a.g.a> aVar = this.d;
        Context context = this.f1574b;
        Looper looper = this.f1575c.getLooper();
        com.google.android.gms.common.internal.d dVar = this.f;
        this.g = (b.c.b.a.g.e) aVar.a(context, looper, dVar, dVar.i(), this, this);
        this.h = h0Var;
        Set<Scope> set = this.e;
        if (set == null || set.isEmpty()) {
            this.f1575c.post(new f0(this));
        } else {
            this.g.j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void b(int i2) {
        this.g.i();
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void e(Bundle bundle) {
        this.g.a(this);
    }

    public final void r0() {
        b.c.b.a.g.e eVar = this.g;
        if (eVar != null) {
            eVar.i();
        }
    }
}
