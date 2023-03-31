package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.c;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class jj0 {

    /* renamed from: a  reason: collision with root package name */
    private final oj0 f3240a = new oj0(null);

    /* renamed from: b  reason: collision with root package name */
    private final a f3241b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f3242c;
    private final Executor d;
    private final eq1 e;
    private final fo f;
    private final j5 g;
    private lo1<ws> h;

    jj0(uj0 uj0) {
        this.f3242c = uj0.a(uj0);
        this.d = uj0.b(uj0);
        this.e = uj0.c(uj0);
        this.f = uj0.d(uj0);
        this.f3241b = uj0.e(uj0);
        uj0.f(uj0);
        this.g = new j5();
    }

    public final synchronized lo1<JSONObject> a(String str, JSONObject jSONObject) {
        if (this.h == null) {
            return yn1.a((Object) null);
        }
        return yn1.a(this.h, new lj0(this, str, jSONObject), this.d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(String str, JSONObject jSONObject, ws wsVar) {
        return this.g.a(wsVar, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ws a(ws wsVar) {
        wsVar.b("/result", this.g);
        ju P = wsVar.P();
        oj0 oj0 = this.f3240a;
        P.a(null, oj0, oj0, oj0, oj0, false, null, new c(this.f3242c, null, null), null, null);
        return wsVar;
    }

    public final synchronized void a() {
        if (this.h != null) {
            yn1.a(this.h, new kj0(this), this.d);
            this.h = null;
        }
    }

    public final synchronized void a(String str, d5<Object> d5Var) {
        if (this.h != null) {
            yn1.a(this.h, new nj0(this, str, d5Var), this.d);
        }
    }

    public final synchronized void a(String str, Map<String, ?> map) {
        if (this.h != null) {
            yn1.a(this.h, new pj0(this, str, map), this.d);
        }
    }

    public final <T> void a(WeakReference<T> weakReference, String str, d5<T> d5Var) {
        a(str, new tj0(this, weakReference, str, d5Var, null));
    }

    public final synchronized void b() {
        lo1<ws> a2 = yn1.a(et.a(this.f3242c, this.f, (String) on2.e().a(zr2.s1), this.e, this.f3241b), new ij0(this), this.d);
        this.h = a2;
        no.a(a2, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void b(String str, d5<Object> d5Var) {
        if (this.h != null) {
            yn1.a(this.h, new mj0(this, str, d5Var), this.d);
        }
    }
}
