package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final class qo implements zn1<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f4364a;

    qo(String str) {
        this.f4364a = str;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        q.g().a(th, this.f4364a);
    }
}
