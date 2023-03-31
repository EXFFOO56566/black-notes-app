package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class rx1 extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4566a;

    public rx1(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f4566a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == rx1.class) {
            if (this == obj) {
                return true;
            }
            rx1 rx1 = (rx1) obj;
            return this.f4566a == rx1.f4566a && get() == rx1.get();
        }
    }

    public final int hashCode() {
        return this.f4566a;
    }
}
