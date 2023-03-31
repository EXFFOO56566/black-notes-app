package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Callable;

final /* synthetic */ class i41 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final f41 f3023a;

    i41(f41 f41) {
        this.f3023a = f41;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2;
        String str3;
        q.c();
        wh2 h = q.g().i().h();
        Bundle bundle = null;
        if (!(h == null || h == null || (q.g().i().d() && q.g().i().j()))) {
            if (h.d()) {
                h.a();
            }
            qh2 c2 = h.c();
            if (c2 != null) {
                str2 = c2.c();
                str = c2.d();
                str3 = c2.e();
                if (str2 != null) {
                    q.g().i().a(str2);
                }
                if (str3 != null) {
                    q.g().i().b(str3);
                }
            } else {
                str2 = q.g().i().n();
                str3 = q.g().i().f();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!q.g().i().j()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    str3 = "no_hash";
                }
                bundle2.putString("v_fp_vertical", str3);
            }
            if (str2 != null && !q.g().i().d()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new g41(bundle);
    }
}
