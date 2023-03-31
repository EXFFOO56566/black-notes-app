package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.eq1;
import com.google.android.gms.internal.ads.fr1;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class m implements Callable<eq1> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ l f1406a;

    m(l lVar) {
        this.f1406a = lVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ eq1 call() {
        return new eq1(fr1.a(this.f1406a.f1404b.f2633b, this.f1406a.e, false));
    }
}
