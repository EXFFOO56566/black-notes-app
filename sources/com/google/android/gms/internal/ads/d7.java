package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class d7 extends q7<e9> implements m7, r7 {
    private final av d;
    private u7 e;

    public d7(Context context, fo foVar) {
        try {
            av avVar = new av(context, new j7(this));
            this.d = avVar;
            avVar.setWillNotDraw(true);
            this.d.addJavascriptInterface(new k7(this), "GoogleJsInterface");
            q.c().a(context, foVar.f2633b, this.d.getSettings());
            super.a((Object) this);
        } catch (Throwable th) {
            throw new it("Init failed.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void a(u7 u7Var) {
        this.e = u7Var;
    }

    @Override // com.google.android.gms.internal.ads.c8, com.google.android.gms.internal.ads.m7
    public final void a(String str) {
        jo.e.execute(new i7(this, str));
    }

    @Override // com.google.android.gms.internal.ads.m7
    public final void a(String str, String str2) {
        l7.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.e7
    public final void a(String str, Map map) {
        l7.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.e7, com.google.android.gms.internal.ads.m7
    public final void a(String str, JSONObject jSONObject) {
        l7.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void b(String str, JSONObject jSONObject) {
        l7.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void c(String str) {
        e(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", str));
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void destroy() {
        this.d.destroy();
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void e(String str) {
        jo.e.execute(new g7(this, str));
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final boolean e() {
        return this.d.e();
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void f(String str) {
        jo.e.execute(new f7(this, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str) {
        this.d.a(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str) {
        this.d.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(String str) {
        this.d.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final d9 z() {
        return new g9(this);
    }
}
