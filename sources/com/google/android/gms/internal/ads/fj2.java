package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class fj2 implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zi2 f2608a;

    fj2(zi2 zi2) {
        this.f2608a = zi2;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void b(int i) {
        synchronized (this.f2608a.f5764b) {
            this.f2608a.e = null;
            this.f2608a.f5764b.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void e(Bundle bundle) {
        synchronized (this.f2608a.f5764b) {
            try {
                if (this.f2608a.f5765c != null) {
                    this.f2608a.e = this.f2608a.f5765c.A();
                }
            } catch (DeadObjectException e) {
                co.b("Unable to obtain a cache service instance.", e);
                this.f2608a.c();
            }
            this.f2608a.f5764b.notifyAll();
        }
    }
}
