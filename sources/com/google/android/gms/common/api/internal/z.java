package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class z implements c.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f.a f1597a;

    z(f.a aVar) {
        this.f1597a = aVar;
    }

    @Override // com.google.android.gms.common.internal.c.e
    public final void a() {
        f.this.n.post(new y(this));
    }
}
