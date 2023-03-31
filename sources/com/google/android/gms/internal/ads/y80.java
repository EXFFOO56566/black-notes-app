package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.r.a;
import java.util.Set;

public final class y80 implements r42<w80> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<a>>> f5549a;

    private y80(e52<Set<ab0<a>>> e52) {
        this.f5549a = e52;
    }

    public static y80 a(e52<Set<ab0<a>>> e52) {
        return new y80(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new w80(this.f5549a.get());
    }
}
