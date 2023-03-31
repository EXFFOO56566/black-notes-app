package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

final /* synthetic */ class d21 implements v61 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f2199a;

    d21(ArrayList arrayList) {
        this.f2199a = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.v61
    public final void a(Object obj) {
        ((Bundle) obj).putStringArrayList("ad_types", this.f2199a);
    }
}
