package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

public final class bb0 implements r42<za0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f1912a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Set<ab0<fh2>>> f1913b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<id1> f1914c;

    private bb0(e52<Context> e52, e52<Set<ab0<fh2>>> e522, e52<id1> e523) {
        this.f1912a = e52;
        this.f1913b = e522;
        this.f1914c = e523;
    }

    public static bb0 a(e52<Context> e52, e52<Set<ab0<fh2>>> e522, e52<id1> e523) {
        return new bb0(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new za0(this.f1912a.get(), this.f1913b.get(), this.f1914c.get());
    }
}
