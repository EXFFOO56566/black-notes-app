package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class b6 implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ro f1869a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ x5 f1870b;

    b6(x5 x5Var, ro roVar) {
        this.f1870b = x5Var;
        this.f1869a = roVar;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void b(int i) {
        ro roVar = this.f1869a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        roVar.a(new RuntimeException(sb.toString()));
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void e(Bundle bundle) {
        try {
            this.f1869a.b(this.f1870b.f5363a.A());
        } catch (DeadObjectException e) {
            this.f1869a.a(e);
        }
    }
}
