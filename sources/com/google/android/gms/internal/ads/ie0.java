package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class ie0 implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<he0> f3069a;

    private ie0(he0 he0) {
        this.f3069a = new WeakReference<>(he0);
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        he0 he0 = this.f3069a.get();
        if (he0 != null) {
            he0.a(he0).K();
        }
    }
}
