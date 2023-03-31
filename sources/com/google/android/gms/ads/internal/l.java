package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.bn2;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.do2;
import com.google.android.gms.internal.ads.eh;
import com.google.android.gms.internal.ads.eq1;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.fo;
import com.google.android.gms.internal.ads.g0;
import com.google.android.gms.internal.ads.ht1;
import com.google.android.gms.internal.ads.io2;
import com.google.android.gms.internal.ads.jo;
import com.google.android.gms.internal.ads.le;
import com.google.android.gms.internal.ads.lp2;
import com.google.android.gms.internal.ads.mp2;
import com.google.android.gms.internal.ads.no2;
import com.google.android.gms.internal.ads.on2;
import com.google.android.gms.internal.ads.qn2;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.rm2;
import com.google.android.gms.internal.ads.rn2;
import com.google.android.gms.internal.ads.rp2;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.ti2;
import com.google.android.gms.internal.ads.to2;
import com.google.android.gms.internal.ads.u;
import com.google.android.gms.internal.ads.um2;
import com.google.android.gms.internal.ads.xp2;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class l extends do2 {

    /* renamed from: b  reason: collision with root package name */
    private final fo f1404b;

    /* renamed from: c  reason: collision with root package name */
    private final um2 f1405c;
    private final Future<eq1> d = jo.f3256a.a(new m(this));
    private final Context e;
    private final o f;
    private WebView g = new WebView(this.e);
    private rn2 h;
    private eq1 i;
    private AsyncTask<Void, Void, String> j;

    public l(Context context, um2 um2, String str, fo foVar) {
        this.e = context;
        this.f1404b = foVar;
        this.f1405c = um2;
        this.f = new o(context, str);
        b(0);
        this.g.setVerticalScrollBarEnabled(false);
        this.g.getSettings().setJavaScriptEnabled(true);
        this.g.setWebViewClient(new k(this));
        this.g.setOnTouchListener(new n(this));
    }

    /* access modifiers changed from: private */
    public final String B(String str) {
        if (this.i == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.i.a(parse, this.e, null, null);
        } catch (ht1 e2) {
            co.c("Unable to process ad data", e2);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    public final void C(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.e.startActivity(intent);
    }

    /* access modifiers changed from: package-private */
    public final int A(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            on2.a();
            return sn.b(this.e, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean D() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final String D1() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void E1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final no2 S0() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final String V() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final um2 Z1() {
        return this.f1405c;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final String a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(bn2 bn2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(eh ehVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(er2 er2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(io2 io2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(le leVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(lp2 lp2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(no2 no2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(qn2 qn2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(re reVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(rn2 rn2) {
        this.h = rn2;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(ti2 ti2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(u uVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(um2 um2) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(xp2 xp2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean a(rm2 rm2) {
        r.a(this.g, "This Search Ad has already been torn down");
        this.f.a(rm2, this.f1404b);
        this.j = new p(this, null).execute(new Void[0]);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (this.g != null) {
            this.g.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void b(to2 to2) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final String b2() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(g0.d.a());
        builder.appendQueryParameter("query", this.f.a());
        builder.appendQueryParameter("pubId", this.f.c());
        Map<String, String> d2 = this.f.d();
        for (String str : d2.keySet()) {
            builder.appendQueryParameter(str, d2.get(str));
        }
        Uri build = builder.build();
        eq1 eq1 = this.i;
        if (eq1 != null) {
            try {
                build = eq1.a(build, this.e);
            } catch (ht1 e2) {
                co.c("Unable to process ad data", e2);
            }
        }
        String c2 = c2();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(c2);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void c(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void c(boolean z) {
    }

    /* access modifiers changed from: package-private */
    public final String c2() {
        String b2 = this.f.b();
        if (TextUtils.isEmpty(b2)) {
            b2 = "www.google.com";
        }
        String a2 = g0.d.a();
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 8 + String.valueOf(a2).length());
        sb.append("https://");
        sb.append(b2);
        sb.append(a2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void destroy() {
        r.a("destroy must be called on the main UI thread.");
        this.j.cancel(true);
        this.d.cancel(true);
        this.g.destroy();
        this.g = null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final rp2 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final mp2 j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final a m1() {
        r.a("getAdFrame must be called on the main UI thread.");
        return b.a(this.g);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void p() {
        r.a("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void s(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final rn2 t1() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean u() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final Bundle v() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void x0() {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void z() {
        r.a("resume must be called on the main UI thread.");
    }
}
