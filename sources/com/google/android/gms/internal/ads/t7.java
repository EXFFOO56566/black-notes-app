package com.google.android.gms.internal.ads;

import android.content.Context;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.q;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class t7 implements m7, r7 {

    /* renamed from: b  reason: collision with root package name */
    private final ws f4762b;

    public t7(Context context, fo foVar, eq1 eq1, a aVar) {
        q.d();
        ws a2 = et.a(context, lu.f(), BuildConfig.FLAVOR, false, false, eq1, foVar, null, null, null, wj2.a(), null, false);
        this.f4762b = a2;
        a2.getView().setWillNotDraw(true);
    }

    private static void a(Runnable runnable) {
        on2.a();
        if (sn.b()) {
            runnable.run();
        } else {
            gl.h.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void a(u7 u7Var) {
        ju P = this.f4762b.P();
        u7Var.getClass();
        P.a(y7.a(u7Var));
    }

    @Override // com.google.android.gms.internal.ads.c8, com.google.android.gms.internal.ads.m7
    public final void a(String str) {
        a(new w7(this, str));
    }

    @Override // com.google.android.gms.internal.ads.e9
    public final void a(String str, d5<? super e9> d5Var) {
        this.f4762b.a(str, new v7(d5Var));
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

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        this.f4762b.a(str);
    }

    @Override // com.google.android.gms.internal.ads.e9
    public final void b(String str, d5<? super e9> d5Var) {
        this.f4762b.b(str, new d8(this, d5Var));
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void b(String str, JSONObject jSONObject) {
        l7.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void c(String str) {
        a(new x7(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void destroy() {
        this.f4762b.destroy();
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void e(String str) {
        a(new b8(this, str));
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final boolean e() {
        return this.f4762b.e();
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void f(String str) {
        a(new a8(this, str));
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final d9 z() {
        return new g9(this);
    }
}
