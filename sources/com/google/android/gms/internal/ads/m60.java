package com.google.android.gms.internal.ads;

import java.util.Set;

public final class m60 extends j90<n60> {

    /* renamed from: c  reason: collision with root package name */
    private boolean f3668c = false;

    public m60(Set<ab0<n60>> set) {
        super(set);
    }

    public final synchronized void K() {
        if (!this.f3668c) {
            a(l60.f3502a);
            this.f3668c = true;
        }
    }
}
