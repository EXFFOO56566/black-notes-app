package com.google.android.gms.internal.ads;

import java.util.Set;

public final class n80 implements r42<l80> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<q80>>> f3812a;

    private n80(e52<Set<ab0<q80>>> e52) {
        this.f3812a = e52;
    }

    public static n80 a(e52<Set<ab0<q80>>> e52) {
        return new n80(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new l80(this.f3812a.get());
    }
}
