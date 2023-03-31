package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final class po implements zn1<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f4209a;

    po(String str) {
        this.f4209a = str;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        q.g().b(th, this.f4209a);
    }
}
