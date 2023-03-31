package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.nf;
import com.google.android.gms.internal.ads.vi;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1393a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1394b;

    /* renamed from: c  reason: collision with root package name */
    private vi f1395c;
    private nf d = null;

    public c(Context context, vi viVar, nf nfVar) {
        this.f1393a = context;
        this.f1395c = viVar;
        if (0 == 0) {
            this.d = new nf();
        }
    }

    private final boolean c() {
        vi viVar = this.f1395c;
        return (viVar != null && viVar.d().g) || this.d.f3836b;
    }

    public final void a() {
        this.f1394b = true;
    }

    public final void a(String str) {
        List<String> list;
        if (c()) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            vi viVar = this.f1395c;
            if (viVar != null) {
                viVar.a(str, null, 3);
                return;
            }
            nf nfVar = this.d;
            if (nfVar.f3836b && (list = nfVar.f3837c) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        q.c();
                        gl.a(this.f1393a, BuildConfig.FLAVOR, replace);
                    }
                }
            }
        }
    }

    public final boolean b() {
        return !c() || this.f1394b;
    }
}
