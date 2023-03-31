package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class sv0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final pv0 f4709a;

    /* renamed from: b  reason: collision with root package name */
    private final lo1 f4710b;

    /* renamed from: c  reason: collision with root package name */
    private final lo1 f4711c;
    private final vd1 d;
    private final id1 e;
    private final JSONObject f;

    sv0(pv0 pv0, lo1 lo1, lo1 lo12, vd1 vd1, id1 id1, JSONObject jSONObject) {
        this.f4709a = pv0;
        this.f4710b = lo1;
        this.f4711c = lo12;
        this.d = vd1;
        this.e = id1;
        this.f = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4709a.a(this.f4710b, this.f4711c, this.d, this.e, this.f);
    }
}
