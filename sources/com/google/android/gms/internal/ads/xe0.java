package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import b.c.b.a.d.a;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

public final class xe0 extends k20 {
    private final Executor g;
    private final if0 h;
    private final sf0 i;
    private final gg0 j;
    private final of0 k;
    private final rf0 l;
    private final l42<bj0> m;
    private final l42<zi0> n;
    private final l42<ej0> o;
    private final l42<vi0> p;
    private final l42<dj0> q;
    private xg0 r;
    private boolean s;
    private final zi t;
    private final eq1 u;
    private final fo v;
    private final Context w;
    private final df0 x;
    private final qz0 y;

    public xe0(n20 n20, Executor executor, if0 if0, sf0 sf0, gg0 gg0, of0 of0, rf0 rf0, l42<bj0> l42, l42<zi0> l422, l42<ej0> l423, l42<vi0> l424, l42<dj0> l425, zi ziVar, eq1 eq1, fo foVar, Context context, df0 df0, qz0 qz0) {
        super(n20);
        this.g = executor;
        this.h = if0;
        this.i = sf0;
        this.j = gg0;
        this.k = of0;
        this.l = rf0;
        this.m = l42;
        this.n = l422;
        this.o = l423;
        this.p = l424;
        this.q = l425;
        this.t = ziVar;
        this.u = eq1;
        this.v = foVar;
        this.w = context;
        this.x = df0;
        this.y = qz0;
    }

    public static boolean d(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    @Override // com.google.android.gms.internal.ads.k20
    public final synchronized void a() {
        this.g.execute(new cf0(this));
        super.a();
    }

    public final synchronized void a(Bundle bundle) {
        this.i.a(bundle);
    }

    public final synchronized void a(View view) {
        this.i.a(view);
    }

    public final synchronized void a(View view, MotionEvent motionEvent, View view2) {
        this.i.a(view, motionEvent, view2);
    }

    public final synchronized void a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        this.j.b(this.r);
        this.i.a(view, view2, map, map2, z);
    }

    public final synchronized void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.s) {
            if (z) {
                this.i.a(view, map, map2);
                this.s = true;
                return;
            }
            if (!z) {
                if (((Boolean) on2.e().a(zr2.A1)).booleanValue() && map != null) {
                    for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                        View view2 = entry.getValue().get();
                        if (view2 != null && d(view2)) {
                            this.i.a(view, map, map2);
                            this.s = true;
                            return;
                        }
                    }
                }
            }
        }
    }

    public final synchronized void a(cp2 cp2) {
        this.i.a(cp2);
    }

    public final synchronized void a(lp2 lp2) {
        this.y.a(lp2);
    }

    public final synchronized void a(v3 v3Var) {
        this.i.a(v3Var);
    }

    public final synchronized void a(xg0 xg0) {
        wf1 a2;
        this.r = xg0;
        this.j.a(xg0);
        this.i.a(xg0.r0(), xg0.t0(), xg0.u1(), xg0, xg0);
        if (((Boolean) on2.e().a(zr2.Z0)).booleanValue() && (a2 = this.u.a()) != null) {
            a2.a(xg0.r0());
        }
        if (xg0.T1() != null) {
            xg0.T1().a(this.t);
        }
    }

    public final synchronized void a(yo2 yo2) {
        this.i.a(yo2);
    }

    public final synchronized void a(String str) {
        this.i.a(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xe0.a(java.lang.String, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z) {
        this.i.a(this.r.r0(), this.r.K0(), this.r.t0(), z);
    }

    @Override // com.google.android.gms.internal.ads.k20
    public final void b() {
        this.g.execute(new af0(this));
        if (this.h.o() != 7) {
            Executor executor = this.g;
            sf0 sf0 = this.i;
            sf0.getClass();
            executor.execute(ze0.a(sf0));
        }
        super.b();
    }

    public final synchronized void b(Bundle bundle) {
        this.i.b(bundle);
    }

    public final void b(View view) {
        a v2 = this.h.v();
        if (this.k.a() && v2 != null && view != null) {
            q.r().b(v2, view);
        }
    }

    public final synchronized void b(xg0 xg0) {
        this.i.a(xg0.r0(), xg0.K0());
        if (xg0.G1() != null) {
            xg0.G1().setClickable(false);
            xg0.G1().removeAllViews();
        }
        if (xg0.T1() != null) {
            xg0.T1().b(this.t);
        }
        this.r = null;
    }

    public final void c(View view) {
        a v2 = this.h.v();
        boolean z = this.h.u() != null;
        if (this.k.a() && v2 != null && z && view != null) {
            q.r().a(v2, view);
        }
    }

    public final synchronized boolean c(Bundle bundle) {
        if (this.s) {
            return true;
        }
        boolean c2 = this.i.c(bundle);
        this.s = c2;
        return c2;
    }

    public final synchronized void f() {
        this.i.X();
    }

    public final synchronized boolean g() {
        return this.i.n0();
    }

    public final synchronized void h() {
        if (this.r == null) {
            co.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.g.execute(new bf0(this, this.r instanceof bg0));
        }
    }

    public final synchronized void i() {
        if (!this.s) {
            this.i.b();
        }
    }

    public final boolean j() {
        return this.k.d();
    }

    public final boolean k() {
        return this.k.a();
    }

    public final df0 l() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        this.i.destroy();
        this.h.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n() {
        try {
            int o2 = this.h.o();
            if (o2 != 1) {
                if (o2 != 2) {
                    if (o2 != 3) {
                        if (o2 != 6) {
                            if (o2 != 7) {
                                co.b("Wrong native template id!");
                            } else if (this.l.e() != null) {
                                this.l.e().a(this.p.get());
                            }
                        } else if (this.l.c() != null) {
                            a("Google", true);
                            this.l.c().a(this.o.get());
                        }
                    } else if (this.l.a(this.h.e()) != null) {
                        if (this.h.t() != null) {
                            a("Google", true);
                        }
                        this.l.a(this.h.e()).a(this.q.get());
                    }
                } else if (this.l.b() != null) {
                    a("Google", true);
                    this.l.b().a(this.n.get());
                }
            } else if (this.l.a() != null) {
                a("Google", true);
                this.l.a().a(this.m.get());
            }
        } catch (RemoteException e) {
            co.b("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final synchronized void o() {
        this.i.i0();
    }
}
