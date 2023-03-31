package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.k;

public final class m0<A extends d<? extends k, a.b>> extends e0 {

    /* renamed from: a  reason: collision with root package name */
    private final A f1581a;

    public m0(int i, A a2) {
        super(i);
        this.f1581a = a2;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void a(Status status) {
        this.f1581a.c(status);
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void a(f.a<?> aVar) {
        try {
            this.f1581a.b(aVar.f());
        } catch (RuntimeException e) {
            a(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void a(t0 t0Var, boolean z) {
        t0Var.a(this.f1581a, z);
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f1581a.c(new Status(10, sb.toString()));
    }
}
