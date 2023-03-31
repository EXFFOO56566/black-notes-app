package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.hl2;
import com.google.android.gms.internal.ads.ik2;

public final class zl0 implements r42<wj2> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5778a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<String> f5779b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<fo> f5780c;
    private final e52<ik2.a> d;
    private final e52<String> e;

    private zl0(e52<Context> e52, e52<String> e522, e52<fo> e523, e52<ik2.a> e524, e52<String> e525) {
        this.f5778a = e52;
        this.f5779b = e522;
        this.f5780c = e523;
        this.d = e524;
        this.e = e525;
    }

    public static zl0 a(e52<Context> e52, e52<String> e522, e52<fo> e523, e52<ik2.a> e524, e52<String> e525) {
        return new zl0(e52, e522, e523, e524, e525);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        String str = this.f5779b.get();
        fo foVar = this.f5780c.get();
        ik2.a aVar = this.d.get();
        String str2 = this.e.get();
        wj2 wj2 = new wj2(new ak2(this.f5778a.get()));
        hl2.a p = hl2.p();
        p.a(foVar.f2634c);
        p.b(foVar.d);
        p.c(foVar.e ? 0 : 2);
        wj2.a(new am0(aVar, str, (hl2) ((rz1) p.e()), str2));
        y42.a(wj2, "Cannot return null from a non-@Nullable @Provides method");
        return wj2;
    }
}
