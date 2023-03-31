package com.google.android.gms.internal.ads;

import java.util.Map;

public final class iy implements ln1<vd1, vd1> {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ly> f3148a;

    public iy(Map<String, ly> map) {
        this.f3148a = map;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.lo1' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.ln1
    public final /* synthetic */ lo1<vd1> a(vd1 vd1) {
        vd1 vd12 = vd1;
        for (rd1 rd1 : vd12.f5093b.f4643c) {
            if (this.f3148a.containsKey(rd1.f4485a)) {
                this.f3148a.get(rd1.f4485a).a(rd1.f4486b);
            }
        }
        return yn1.a(vd12);
    }
}
