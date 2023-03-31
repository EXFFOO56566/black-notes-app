package com.google.android.gms.internal.ads;

import java.util.ArrayList;

final /* synthetic */ class q21 implements xk1 {

    /* renamed from: a  reason: collision with root package name */
    static final xk1 f4263a = new q21();

    private q21() {
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public final Object a(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new t21(arrayList);
    }
}
