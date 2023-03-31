package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public abstract class fn1<InputT, OutputT> extends in1<OutputT> {
    private static final Logger p = Logger.getLogger(fn1.class.getName());
    @NullableDecl
    private tl1<? extends lo1<? extends InputT>> m;
    private final boolean n;
    private final boolean o;

    /* access modifiers changed from: package-private */
    public enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    fn1(tl1<? extends lo1<? extends InputT>> tl1, boolean z, boolean z2) {
        super(tl1.size());
        jl1.a(tl1);
        this.m = tl1;
        this.n = z;
        this.o = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.fn1<InputT, OutputT> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    public final void a(int i, Future<? extends InputT> future) {
        try {
            a(i, yn1.a((Future) future));
        } catch (ExecutionException e) {
            b(e.getCause());
        } catch (Throwable th) {
            b(th);
        }
    }

    /* access modifiers changed from: private */
    public final void a(@NullableDecl tl1<? extends Future<? extends InputT>> tl1) {
        int i = i();
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalStateException("Less than 0 remaining futures");
        } else if (i == 0) {
            if (tl1 != null) {
                qm1 qm1 = (qm1) tl1.iterator();
                while (qm1.hasNext()) {
                    Future<? extends InputT> future = (Future) qm1.next();
                    if (!future.isCancelled()) {
                        a(i2, (Future) future);
                    }
                    i2++;
                }
            }
            j();
            l();
            a(a.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    private static boolean a(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void b(Throwable th) {
        jl1.a(th);
        if (this.n && !a(th) && a(h(), th)) {
            c(th);
        } else if (th instanceof Error) {
            c(th);
        }
    }

    private static void c(Throwable th) {
        p.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(int i, @NullableDecl InputT inputt);

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        jl1.a(aVar);
        this.m = null;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.in1
    public final void a(Set<Throwable> set) {
        jl1.a(set);
        if (!isCancelled()) {
            a(set, a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final void b() {
        super.b();
        tl1<? extends lo1<? extends InputT>> tl1 = this.m;
        a(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (tl1 != null)) {
            boolean e = e();
            qm1 qm1 = (qm1) tl1.iterator();
            while (qm1.hasNext()) {
                ((Future) qm1.next()).cancel(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final String d() {
        tl1<? extends lo1<? extends InputT>> tl1 = this.m;
        if (tl1 == null) {
            return super.d();
        }
        String valueOf = String.valueOf(tl1);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        if (this.m.isEmpty()) {
            l();
        } else if (this.n) {
            int i = 0;
            qm1 qm1 = (qm1) this.m.iterator();
            while (qm1.hasNext()) {
                lo1 lo1 = (lo1) qm1.next();
                lo1.a(new en1(this, lo1, i), rn1.INSTANCE);
                i++;
            }
        } else {
            gn1 gn1 = new gn1(this, this.o ? this.m : null);
            qm1 qm12 = (qm1) this.m.iterator();
            while (qm12.hasNext()) {
                ((lo1) qm12.next()).a(gn1, rn1.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void l();
}
