package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.c;
import java.util.Map;
import java.util.concurrent.Executor;

public final class sk0 {

    /* renamed from: a  reason: collision with root package name */
    private final t50 f4673a;

    /* renamed from: b  reason: collision with root package name */
    private final v60 f4674b;

    /* renamed from: c  reason: collision with root package name */
    private final k70 f4675c;
    private final t70 d;
    private final w80 e;
    private final Executor f;
    private final za0 g;
    private final ez h;
    private final c i;
    private final p60 j;
    private final vi k;
    private final eq1 l;
    private final l80 m;

    public sk0(t50 t50, v60 v60, k70 k70, t70 t70, w80 w80, Executor executor, za0 za0, ez ezVar, c cVar, p60 p60, vi viVar, eq1 eq1, l80 l80) {
        this.f4673a = t50;
        this.f4674b = v60;
        this.f4675c = k70;
        this.d = t70;
        this.e = w80;
        this.f = executor;
        this.g = za0;
        this.h = ezVar;
        this.i = cVar;
        this.j = p60;
        this.k = viVar;
        this.l = eq1;
        this.m = l80;
    }

    public static lo1<?> a(ws wsVar, String str, String str2) {
        ro roVar = new ro();
        wsVar.P().a(new dl0(roVar));
        wsVar.a(str, str2, (String) null);
        return roVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.f4674b.S();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view) {
        this.i.a();
        vi viVar = this.k;
        if (viVar != null) {
            viVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ws wsVar, ws wsVar2, Map map) {
        this.h.a(wsVar);
    }

    public final void a(ws wsVar, boolean z) {
        wf1 a2;
        wsVar.P().a(new vk0(this), this.f4675c, this.d, new uk0(this), new xk0(this), z, null, this.i, new cl0(this), this.k);
        wsVar.setOnTouchListener(new wk0(this));
        wsVar.setOnClickListener(new zk0(this));
        if (((Boolean) on2.e().a(zr2.Z0)).booleanValue() && (a2 = this.l.a()) != null) {
            a2.a(wsVar.getView());
        }
        this.g.a(wsVar, this.f);
        this.g.a(new yk0(wsVar), this.f);
        this.g.a(wsVar.getView());
        wsVar.b("/trackActiveViewUnit", new bl0(this, wsVar));
        this.h.a((Object) wsVar);
        if (!((Boolean) on2.e().a(zr2.k0)).booleanValue()) {
            p60 p60 = this.j;
            wsVar.getClass();
            p60.a(al0.a(wsVar), this.f);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, String str2) {
        this.e.a(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        this.i.a();
        vi viVar = this.k;
        if (viVar == null) {
            return false;
        }
        viVar.a();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f4673a.l();
    }
}
