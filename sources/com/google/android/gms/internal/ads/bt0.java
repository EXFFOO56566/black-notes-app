package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.bl2;
import java.util.ArrayList;

final class bt0 implements zn1<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f2009a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ xs0 f2010b;

    bt0(xs0 xs0, boolean z) {
        this.f2010b = xs0;
        this.f2009a = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        ArrayList a2 = xs0.a(this.f2010b, bundle2);
        bl2.c b2 = xs0.b(this.f2010b, bundle2);
        xs0.a(this.f2010b).a(new at0(this, this.f2009a, a2, xs0.c(this.f2010b, bundle2), b2));
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        co.b("Failed to get signals bundle");
    }
}
