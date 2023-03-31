package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

public final class da<I, O> implements ln1<I, O> {

    /* renamed from: a  reason: collision with root package name */
    private final k9<O> f2230a;

    /* renamed from: b  reason: collision with root package name */
    private final j9<I> f2231b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2232c;
    private final lo1<e9> d;

    da(lo1<e9> lo1, String str, j9<I> j9Var, k9<O> k9Var) {
        this.d = lo1;
        this.f2232c = str;
        this.f2231b = j9Var;
        this.f2230a = k9Var;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1<O> a(I i) {
        return yn1.a(this.d, new ca(this, i), jo.f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(Object obj, e9 e9Var) {
        ro roVar = new ro();
        q.c();
        String b2 = gl.b();
        p4.o.a(b2, new fa(this, roVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", b2);
        jSONObject.put("args", this.f2231b.a(obj));
        e9Var.b(this.f2232c, jSONObject);
        return roVar;
    }
}
