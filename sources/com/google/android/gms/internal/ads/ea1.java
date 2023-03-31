package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class ea1 implements a60, q70, jb1 {

    /* renamed from: b  reason: collision with root package name */
    private final df1 f2390b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<ti2> f2391c = new AtomicReference<>();
    private final AtomicReference<wi2> d = new AtomicReference<>();
    private final AtomicReference<q70> e = new AtomicReference<>();
    private ea1 f = null;

    public ea1(df1 df1) {
        this.f2390b = df1;
    }

    public static ea1 a(ea1 ea1) {
        ea1 ea12 = new ea1(ea1.f2390b);
        ea12.a((jb1) ea1);
        return ea12;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void M0() {
        ea1 ea1 = this;
        while (true) {
            ea1 ea12 = ea1.f;
            if (ea12 != null) {
                ea1 = ea12;
            } else {
                cb1.a(ea1.e, ia1.f3052a);
                return;
            }
        }
    }

    public final void a() {
        ea1 ea1 = this;
        while (true) {
            ea1 ea12 = ea1.f;
            if (ea12 != null) {
                ea1 = ea12;
            } else {
                ea1.f2390b.a();
                cb1.a(ea1.d, ja1.f3198a);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final void a(int i) {
        ea1 ea1 = this;
        while (true) {
            ea1 ea12 = ea1.f;
            if (ea12 != null) {
                ea1 = ea12;
            } else {
                cb1.a(ea1.f2391c, new ga1(i));
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jb1
    public final void a(jb1 jb1) {
        this.f = (ea1) jb1;
    }

    public final void a(q70 q70) {
        this.e.set(q70);
    }

    public final void a(si2 si2) {
        ea1 ea1 = this;
        while (true) {
            ea1 ea12 = ea1.f;
            if (ea12 != null) {
                ea1 = ea12;
            } else {
                cb1.a(ea1.f2391c, new ha1(si2));
                return;
            }
        }
    }

    public final void a(ti2 ti2) {
        this.f2391c.set(ti2);
    }

    public final void a(wi2 wi2) {
        this.d.set(wi2);
    }
}
