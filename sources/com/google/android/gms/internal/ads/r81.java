package com.google.android.gms.internal.ads;

import java.util.List;

public final class r81 implements y61<s81> {

    /* renamed from: a  reason: collision with root package name */
    lr2 f4457a;

    /* renamed from: b  reason: collision with root package name */
    private ko1 f4458b;

    /* renamed from: c  reason: collision with root package name */
    List<String> f4459c;

    public r81(lr2 lr2, ko1 ko1, List<String> list) {
        this.f4457a = lr2;
        this.f4458b = ko1;
        this.f4459c = list;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<s81> a() {
        return this.f4458b.a(new u81(this));
    }
}
