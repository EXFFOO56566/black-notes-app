package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

public final class qb0 extends j90<p.a> {
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private boolean f4302c;

    protected qb0(Set<ab0<p.a>> set) {
        super(set);
    }

    public final void R() {
        a(sb0.f4625a);
    }

    public final void S() {
        a(tb0.f4780a);
    }

    public final synchronized void T() {
        if (!this.f4302c) {
            a(ub0.f4924a);
            this.f4302c = true;
        }
        a(xb0.f5400a);
    }

    public final synchronized void U() {
        a(vb0.f5081a);
        this.f4302c = true;
    }
}
