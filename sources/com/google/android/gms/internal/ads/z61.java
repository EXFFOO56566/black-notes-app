package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z61 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final List f5701a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f5702b;

    z61(List list, Object obj) {
        this.f5701a = list;
        this.f5702b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<lo1> list = this.f5701a;
        Object obj = this.f5702b;
        for (lo1 lo1 : list) {
            v61 v61 = (v61) lo1.get();
            if (v61 != null) {
                v61.a(obj);
            }
        }
        return obj;
    }
}
