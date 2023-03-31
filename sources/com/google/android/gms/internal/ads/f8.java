package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class f8 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2551a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2552b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2553c;
    private final fo d;
    private mm<r7> e;
    private mm<r7> f;
    private w8 g;
    private int h;

    public f8(Context context, fo foVar, String str) {
        this.f2551a = new Object();
        this.h = 1;
        this.f2553c = str;
        this.f2552b = context.getApplicationContext();
        this.d = foVar;
        this.e = new t8();
        this.f = new t8();
    }

    public f8(Context context, fo foVar, String str, mm<r7> mmVar, mm<r7> mmVar2) {
        this(context, foVar, str);
        this.e = mmVar;
        this.f = mmVar2;
    }

    /* access modifiers changed from: protected */
    public final w8 a(eq1 eq1) {
        w8 w8Var = new w8(this.f);
        jo.e.execute(new e8(this, eq1, w8Var));
        w8Var.a(new o8(this, w8Var), new r8(this, w8Var));
        return w8Var;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(eq1 eq1, w8 w8Var) {
        try {
            Context context = this.f2552b;
            fo foVar = this.d;
            r7 d7Var = c1.f2039c.a().booleanValue() ? new d7(context, foVar) : new t7(context, foVar, eq1, null);
            d7Var.a(new j8(this, w8Var, d7Var));
            d7Var.b("/jsLoaded", new k8(this, w8Var, d7Var));
            hn hnVar = new hn();
            n8 n8Var = new n8(this, eq1, d7Var, hnVar);
            hnVar.a(n8Var);
            d7Var.b("/requestReload", n8Var);
            if (this.f2553c.endsWith(".js")) {
                d7Var.c(this.f2553c);
            } else if (this.f2553c.startsWith("<html>")) {
                d7Var.e(this.f2553c);
            } else {
                d7Var.f(this.f2553c);
            }
            gl.h.postDelayed(new m8(this, w8Var, d7Var), (long) q8.f4284a);
        } catch (Throwable th) {
            co.b("Error creating webview.", th);
            q.g().a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            w8Var.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(r7 r7Var) {
        if (r7Var.e()) {
            this.h = 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(w8 w8Var, r7 r7Var) {
        synchronized (this.f2551a) {
            if (w8Var.a() != -1) {
                if (w8Var.a() != 1) {
                    w8Var.b();
                    ko1 ko1 = jo.e;
                    r7Var.getClass();
                    ko1.execute(l8.a(r7Var));
                    wk.e("Could not receive loaded message in a timely manner. Rejecting.");
                }
            }
        }
    }

    public final s8 b(eq1 eq1) {
        synchronized (this.f2551a) {
            synchronized (this.f2551a) {
                if (this.g != null && this.h == 0) {
                    this.g.a(new h8(this), g8.f2721a);
                }
            }
            if (this.g == null || this.g.a() == -1) {
                this.h = 2;
                w8 a2 = a((eq1) null);
                this.g = a2;
                return a2.c();
            } else if (this.h == 0) {
                return this.g.c();
            } else if (this.h == 1) {
                this.h = 2;
                a((eq1) null);
                return this.g.c();
            } else if (this.h == 2) {
                return this.g.c();
            } else {
                return this.g.c();
            }
        }
    }
}
