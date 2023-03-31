package com.google.android.gms.internal.ads;

import android.content.Context;

public final class q50 implements r42<vi> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4273a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f4274b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<id1> f4275c;
    private final e52<xi> d;

    private q50(r50 r50, e52<Context> e52, e52<fo> e522, e52<id1> e523, e52<xi> e524) {
        this.f4273a = e52;
        this.f4274b = e522;
        this.f4275c = e523;
        this.d = e524;
    }

    public static q50 a(r50 r50, e52<Context> e52, e52<fo> e522, e52<id1> e523, e52<xi> e524) {
        return new q50(r50, e52, e522, e523, e524);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Context context = this.f4273a.get();
        fo foVar = this.f4274b.get();
        id1 id1 = this.f4275c.get();
        xi xiVar = this.d.get();
        if (id1.x != null) {
            return new mi(context, foVar, id1.x, id1.p.f3693b, xiVar);
        }
        return null;
    }
}
