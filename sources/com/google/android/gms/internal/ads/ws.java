package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b.c.b.a.d.a;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.common.util.m;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public interface ws extends i, e7, c8, gq, wt, zt, du, eu, gu, hu, fh2 {
    a A();

    boolean B();

    Context D();

    void E();

    void F();

    String G();

    yi2 H();

    WebViewClient J();

    boolean L();

    c M();

    void N();

    ju P();

    void Q();

    @Override // com.google.android.gms.internal.ads.wt, com.google.android.gms.internal.ads.gq
    Activity a();

    void a(ViewGroup viewGroup, Activity activity, String str, String str2);

    void a(a aVar);

    void a(c cVar);

    void a(j1 j1Var);

    void a(k1 k1Var);

    void a(lu luVar);

    void a(pi2 pi2);

    @Override // com.google.android.gms.internal.ads.gq
    void a(rt rtVar);

    void a(String str, m<d5<? super ws>> mVar);

    void a(String str, d5<? super ws> d5Var);

    @Override // com.google.android.gms.internal.ads.gq
    void a(String str, wr wrVar);

    void a(String str, String str2, String str3);

    @Override // com.google.android.gms.internal.ads.hu, com.google.android.gms.internal.ads.gq
    fo b();

    void b(int i);

    void b(c cVar);

    void b(String str, d5<? super ws> d5Var);

    void b(boolean z);

    boolean b(boolean z, int i);

    @Override // com.google.android.gms.internal.ads.gq
    com.google.android.gms.ads.internal.a c();

    void c(Context context);

    void c(boolean z);

    @Override // com.google.android.gms.internal.ads.eu
    eq1 d();

    void destroy();

    void e(boolean z);

    boolean e();

    @Override // com.google.android.gms.internal.ads.fu
    lu f();

    void f(boolean z);

    @Override // com.google.android.gms.internal.ads.gq
    p g();

    void g(boolean z);

    @Override // com.google.android.gms.internal.ads.wt, com.google.android.gms.internal.ads.gq
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    @Override // com.google.android.gms.internal.ads.gu
    View getView();

    WebView getWebView();

    int getWidth();

    @Override // com.google.android.gms.internal.ads.zt
    boolean h();

    @Override // com.google.android.gms.internal.ads.gq
    rt i();

    boolean k();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void m();

    void measure(int i, int i2);

    void n();

    void o();

    void onPause();

    void onResume();

    c q();

    pi2 r();

    @Override // com.google.android.gms.internal.ads.gq
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    boolean u();

    k1 v();

    void x();

    boolean y();
}
