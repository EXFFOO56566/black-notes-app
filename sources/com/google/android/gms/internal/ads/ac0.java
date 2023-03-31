package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

public final class ac0 extends k20 {
    private final Context g;
    private final WeakReference<ws> h;
    private final na0 i;
    private final id0 j;
    private final h30 k;
    private final xi1 l;
    private final c60 m;
    private boolean n = false;

    ac0(n20 n20, Context context, @Nullable ws wsVar, na0 na0, id0 id0, h30 h30, xi1 xi1, c60 c60) {
        super(n20);
        this.g = context;
        this.h = new WeakReference<>(wsVar);
        this.i = na0;
        this.j = id0;
        this.k = h30;
        this.l = xi1;
        this.m = c60;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r5) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ac0.a(boolean):boolean");
    }

    public final boolean f() {
        return this.k.a();
    }

    public final void finalize() {
        try {
            ws wsVar = this.h.get();
            if (((Boolean) on2.e().a(zr2.y3)).booleanValue()) {
                if (!this.n && wsVar != null) {
                    ko1 ko1 = jo.e;
                    wsVar.getClass();
                    ko1.execute(dc0.a(wsVar));
                }
            } else if (wsVar != null) {
                wsVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
