package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class e21 implements y61<v61<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f2359a;

    e21(Set<String> set) {
        this.f2359a = set;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<v61<Bundle>> a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f2359a) {
            arrayList.add(str);
        }
        return yn1.a(new d21(arrayList));
    }
}
