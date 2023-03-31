package com.google.android.gms.internal.ads;

import android.view.View;

public final class v00 implements r42<View> {

    /* renamed from: a  reason: collision with root package name */
    private final r00 f5032a;

    public v00(r00 r00) {
        this.f5032a = r00;
    }

    public static View a(r00 r00) {
        View b2 = r00.b();
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5032a);
    }
}
