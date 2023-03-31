package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.d.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class lj implements tj {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3564a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3565b;

    lj(Context context, String str) {
        this.f3564a = context;
        this.f3565b = str;
    }

    @Override // com.google.android.gms.internal.ads.tj
    public final void a(ev evVar) {
        Context context = this.f3564a;
        evVar.a(b.a(context), this.f3565b, context.getPackageName());
    }
}
