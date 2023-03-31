package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

public class xm1<V> extends cp1 implements lo1<V> {
    private static final boolean e;
    private static final Logger f = Logger.getLogger(xm1.class.getName());
    private static final b g;
    private static final Object h = new Object();
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f5444b;
    @NullableDecl

    /* renamed from: c  reason: collision with root package name */
    private volatile e f5445c;
    @NullableDecl
    private volatile l d;

    /* access modifiers changed from: package-private */
    public static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(l lVar, l lVar2);

        /* access modifiers changed from: package-private */
        public abstract void a(l lVar, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean a(xm1<?> xm1, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(xm1<?> xm1, l lVar, l lVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(xm1<?> xm1, Object obj, Object obj2);
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        static final c f5446b = new c(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f5447a;

        class a extends Throwable {
            a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        c(Throwable th) {
            jl1.a(th);
            this.f5447a = th;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d {

        /* renamed from: c  reason: collision with root package name */
        static final d f5448c;
        static final d d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f5449a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        final Throwable f5450b;

        static {
            if (xm1.e) {
                d = null;
                f5448c = null;
                return;
            }
            d = new d(false, null);
            f5448c = new d(true, null);
        }

        d(boolean z, @NullableDecl Throwable th) {
            this.f5449a = z;
            this.f5450b = th;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e {
        static final e d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f5451a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f5452b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        e f5453c;

        e(Runnable runnable, Executor executor) {
            this.f5451a = runnable;
            this.f5452b = executor;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<V> implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final xm1<V> f5454b;

        /* renamed from: c  reason: collision with root package name */
        final lo1<? extends V> f5455c;

        f(xm1<V> xm1, lo1<? extends V> lo1) {
            this.f5454b = xm1;
            this.f5455c = lo1;
        }

        public final void run() {
            if (((xm1) this.f5454b).f5444b == this) {
                if (xm1.g.a((xm1<?>) this.f5454b, (Object) this, xm1.b((lo1) this.f5455c))) {
                    xm1.a((xm1) this.f5454b);
                }
            }
        }
    }

    static final class g extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f5456a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f5457b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<xm1, l> f5458c;
        final AtomicReferenceFieldUpdater<xm1, e> d;
        final AtomicReferenceFieldUpdater<xm1, Object> e;

        g(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<xm1, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<xm1, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<xm1, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f5456a = atomicReferenceFieldUpdater;
            this.f5457b = atomicReferenceFieldUpdater2;
            this.f5458c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final void a(l lVar, l lVar2) {
            this.f5457b.lazySet(lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final void a(l lVar, Thread thread) {
            this.f5456a.lazySet(lVar, thread);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final boolean a(xm1<?> xm1, e eVar, e eVar2) {
            return this.d.compareAndSet(xm1, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final boolean a(xm1<?> xm1, l lVar, l lVar2) {
            return this.f5458c.compareAndSet(xm1, lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final boolean a(xm1<?> xm1, Object obj, Object obj2) {
            return this.e.compareAndSet(xm1, obj, obj2);
        }
    }

    /* access modifiers changed from: package-private */
    public interface h<V> extends lo1<V> {
    }

    static final class i extends b {
        private i() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final void a(l lVar, l lVar2) {
            lVar.f5464b = lVar2;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final void a(l lVar, Thread thread) {
            lVar.f5463a = thread;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final boolean a(xm1<?> xm1, e eVar, e eVar2) {
            synchronized (xm1) {
                if (((xm1) xm1).f5445c != eVar) {
                    return false;
                }
                ((xm1) xm1).f5445c = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final boolean a(xm1<?> xm1, l lVar, l lVar2) {
            synchronized (xm1) {
                if (((xm1) xm1).d != lVar) {
                    return false;
                }
                ((xm1) xm1).d = lVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final boolean a(xm1<?> xm1, Object obj, Object obj2) {
            synchronized (xm1) {
                if (((xm1) xm1).f5444b != obj) {
                    return false;
                }
                ((xm1) xm1).f5444b = obj2;
                return true;
            }
        }
    }

    static final class j extends b {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f5459a;

        /* renamed from: b  reason: collision with root package name */
        static final long f5460b;

        /* renamed from: c  reason: collision with root package name */
        static final long f5461c;
        static final long d;
        static final long e;
        static final long f;

        class a implements PrivilegedExceptionAction<Unsafe> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.security.PrivilegedExceptionAction
            public /* synthetic */ Unsafe run() {
                Field[] declaredFields = Unsafe.class.getDeclaredFields();
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
            // Method dump skipped, instructions count: 106
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xm1.j.<clinit>():void");
        }

        private j() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final void a(l lVar, l lVar2) {
            f5459a.putObject(lVar, f, lVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final void a(l lVar, Thread thread) {
            f5459a.putObject(lVar, e, thread);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final boolean a(xm1<?> xm1, e eVar, e eVar2) {
            return f5459a.compareAndSwapObject(xm1, f5460b, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final boolean a(xm1<?> xm1, l lVar, l lVar2) {
            return f5459a.compareAndSwapObject(xm1, f5461c, lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xm1.b
        public final boolean a(xm1<?> xm1, Object obj, Object obj2) {
            return f5459a.compareAndSwapObject(xm1, d, obj, obj2);
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class k<V> extends xm1<V> implements h<V> {
        k() {
        }

        @Override // java.util.concurrent.Future, com.google.android.gms.internal.ads.xm1
        public final V get(long j, TimeUnit timeUnit) {
            return (V) xm1.super.get(j, timeUnit);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l {

        /* renamed from: c  reason: collision with root package name */
        static final l f5462c = new l(false);
        @NullableDecl

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f5463a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        volatile l f5464b;

        l() {
            xm1.g.a(this, Thread.currentThread());
        }

        private l(boolean z) {
        }

        /* access modifiers changed from: package-private */
        public final void a(l lVar) {
            xm1.g.a(this, lVar);
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        b bVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        e = z;
        try {
            bVar = new j();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            bVar = new i();
        }
        g = bVar;
        if (th != null) {
            f.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            f.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected xm1() {
    }

    private final void a(l lVar) {
        lVar.f5463a = null;
        while (true) {
            l lVar2 = this.d;
            if (lVar2 != l.f5462c) {
                l lVar3 = null;
                while (lVar2 != null) {
                    l lVar4 = lVar2.f5464b;
                    if (lVar2.f5463a != null) {
                        lVar3 = lVar2;
                    } else if (lVar3 != null) {
                        lVar3.f5464b = lVar4;
                        if (lVar3.f5463a == null) {
                        }
                    } else if (g.a((xm1<?>) this, lVar2, lVar4)) {
                    }
                    lVar2 = lVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0002 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x0002 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.xm1<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.xm1] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.xm1<V>, com.google.android.gms.internal.ads.xm1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.xm1$b] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.google.android.gms.internal.ads.xm1<?> r5) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            com.google.android.gms.internal.ads.xm1$l r2 = r5.d
            com.google.android.gms.internal.ads.xm1$b r3 = com.google.android.gms.internal.ads.xm1.g
            com.google.android.gms.internal.ads.xm1$l r4 = com.google.android.gms.internal.ads.xm1.l.f5462c
            boolean r3 = r3.a(r5, r2, r4)
            if (r3 == 0) goto L_0x0002
        L_0x000e:
            if (r2 == 0) goto L_0x001c
            java.lang.Thread r3 = r2.f5463a
            if (r3 == 0) goto L_0x0019
            r2.f5463a = r0
            java.util.concurrent.locks.LockSupport.unpark(r3)
        L_0x0019:
            com.google.android.gms.internal.ads.xm1$l r2 = r2.f5464b
            goto L_0x000e
        L_0x001c:
            r5.b()
        L_0x001f:
            com.google.android.gms.internal.ads.xm1$e r2 = r5.f5445c
            com.google.android.gms.internal.ads.xm1$b r3 = com.google.android.gms.internal.ads.xm1.g
            com.google.android.gms.internal.ads.xm1$e r4 = com.google.android.gms.internal.ads.xm1.e.d
            boolean r3 = r3.a(r5, r2, r4)
            if (r3 == 0) goto L_0x001f
        L_0x002b:
            r5 = r1
            r1 = r2
            if (r1 == 0) goto L_0x0034
            com.google.android.gms.internal.ads.xm1$e r2 = r1.f5453c
            r1.f5453c = r5
            goto L_0x002b
        L_0x0034:
            if (r5 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.xm1$e r1 = r5.f5453c
            java.lang.Runnable r2 = r5.f5451a
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.xm1.f
            if (r3 == 0) goto L_0x0055
            com.google.android.gms.internal.ads.xm1$f r2 = (com.google.android.gms.internal.ads.xm1.f) r2
            com.google.android.gms.internal.ads.xm1<V> r5 = r2.f5454b
            java.lang.Object r3 = r5.f5444b
            if (r3 != r2) goto L_0x005a
            com.google.android.gms.internal.ads.lo1<? extends V> r3 = r2.f5455c
            java.lang.Object r3 = b(r3)
            com.google.android.gms.internal.ads.xm1$b r4 = com.google.android.gms.internal.ads.xm1.g
            boolean r2 = r4.a(r5, r2, r3)
            if (r2 != 0) goto L_0x0002
            goto L_0x005a
        L_0x0055:
            java.util.concurrent.Executor r5 = r5.f5452b
            b(r2, r5)
        L_0x005a:
            r5 = r1
            goto L_0x0034
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xm1.a(com.google.android.gms.internal.ads.xm1):void");
    }

    private final void a(StringBuilder sb) {
        String str = "]";
        try {
            Object b2 = b((Future) this);
            sb.append("SUCCESS, result=[");
            a(sb, b2);
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            str = " thrown from get()]";
            sb.append(str);
        }
    }

    private final void a(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e2) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e2.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* access modifiers changed from: private */
    public static Object b(lo1<?> lo1) {
        Throwable a2;
        if (lo1 instanceof h) {
            Object obj = ((xm1) lo1).f5444b;
            if (!(obj instanceof d)) {
                return obj;
            }
            d dVar = (d) obj;
            return dVar.f5449a ? dVar.f5450b != null ? new d(false, dVar.f5450b) : d.d : obj;
        } else if ((lo1 instanceof cp1) && (a2 = gp1.a((cp1) lo1)) != null) {
            return new c(a2);
        } else {
            boolean isCancelled = lo1.isCancelled();
            if ((!e) && isCancelled) {
                return d.d;
            }
            try {
                Object b2 = b((Future) lo1);
                if (!isCancelled) {
                    return b2 == null ? h : b2;
                }
                String valueOf = String.valueOf(lo1);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new d(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e2) {
                if (!isCancelled) {
                    return new c(e2.getCause());
                }
                String valueOf2 = String.valueOf(lo1);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new d(false, new IllegalArgumentException(sb2.toString(), e2));
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new d(false, e3);
                }
                String valueOf3 = String.valueOf(lo1);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new c(new IllegalArgumentException(sb3.toString(), e3));
            } catch (Throwable th) {
                return new c(th);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private static V b(Object obj) {
        if (obj instanceof d) {
            Throwable th = ((d) obj).f5450b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f5447a);
        } else if (obj == h) {
            return null;
        } else {
            return obj;
        }
    }

    private static <V> V b(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cp1
    @NullableDecl
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f5444b;
        if (obj instanceof c) {
            return ((c) obj).f5447a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public void a(Runnable runnable, Executor executor) {
        e eVar;
        jl1.a(runnable, "Runnable was null.");
        jl1.a(executor, "Executor was null.");
        if (isDone() || (eVar = this.f5445c) == e.d) {
            b(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f5453c = eVar;
            if (!g.a((xm1<?>) this, eVar, eVar2)) {
                eVar = this.f5445c;
            } else {
                return;
            }
        } while (eVar != e.d);
        b(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    public final void a(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(e());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(lo1<? extends V> lo1) {
        f fVar;
        c cVar;
        jl1.a(lo1);
        Object obj = this.f5444b;
        if (obj == null) {
            if (lo1.isDone()) {
                if (!g.a((xm1<?>) this, (Object) null, b((lo1<?>) lo1))) {
                    return false;
                }
                a((xm1<?>) this);
                return true;
            }
            fVar = new f(this, lo1);
            if (g.a((xm1<?>) this, (Object) null, (Object) fVar)) {
                try {
                    lo1.a(fVar, rn1.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.f5446b;
                }
                return true;
            }
            obj = this.f5444b;
        }
        if (obj instanceof d) {
            lo1.cancel(((d) obj).f5449a);
        }
        return false;
        g.a((xm1<?>) this, (Object) fVar, (Object) cVar);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(@NullableDecl V v) {
        if (v == null) {
            v = (V) h;
        }
        if (!g.a((xm1<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        a((xm1<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(Throwable th) {
        jl1.a(th);
        if (!g.a((xm1<?>) this, (Object) null, (Object) new c(th))) {
            return false;
        }
        a((xm1<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public boolean cancel(boolean z) {
        Object obj = this.f5444b;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        d dVar = e ? new d(z, new CancellationException("Future.cancel() was called.")) : z ? d.f5448c : d.d;
        boolean z2 = false;
        xm1<V> xm1 = this;
        while (true) {
            if (g.a((xm1<?>) xm1, obj, (Object) dVar)) {
                if (z) {
                    xm1.c();
                }
                a((xm1<?>) xm1);
                if (!(obj instanceof f)) {
                    return true;
                }
                lo1<? extends V> lo1 = ((f) obj).f5455c;
                if (lo1 instanceof h) {
                    xm1 = (xm1) lo1;
                    obj = xm1.f5444b;
                    if (!(obj == null) && !(obj instanceof f)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    lo1.cancel(z);
                    return true;
                }
            } else {
                obj = xm1.f5444b;
                if (!(obj instanceof f)) {
                    return z2;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    public String d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        Object obj = this.f5444b;
        return (obj instanceof d) && ((d) obj).f5449a;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5444b;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return (V) b(obj2);
            }
            l lVar = this.d;
            if (lVar != l.f5462c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (g.a((xm1<?>) this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5444b;
                            } else {
                                a(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) b(obj);
                    }
                    lVar = this.d;
                } while (lVar != l.f5462c);
            }
            return (V) b(this.f5444b);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f5444b;
            if ((obj != null) && (!(obj instanceof f))) {
                return (V) b(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                l lVar = this.d;
                if (lVar != l.f5462c) {
                    l lVar2 = new l();
                    do {
                        lVar2.a(lVar);
                        if (g.a((xm1<?>) this, lVar, lVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5444b;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return (V) b(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(lVar2);
                        } else {
                            lVar = this.d;
                        }
                    } while (lVar != l.f5462c);
                }
                return (V) b(this.f5444b);
            }
            while (nanos > 0) {
                Object obj3 = this.f5444b;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return (V) b(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String xm1 = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(xm1).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(xm1);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f5444b instanceof d;
    }

    public boolean isDone() {
        Object obj = this.f5444b;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xm1.toString():java.lang.String");
    }
}
