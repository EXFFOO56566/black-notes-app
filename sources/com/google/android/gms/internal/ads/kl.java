package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final class kl implements tn {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f3414a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3415b;

    kl(gl glVar, Context context, String str) {
        this.f3414a = context;
        this.f3415b = str;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void a(String str) {
        q.c();
        gl.a(this.f3414a, this.f3415b, str);
    }
}
