package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.q.c;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

public final class h61 implements y61<i61> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f2869a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2870b;

    /* renamed from: c  reason: collision with root package name */
    private final fo f2871c;

    public h61(ko1 ko1, Context context, fo foVar) {
        this.f2869a = ko1;
        this.f2870b = context;
        this.f2871c = foVar;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<i61> a() {
        return this.f2869a.a(new k61(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i61 b() {
        boolean a2 = c.a(this.f2870b).a();
        q.c();
        boolean k = gl.k(this.f2870b);
        String str = this.f2871c.f2633b;
        q.e();
        boolean e = ll.e();
        q.c();
        return new i61(a2, k, str, e, gl.h(this.f2870b), DynamiteModule.b(this.f2870b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.f2870b, ModuleDescriptor.MODULE_ID));
    }
}
