package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final class gk {

    /* renamed from: a  reason: collision with root package name */
    private long f2773a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f2774b = -1;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ hk f2775c;

    public gk(hk hkVar) {
        this.f2775c = hkVar;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f2773a);
        bundle.putLong("tclose", this.f2774b);
        return bundle;
    }

    public final long b() {
        return this.f2774b;
    }

    public final void c() {
        this.f2774b = this.f2775c.f2929a.b();
    }

    public final void d() {
        this.f2773a = this.f2775c.f2929a.b();
    }
}
