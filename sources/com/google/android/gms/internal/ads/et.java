package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.i;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class et {
    public static lo1<ws> a(Context context, fo foVar, String str, eq1 eq1, a aVar) {
        return yn1.a(yn1.a((Object) null), new dt(context, eq1, foVar, aVar, str), jo.e);
    }

    public static ws a(Context context, lu luVar, String str, boolean z, boolean z2, eq1 eq1, fo foVar, o oVar, i iVar, a aVar, wj2 wj2, yi2 yi2, boolean z3) {
        zr2.a(context);
        if (c1.f2038b.a().booleanValue()) {
            return su.a(context, luVar, str, z, z2, eq1, foVar, null, iVar, aVar, wj2, yi2, z3);
        }
        try {
            return (ws) kn.a(new gt(context, luVar, str, z, z2, eq1, foVar, null, iVar, aVar, wj2, yi2, z3));
        } catch (Throwable th) {
            throw new it("Webview initialization failed.", th);
        }
    }
}
