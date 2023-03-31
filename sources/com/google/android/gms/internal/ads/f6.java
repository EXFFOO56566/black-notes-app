package com.google.android.gms.internal.ads;

import b.c.b.a.c.b;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class f6 implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ro f2537a;

    f6(x5 x5Var, ro roVar) {
        this.f2537a = roVar;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void a(b bVar) {
        this.f2537a.a(new RuntimeException("Connection failed."));
    }
}
