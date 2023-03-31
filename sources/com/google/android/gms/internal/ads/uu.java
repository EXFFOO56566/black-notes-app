package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b.c.b.a.d.a;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.m;
import com.google.android.gms.internal.ads.nk2;
import com.google.android.gms.internal.ads.vk2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
@ParametersAreNonnullByDefault
public final class uu extends av implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, m7, ws {
    @GuardedBy("this")
    private k1 A;
    @GuardedBy("this")
    private j1 B;
    @GuardedBy("this")
    private pi2 C;
    @GuardedBy("this")
    private int D;
    @GuardedBy("this")
    private int E;
    private m F;
    private m G;
    private m H;
    private p I;
    @GuardedBy("this")
    private c J;
    private pn K;
    private final AtomicReference<a> L = new AtomicReference<>();
    private int M = -1;
    private int N = -1;
    private int O = -1;
    private int P = -1;
    private Map<String, wr> Q;
    private final WindowManager R;
    private final nu e;
    private final pu f;
    private final eq1 g;
    private final fo h;
    private final i i;
    private final com.google.android.gms.ads.internal.a j;
    private final DisplayMetrics k;
    private final wj2 l;
    private final yi2 m;
    private final boolean n;
    @GuardedBy("this")
    private c o;
    @GuardedBy("this")
    private lu p;
    @GuardedBy("this")
    private String q;
    @GuardedBy("this")
    private boolean r;
    @GuardedBy("this")
    private boolean s;
    @GuardedBy("this")
    private boolean t;
    @GuardedBy("this")
    private int u;
    @GuardedBy("this")
    private boolean v = true;
    @GuardedBy("this")
    private String w = BuildConfig.FLAVOR;
    @GuardedBy("this")
    private rt x;
    @GuardedBy("this")
    private boolean y;
    @GuardedBy("this")
    private boolean z;

    protected uu(nu nuVar, pu puVar, lu luVar, String str, boolean z2, boolean z3, eq1 eq1, fo foVar, o oVar, i iVar, com.google.android.gms.ads.internal.a aVar, wj2 wj2, yi2 yi2, boolean z4) {
        super(nuVar, puVar);
        this.e = nuVar;
        this.f = puVar;
        this.p = luVar;
        this.q = str;
        this.s = z2;
        this.u = -1;
        this.g = eq1;
        this.h = foVar;
        this.i = iVar;
        this.j = aVar;
        this.R = (WindowManager) getContext().getSystemService("window");
        q.c();
        this.k = gl.a(this.R);
        this.l = wj2;
        this.m = yi2;
        this.n = z4;
        this.K = new pn(this.e.b(), this, this, null);
        q.c().a(nuVar, foVar.f2633b, getSettings());
        setDownloadListener(this);
        T();
        if (l.d()) {
            addJavascriptInterface(st.a(this), "googleAdsJsInterface");
        }
        X();
        p pVar = new p(new o(true, "make_wv", this.q));
        this.I = pVar;
        pVar.a().a(oVar);
        m a2 = j.a(this.I.a());
        this.G = a2;
        this.I.a("native:view_create", a2);
        this.H = null;
        this.F = null;
        q.e().b(nuVar);
    }

    private final boolean R() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.f.f() && !this.f.j()) {
            return false;
        }
        on2.a();
        DisplayMetrics displayMetrics = this.k;
        int b2 = sn.b(displayMetrics, displayMetrics.widthPixels);
        on2.a();
        DisplayMetrics displayMetrics2 = this.k;
        int b3 = sn.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity b4 = this.e.b();
        if (b4 == null || b4.getWindow() == null) {
            i3 = b2;
            i2 = b3;
        } else {
            q.c();
            int[] c2 = gl.c(b4);
            on2.a();
            int b5 = sn.b(this.k, c2[0]);
            on2.a();
            i2 = sn.b(this.k, c2[1]);
            i3 = b5;
        }
        if (this.N == b2 && this.M == b3 && this.O == i3 && this.P == i2) {
            return false;
        }
        if (!(this.N == b2 && this.M == b3)) {
            z2 = true;
        }
        this.N = b2;
        this.M = b3;
        this.O = i3;
        this.P = i2;
        new wd(this).a(b2, b3, i3, i2, this.k.density, this.R.getDefaultDisplay().getRotation());
        return z2;
    }

    private final void S() {
        j.a(this.I.a(), this.G, "aeh2");
    }

    private final synchronized void T() {
        if (!this.s) {
            if (!this.p.b()) {
                if (Build.VERSION.SDK_INT < 18) {
                    co.a("Disabling hardware acceleration on an AdView.");
                    U();
                    return;
                }
                co.a("Enabling hardware acceleration on an AdView.");
                V();
                return;
            }
        }
        co.a("Enabling hardware acceleration on an overlay.");
        V();
    }

    private final synchronized void U() {
        if (!this.t) {
            q.e();
            setLayerType(1, null);
        }
        this.t = true;
    }

    private final synchronized void V() {
        if (this.t) {
            q.e();
            setLayerType(0, null);
        }
        this.t = false;
    }

    private final synchronized void W() {
        if (this.Q != null) {
            for (wr wrVar : this.Q.values()) {
                wrVar.a();
            }
        }
        this.Q = null;
    }

    private final void X() {
        o a2;
        p pVar = this.I;
        if (pVar != null && (a2 = pVar.a()) != null && q.g().c() != null) {
            q.g().c().a(a2);
        }
    }

    static final /* synthetic */ void a(boolean z2, int i2, vk2.a aVar) {
        nk2.a q2 = nk2.q();
        if (q2.m() != z2) {
            q2.a(z2);
        }
        q2.a(i2);
        aVar.a((nk2) ((rz1) q2.e()));
    }

    private final void h(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        l7.a(this, "onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final a A() {
        return this.L.get();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized boolean B() {
        return this.D > 0;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final m C() {
        return this.G;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final Context D() {
        return this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void E() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void F() {
        if (this.F == null) {
            j.a(this.I.a(), this.G, "aes2");
            m a2 = j.a(this.I.a());
            this.F = a2;
            this.I.a("native:view_show", a2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.h.f2633b);
        l7.a(this, "onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized String G() {
        return this.q;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final yi2 H() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final synchronized void I() {
        if (this.B != null) {
            this.B.E0();
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final WebViewClient J() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.internal.i
    public final synchronized void K() {
        if (this.i != null) {
            this.i.K();
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean L() {
        return ((Boolean) on2.e().a(zr2.e3)).booleanValue() && this.m != null && this.n;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized c M() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void N() {
        this.K.c();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final /* synthetic */ ju P() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void Q() {
        wk.e("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.wt, com.google.android.gms.internal.ads.ws
    public final Activity a() {
        return this.e.b();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(ViewGroup viewGroup, Activity activity, String str, String str2) {
        if (!L()) {
            wk.e("AR ad is not enabled or the ad from the server is not an AR ad.");
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        wk.e("Initializing ArWebView object.");
        this.m.a(activity, this);
        this.m.a(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.m.getView());
        } else {
            co.b("The FrameLayout object cannot be null.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(a aVar) {
        this.L.set(aVar);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(c cVar) {
        this.J = cVar;
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(d dVar) {
        this.f.a(dVar);
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final void a(hh2 hh2) {
        synchronized (this) {
            this.y = hh2.j;
        }
        h(hh2.j);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(j1 j1Var) {
        this.B = j1Var;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(k1 k1Var) {
        this.A = k1Var;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(lu luVar) {
        this.p = luVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(pi2 pi2) {
        this.C = pi2;
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final synchronized void a(rt rtVar) {
        if (this.x != null) {
            co.b("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.x = rtVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zu, com.google.android.gms.internal.ads.c8, com.google.android.gms.internal.ads.m7
    public final synchronized void a(String str) {
        if (!e()) {
            super.a(str);
        } else {
            co.d("The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(String str, m<d5<? super ws>> mVar) {
        pu puVar = this.f;
        if (puVar != null) {
            puVar.a(str, mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(String str, d5<? super ws> d5Var) {
        pu puVar = this.f;
        if (puVar != null) {
            puVar.b(str, d5Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final synchronized void a(String str, wr wrVar) {
        if (this.Q == null) {
            this.Q = new HashMap();
        }
        this.Q.put(str, wrVar);
    }

    @Override // com.google.android.gms.internal.ads.m7
    public final void a(String str, String str2) {
        l7.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(String str, String str2, String str3) {
        super.loadDataWithBaseURL(str, cu.a(str2, cu.a()), "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.internal.ads.e7
    public final void a(String str, Map map) {
        l7.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.e7, com.google.android.gms.internal.ads.m7
    public final void a(String str, JSONObject jSONObject) {
        l7.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void a(boolean z2) {
        this.f.c(z2);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(boolean z2, int i2) {
        this.f.a(z2, i2);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(boolean z2, int i2, String str) {
        this.f.a(z2, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(boolean z2, int i2, String str, String str2) {
        this.f.a(z2, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void a(boolean z2, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z2 ? "1" : "0");
        hashMap.put("duration", Long.toString(j2));
        l7.a(this, "onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.hu, com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final fo b() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void b(int i2) {
        if (i2 == 0) {
            j.a(this.I.a(), this.G, "aebb2");
        }
        S();
        if (this.I.a() != null) {
            this.I.a().a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.h.f2633b);
        l7.a(this, "onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void b(c cVar) {
        this.o = cVar;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void b(String str, d5<? super ws> d5Var) {
        pu puVar = this.f;
        if (puVar != null) {
            puVar.a(str, d5Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void b(String str, JSONObject jSONObject) {
        l7.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void b(boolean z2) {
        if (this.o != null) {
            this.o.a(this.f.f(), z2);
        } else {
            this.r = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean b(boolean z2, int i2) {
        destroy();
        this.l.a(new xu(z2, i2));
        this.l.a(yj2.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final com.google.android.gms.ads.internal.a c() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void c(Context context) {
        this.e.setBaseContext(context);
        this.K.a(this.e.b());
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void c(boolean z2) {
        this.v = z2;
    }

    @Override // com.google.android.gms.internal.ads.eu, com.google.android.gms.internal.ads.ws
    public final eq1 d() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final synchronized wr d(String str) {
        if (this.Q == null) {
            return null;
        }
        return this.Q.get(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.av
    public final synchronized void d(boolean z2) {
        if (!z2) {
            X();
            this.K.d();
            if (this.o != null) {
                this.o.b2();
                this.o.onDestroy();
                this.o = null;
            }
        }
        this.L.set(null);
        this.f.i();
        q.y();
        xr.a(this);
        W();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void e(boolean z2) {
        int i2 = this.D + (z2 ? 1 : -1);
        this.D = i2;
        if (i2 <= 0 && this.o != null) {
            this.o.h2();
        }
    }

    @Override // com.google.android.gms.internal.ads.fu, com.google.android.gms.internal.ads.ws
    public final synchronized lu f() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void f(boolean z2) {
        this.f.d(z2);
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final p g() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void g(boolean z2) {
        boolean z3 = z2 != this.s;
        this.s = z2;
        T();
        if (z3) {
            if (!((Boolean) on2.e().a(zr2.G)).booleanValue() || !this.p.b()) {
                new wd(this).c(z2 ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final synchronized String getRequestId() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.gu, com.google.android.gms.internal.ads.ws
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zt, com.google.android.gms.internal.ads.ws
    public final synchronized boolean h() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final synchronized rt i() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final int j() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized boolean k() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final zp l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.av, com.google.android.gms.internal.ads.ws
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void n() {
        if (this.H == null) {
            m a2 = j.a(this.I.a());
            this.H = a2;
            this.I.a("native:view_load", a2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void o() {
        S();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.h.f2633b);
        l7.a(this, "onhide", hashMap);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!e()) {
            this.K.a();
        }
        boolean z2 = this.y;
        if (this.f != null && this.f.j()) {
            if (!this.z) {
                this.f.l();
                this.f.m();
                this.z = true;
            }
            R();
            z2 = true;
        }
        h(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!e()) {
                this.K.b();
            }
            super.onDetachedFromWindow();
            if (this.z && this.f != null && this.f.j() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f.l();
                this.f.m();
                this.z = false;
            }
        }
        h(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            q.c();
            gl.a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            co.a(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.av
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean R2 = R();
        c M2 = M();
        if (M2 != null && R2) {
            M2.f2();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public final synchronized void onMeasure(int i2, int i3) {
        if (e()) {
            setMeasuredDimension(0, 0);
        } else if (isInEditMode() || this.s || this.p.c()) {
            super.onMeasure(i2, i3);
        } else if (this.p.e()) {
            super.onMeasure(i2, i3);
        } else if (this.p.d()) {
            if (((Boolean) on2.e().a(zr2.z1)).booleanValue()) {
                super.onMeasure(i2, i3);
                return;
            }
            rt i4 = i();
            float Q2 = i4 != null ? i4.Q() : 0.0f;
            if (Q2 == 0.0f) {
                super.onMeasure(i2, i3);
                return;
            }
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i3);
            int i5 = (int) (((float) size2) * Q2);
            int i6 = (int) (((float) size) / Q2);
            if (size2 == 0 && i6 != 0) {
                i5 = (int) (((float) i6) * Q2);
                size2 = i6;
            } else if (size == 0 && i5 != 0) {
                i6 = (int) (((float) i5) / Q2);
                size = i5;
            }
            setMeasuredDimension(Math.min(i5, size), Math.min(i6, size2));
        } else if (this.p.a()) {
            if (((Boolean) on2.e().a(zr2.B1)).booleanValue() || !l.d()) {
                super.onMeasure(i2, i3);
                return;
            }
            b("/contentHeight", new wu(this));
            a("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
            setMeasuredDimension(View.MeasureSpec.getSize(i2), this.E != -1 ? (int) (((float) this.E) * this.k.density) : View.MeasureSpec.getSize(i3));
        } else if (this.p.b()) {
            setMeasuredDimension(this.k.widthPixels, this.k.heightPixels);
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            int size3 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size4 = View.MeasureSpec.getSize(i3);
            int i7 = Integer.MAX_VALUE;
            int i8 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size3 : Integer.MAX_VALUE;
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i7 = size4;
            }
            boolean z2 = true;
            boolean z3 = this.p.f3605c > i8 || this.p.f3604b > i7;
            if (((Boolean) on2.e().a(zr2.r2)).booleanValue()) {
                if (((float) this.p.f3605c) / this.k.density > ((float) i8) / this.k.density || ((float) this.p.f3604b) / this.k.density > ((float) i7) / this.k.density) {
                    z2 = false;
                }
                if (z3) {
                    z3 = z2;
                }
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(103);
                sb.append("Not enough space to show ad. Needs ");
                sb.append((int) (((float) this.p.f3605c) / this.k.density));
                sb.append("x");
                sb.append((int) (((float) this.p.f3604b) / this.k.density));
                sb.append(" dp, but only has ");
                sb.append((int) (((float) size3) / this.k.density));
                sb.append("x");
                sb.append((int) (((float) size4) / this.k.density));
                sb.append(" dp.");
                co.d(sb.toString());
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                return;
            }
            if (getVisibility() != 8) {
                setVisibility(0);
            }
            setMeasuredDimension(this.p.f3605c, this.p.f3604b);
        }
    }

    @Override // com.google.android.gms.internal.ads.av, com.google.android.gms.internal.ads.ws
    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e2) {
            co.b("Could not pause webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.av, com.google.android.gms.internal.ads.ws
    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e2) {
            co.b("Could not resume webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f.j() || this.f.k()) {
            eq1 eq1 = this.g;
            if (eq1 != null) {
                eq1.a(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.A != null) {
                    this.A.a(motionEvent);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.ads.internal.i
    public final synchronized void p() {
        if (this.i != null) {
            this.i.p();
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized c q() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized pi2 r() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final int s() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void setRequestedOrientation(int i2) {
        this.u = i2;
        if (this.o != null) {
            this.o.b(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e2) {
            co.b("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized boolean u() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized k1 v() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void w() {
        c M2 = M();
        if (M2 != null) {
            M2.g2();
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void x() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(q.h().b()));
        hashMap.put("app_volume", String.valueOf(q.h().a()));
        hashMap.put("device_volume", String.valueOf(yl.a(getContext())));
        l7.a(this, "volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean y() {
        return false;
    }
}
