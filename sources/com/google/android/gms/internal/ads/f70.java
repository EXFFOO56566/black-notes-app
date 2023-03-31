package com.google.android.gms.internal.ads;

import java.util.Set;

public final class f70 implements r42<v60> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<u50>>> f2546a;

    private f70(e52<Set<ab0<u50>>> e52) {
        this.f2546a = e52;
    }

    public static f70 a(e52<Set<ab0<u50>>> e52) {
        return new f70(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new v60(this.f2546a.get());
    }
}
