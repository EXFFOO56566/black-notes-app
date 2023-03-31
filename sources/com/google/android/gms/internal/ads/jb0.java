package com.google.android.gms.internal.ads;

import java.util.List;

public final class jb0 implements fb0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f3199a;

    /* renamed from: b  reason: collision with root package name */
    private final ci1 f3200b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3201c;

    public jb0(id1 id1, ci1 ci1) {
        this.f3199a = id1.n;
        this.f3200b = ci1;
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void a() {
        if (!this.f3201c) {
            this.f3200b.a(this.f3199a);
            this.f3201c = true;
        }
    }
}
