package com.google.android.gms.internal.ads;

import a.g.l.u;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public class vs extends WebViewClient implements ju {

    /* renamed from: a  reason: collision with root package name */
    protected ws f5152a;

    /* renamed from: b  reason: collision with root package name */
    private final wj2 f5153b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, List<d5<? super ws>>> f5154c;
    private final Object d;
    private jm2 e;
    private o f;
    private iu g;
    private ku h;
    private l4 i;
    private n4 j;
    private boolean k;
    @GuardedBy("lock")
    private boolean l;
    @GuardedBy("lock")
    private boolean m;
    @GuardedBy("lock")
    private boolean n;
    private t o;
    private final sd p;
    private c q;
    private ld r;
    protected vi s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean w;
    private View.OnAttachStateChangeListener x;

    public vs(ws wsVar, wj2 wj2, boolean z) {
        this(wsVar, wj2, z, new sd(wsVar, wsVar.D(), new gr2(wsVar.getContext())), null);
    }

    private vs(ws wsVar, wj2 wj2, boolean z, sd sdVar, ld ldVar) {
        this.f5154c = new HashMap<>();
        this.d = new Object();
        this.k = false;
        this.f5153b = wj2;
        this.f5152a = wsVar;
        this.l = z;
        this.p = sdVar;
        this.r = null;
    }

    /* access modifiers changed from: private */
    public final void a(View view, vi viVar, int i2) {
        if (viVar.c() && i2 > 0) {
            viVar.a(view);
            if (viVar.c()) {
                gl.h.postDelayed(new at(this, view, viVar, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        d dVar;
        ld ldVar = this.r;
        boolean a2 = ldVar != null ? ldVar.a() : false;
        q.b();
        n.a(this.f5152a.getContext(), adOverlayInfoParcel, !a2);
        if (this.s != null) {
            String str = adOverlayInfoParcel.m;
            if (str == null && (dVar = adOverlayInfoParcel.f1411b) != null) {
                str = dVar.f1416c;
            }
            this.s.a(str);
        }
    }

    /* access modifiers changed from: private */
    public final void a(Map<String, String> map, List<d5<? super ws>> list, String str) {
        if (co.a(2)) {
            String valueOf = String.valueOf(str);
            wk.e(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                wk.e(sb.toString());
            }
        }
        for (d5<? super ws> d5Var : list) {
            d5Var.a(this.f5152a, map);
        }
    }

    private final WebResourceResponse b(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    q.c().a(this.f5152a.getContext(), this.f5152a.b().f2633b, false, httpURLConnection);
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
        if (this.x != null) {
            this.f5152a.getView().removeOnAttachStateChangeListener(this.x);
        }
    }

    private final void o() {
        if (this.g != null && ((this.t && this.v <= 0) || this.u)) {
            this.g.a(!this.u);
            this.g = null;
        }
        this.f5152a.n();
    }

    private static WebResourceResponse p() {
        if (((Boolean) on2.e().a(zr2.g0)).booleanValue()) {
            return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(String str, Map<String, String> map) {
        hj2 a2;
        try {
            String a3 = sj.a(str, this.f5152a.getContext(), this.w);
            if (!a3.equals(str)) {
                return b(a3, map);
            }
            ij2 a4 = ij2.a(str);
            if (a4 != null && (a2 = q.i().a(a4)) != null && a2.d()) {
                return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, a2.e());
            }
            if (!wn.a() || !l0.f3476b.a().booleanValue()) {
                return null;
            }
            return b(str, map);
        } catch (Exception | NoClassDefFoundError e2) {
            q.g().a(e2, "AdWebViewClient.interceptRequest");
            return p();
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a() {
        vi viVar = this.s;
        if (viVar != null) {
            WebView webView = this.f5152a.getWebView();
            if (u.B(webView)) {
                a(webView, viVar, 10);
                return;
            }
            n();
            this.x = new zs(this, viVar);
            this.f5152a.getView().addOnAttachStateChangeListener(this.x);
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(int i2, int i3) {
        ld ldVar = this.r;
        if (ldVar != null) {
            ldVar.a(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(int i2, int i3, boolean z) {
        this.p.a(i2, i3);
        ld ldVar = this.r;
        if (ldVar != null) {
            ldVar.a(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(Uri uri) {
        String path = uri.getPath();
        List<d5<? super ws>> list = this.f5154c.get(path);
        if (list != null) {
            if (!((Boolean) on2.e().a(zr2.A2)).booleanValue()) {
                q.c();
                a(gl.b(uri), list, path);
                return;
            }
            yn1.a(q.c().a(uri), new ct(this, list, path), jo.f);
            return;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("No GMSG handler found for GMSG: ");
        sb.append(valueOf);
        wk.e(sb.toString());
        if (((Boolean) on2.e().a(zr2.z3)).booleanValue() && q.g().c() != null) {
            jo.f3256a.execute(new xs(path));
        }
    }

    public final void a(d dVar) {
        boolean h2 = this.f5152a.h();
        a(new AdOverlayInfoParcel(dVar, (!h2 || this.f5152a.f().b()) ? this.e : null, h2 ? null : this.f, this.o, this.f5152a.b()));
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(iu iuVar) {
        this.g = iuVar;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(jm2 jm2, l4 l4Var, o oVar, n4 n4Var, t tVar, boolean z, g5 g5Var, c cVar, vd vdVar, vi viVar) {
        if (cVar == null) {
            cVar = new c(this.f5152a.getContext(), viVar, null);
        }
        this.r = new ld(this.f5152a, vdVar);
        this.s = viVar;
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
        a("/mraid", new i5(cVar, this.r, vdVar));
        a("/mraidLoaded", this.p);
        a("/open", new h5(cVar, this.r));
        a("/precache", new fs());
        a("/touch", p4.i);
        a("/video", p4.l);
        a("/videoMeta", p4.m);
        if (q.A().a(this.f5152a.getContext())) {
            a("/logScionEvent", new f5(this.f5152a.getContext()));
        }
        this.e = jm2;
        this.f = oVar;
        this.i = l4Var;
        this.j = n4Var;
        this.o = tVar;
        this.q = cVar;
        this.k = z;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(ku kuVar) {
        this.h = kuVar;
    }

    public final void a(String str, m<d5<? super ws>> mVar) {
        synchronized (this.d) {
            List<d5<? super ws>> list = this.f5154c.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (d5<? super ws> d5Var : list) {
                    if (mVar.a(d5Var)) {
                        arrayList.add(d5Var);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final void a(String str, d5<? super ws> d5Var) {
        synchronized (this.d) {
            List<d5<? super ws>> list = this.f5154c.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.f5154c.put(str, list);
            }
            list.add(d5Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void a(boolean z) {
        synchronized (this.d) {
            this.m = true;
        }
    }

    public final void a(boolean z, int i2) {
        jm2 jm2 = (!this.f5152a.h() || this.f5152a.f().b()) ? this.e : null;
        o oVar = this.f;
        t tVar = this.o;
        ws wsVar = this.f5152a;
        a(new AdOverlayInfoParcel(jm2, oVar, tVar, wsVar, z, i2, wsVar.b()));
    }

    public final void a(boolean z, int i2, String str) {
        boolean h2 = this.f5152a.h();
        jm2 jm2 = (!h2 || this.f5152a.f().b()) ? this.e : null;
        bt btVar = h2 ? null : new bt(this.f5152a, this.f);
        l4 l4Var = this.i;
        n4 n4Var = this.j;
        t tVar = this.o;
        ws wsVar = this.f5152a;
        a(new AdOverlayInfoParcel(jm2, btVar, l4Var, n4Var, tVar, wsVar, z, i2, str, wsVar.b()));
    }

    public final void a(boolean z, int i2, String str, String str2) {
        boolean h2 = this.f5152a.h();
        jm2 jm2 = (!h2 || this.f5152a.f().b()) ? this.e : null;
        bt btVar = h2 ? null : new bt(this.f5152a, this.f);
        l4 l4Var = this.i;
        n4 n4Var = this.j;
        t tVar = this.o;
        ws wsVar = this.f5152a;
        a(new AdOverlayInfoParcel(jm2, btVar, l4Var, n4Var, tVar, wsVar, z, i2, str, str2, wsVar.b()));
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final c b() {
        return this.q;
    }

    public final void b(String str, d5<? super ws> d5Var) {
        synchronized (this.d) {
            List<d5<? super ws>> list = this.f5154c.get(str);
            if (list != null) {
                list.remove(d5Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void b(boolean z) {
        synchronized (this.d) {
            this.n = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void c() {
        synchronized (this.d) {
        }
        this.v++;
        o();
    }

    public final void c(boolean z) {
        this.k = z;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void d() {
        synchronized (this.d) {
            this.k = false;
            this.l = true;
            jo.e.execute(new ys(this));
        }
    }

    public final void d(boolean z) {
        this.w = z;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void e() {
        wj2 wj2 = this.f5153b;
        if (wj2 != null) {
            wj2.a(yj2.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.u = true;
        o();
        if (((Boolean) on2.e().a(zr2.D2)).booleanValue()) {
            this.f5152a.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final boolean f() {
        boolean z;
        synchronized (this.d) {
            z = this.l;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final vi g() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final void h() {
        this.v--;
        o();
    }

    public final void i() {
        vi viVar = this.s;
        if (viVar != null) {
            viVar.b();
            this.s = null;
        }
        n();
        synchronized (this.d) {
            this.f5154c.clear();
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = false;
            this.l = false;
            this.m = false;
            this.o = null;
            if (this.r != null) {
                this.r.a(true);
                this.r = null;
            }
        }
    }

    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = this.m;
        }
        return z;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.n;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener l() {
        synchronized (this.d) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener m() {
        synchronized (this.d) {
        }
        return null;
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        wk.e(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.a();
        r0.h = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.t = true;
        r1 = r0.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.ws r2 = r0.f5152a     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.e()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.wk.e(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.ws r2 = r0.f5152a     // Catch:{ all -> 0x0029 }
            r2.m()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.t = r1
            com.google.android.gms.internal.ads.ku r1 = r0.h
            if (r1 == 0) goto L_0x0025
            r1.a()
            r1 = 0
            r0.h = r1
        L_0x0025:
            r0.o()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vs.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        yi2 H = this.f5152a.H();
        if (H != null && webView == H.getWebView()) {
            H.a(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f5152a.b(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(str, Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        wk.e(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.k && webView == this.f5152a.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    jm2 jm2 = this.e;
                    if (jm2 != null) {
                        jm2.l();
                        vi viVar = this.s;
                        if (viVar != null) {
                            viVar.a(str);
                        }
                        this.e = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f5152a.getWebView().willNotDraw()) {
                try {
                    eq1 d2 = this.f5152a.d();
                    if (d2 != null && d2.a(parse)) {
                        parse = d2.a(parse, this.f5152a.getContext(), this.f5152a.getView(), this.f5152a.a());
                    }
                } catch (ht1 unused) {
                    String valueOf2 = String.valueOf(str);
                    co.d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                c cVar = this.q;
                if (cVar == null || cVar.b()) {
                    a(new d("android.intent.action.VIEW", parse.toString(), null, null, null, null, null));
                } else {
                    this.q.a(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                co.d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            a(parse);
        }
        return true;
    }
}
