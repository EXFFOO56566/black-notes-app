package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public final class nn1<V> extends kn1<V, List<V>> {
    nn1(tl1<? extends lo1<? extends V>> tl1, boolean z) {
        super(tl1, true);
        k();
    }

    @Override // com.google.android.gms.internal.ads.kn1
    public final /* synthetic */ Object a(List list) {
        ArrayList a2 = dm1.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            el1 el1 = (el1) it.next();
            a2.add(el1 != null ? el1.a() : null);
        }
        return Collections.unmodifiableList(a2);
    }
}
