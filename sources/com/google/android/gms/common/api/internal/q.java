package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

/* access modifiers changed from: package-private */
public final class q implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BasePendingResult f1587a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ t0 f1588b;

    q(t0 t0Var, BasePendingResult basePendingResult) {
        this.f1588b = t0Var;
        this.f1587a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.g.a
    public final void a(Status status) {
        this.f1588b.f1591a.remove(this.f1587a);
    }
}
