package com.google.android.gms.common.api.internal;

import android.util.Log;
import b.c.b.a.c.b;
import com.google.android.gms.common.api.internal.f;

final class b0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b f1552b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f.b f1553c;

    b0(f.b bVar, b bVar2) {
        this.f1553c = bVar;
        this.f1552b = bVar2;
    }

    public final void run() {
        f.a aVar = (f.a) f.this.j.get(this.f1553c.f1566b);
        if (aVar != null) {
            if (this.f1552b.j()) {
                this.f1553c.e = true;
                if (this.f1553c.f1565a.k()) {
                    this.f1553c.a();
                    return;
                }
                try {
                    this.f1553c.f1565a.a(null, this.f1553c.f1565a.b());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    aVar.a(new b(10));
                }
            } else {
                aVar.a(this.f1552b);
            }
        }
    }
}
