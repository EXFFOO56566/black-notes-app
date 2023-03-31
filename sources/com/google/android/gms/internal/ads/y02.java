package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class y02 implements v02 {
    y02() {
    }

    @Override // com.google.android.gms.internal.ads.v02
    public final int a(int i, Object obj, Object obj2) {
        w02 w02 = (w02) obj;
        u02 u02 = (u02) obj2;
        if (w02.isEmpty()) {
            return 0;
        }
        Iterator it = w02.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.v02
    public final Object a(Object obj, Object obj2) {
        w02 w02 = (w02) obj;
        w02 w022 = (w02) obj2;
        if (!w022.isEmpty()) {
            if (!w02.a()) {
                w02 = w02.d();
            }
            w02.a(w022);
        }
        return w02;
    }

    @Override // com.google.android.gms.internal.ads.v02
    public final Map<?, ?> a(Object obj) {
        return (w02) obj;
    }

    @Override // com.google.android.gms.internal.ads.v02
    public final t02<?, ?> b(Object obj) {
        u02 u02 = (u02) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.v02
    public final boolean c(Object obj) {
        return !((w02) obj).a();
    }

    @Override // com.google.android.gms.internal.ads.v02
    public final Object d(Object obj) {
        ((w02) obj).c();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.v02
    public final Map<?, ?> e(Object obj) {
        return (w02) obj;
    }

    @Override // com.google.android.gms.internal.ads.v02
    public final Object f(Object obj) {
        return w02.f().d();
    }
}
