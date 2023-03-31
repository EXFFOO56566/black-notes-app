package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class vy0 implements py0<ac0> {

    /* renamed from: a  reason: collision with root package name */
    private final ad0 f5184a;

    public vy0(Context context, ad0 ad0) {
        this.f5184a = ad0;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.py0
    public final /* synthetic */ ac0 a(vd1 vd1, id1 id1, View view, wy0 wy0) {
        cc0 a2 = this.f5184a.a(new d30(vd1, id1, null), new xy0(this, yy0.f5668a));
        wy0.a(new az0(this, a2));
        return a2.i();
    }
}
