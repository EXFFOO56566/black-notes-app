package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class ib1 implements xk1<ar0, kb1> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ gb1 f3055a;

    ib1(gb1 gb1) {
        this.f3055a = gb1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.xk1
    @NullableDecl
    public final /* synthetic */ kb1 a(@NullableDecl ar0 ar0) {
        co.b(BuildConfig.FLAVOR, ar0);
        wk.e("Failed to get a cache key, reverting to legacy flow.");
        gb1 gb1 = this.f3055a;
        gb1.a(gb1, new kb1(null, gb1.a(gb1), null));
        return gb1.b(this.f3055a);
    }
}
