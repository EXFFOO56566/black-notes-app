package com.google.android.gms.internal.ads;

import org.json.JSONArray;

final /* synthetic */ class rv0 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final pv0 f4552a;

    /* renamed from: b  reason: collision with root package name */
    private final vd1 f4553b;

    /* renamed from: c  reason: collision with root package name */
    private final id1 f4554c;

    rv0(pv0 pv0, vd1 vd1, id1 id1) {
        this.f4552a = pv0;
        this.f4553b = vd1;
        this.f4554c = id1;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        return this.f4552a.a(this.f4553b, this.f4554c, (JSONArray) obj);
    }
}
