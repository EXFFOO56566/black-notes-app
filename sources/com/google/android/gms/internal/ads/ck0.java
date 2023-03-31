package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

public final class ck0 extends k20 {
    private final Context g;
    private final WeakReference<ws> h;
    private final id0 i;
    private final na0 j;
    private final c60 k;
    private final k70 l;
    private final h30 m;
    private final wh n;
    private final xi1 o;
    private boolean p = false;

    ck0(n20 n20, Context context, ws wsVar, id0 id0, na0 na0, c60 c60, k70 k70, h30 h30, id1 id1, xi1 xi1) {
        super(n20);
        this.g = context;
        this.i = id0;
        this.h = new WeakReference<>(wsVar);
        this.j = na0;
        this.k = c60;
        this.l = k70;
        this.m = h30;
        this.o = xi1;
        this.n = new ki(id1.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r4, android.app.Activity r5) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ck0.a(boolean, android.app.Activity):boolean");
    }

    public final Bundle f() {
        return this.l.R();
    }

    public final void finalize() {
        try {
            ws wsVar = this.h.get();
            if (((Boolean) on2.e().a(zr2.y3)).booleanValue()) {
                if (!this.p && wsVar != null) {
                    ko1 ko1 = jo.e;
                    wsVar.getClass();
                    ko1.execute(bk0.a(wsVar));
                }
            } else if (wsVar != null) {
                wsVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        return this.m.a();
    }

    public final boolean h() {
        return this.p;
    }

    public final wh i() {
        return this.n;
    }

    public final boolean j() {
        ws wsVar = this.h.get();
        return wsVar != null && !wsVar.y();
    }
}
