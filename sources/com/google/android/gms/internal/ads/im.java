package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

public final class im extends a9 {
    private final Context d;

    private im(Context context, d6 d6Var) {
        super(d6Var);
        this.d = context;
    }

    public static hm2 a(Context context) {
        hm2 hm2 = new hm2(new ba(new File(context.getCacheDir(), "admob_volley"), 20971520), new im(context, new rh()));
        hm2.a();
        return hm2;
    }

    @Override // com.google.android.gms.internal.ads.a9, com.google.android.gms.internal.ads.de2
    public final ef2 a(gh2<?> gh2) {
        if (gh2.n() && gh2.c() == 0) {
            if (Pattern.matches((String) on2.e().a(zr2.R1), gh2.e())) {
                on2.a();
                if (sn.c(this.d, 13400000)) {
                    ef2 a2 = new x5(this.d).a(gh2);
                    if (a2 != null) {
                        String valueOf = String.valueOf(gh2.e());
                        wk.e(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a2;
                    }
                    String valueOf2 = String.valueOf(gh2.e());
                    wk.e(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(gh2);
    }
}
