package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

public final class j {
    public static m a(o oVar) {
        if (oVar == null) {
            return null;
        }
        return oVar.a(q.j().b());
    }

    public static boolean a(o oVar, m mVar, String... strArr) {
        if (oVar == null || mVar == null || !oVar.f3919a || mVar == null) {
            return false;
        }
        return oVar.a(mVar, q.j().b(), strArr);
    }
}
