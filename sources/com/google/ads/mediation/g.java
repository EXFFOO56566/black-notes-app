package com.google.ads.mediation;

import com.google.android.gms.ads.x.a;

final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractAdViewAdapter f1374a;

    g(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f1374a = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.x.a
    public final void a() {
        if (AbstractAdViewAdapter.zzb(this.f1374a) != null && AbstractAdViewAdapter.zza(this.f1374a) != null) {
            AbstractAdViewAdapter.zza(this.f1374a).c(AbstractAdViewAdapter.zzb(this.f1374a).a());
        }
    }
}
