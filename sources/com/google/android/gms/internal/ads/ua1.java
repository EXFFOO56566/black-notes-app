package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e50;
import com.google.android.gms.internal.ads.k20;

final class ua1<R extends e50<AdT>, AdT extends k20> implements hg1<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final mb1<R, rf1<AdT>> f4922a;

    public ua1(mb1<R, rf1<AdT>> mb1) {
        this.f4922a = mb1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.mb1<R extends com.google.android.gms.internal.ads.e50<AdT>, com.google.android.gms.internal.ads.rf1<AdT extends com.google.android.gms.internal.ads.k20>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.hg1
    public final lo1<rf1<AdT>> a(gg1 gg1) {
        ta1 ta1 = (ta1) gg1;
        return this.f4922a.a(ta1.f4774b, ta1.f4773a);
    }

    @Override // com.google.android.gms.internal.ads.hg1
    public final void a(rf1<AdT> rf1) {
        rf1.f4494a = this.f4922a.a().a();
    }

    @Override // com.google.android.gms.internal.ads.hg1
    public final void a(Throwable th) {
    }
}
