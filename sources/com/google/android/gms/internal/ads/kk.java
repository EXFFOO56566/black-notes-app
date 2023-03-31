package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final class kk extends sk {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ik f3407c;

    kk(ik ikVar) {
        this.f3407c = ikVar;
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void a() {
        f fVar = new f(this.f3407c.e, this.f3407c.f.f2633b);
        synchronized (this.f3407c.f3100a) {
            try {
                q.l();
                g.a(this.f3407c.g, fVar);
            } catch (IllegalArgumentException e) {
                co.c("Cannot config CSI reporter.", e);
            }
        }
    }
}
