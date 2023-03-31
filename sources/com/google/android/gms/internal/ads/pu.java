package com.google.android.gms.internal.ads;

import a.g.l.u;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.m;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public final class pu extends yu implements ju {
    protected ws d;
    private final q7<ws> e = new q7<>();
    private final Object f = new Object();
    private jm2 g;
    private o h;
    private iu i;
    private ku j;
    private l4 k;
    private n4 l;
    private boolean m = false;
    private volatile boolean n;
    @GuardedBy("lock")
    private boolean o;
    @GuardedBy("lock")
    private boolean p;
    private t q;
    private sd r;
    private c s;
    private ld t;
    private vi u;
    private boolean v;
    private boolean w;
    private int x;
    private boolean y;
    private View.OnAttachStateChangeListener z;

    /* access modifiers changed from: private */
    public final void a(View view, vi viVar, int i2) {
        if (viVar.c() && i2 > 0) {
            viVar.a(view);
            if (viVar.c()) {
                gl.h.postDelayed(new ru(this, view, viVar, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        d dVar;
        ld ldVar = this.t;
        boolean a2 = ldVar != null ? ldVar.a() : false;
        q.b();
        n.a(this.d.getContext(), adOverlayInfoParcel, !a2);
        if (this.u != null) {
            String str = adOverlayInfoParcel.m;
            if (str == null && (dVar = adOverlayInfoParcel.f1411b) != null) {
                str = dVar.f1416c;
            }
            this.u.a(str);
        }
    }

    private final WebResourceResponse e(bv bvVar) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(bvVar.f2015a);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry<String, String> entry : bvVar.f2017c.entrySet()) {
                    openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    q.c().a(this.d.getContext(), this.d.b().f2633b, false, httpURLConnection);
                    wn wnVar = new wn();
                    wnVar.a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    wnVar.a(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        q.c();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        } else if (headerField.startsWith("tel:")) {
                            return null;
                        } else {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                co.d("Protocol is null");
                                return p();
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String valueOf = String.valueOf(headerField);
                                co.a(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                co.d(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return p();
                            }
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        q.c();
        return gl.a(httpURLConnection);
    }

    private final void n() {
        if (this.z != null) {
            this.d.getView().removeOnAttachStateChangeListener(this.z);
        }
    }

    private final void o() {
        if (this.i != null && ((this.v && this.x <= 0) || this.w)) {
            this.i.a(!this.w);
            this.i = null;
        }
        this.d.n();
    }

    private static WebResourceResponse p() {
        if (((Boolean) on2.e().a(zr2.g0)).booleanValue()) {
            return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a() {
        vi viVar = this.u;
        if (viVar != null) {
            WebView webView = this.d.getWebView();
            if (u.B(webView)) {
                a(webView, viVar, 10);
                return;
            }
            n();
            this.z = new qu(this, viVar);
            this.d.getView().addOnAttachStateChangeListener(this.z);
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(int i2, int i3) {
        ld ldVar = this.t;
        if (ldVar != null) {
            ldVar.a(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(int i2, int i3, boolean z2) {
        this.r.a(i2, i3);
        ld ldVar = this.t;
        if (ldVar != null) {
            ldVar.a(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(Uri uri) {
        this.e.b(uri);
    }

    public final void a(d dVar) {
        boolean h2 = this.d.h();
        a(new AdOverlayInfoParcel(dVar, (!h2 || this.d.f().b()) ? this.g : null, h2 ? null : this.h, this.q, this.d.b()));
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void a(bv bvVar) {
        this.v = true;
        ku kuVar = this.j;
        if (kuVar != null) {
            kuVar.a();
            this.j = null;
        }
        o();
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(iu iuVar) {
        this.i = iuVar;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(jm2 jm2, l4 l4Var, o oVar, n4 n4Var, t tVar, boolean z2, g5 g5Var, c cVar, vd vdVar, vi viVar) {
        if (cVar == null) {
            cVar = new c(this.d.getContext(), viVar, null);
        }
        this.t = new ld(this.d, vdVar);
        this.u = viVar;
        if (((Boolean) on2.e().a(zr2.m0)).booleanValue()) {
            a("/adMetadata", new j4(l4Var));
        }
        a("/appEvent", new k4(n4Var));
        a("/backButton", p4.j);
        a("/refresh", p4.k);
        a("/canOpenURLs", p4.f4104a);
        a("/canOpenIntents", p4.f4105b);
        a("/click", p4.f4106c);
        a("/close", p4.d);
        a("/customClose", p4.e);
        a("/instrument", p4.n);
        a("/delayPageLoaded", p4.p);
        a("/delayPageClosed", p4.q);
        a("/getLocationInfo", p4.r);
        a("/httpTrack", p4.f);
        a("/log", p4.g);
        a("/mraid", new i5(cVar, this.t, vdVar));
        a("/mraidLoaded", this.r);
        a("/open", new h5(cVar, this.t));
        a("/precache", new fs());
        a("/touch", p4.i);
        a("/video", p4.l);
        a("/videoMeta", p4.m);
        if (q.A().a(this.d.getContext())) {
            a("/logScionEvent", new f5(this.d.getContext()));
        }
        this.g = jm2;
        this.h = oVar;
        this.k = l4Var;
        this.l = n4Var;
        this.q = tVar;
        this.s = cVar;
        this.m = z2;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(ku kuVar) {
        this.j = kuVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(ws wsVar, boolean z2) {
        sd sdVar = new sd(wsVar, wsVar.D(), new gr2(wsVar.getContext()));
        this.d = wsVar;
        this.n = z2;
        this.r = sdVar;
        this.t = null;
        this.e.a(wsVar);
    }

    public final void a(String str, m<d5<? super ws>> mVar) {
        this.e.a(str, mVar);
    }

    public final void a(String str, d5<? super ws> d5Var) {
        this.e.b(str, d5Var);
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(boolean z2) {
        synchronized (this.f) {
            this.o = true;
        }
    }

    public final void a(boolean z2, int i2) {
        jm2 jm2 = (!this.d.h() || this.d.f().b()) ? this.g : null;
        o oVar = this.h;
        t tVar = this.q;
        ws wsVar = this.d;
        a(new AdOverlayInfoParcel(jm2, oVar, tVar, wsVar, z2, i2, wsVar.b()));
    }

    public final void a(boolean z2, int i2, String str) {
        boolean h2 = this.d.h();
        jm2 jm2 = (!h2 || this.d.f().b()) ? this.g : null;
        tu tuVar = h2 ? null : new tu(this.d, this.h);
        l4 l4Var = this.k;
        n4 n4Var = this.l;
        t tVar = this.q;
        ws wsVar = this.d;
        a(new AdOverlayInfoParcel(jm2, tuVar, l4Var, n4Var, tVar, wsVar, z2, i2, str, wsVar.b()));
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        boolean h2 = this.d.h();
        jm2 jm2 = (!h2 || this.d.f().b()) ? this.g : null;
        tu tuVar = h2 ? null : new tu(this.d, this.h);
        l4 l4Var = this.k;
        n4 n4Var = this.l;
        t tVar = this.q;
        ws wsVar = this.d;
        a(new AdOverlayInfoParcel(jm2, tuVar, l4Var, n4Var, tVar, wsVar, z2, i2, str, str2, wsVar.b()));
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final c b() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void b(bv bvVar) {
        this.e.a(bvVar.f2016b);
    }

    public final void b(String str, d5<? super ws> d5Var) {
        this.e.a(str, d5Var);
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void b(boolean z2) {
        synchronized (this.f) {
            this.p = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void c() {
        synchronized (this.f) {
        }
        this.x++;
        o();
    }

    public final void c(boolean z2) {
        this.m = z2;
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final boolean c(bv bvVar) {
        String valueOf = String.valueOf(bvVar.f2015a);
        wk.e(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = bvVar.f2016b;
        if (this.e.a(uri)) {
            return true;
        }
        if (this.m) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                jm2 jm2 = this.g;
                if (jm2 != null) {
                    jm2.l();
                    vi viVar = this.u;
                    if (viVar != null) {
                        viVar.a(bvVar.f2015a);
                    }
                    this.g = null;
                }
                return false;
            }
        }
        if (!this.d.getWebView().willNotDraw()) {
            try {
                eq1 d2 = this.d.d();
                if (d2 != null && d2.a(uri)) {
                    uri = d2.a(uri, this.d.getContext(), this.d.getView(), this.d.a());
                }
            } catch (ht1 unused) {
                String valueOf2 = String.valueOf(bvVar.f2015a);
                co.d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            c cVar = this.s;
            if (cVar == null || cVar.b()) {
                a(new d("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.s.a(bvVar.f2015a);
            }
        } else {
            String valueOf3 = String.valueOf(bvVar.f2015a);
            co.d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final WebResourceResponse d(bv bvVar) {
        WebResourceResponse webResourceResponse;
        hj2 a2;
        vi viVar = this.u;
        if (viVar != null) {
            viVar.a(bvVar.f2015a, bvVar.f2017c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(bvVar.f2015a).getName())) {
            webResourceResponse = null;
        } else {
            d();
            String str = (String) on2.e().a(this.d.f().b() ? zr2.E : this.d.h() ? zr2.D : zr2.C);
            q.c();
            webResourceResponse = gl.c(this.d.getContext(), this.d.b().f2633b, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!sj.a(bvVar.f2015a, this.d.getContext(), this.y).equals(bvVar.f2015a)) {
                return e(bvVar);
            }
            ij2 a3 = ij2.a(bvVar.f2015a);
            if (a3 != null && (a2 = q.i().a(a3)) != null && a2.d()) {
                return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, a2.e());
            }
            if (!wn.a() || !l0.f3476b.a().booleanValue()) {
                return null;
            }
            return e(bvVar);
        } catch (Exception | NoClassDefFoundError e2) {
            q.g().a(e2, "AdWebViewClient.interceptRequest");
            return p();
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void d() {
        synchronized (this.f) {
            this.m = false;
            this.n = true;
            jo.e.execute(new ou(this));
        }
    }

    public final void d(boolean z2) {
        this.y = z2;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void e() {
        this.w = true;
        o();
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final boolean f() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final vi g() {
        return this.u;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void h() {
        this.x--;
        o();
    }

    public final void i() {
        vi viVar = this.u;
        if (viVar != null) {
            viVar.b();
            this.u = null;
        }
        n();
        this.e.p();
        this.e.a((ws) null);
        synchronized (this.f) {
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.q = null;
            if (this.t != null) {
                this.t.a(true);
                this.t = null;
            }
        }
    }

    public final boolean j() {
        boolean z2;
        synchronized (this.f) {
            z2 = this.o;
        }
        return z2;
    }

    public final boolean k() {
        boolean z2;
        synchronized (this.f) {
            z2 = this.p;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener l() {
        synchronized (this.f) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener m() {
        synchronized (this.f) {
        }
        return null;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        yi2 H = this.d.H();
        if (H != null && webView == H.getWebView()) {
            H.a(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.d.b(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
