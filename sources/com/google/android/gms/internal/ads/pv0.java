package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class pv0 implements mv0<xe0> {

    /* renamed from: a  reason: collision with root package name */
    private final zd0 f4236a;

    /* renamed from: b  reason: collision with root package name */
    private final ko1 f4237b;

    /* renamed from: c  reason: collision with root package name */
    private final kh0 f4238c;
    private final ke1<jj0> d;

    public pv0(zd0 zd0, ko1 ko1, kh0 kh0, ke1<jj0> ke1) {
        this.f4236a = zd0;
        this.f4237b = ko1;
        this.f4238c = kh0;
        this.d = ke1;
    }

    private final lo1<xe0> a(vd1 vd1, id1 id1, JSONObject jSONObject) {
        lo1<jj0> a2 = this.d.a();
        lo1<if0> a3 = this.f4238c.a(vd1, id1, jSONObject);
        return yn1.b(a2, a3).a(new sv0(this, a3, a2, vd1, id1, jSONObject), this.f4237b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(id1 id1, jj0 jj0) {
        JSONObject a2 = an.a("isNonagon", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", id1.p.f3694c);
        jSONObject.put("sdk_params", a2);
        return yn1.a(jj0.a("google.afma.nativeAds.preProcessJson", jSONObject), new qv0(this, jj0), this.f4237b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(jj0 jj0, JSONObject jSONObject) {
        this.d.a(yn1.a(jj0));
        if (jSONObject.optBoolean("success")) {
            return yn1.a(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new f9("process json failed");
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<List<lo1<xe0>>> a(vd1 vd1, id1 id1) {
        return yn1.a(yn1.a(this.d.a(), new ov0(this, id1), this.f4237b), new rv0(this, vd1, id1), this.f4237b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(vd1 vd1, id1 id1, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return yn1.a((Throwable) new gp0(3));
        }
        int i = 0;
        if (vd1.f5092a.f4150a.k <= 1) {
            return yn1.a(a(vd1, id1, jSONArray.getJSONObject(0)), tv0.f4862a, this.f4237b);
        }
        int length = jSONArray.length();
        this.d.a(Math.min(length, vd1.f5092a.f4150a.k));
        ArrayList arrayList = new ArrayList(vd1.f5092a.f4150a.k);
        while (i < vd1.f5092a.f4150a.k) {
            arrayList.add(i < length ? a(vd1, id1, jSONArray.getJSONObject(i)) : yn1.a((Throwable) new gp0(3)));
            i++;
        }
        return yn1.a((Object) arrayList);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ xe0 a(lo1 lo1, lo1 lo12, vd1 vd1, id1 id1, JSONObject jSONObject) {
        if0 if0 = (if0) lo1.get();
        jj0 jj0 = (jj0) lo12.get();
        kf0 a2 = this.f4236a.a(new d30(vd1, id1, null), new wf0(if0), new le0(jSONObject, jj0));
        a2.i().a();
        a2.j().a(jj0);
        a2.k().a(if0.t());
        return a2.h();
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        md1 md1 = id1.p;
        return (md1 == null || md1.f3694c == null) ? false : true;
    }
}
