package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.d.b;

final class fv0 implements id0 {

    /* renamed from: a  reason: collision with root package name */
    private final id1 f2660a;

    /* renamed from: b  reason: collision with root package name */
    private final qc f2661b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2662c;
    private m60 d = null;

    fv0(id1 id1, qc qcVar, boolean z) {
        this.f2660a = id1;
        this.f2661b = qcVar;
        this.f2662c = z;
    }

    public final void a(m60 m60) {
        this.d = m60;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void a(boolean z, Context context) {
        try {
            if (this.f2662c ? this.f2661b.H(b.a(context)) : this.f2661b.B(b.a(context))) {
                m60 m60 = this.d;
                if (m60 != null && this.f2660a.O == 2) {
                    m60.K();
                    return;
                }
                return;
            }
            throw new hd0("Adapter failed to show.");
        } catch (Throwable th) {
            throw new hd0(th);
        }
    }
}
