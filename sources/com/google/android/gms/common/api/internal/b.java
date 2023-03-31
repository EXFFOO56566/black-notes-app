package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.p;

public final class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1549a = false;

    /* renamed from: b  reason: collision with root package name */
    private final int f1550b;

    /* renamed from: c  reason: collision with root package name */
    private final a<O> f1551c;
    private final O d;

    private b(a<O> aVar, O o) {
        this.f1551c = aVar;
        this.d = o;
        this.f1550b = p.a(aVar, o);
    }

    public static <O extends a.d> b<O> a(a<O> aVar, O o) {
        return new b<>(aVar, o);
    }

    public final String a() {
        return this.f1551c.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return !this.f1549a && !bVar.f1549a && p.a(this.f1551c, bVar.f1551c) && p.a(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.f1550b;
    }
}
