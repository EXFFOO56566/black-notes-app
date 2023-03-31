package com.google.android.gms.common.api.internal;

import a.e.a;
import b.c.b.a.c.b;
import b.c.b.a.h.g;
import com.google.android.gms.common.api.c;
import java.util.Map;
import java.util.Set;

public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final a<b<?>, b> f1584a;

    /* renamed from: b  reason: collision with root package name */
    private final a<b<?>, String> f1585b;

    /* renamed from: c  reason: collision with root package name */
    private final g<Map<b<?>, String>> f1586c;
    private int d;
    private boolean e;

    public final Set<b<?>> a() {
        return this.f1584a.keySet();
    }

    public final void a(b<?> bVar, b bVar2, String str) {
        this.f1584a.put(bVar, bVar2);
        this.f1585b.put(bVar, str);
        this.d--;
        if (!bVar2.j()) {
            this.e = true;
        }
        if (this.d != 0) {
            return;
        }
        if (this.e) {
            this.f1586c.a(new c(this.f1584a));
            return;
        }
        this.f1586c.a(this.f1585b);
    }
}
