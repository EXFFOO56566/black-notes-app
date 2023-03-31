package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import b.c.b.a.d.a;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import javax.annotation.concurrent.GuardedBy;

public final class d20 implements n60, l70 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f2197b;

    /* renamed from: c  reason: collision with root package name */
    private final ws f2198c;
    private final id1 d;
    private final fo e;
    @GuardedBy("this")
    private a f;
    @GuardedBy("this")
    private boolean g;

    public d20(Context context, ws wsVar, id1 id1, fo foVar) {
        this.f2197b = context;
        this.f2198c = wsVar;
        this.d = id1;
        this.e = foVar;
    }

    private final synchronized void a() {
        if (this.d.J) {
            if (this.f2198c != null) {
                if (q.r().b(this.f2197b)) {
                    int i = this.e.f2634c;
                    int i2 = this.e.d;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    this.f = q.r().a(sb.toString(), this.f2198c.getWebView(), BuildConfig.FLAVOR, "javascript", this.d.L.optInt("media_type", -1) == 0 ? null : "javascript");
                    View view = this.f2198c.getView();
                    if (!(this.f == null || view == null)) {
                        q.r().a(this.f, view);
                        this.f2198c.a(this.f);
                        q.r().a(this.f);
                        this.g = true;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final synchronized void K() {
        if (!this.g) {
            a();
        }
        if (!(!this.d.J || this.f == null || this.f2198c == null)) {
            this.f2198c.a("onSdkImpression", new a.e.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final synchronized void s() {
        if (!this.g) {
            a();
        }
    }
}
