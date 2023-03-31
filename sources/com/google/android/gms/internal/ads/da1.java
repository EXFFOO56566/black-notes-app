package com.google.android.gms.internal.ads;

import android.content.Context;

public final class da1 implements r42<w91> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<kv> f2233a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f2234b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<String> f2235c;
    private final e52<p91> d;
    private final e52<ea1> e;
    private final e52<fo> f;

    public da1(e52<kv> e52, e52<Context> e522, e52<String> e523, e52<p91> e524, e52<ea1> e525, e52<fo> e526) {
        this.f2233a = e52;
        this.f2234b = e522;
        this.f2235c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new w91(this.f2233a.get(), this.f2234b.get(), this.f2235c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
