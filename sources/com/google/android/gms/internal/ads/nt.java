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
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.a;
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
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
final class nt extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, ws {
    @GuardedBy("this")
    private boolean A;
    @GuardedBy("this")
    private boolean B;
    @GuardedBy("this")
    private k1 C;
    @GuardedBy("this")
    private j1 D;
    @GuardedBy("this")
    private pi2 E;
    @GuardedBy("this")
    private int F;
    @GuardedBy("this")
    private int G;
    private m H;
    private m I;
    private m J;
    private p K;
    @GuardedBy("this")
    private c L;
    @GuardedBy("this")
    private boolean M;
    private pn N;
    private int O = -1;
    private int P = -1;
    private int Q = -1;
    private int R = -1;
    private Map<String, wr> S;
    private final WindowManager T;
    private final wj2 U;

    /* renamed from: b  reason: collision with root package name */
    private final nu f3883b;

    /* renamed from: c  reason: collision with root package name */
    private final eq1 f3884c;
    private final fo d;
    private final i e;
    private final a f;
    private final DisplayMetrics g;
    private final float h;
    private final yi2 i;
    private final boolean j;
    private boolean k = false;
    private boolean l = false;
    private vs m;
    @GuardedBy("this")
    private c n;
    @GuardedBy("this")
    private b.c.b.a.d.a o;
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
    private boolean u;
    @GuardedBy("this")
    private Boolean v;
    @GuardedBy("this")
    private int w;
    @GuardedBy("this")
    private boolean x = true;
    @GuardedBy("this")
    private String y = BuildConfig.FLAVOR;
    @GuardedBy("this")
    private rt z;

    private nt(nu nuVar, lu luVar, String str, boolean z2, boolean z3, eq1 eq1, fo foVar, o oVar, i iVar, a aVar, wj2 wj2, yi2 yi2, boolean z4) {
        super(nuVar);
        this.f3883b = nuVar;
        this.p = luVar;
        this.q = str;
        this.t = z2;
        this.w = -1;
        this.f3884c = eq1;
        this.d = foVar;
        this.e = iVar;
        this.f = aVar;
        this.T = (WindowManager) getContext().getSystemService("window");
        q.c();
        DisplayMetrics a2 = gl.a(this.T);
        this.g = a2;
        this.h = a2.density;
        this.U = wj2;
        this.i = yi2;
        this.j = z4;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            co.b("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        q.c().a(nuVar, foVar.f2633b, settings);
        q.e().a(getContext(), settings);
        setDownloadListener(this);
        T();
        if (l.d()) {
            addJavascriptInterface(st.a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.N = new pn(this.f3883b.b(), this, this, null);
        X();
        p pVar = new p(new o(true, "make_wv", this.q));
        this.K = pVar;
        pVar.a().a(oVar);
        m a3 = j.a(this.K.a());
        this.I = a3;
        this.K.a("native:view_create", a3);
        this.J = null;
        this.H = null;
        q.e().b(nuVar);
        q.g().f();
    }

    private final boolean O() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.m.f() && !this.m.j()) {
            return false;
        }
        on2.a();
        DisplayMetrics displayMetrics = this.g;
        int b2 = sn.b(displayMetrics, displayMetrics.widthPixels);
        on2.a();
        DisplayMetrics displayMetrics2 = this.g;
        int b3 = sn.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity b4 = this.f3883b.b();
        if (b4 == null || b4.getWindow() == null) {
            i3 = b2;
            i2 = b3;
        } else {
            q.c();
            int[] c2 = gl.c(b4);
            on2.a();
            int b5 = sn.b(this.g, c2[0]);
            on2.a();
            i2 = sn.b(this.g, c2[1]);
            i3 = b5;
        }
        if (this.P == b2 && this.O == b3 && this.Q == i3 && this.R == i2) {
            return false;
        }
        if (!(this.P == b2 && this.O == b3)) {
            z2 = true;
        }
        this.P = b2;
        this.O = b3;
        this.Q = i3;
        this.R = i2;
        new wd(this).a(b2, b3, i3, i2, this.g.density, this.T.getDefaultDisplay().getRotation());
        return z2;
    }

    private final synchronized void R() {
        Boolean d2 = q.g().d();
        this.v = d2;
        if (d2 == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                a((Boolean) true);
            } catch (IllegalStateException unused) {
                a((Boolean) false);
            }
        }
    }

    private final void S() {
        j.a(this.K.a(), this.I, "aeh2");
    }

    private final synchronized void T() {
        if (!this.t) {
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
        if (!this.u) {
            q.e();
            setLayerType(1, null);
        }
        this.u = true;
    }

    private final synchronized void V() {
        if (this.u) {
            q.e();
            setLayerType(0, null);
        }
        this.u = false;
    }

    private final synchronized void W() {
        if (this.S != null) {
            for (wr wrVar : this.S.values()) {
                wrVar.a();
            }
        }
        this.S = null;
    }

    private final void X() {
        o a2;
        p pVar = this.K;
        if (pVar != null && (a2 = pVar.a()) != null && q.g().c() != null) {
            q.g().c().a(a2);
        }
    }

    private final synchronized Boolean Y() {
        return this.v;
    }

    private final synchronized void Z() {
        if (!this.M) {
            this.M = true;
            q.g().g();
        }
    }

    static nt a(Context context, lu luVar, String str, boolean z2, boolean z3, eq1 eq1, fo foVar, o oVar, i iVar, a aVar, wj2 wj2, yi2 yi2, boolean z4) {
        return new nt(new nu(context), luVar, str, z2, z3, eq1, foVar, oVar, iVar, aVar, wj2, yi2, z4);
    }

    private final void a(Boolean bool) {
        synchronized (this) {
            this.v = bool;
        }
        q.g().a(bool);
    }

    @TargetApi(19)
    private final synchronized void a(String str, ValueCallback<String> valueCallback) {
        if (!e()) {
            evaluateJavascript(str, null);
        } else {
            co.d("#004 The webview is destroyed. Ignoring action.");
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

    private final synchronized void b(String str) {
        if (!e()) {
            loadUrl(str);
        } else {
            co.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final void d(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        a("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void g(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
            q.g().a(e2, "AdWebViewImpl.loadUrlUnsafe");
            co.c("Could not call loadUrl. ", e2);
        }
    }

    private final void h(String str) {
        if (l.f()) {
            if (Y() == null) {
                R();
            }
            if (Y().booleanValue()) {
                a(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            b(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        b(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized b.c.b.a.d.a A() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized boolean B() {
        return this.F > 0;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final m C() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final Context D() {
        return this.f3883b.a();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void E() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void F() {
        if (this.H == null) {
            j.a(this.K.a(), this.I, "aes2");
            m a2 = j.a(this.K.a());
            this.H = a2;
            this.K.a("native:view_show", a2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.d.f2633b);
        a("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized String G() {
        return this.q;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final yi2 H() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final synchronized void I() {
        if (this.D != null) {
            this.D.E0();
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final WebViewClient J() {
        return this.m;
    }

    @Override // com.google.android.gms.ads.internal.i
    public final synchronized void K() {
        if (this.e != null) {
            this.e.K();
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean L() {
        return ((Boolean) on2.e().a(zr2.e3)).booleanValue() && this.i != null && this.j;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized c M() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void N() {
        this.N.c();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final /* synthetic */ ju P() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void Q() {
        wk.e("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.wt, com.google.android.gms.internal.ads.ws
    public final Activity a() {
        return this.f3883b.b();
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
        this.i.a(activity, this);
        this.i.a(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.i.getView());
        } else {
            co.b("The FrameLayout object cannot be null.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(b.c.b.a.d.a aVar) {
        this.o = aVar;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(c cVar) {
        this.L = cVar;
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(d dVar) {
        this.m.a(dVar);
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final void a(hh2 hh2) {
        synchronized (this) {
            this.A = hh2.j;
        }
        d(hh2.j);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(j1 j1Var) {
        this.D = j1Var;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(k1 k1Var) {
        this.C = k1Var;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(lu luVar) {
        this.p = luVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(pi2 pi2) {
        this.E = pi2;
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final synchronized void a(rt rtVar) {
        if (this.z != null) {
            co.b("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.z = rtVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void a(String str) {
        h(str);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(String str, m<d5<? super ws>> mVar) {
        vs vsVar = this.m;
        if (vsVar != null) {
            vsVar.a(str, mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(String str, d5<? super ws> d5Var) {
        vs vsVar = this.m;
        if (vsVar != null) {
            vsVar.b(str, d5Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final synchronized void a(String str, wr wrVar) {
        if (this.S == null) {
            this.S = new HashMap();
        }
        this.S.put(str, wrVar);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void a(String str, String str2, String str3) {
        if (!e()) {
            super.loadDataWithBaseURL(str, cu.a(str2, cu.a()), "text/html", "UTF-8", str3);
            return;
        }
        co.d("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.e7
    public final void a(String str, Map<String, ?> map) {
        try {
            a(str, q.c().a(map));
        } catch (JSONException unused) {
            co.d("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.e7
    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        co.a(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        h(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void a(boolean z2) {
        this.m.c(z2);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(boolean z2, int i2) {
        this.m.a(z2, i2);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(boolean z2, int i2, String str) {
        this.m.a(z2, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(boolean z2, int i2, String str, String str2) {
        this.m.a(z2, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void a(boolean z2, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z2 ? "1" : "0");
        hashMap.put("duration", Long.toString(j2));
        a("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.hu, com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final fo b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void b(int i2) {
        if (i2 == 0) {
            j.a(this.K.a(), this.I, "aebb2");
        }
        S();
        if (this.K.a() != null) {
            this.K.a().a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.d.f2633b);
        a("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void b(c cVar) {
        this.n = cVar;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void b(String str, d5<? super ws> d5Var) {
        vs vsVar = this.m;
        if (vsVar != null) {
            vsVar.a(str, d5Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        h(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void b(boolean z2) {
        if (this.n != null) {
            this.n.a(this.m.f(), z2);
        } else {
            this.r = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean b(boolean z2, int i2) {
        destroy();
        this.U.a(new lt(z2, i2));
        this.U.a(yj2.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final a c() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void c(Context context) {
        this.f3883b.setBaseContext(context);
        this.N.a(this.f3883b.b());
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void c(boolean z2) {
        this.x = z2;
    }

    @Override // com.google.android.gms.internal.ads.eu, com.google.android.gms.internal.ads.ws
    public final eq1 d() {
        return this.f3884c;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final synchronized wr d(String str) {
        if (this.S == null) {
            return null;
        }
        return this.S.get(str);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void destroy() {
        X();
        this.N.d();
        if (this.n != null) {
            this.n.b2();
            this.n.onDestroy();
            this.n = null;
        }
        this.o = null;
        this.m.i();
        if (!this.s) {
            q.y();
            xr.a(this);
            W();
            this.s = true;
            wk.e("Initiating WebView self destruct sequence in 3...");
            wk.e("Loading blank page in WebView, 2...");
            g("about:blank");
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void e(boolean z2) {
        int i2 = this.F + (z2 ? 1 : -1);
        this.F = i2;
        if (i2 <= 0 && this.n != null) {
            this.n.h2();
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized boolean e() {
        return this.s;
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (e()) {
            co.f("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.fu, com.google.android.gms.internal.ads.ws
    public final synchronized lu f() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void f(boolean z2) {
        this.m.d(z2);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.s) {
                    this.m.i();
                    q.y();
                    xr.a(this);
                    W();
                    Z();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final p g() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void g(boolean z2) {
        boolean z3 = z2 != this.t;
        this.t = z2;
        T();
        if (z3) {
            if (!((Boolean) on2.e().a(zr2.G)).booleanValue() || !this.p.b()) {
                new wd(this).c(z2 ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final synchronized String getRequestId() {
        return this.y;
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
        return this.t;
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final synchronized rt i() {
        return this.z;
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

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!e()) {
            super.loadData(str, str2, str3);
        } else {
            co.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!e()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            co.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void loadUrl(String str) {
        if (!e()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                q.g().a(e2, "AdWebViewImpl.loadUrl");
                co.c("Could not call loadUrl. ", e2);
            }
        } else {
            co.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized void m() {
        wk.e("Destroying WebView!");
        Z();
        gl.h.post(new ot(this));
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void n() {
        if (this.J == null) {
            m a2 = j.a(this.K.a());
            this.J = a2;
            this.K.a("native:view_load", a2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void o() {
        S();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.d.f2633b);
        a("onhide", hashMap);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!e()) {
            this.N.a();
        }
        boolean z2 = this.A;
        if (this.m != null && this.m.j()) {
            if (!this.B) {
                this.m.l();
                this.m.m();
                this.B = true;
            }
            O();
            z2 = true;
        }
        d(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!e()) {
                this.N.b();
            }
            super.onDetachedFromWindow();
            if (this.B && this.m != null && this.m.j() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.m.l();
                this.m.m();
                this.B = false;
            }
        }
        d(false);
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
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!e()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
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
        boolean O2 = O();
        c M2 = M();
        if (M2 != null && O2) {
            M2.f2();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public final synchronized void onMeasure(int i2, int i3) {
        if (e()) {
            setMeasuredDimension(0, 0);
        } else if (isInEditMode() || this.t || this.p.c()) {
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
            b("/contentHeight", new pt(this));
            h("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
            setMeasuredDimension(View.MeasureSpec.getSize(i2), this.G != -1 ? (int) (((float) this.G) * this.g.density) : View.MeasureSpec.getSize(i3));
        } else if (this.p.b()) {
            setMeasuredDimension(this.g.widthPixels, this.g.heightPixels);
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
            boolean z2 = this.p.f3605c > i8 || this.p.f3604b > i7;
            if (((Boolean) on2.e().a(zr2.r2)).booleanValue()) {
                boolean z3 = ((float) this.p.f3605c) / this.h <= ((float) i8) / this.h && ((float) this.p.f3604b) / this.h <= ((float) i7) / this.h;
                if (z2) {
                    z2 = z3;
                }
            }
            if (z2) {
                StringBuilder sb = new StringBuilder(103);
                sb.append("Not enough space to show ad. Needs ");
                sb.append((int) (((float) this.p.f3605c) / this.h));
                sb.append("x");
                sb.append((int) (((float) this.p.f3604b) / this.h));
                sb.append(" dp, but only has ");
                sb.append((int) (((float) size3) / this.h));
                sb.append("x");
                sb.append((int) (((float) size4) / this.h));
                sb.append(" dp.");
                co.d(sb.toString());
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                if (!this.k) {
                    this.U.a(yj2.BANNER_SIZE_INVALID);
                    this.k = true;
                }
            } else {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.l) {
                    this.U.a(yj2.BANNER_SIZE_VALID);
                    this.l = true;
                }
                setMeasuredDimension(this.p.f3605c, this.p.f3604b);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void onPause() {
        if (!e()) {
            try {
                super.onPause();
            } catch (Exception e2) {
                co.b("Could not pause webview.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void onResume() {
        if (!e()) {
            try {
                super.onResume();
            } catch (Exception e2) {
                co.b("Could not resume webview.", e2);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m.j() || this.m.k()) {
            eq1 eq1 = this.f3884c;
            if (eq1 != null) {
                eq1.a(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.C != null) {
                    this.C.a(motionEvent);
                }
            }
        }
        if (e()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.ads.internal.i
    public final synchronized void p() {
        if (this.e != null) {
            this.e.p();
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized c q() {
        return this.L;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized pi2 r() {
        return this.E;
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
        this.w = i2;
        if (this.n != null) {
            this.n.b(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof vs) {
            this.m = (vs) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!e()) {
            try {
                super.stopLoading();
            } catch (Exception e2) {
                co.b("Could not stop loading webview.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized boolean u() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final synchronized k1 v() {
        return this.C;
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
        a("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean y() {
        return false;
    }
}
