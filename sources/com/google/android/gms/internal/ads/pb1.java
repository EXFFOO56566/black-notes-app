package com.google.android.gms.internal.ads;

import android.content.Context;

public final class pb1 implements r42<mb1<fk0, ck0>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4138a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<df1> f4139b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<vf1> f4140c;

    public pb1(e52<Context> e52, e52<df1> e522, e52<vf1> e523) {
        this.f4138a = e52;
        this.f4139b = e522;
        this.f4140c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        mb1 mb1;
        Context context = this.f4138a.get();
        df1 df1 = this.f4139b.get();
        vf1 vf1 = this.f4140c.get();
        if (((Integer) on2.e().a(zr2.g3)).intValue() > 0) {
            zf1 a2 = vf1.a(qf1.Rewarded, context, df1, new ua1(new ka1()));
            mb1 = new pa1(new db1(new eb1()), new va1(a2.f5747a, jo.f3256a), a2.f5748b, jo.f3256a);
        } else {
            mb1 = new eb1();
        }
        y42.a(mb1, "Cannot return null from a non-@Nullable @Provides method");
        return mb1;
    }
}
