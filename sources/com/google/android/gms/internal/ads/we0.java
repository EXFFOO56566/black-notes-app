package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;

public final class we0 implements r42<nz> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ah2> f5257a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f5258b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Context> f5259c;
    private final e52<d> d;

    public we0(e52<ah2> e52, e52<Executor> e522, e52<Context> e523, e52<d> e524) {
        this.f5257a = e52;
        this.f5258b = e522;
        this.f5259c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        nz nzVar = new nz(this.f5258b.get(), new cz(this.f5259c.get(), this.f5257a.get()), this.d.get());
        y42.a(nzVar, "Cannot return null from a non-@Nullable @Provides method");
        return nzVar;
    }
}
