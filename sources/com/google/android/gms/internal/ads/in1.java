package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.xm1;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public abstract class in1<OutputT> extends xm1.k<OutputT> {
    private static final b k;
    private static final Logger l = Logger.getLogger(in1.class.getName());
    private volatile Set<Throwable> i = null;
    private volatile int j;

    static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicReferenceFieldUpdater<in1, Set<Throwable>> f3115a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<in1> f3116b;

        a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f3115a = atomicReferenceFieldUpdater;
            this.f3116b = atomicIntegerFieldUpdater;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.in1.b
        public final int a(in1 in1) {
            return this.f3116b.decrementAndGet(in1);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.in1.b
        public final void a(in1 in1, Set<Throwable> set, Set<Throwable> set2) {
            this.f3115a.compareAndSet(in1, null, set2);
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract int a(in1 in1);

        /* access modifiers changed from: package-private */
        public abstract void a(in1 in1, Set<Throwable> set, Set<Throwable> set2);
    }

    static final class c extends b {
        private c() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.in1.b
        public final int a(in1 in1) {
            int b2;
            synchronized (in1) {
                b2 = in1.b(in1);
            }
            return b2;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.in1.b
        public final void a(in1 in1, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (in1) {
                if (in1.i == null) {
                    in1.i = set2;
                }
            }
        }
    }

    static {
        Throwable th;
        b bVar;
        try {
            bVar = new a(AtomicReferenceFieldUpdater.newUpdater(in1.class, Set.class, "i"), AtomicIntegerFieldUpdater.newUpdater(in1.class, "j"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = new c();
        }
        k = bVar;
        if (th != null) {
            l.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    in1(int i2) {
        this.j = i2;
    }

    static /* synthetic */ int b(in1 in1) {
        int i2 = in1.j - 1;
        in1.j = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Set<Throwable> set);

    /* access modifiers changed from: package-private */
    public final Set<Throwable> h() {
        Set<Throwable> set = this.i;
        if (set != null) {
            return set;
        }
        Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        a(newSetFromMap);
        k.a(this, null, newSetFromMap);
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return k.a(this);
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        this.i = null;
    }
}
