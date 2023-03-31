package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.g;
import b.c.b.a.c.h;
import com.google.android.gms.ads.t.a;
import java.io.IOException;

final class fk implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f2609b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ro f2610c;

    fk(bk bkVar, Context context, ro roVar) {
        this.f2609b = context;
        this.f2610c = roVar;
    }

    public final void run() {
        try {
            this.f2610c.b(a.a(this.f2609b));
        } catch (g | h | IOException | IllegalStateException e) {
            this.f2610c.a(e);
            co.b("Exception while getting advertising Id info", e);
        }
    }
}
