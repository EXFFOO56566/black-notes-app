package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public abstract class zm1<I, O, F, T> extends sn1<O> implements Runnable {
    @NullableDecl
    private lo1<? extends I> i;
    @NullableDecl
    private F j;

    zm1(lo1<? extends I> lo1, F f) {
        jl1.a(lo1);
        this.i = lo1;
        jl1.a(f);
        this.j = f;
    }

    static <I, O> lo1<O> a(lo1<I> lo1, ln1<? super I, ? extends O> ln1, Executor executor) {
        jl1.a(executor);
        dn1 dn1 = new dn1(lo1, ln1);
        lo1.a(dn1, no1.a(executor, dn1));
        return dn1;
    }

    static <I, O> lo1<O> a(lo1<I> lo1, xk1<? super I, ? extends O> xk1, Executor executor) {
        jl1.a(xk1);
        cn1 cn1 = new cn1(lo1, xk1);
        lo1.a(cn1, no1.a(executor, cn1));
        return cn1;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public abstract T a(F f, @NullableDecl I i2);

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final void b() {
        a((Future<?>) this.i);
        this.i = null;
        this.j = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void b(@NullableDecl T t);

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final String d() {
        String str;
        lo1<? extends I> lo1 = this.i;
        F f = this.j;
        String d = super.d();
        if (lo1 != null) {
            String valueOf = String.valueOf(lo1);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (f != null) {
            String valueOf2 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf2).length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (d == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf(d);
            return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.gms.internal.ads.zm1<I, O, F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void run() {
        lo1<? extends I> lo1 = this.i;
        F f = this.j;
        boolean z = true;
        boolean isCancelled = isCancelled() | (lo1 == null);
        if (f != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.i = null;
            if (lo1.isCancelled()) {
                a((lo1) lo1);
                return;
            }
            try {
                try {
                    Object a2 = a((Object) f, yn1.a((Future) lo1));
                    this.j = null;
                    b(a2);
                } catch (Throwable th) {
                    this.j = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                a(e.getCause());
            } catch (RuntimeException e2) {
                a((Throwable) e2);
            } catch (Error e3) {
                a((Throwable) e3);
            }
        }
    }
}
