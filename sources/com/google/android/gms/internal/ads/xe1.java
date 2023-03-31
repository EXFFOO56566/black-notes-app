package com.google.android.gms.internal.ads;

import android.content.Context;

public final class xe1 implements r42<we1> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5415a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f5416b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<ik> f5417c;

    public xe1(e52<Context> e52, e52<fo> e522, e52<ik> e523) {
        this.f5415a = e52;
        this.f5416b = e522;
        this.f5417c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new we1(this.f5415a.get(), this.f5416b.get(), this.f5417c.get());
    }
}
