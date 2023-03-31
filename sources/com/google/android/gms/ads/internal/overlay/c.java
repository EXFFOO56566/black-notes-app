package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.ae;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.on2;
import com.google.android.gms.internal.ads.wd;
import com.google.android.gms.internal.ads.ws;
import com.google.android.gms.internal.ads.zr2;
import java.util.Collections;

public class c extends ae implements y {
    private static final int v = Color.argb(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    protected final Activity f1413b;

    /* renamed from: c  reason: collision with root package name */
    AdOverlayInfoParcel f1414c;
    ws d;
    private i e;
    private q f;
    private boolean g = false;
    private FrameLayout h;
    private WebChromeClient.CustomViewCallback i;
    private boolean j = false;
    private boolean k = false;
    private j l;
    private boolean m = false;
    int n = 0;
    private final Object o = new Object();
    private Runnable p;
    private boolean q;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private boolean u = true;

    public c(Activity activity) {
        this.f1413b = activity;
    }

    private final void a(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        g gVar;
        g gVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f1414c;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || (gVar2 = adOverlayInfoParcel2.p) == null || !gVar2.f1400c) ? false : true;
        boolean a2 = q.e().a(this.f1413b, configuration);
        if ((this.k && !z3) || a2) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.f1414c) != null && (gVar = adOverlayInfoParcel.p) != null && gVar.h) {
            z2 = true;
        }
        Window window = this.f1413b.getWindow();
        if (((Boolean) on2.e().a(zr2.w0)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i2 = 256;
            if (z) {
                i2 = 5380;
                if (z2) {
                    i2 = 5894;
                }
            }
            decorView.setSystemUiVisibility(i2);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT >= 19 && z2) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }

    private static void a(a aVar, View view) {
        if (aVar != null && view != null) {
            q.r().a(aVar, view);
        }
    }

    private final void g(boolean z) {
        int intValue = ((Integer) on2.e().a(zr2.f2)).intValue();
        p pVar = new p();
        pVar.d = 50;
        int i2 = 0;
        pVar.f1427a = z ? intValue : 0;
        if (!z) {
            i2 = intValue;
        }
        pVar.f1428b = i2;
        pVar.f1429c = intValue;
        this.f = new q(this.f1413b, pVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        a(z, this.f1414c.h);
        this.l.addView(this.f, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r19.f1413b.getResources().getConfiguration().orientation == 1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r19.f1413b.getResources().getConfiguration().orientation == 2) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(boolean r20) {
        /*
        // Method dump skipped, instructions count: 483
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.c.h(boolean):void");
    }

    private final void i2() {
        if (this.f1413b.isFinishing() && !this.s) {
            this.s = true;
            ws wsVar = this.d;
            if (wsVar != null) {
                wsVar.b(this.n);
                synchronized (this.o) {
                    if (!this.q && this.d.B()) {
                        e eVar = new e(this);
                        this.p = eVar;
                        gl.h.postDelayed(eVar, ((Long) on2.e().a(zr2.t0)).longValue());
                        return;
                    }
                }
            }
            e2();
        }
    }

    private final void j2() {
        this.d.F();
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void K1() {
        this.r = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.y
    public final void Q0() {
        this.n = 1;
        this.f1413b.finish();
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void R0() {
        if (((Boolean) on2.e().a(zr2.d2)).booleanValue() && this.d != null && (!this.f1413b.isFinishing() || this.e == null)) {
            q.e();
            ll.a(this.d);
        }
        i2();
    }

    @Override // com.google.android.gms.internal.ads.be
    public final boolean Y1() {
        this.n = 0;
        ws wsVar = this.d;
        if (wsVar == null) {
            return true;
        }
        boolean u2 = wsVar.u();
        if (!u2) {
            this.d.a("onbackblocked", Collections.emptyMap());
        }
        return u2;
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void a(int i2, int i3, Intent intent) {
    }

    public final void a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f1413b);
        this.h = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.h.addView(view, -1, -1);
        this.f1413b.setContentView(this.h);
        this.r = true;
        this.i = customViewCallback;
        this.g = true;
    }

    public final void a(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        g gVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        g gVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) on2.e().a(zr2.u0)).booleanValue() && (adOverlayInfoParcel2 = this.f1414c) != null && (gVar2 = adOverlayInfoParcel2.p) != null && gVar2.i;
        boolean z5 = ((Boolean) on2.e().a(zr2.v0)).booleanValue() && (adOverlayInfoParcel = this.f1414c) != null && (gVar = adOverlayInfoParcel.p) != null && gVar.j;
        if (z && z2 && z4 && !z5) {
            new wd(this.d, "useCustomClose").a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        q qVar = this.f;
        if (qVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            qVar.a(z3);
        }
    }

    public final void b(int i2) {
        if (this.f1413b.getApplicationInfo().targetSdkVersion >= ((Integer) on2.e().a(zr2.O2)).intValue()) {
            if (this.f1413b.getApplicationInfo().targetSdkVersion <= ((Integer) on2.e().a(zr2.P2)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) on2.e().a(zr2.Q2)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) on2.e().a(zr2.R2)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f1413b.setRequestedOrientation(i2);
        } catch (Throwable th) {
            q.g().b(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void b2() {
        this.n = 2;
        this.f1413b.finish();
    }

    public final void c2() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1414c;
        if (adOverlayInfoParcel != null && this.g) {
            b(adOverlayInfoParcel.k);
        }
        if (this.h != null) {
            this.f1413b.setContentView(this.l);
            this.r = true;
            this.h.removeAllViews();
            this.h = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.i;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.i = null;
        }
        this.g = false;
    }

    public final void d2() {
        this.l.removeView(this.f);
        g(true);
    }

    /* access modifiers changed from: package-private */
    public final void e2() {
        ws wsVar;
        o oVar;
        if (!this.t) {
            this.t = true;
            ws wsVar2 = this.d;
            if (wsVar2 != null) {
                this.l.removeView(wsVar2.getView());
                i iVar = this.e;
                if (iVar != null) {
                    this.d.c(iVar.d);
                    this.d.g(false);
                    ViewGroup viewGroup = this.e.f1421c;
                    View view = this.d.getView();
                    i iVar2 = this.e;
                    viewGroup.addView(view, iVar2.f1419a, iVar2.f1420b);
                    this.e = null;
                } else if (this.f1413b.getApplicationContext() != null) {
                    this.d.c(this.f1413b.getApplicationContext());
                }
                this.d = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f1414c;
            if (!(adOverlayInfoParcel == null || (oVar = adOverlayInfoParcel.d) == null)) {
                oVar.I();
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f1414c;
            if (adOverlayInfoParcel2 != null && (wsVar = adOverlayInfoParcel2.e) != null) {
                a(wsVar.A(), this.f1414c.e.getView());
            }
        }
    }

    public final void f2() {
        if (this.m) {
            this.m = false;
            j2();
        }
    }

    public final void g2() {
        this.l.f1423c = true;
    }

    public final void h2() {
        synchronized (this.o) {
            this.q = true;
            if (this.p != null) {
                gl.h.removeCallbacks(this.p);
                gl.h.post(this.p);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void j(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.j);
    }

    @Override // com.google.android.gms.internal.ads.be
    public void k(Bundle bundle) {
        this.f1413b.requestWindowFeature(1);
        this.j = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel a2 = AdOverlayInfoParcel.a(this.f1413b.getIntent());
            this.f1414c = a2;
            if (a2 != null) {
                if (a2.n.d > 7500000) {
                    this.n = 3;
                }
                if (this.f1413b.getIntent() != null) {
                    this.u = this.f1413b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.f1414c.p != null) {
                    this.k = this.f1414c.p.f1399b;
                } else {
                    this.k = false;
                }
                if (this.k && this.f1414c.p.g != -1) {
                    new l(this).b();
                }
                if (bundle == null) {
                    if (this.f1414c.d != null && this.u) {
                        this.f1414c.d.p();
                    }
                    if (!(this.f1414c.l == 1 || this.f1414c.f1412c == null)) {
                        this.f1414c.f1412c.l();
                    }
                }
                j jVar = new j(this.f1413b, this.f1414c.o, this.f1414c.n.f2633b);
                this.l = jVar;
                jVar.setId(1000);
                q.e().a(this.f1413b);
                int i2 = this.f1414c.l;
                if (i2 == 1) {
                    h(false);
                } else if (i2 == 2) {
                    this.e = new i(this.f1414c.e);
                    h(false);
                } else if (i2 == 3) {
                    h(true);
                } else {
                    throw new g("Could not determine ad overlay type.");
                }
            } else {
                throw new g("Could not get info for ad overlay.");
            }
        } catch (g e2) {
            co.d(e2.getMessage());
            this.n = 3;
            this.f1413b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void k1() {
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void m0() {
        if (((Boolean) on2.e().a(zr2.d2)).booleanValue()) {
            ws wsVar = this.d;
            if (wsVar == null || wsVar.e()) {
                co.d("The webview does not exist. Ignoring action.");
                return;
            }
            q.e();
            ll.b(this.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void onDestroy() {
        ws wsVar = this.d;
        if (wsVar != null) {
            try {
                this.l.removeView(wsVar.getView());
            } catch (NullPointerException unused) {
            }
        }
        i2();
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void onPause() {
        c2();
        o oVar = this.f1414c.d;
        if (oVar != null) {
            oVar.onPause();
        }
        if (!((Boolean) on2.e().a(zr2.d2)).booleanValue() && this.d != null && (!this.f1413b.isFinishing() || this.e == null)) {
            q.e();
            ll.a(this.d);
        }
        i2();
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void onResume() {
        o oVar = this.f1414c.d;
        if (oVar != null) {
            oVar.onResume();
        }
        a(this.f1413b.getResources().getConfiguration());
        if (!((Boolean) on2.e().a(zr2.d2)).booleanValue()) {
            ws wsVar = this.d;
            if (wsVar == null || wsVar.e()) {
                co.d("The webview does not exist. Ignoring action.");
                return;
            }
            q.e();
            ll.b(this.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void v(a aVar) {
        a((Configuration) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void z1() {
        this.n = 0;
    }
}
