package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class hm2 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f2943a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<gh2<?>> f2944b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityBlockingQueue<gh2<?>> f2945c;
    private final PriorityBlockingQueue<gh2<?>> d;
    private final a e;
    private final de2 f;
    private final b g;
    private final cd2[] h;
    private lf0 i;
    private final List<fo2> j;
    private final List<fp2> k;

    public hm2(a aVar, de2 de2) {
        this(aVar, de2, 4);
    }

    private hm2(a aVar, de2 de2, int i2) {
        this(aVar, de2, 4, new aa2(new Handler(Looper.getMainLooper())));
    }

    private hm2(a aVar, de2 de2, int i2, b bVar) {
        this.f2943a = new AtomicInteger();
        this.f2944b = new HashSet();
        this.f2945c = new PriorityBlockingQueue<>();
        this.d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = aVar;
        this.f = de2;
        this.h = new cd2[4];
        this.g = bVar;
    }

    public final <T> gh2<T> a(gh2<T> gh2) {
        gh2.a(this);
        synchronized (this.f2944b) {
            this.f2944b.add(gh2);
        }
        gh2.b(this.f2943a.incrementAndGet());
        gh2.a("add-to-queue");
        a(gh2, 0);
        (!gh2.n() ? this.d : this.f2945c).add(gh2);
        return gh2;
    }

    public final void a() {
        lf0 lf0 = this.i;
        if (lf0 != null) {
            lf0.a();
        }
        cd2[] cd2Arr = this.h;
        for (cd2 cd2 : cd2Arr) {
            if (cd2 != null) {
                cd2.a();
            }
        }
        lf0 lf02 = new lf0(this.f2945c, this.d, this.e, this.g);
        this.i = lf02;
        lf02.start();
        for (int i2 = 0; i2 < this.h.length; i2++) {
            cd2 cd22 = new cd2(this.d, this.f, this.e, this.g);
            this.h[i2] = cd22;
            cd22.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(gh2<?> gh2, int i2) {
        synchronized (this.k) {
            for (fp2 fp2 : this.k) {
                fp2.a(gh2, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final <T> void b(gh2<T> gh2) {
        synchronized (this.f2944b) {
            this.f2944b.remove(gh2);
        }
        synchronized (this.j) {
            for (fo2 fo2 : this.j) {
                fo2.a(gh2);
            }
        }
        a(gh2, 5);
    }
}
