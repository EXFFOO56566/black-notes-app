package com.google.android.gms.internal.ads;

import b.c.b.a.c.b;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class ej2 implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zi2 f2438a;

    ej2(zi2 zi2) {
        this.f2438a = zi2;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void a(b bVar) {
        synchronized (this.f2438a.f5764b) {
            this.f2438a.e = null;
            if (this.f2438a.f5765c != null) {
                this.f2438a.f5765c = null;
            }
            this.f2438a.f5764b.notifyAll();
        }
    }
}
