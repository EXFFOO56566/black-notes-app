package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class je0 implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<he0> f3209a;

    private je0(he0 he0) {
        this.f3209a = new WeakReference<>(he0);
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        he0 he0 = this.f3209a.get();
        if (he0 != null && "_ac".equals(map.get("eventName"))) {
            he0.b(he0).l();
        }
    }
}
