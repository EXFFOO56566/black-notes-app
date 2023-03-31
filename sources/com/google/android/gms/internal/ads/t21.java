package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

final /* synthetic */ class t21 implements v61 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f4745a;

    t21(ArrayList arrayList) {
        this.f4745a = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.v61
    public final void a(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.f4745a);
    }
}
