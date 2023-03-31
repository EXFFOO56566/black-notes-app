package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.ArrayList;
import java.util.List;

public final class c {
    static List<String> a() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, b0.a("gad:dynamite_module:experiment_id", BuildConfig.FLAVOR));
        a(arrayList, o0.f3922a);
        a(arrayList, o0.f3923b);
        a(arrayList, o0.f3924c);
        a(arrayList, o0.d);
        a(arrayList, o0.e);
        a(arrayList, o0.k);
        a(arrayList, o0.f);
        a(arrayList, o0.g);
        a(arrayList, o0.h);
        a(arrayList, o0.i);
        a(arrayList, o0.j);
        return arrayList;
    }

    private static void a(List<String> list, b0<String> b0Var) {
        String a2 = b0Var.a();
        if (!TextUtils.isEmpty(a2)) {
            list.add(a2);
        }
    }

    static List<String> b() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, y0.f5518a);
        return arrayList;
    }
}
