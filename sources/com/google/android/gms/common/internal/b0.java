package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class b0 implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ g f1599a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b.c.b.a.h.g f1600b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ q.a f1601c;
    private final /* synthetic */ q.b d;

    b0(g gVar, b.c.b.a.h.g gVar2, q.a aVar, q.b bVar) {
        this.f1599a = gVar;
        this.f1600b = gVar2;
        this.f1601c = aVar;
        this.d = bVar;
    }

    @Override // com.google.android.gms.common.api.g.a
    public final void a(Status status) {
        if (status.i()) {
            this.f1600b.a(this.f1601c.a(this.f1599a.a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f1600b.a((Exception) this.d.a(status));
    }
}
