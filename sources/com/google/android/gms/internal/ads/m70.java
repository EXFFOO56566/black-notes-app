package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.x.a;
import java.util.Set;

public final class m70 implements r42<k70> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<a>>> f3672a;

    private m70(e52<Set<ab0<a>>> e52) {
        this.f3672a = e52;
    }

    public static m70 a(e52<Set<ab0<a>>> e52) {
        return new m70(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new k70(this.f3672a.get());
    }
}
