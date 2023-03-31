package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class yp extends qp {
    @Override // com.google.android.gms.internal.ads.qp
    public final rp a(Context context, gq gqVar, int i, boolean z, o oVar, hq hqVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        return i == 2 ? new oq(context, new kq(context, gqVar.b(), gqVar.getRequestId(), oVar, gqVar.C()), gqVar, z, qp.a(gqVar), hqVar) : new dp(context, z, qp.a(gqVar), hqVar, new kq(context, gqVar.b(), gqVar.getRequestId(), oVar, gqVar.C()));
    }
}
