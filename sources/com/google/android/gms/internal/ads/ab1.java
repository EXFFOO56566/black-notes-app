package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class ab1 implements zn1<Void> {
    ab1(va1 va1) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(@NullableDecl Void r1) {
        wk.e("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        wk.e("Notification of cache hit failed.");
    }
}
