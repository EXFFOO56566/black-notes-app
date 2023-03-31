package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class o51 implements y61<k51> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f3948a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f3949b;

    public o51(ko1 ko1, Bundle bundle) {
        this.f3948a = ko1;
        this.f3949b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<k51> a() {
        return this.f3948a.a(new n51(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ k51 b() {
        return new k51(this.f3949b);
    }
}
