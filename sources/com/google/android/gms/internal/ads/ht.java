package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import b.c.b.a.d.a;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.m;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class ht extends FrameLayout implements ws {

    /* renamed from: b  reason: collision with root package name */
    private final ws f2973b;

    /* renamed from: c  reason: collision with root package name */
    private final zp f2974c;
    private final AtomicBoolean d = new AtomicBoolean();

    public ht(ws wsVar) {
        super(wsVar.getContext());
        this.f2973b = wsVar;
        this.f2974c = new zp(wsVar.D(), this, this);
        if (!L()) {
            addView(this.f2973b.getView());
        }
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final a A() {
        return this.f2973b.A();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean B() {
        return this.f2973b.B();
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final m C() {
        return this.f2973b.C();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final Context D() {
        return this.f2973b.D();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void E() {
        setBackgroundColor(0);
        this.f2973b.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void F() {
        this.f2973b.F();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final String G() {
        return this.f2973b.G();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final yi2 H() {
        return this.f2973b.H();
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void I() {
        this.f2973b.I();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final WebViewClient J() {
        return this.f2973b.J();
    }

    @Override // com.google.android.gms.ads.internal.i
    public final void K() {
        this.f2973b.K();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean L() {
        return this.f2973b.L();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final c M() {
        return this.f2973b.M();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void N() {
        this.f2973b.N();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final ju P() {
        return this.f2973b.P();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void Q() {
        TextView textView = new TextView(getContext());
        Resources b2 = q.g().b();
        textView.setText(b2 != null ? b2.getString(com.google.android.gms.ads.u.a.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.wt, com.google.android.gms.internal.ads.ws
    public final Activity a() {
        return this.f2973b.a();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(ViewGroup viewGroup, Activity activity, String str, String str2) {
        this.f2973b.a(this, activity, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(a aVar) {
        this.f2973b.a(aVar);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(c cVar) {
        this.f2973b.a(cVar);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(d dVar) {
        this.f2973b.a(dVar);
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final void a(hh2 hh2) {
        this.f2973b.a(hh2);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(j1 j1Var) {
        this.f2973b.a(j1Var);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(k1 k1Var) {
        this.f2973b.a(k1Var);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(lu luVar) {
        this.f2973b.a(luVar);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(pi2 pi2) {
        this.f2973b.a(pi2);
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final void a(rt rtVar) {
        this.f2973b.a(rtVar);
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void a(String str) {
        this.f2973b.a(str);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(String str, m<d5<? super ws>> mVar) {
        this.f2973b.a(str, mVar);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(String str, d5<? super ws> d5Var) {
        this.f2973b.a(str, d5Var);
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final void a(String str, wr wrVar) {
        this.f2973b.a(str, wrVar);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void a(String str, String str2, String str3) {
        this.f2973b.a(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.e7
    public final void a(String str, Map<String, ?> map) {
        this.f2973b.a(str, map);
    }

    @Override // com.google.android.gms.internal.ads.e7
    public final void a(String str, JSONObject jSONObject) {
        this.f2973b.a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void a(boolean z) {
        this.f2973b.a(z);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(boolean z, int i) {
        this.f2973b.a(z, i);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(boolean z, int i, String str) {
        this.f2973b.a(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void a(boolean z, int i, String str, String str2) {
        this.f2973b.a(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void a(boolean z, long j) {
        this.f2973b.a(z, j);
    }

    @Override // com.google.android.gms.internal.ads.hu, com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final fo b() {
        return this.f2973b.b();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void b(int i) {
        this.f2973b.b(i);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void b(c cVar) {
        this.f2973b.b(cVar);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void b(String str, d5<? super ws> d5Var) {
        this.f2973b.b(str, d5Var);
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void b(String str, JSONObject jSONObject) {
        this.f2973b.b(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void b(boolean z) {
        this.f2973b.b(z);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean b(boolean z, int i) {
        if (!this.d.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) on2.e().a(zr2.i0)).booleanValue()) {
            return false;
        }
        if (this.f2973b.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f2973b.getParent()).removeView(this.f2973b.getView());
        }
        return this.f2973b.b(z, i);
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final com.google.android.gms.ads.internal.a c() {
        return this.f2973b.c();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void c(Context context) {
        this.f2973b.c(context);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void c(boolean z) {
        this.f2973b.c(z);
    }

    @Override // com.google.android.gms.internal.ads.eu, com.google.android.gms.internal.ads.ws
    public final eq1 d() {
        return this.f2973b.d();
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final wr d(String str) {
        return this.f2973b.d(str);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void destroy() {
        a A = A();
        if (A != null) {
            gl.h.post(new kt(A));
            gl.h.postDelayed(new jt(this), (long) ((Integer) on2.e().a(zr2.n2)).intValue());
            return;
        }
        this.f2973b.destroy();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void e(boolean z) {
        this.f2973b.e(z);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean e() {
        return this.f2973b.e();
    }

    @Override // com.google.android.gms.internal.ads.fu, com.google.android.gms.internal.ads.ws
    public final lu f() {
        return this.f2973b.f();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void f(boolean z) {
        this.f2973b.f(z);
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final p g() {
        return this.f2973b.g();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void g(boolean z) {
        this.f2973b.g(z);
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final String getRequestId() {
        return this.f2973b.getRequestId();
    }

    @Override // com.google.android.gms.internal.ads.gu, com.google.android.gms.internal.ads.ws
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final WebView getWebView() {
        return this.f2973b.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.ws, com.google.android.gms.internal.ads.zt
    public final boolean h() {
        return this.f2973b.h();
    }

    @Override // com.google.android.gms.internal.ads.gq, com.google.android.gms.internal.ads.ws
    public final rt i() {
        return this.f2973b.i();
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final int j() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean k() {
        return this.f2973b.k();
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final zp l() {
        return this.f2974c;
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void loadData(String str, String str2, String str3) {
        this.f2973b.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f2973b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void loadUrl(String str) {
        this.f2973b.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void m() {
        this.f2974c.a();
        this.f2973b.m();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void n() {
        this.f2973b.n();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void o() {
        this.f2973b.o();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void onPause() {
        this.f2974c.b();
        this.f2973b.onPause();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void onResume() {
        this.f2973b.onResume();
    }

    @Override // com.google.android.gms.ads.internal.i
    public final void p() {
        this.f2973b.p();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final c q() {
        return this.f2973b.q();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final pi2 r() {
        return this.f2973b.r();
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final int s() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2973b.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f2973b.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void setRequestedOrientation(int i) {
        this.f2973b.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f2973b.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f2973b.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean u() {
        return this.f2973b.u();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final k1 v() {
        return this.f2973b.v();
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void w() {
        this.f2973b.w();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final void x() {
        this.f2973b.x();
    }

    @Override // com.google.android.gms.internal.ads.ws
    public final boolean y() {
        return this.d.get();
    }
}
