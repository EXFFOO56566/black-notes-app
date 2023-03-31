package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.q;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class su {
    public static ws a(Context context, lu luVar, String str, boolean z, boolean z2, eq1 eq1, fo foVar, o oVar, i iVar, a aVar, wj2 wj2, yi2 yi2, boolean z3) {
        try {
            return (ws) kn.a(new vu(context, luVar, str, z, z2, eq1, foVar, null, iVar, aVar, wj2, yi2, z3));
        } catch (Throwable th) {
            q.g().a(th, "AdWebViewFactory.newAdWebView2");
            throw new it("Webview initialization failed.", th);
        }
    }
}
