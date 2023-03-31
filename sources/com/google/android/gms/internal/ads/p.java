package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, m> f4077a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final o f4078b;

    public p(o oVar) {
        this.f4078b = oVar;
    }

    public final o a() {
        return this.f4078b;
    }

    public final void a(String str, m mVar) {
        this.f4077a.put(str, mVar);
    }

    public final void a(String str, String str2, long j) {
        o oVar = this.f4078b;
        m mVar = this.f4077a.get(str2);
        String[] strArr = {str};
        if (!(oVar == null || mVar == null)) {
            oVar.a(mVar, j, strArr);
        }
        Map<String, m> map = this.f4077a;
        o oVar2 = this.f4078b;
        map.put(str, oVar2 == null ? null : oVar2.a(j));
    }
}
