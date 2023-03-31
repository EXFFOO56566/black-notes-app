package com.google.android.gms.internal.ads;

import android.net.Uri;
import b.c.b.a.d.a;
import java.util.concurrent.Callable;

final /* synthetic */ class p01 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final o01 f4081a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f4082b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4083c;

    p01(o01 o01, Uri uri, a aVar) {
        this.f4081a = o01;
        this.f4082b = uri;
        this.f4083c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4081a.a(this.f4082b, this.f4083c);
    }
}
