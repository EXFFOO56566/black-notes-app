package com.google.android.gms.internal.ads;

import java.util.Set;

public final class r70 implements r42<p70> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<q70>>> f4453a;

    private r70(e52<Set<ab0<q70>>> e52) {
        this.f4453a = e52;
    }

    public static r70 a(e52<Set<ab0<q70>>> e52) {
        return new r70(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new p70(this.f4453a.get());
    }
}
