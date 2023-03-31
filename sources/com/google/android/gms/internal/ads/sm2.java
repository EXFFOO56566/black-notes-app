package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.n;
import com.google.android.gms.ads.y.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class sm2 {

    /* renamed from: a  reason: collision with root package name */
    public static final sm2 f4681a = new sm2();

    protected sm2() {
    }

    static final /* synthetic */ int a(String str, String str2) {
        return n.e.indexOf(str) - n.e.indexOf(str2);
    }

    public static rm2 a(Context context, zp2 zp2) {
        List list;
        Context context2;
        String str;
        Date a2 = zp2.a();
        long time = a2 != null ? a2.getTime() : -1;
        String b2 = zp2.b();
        int d = zp2.d();
        Set<String> e = zp2.e();
        if (!e.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(e));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a3 = zp2.a(context2);
        Location f = zp2.f();
        Bundle a4 = zp2.a(AdMobAdapter.class);
        if (zp2.r() == null) {
            boolean g = zp2.g();
            String i = zp2.i();
            a m = zp2.m();
            if (m == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    String packageName = applicationContext.getPackageName();
                    on2.a();
                    str = sn.a(Thread.currentThread().getStackTrace(), packageName);
                } else {
                    str = null;
                }
                boolean j = zp2.j();
                n a5 = cq2.c().a();
                return new rm2(8, time, a4, d, list, a3, Math.max(zp2.p(), a5.b()), g, i, null, f, b2, zp2.o(), zp2.c(), Collections.unmodifiableList(new ArrayList(zp2.q())), zp2.l(), str, j, null, Math.max(zp2.s(), a5.c()), (String) Collections.max(Arrays.asList(zp2.h(), a5.a()), vm2.f5134b), zp2.k());
            }
            new br2(m);
            throw null;
        }
        on2.i();
        zp2.r().a();
        throw null;
    }
}
