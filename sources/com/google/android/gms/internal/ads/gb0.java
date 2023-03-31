package com.google.android.gms.internal.ads;

import java.util.Set;

public final class gb0 implements r42<eb0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<fb0>>> f2729a;

    private gb0(e52<Set<ab0<fb0>>> e52) {
        this.f2729a = e52;
    }

    public static gb0 a(e52<Set<ab0<fb0>>> e52) {
        return new gb0(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new eb0(this.f2729a.get());
    }
}
