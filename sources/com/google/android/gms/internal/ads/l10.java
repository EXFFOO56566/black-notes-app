package com.google.android.gms.internal.ads;

public final class l10 implements r42<jt0<n00>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Boolean> f3480a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fw0> f3481b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<yx0<n00, le1, uu0>> f3482c;

    public l10(e52<Boolean> e52, e52<fw0> e522, e52<yx0<n00, le1, uu0>> e523) {
        this.f3480a = e52;
        this.f3481b = e522;
        this.f3482c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        boolean booleanValue = this.f3480a.get().booleanValue();
        fw0 fw0 = this.f3481b.get();
        yx0<n00, le1, uu0> yx0 = this.f3482c.get();
        if (!booleanValue) {
            fw0 = yx0;
        }
        y42.a(fw0, "Cannot return null from a non-@Nullable @Provides method");
        return fw0;
    }
}
