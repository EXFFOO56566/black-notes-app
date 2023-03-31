package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.ik2;

public final class qd0 implements r42<rd0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<zi> f4315a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f4316b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<cj> f4317c;
    private final e52<View> d;
    private final e52<ik2.a> e;

    private qd0(e52<zi> e52, e52<Context> e522, e52<cj> e523, e52<View> e524, e52<ik2.a> e525) {
        this.f4315a = e52;
        this.f4316b = e522;
        this.f4317c = e523;
        this.d = e524;
        this.e = e525;
    }

    public static qd0 a(e52<zi> e52, e52<Context> e522, e52<cj> e523, e52<View> e524, e52<ik2.a> e525) {
        return new qd0(e52, e522, e523, e524, e525);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new rd0(this.f4315a.get(), this.f4316b.get(), this.f4317c.get(), this.d.get(), this.e.get());
    }
}
