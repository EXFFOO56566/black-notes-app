package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class qp0 implements r42<lo1<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<sh1> f4368a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f4369b;

    private qp0(e52<sh1> e52, e52<Context> e522) {
        this.f4368a = e52;
        this.f4369b = e522;
    }

    public static qp0 a(e52<sh1> e52, e52<Context> e522) {
        return new qp0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        bh1 a2 = this.f4368a.get().a(ph1.WEBVIEW_COOKIE).a(new mp0(this.f4369b.get())).a(1, TimeUnit.SECONDS).a(Exception.class, pp0.f4215a).a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
