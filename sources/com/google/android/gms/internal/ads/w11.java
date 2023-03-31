package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class w11 implements y61<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final lo1<String> f5194a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5195b;

    public w11(lo1<String> lo1, Executor executor) {
        this.f5194a = lo1;
        this.f5195b = executor;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<Object> a() {
        return yn1.a(this.f5194a, v11.f5036a, this.f5195b);
    }
}
