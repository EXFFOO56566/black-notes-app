package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

final /* synthetic */ class n91 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f3815a = new n91();

    private n91() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) on2.e().a(zr2.A);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) on2.e().a(zr2.B)).intValue()) {
                String[] split = str.split(",", -1);
                for (String str2 : split) {
                    hashMap.put(str2, qn.a(str2));
                }
            }
        }
        return new l91(hashMap);
    }
}
