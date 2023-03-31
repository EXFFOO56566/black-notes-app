package com.google.android.gms.internal.ads;

import android.content.Context;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class kq0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3435a;

    /* renamed from: b  reason: collision with root package name */
    private final fo f3436b;

    /* renamed from: c  reason: collision with root package name */
    private final zd1 f3437c;
    private final Executor d;

    public kq0(Context context, fo foVar, zd1 zd1, Executor executor) {
        this.f3435a = context;
        this.f3436b = foVar;
        this.f3437c = zd1;
        this.d = executor;
    }

    public final lo1<vd1> a() {
        q9 b2 = q.p().b(this.f3435a, this.f3436b);
        m9<JSONObject> m9Var = l9.f3510b;
        i9 a2 = b2.a("google.afma.response.normalize", m9Var, m9Var);
        return yn1.a(yn1.a(yn1.a(yn1.a(BuildConfig.FLAVOR), new jq0(this, this.f3437c.d.t), this.d), new mq0(a2), this.d), new lq0(this), this.d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(JSONObject jSONObject) {
        return yn1.a(new vd1(new pd1(this.f3437c), sd1.a(new StringReader(jSONObject.toString()))));
    }
}
