package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.t.a;

public final class bk implements dk {
    @Override // com.google.android.gms.internal.ads.dk
    public final lo1<a.C0067a> a(Context context) {
        ro roVar = new ro();
        on2.a();
        if (sn.c(context)) {
            jo.f3256a.execute(new fk(this, context, roVar));
        }
        return roVar;
    }

    @Override // com.google.android.gms.internal.ads.dk
    public final lo1<String> a(Context context, int i) {
        return yn1.a((Object) null);
    }

    @Override // com.google.android.gms.internal.ads.dk
    public final lo1<String> a(String str, PackageInfo packageInfo) {
        return yn1.a(str);
    }
}
