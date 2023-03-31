package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

public final class za0 extends j90<fh2> implements fh2 {
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private Map<View, bh2> f5723c = new WeakHashMap(1);
    private final Context d;
    private final id1 e;

    public za0(Context context, Set<ab0<fh2>> set, id1 id1) {
        super(set);
        this.d = context;
        this.e = id1;
    }

    public final synchronized void a(View view) {
        bh2 bh2 = this.f5723c.get(view);
        if (bh2 == null) {
            bh2 = new bh2(this.d, view);
            bh2.a(this);
            this.f5723c.put(view, bh2);
        }
        if (this.e != null && this.e.N) {
            if (((Boolean) on2.e().a(zr2.E0)).booleanValue()) {
                bh2.a(((Long) on2.e().a(zr2.D0)).longValue());
                return;
            }
        }
        bh2.a();
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final synchronized void a(hh2 hh2) {
        a(new cb0(hh2));
    }

    public final synchronized void b(View view) {
        if (this.f5723c.containsKey(view)) {
            this.f5723c.get(view).b(this);
            this.f5723c.remove(view);
        }
    }
}
