package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class sh0 implements xk1 {

    /* renamed from: a  reason: collision with root package name */
    static final xk1 f4656a = new sh0();

    private sh0() {
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (i1 i1Var : (List) obj) {
            if (i1Var != null) {
                arrayList.add(i1Var);
            }
        }
        return arrayList;
    }
}
