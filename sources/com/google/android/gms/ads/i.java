package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.x.a;
import com.google.android.gms.ads.x.d;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.dq2;
import com.google.android.gms.internal.ads.jm2;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final dq2 f1390a;

    public i(Context context) {
        this.f1390a = new dq2(context);
        r.a(context, "Context cannot be null");
    }

    public final Bundle a() {
        return this.f1390a.a();
    }

    public final void a(b bVar) {
        this.f1390a.a(bVar);
        if (bVar != null && (bVar instanceof jm2)) {
            this.f1390a.a((jm2) bVar);
        } else if (bVar == null) {
            this.f1390a.a((jm2) null);
        }
    }

    public final void a(d dVar) {
        this.f1390a.a(dVar.a());
    }

    public final void a(a aVar) {
        this.f1390a.a(aVar);
    }

    public final void a(d dVar) {
        this.f1390a.a(dVar);
    }

    public final void a(String str) {
        this.f1390a.a(str);
    }

    public final void a(boolean z) {
        this.f1390a.a(z);
    }

    public final void b(boolean z) {
        this.f1390a.b(true);
    }

    public final boolean b() {
        return this.f1390a.b();
    }

    public final void c() {
        this.f1390a.c();
    }
}
