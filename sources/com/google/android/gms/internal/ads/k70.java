package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.x.a;
import java.util.Set;

public final class k70 extends j90<a> implements l4 {

    /* renamed from: c  reason: collision with root package name */
    private Bundle f3334c = new Bundle();

    public k70(Set<ab0<a>> set) {
        super(set);
    }

    public final synchronized Bundle R() {
        return new Bundle(this.f3334c);
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final synchronized void a(String str, Bundle bundle) {
        this.f3334c.putAll(bundle);
        a(n70.f3802a);
    }
}
