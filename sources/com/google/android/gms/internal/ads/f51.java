package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.Set;

public final class f51 implements y61<c51> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f2534a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2535b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f2536c;

    public f51(ko1 ko1, Context context, Set<String> set) {
        this.f2534a = ko1;
        this.f2535b = context;
        this.f2536c = set;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<c51> a() {
        return this.f2534a.a(new e51(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ c51 b() {
        return (!((Boolean) on2.e().a(zr2.m2)).booleanValue() || !c51.b(this.f2536c)) ? new c51(null) : new c51(q.r().a(this.f2535b));
    }
}
