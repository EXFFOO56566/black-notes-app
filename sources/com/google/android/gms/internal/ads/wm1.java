package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.lang.Throwable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public abstract class wm1<V, X extends Throwable, F, T> extends sn1<V> implements Runnable {
    @NullableDecl
    private lo1<? extends V> i;
    @NullableDecl
    private Class<X> j;
    @NullableDecl
    private F k;

    wm1(lo1<? extends V> lo1, Class<X> cls, F f) {
        jl1.a(lo1);
        this.i = lo1;
        jl1.a(cls);
        this.j = cls;
        jl1.a(f);
        this.k = f;
    }

    static <X extends Throwable, V> lo1<V> a(lo1<? extends V> lo1, Class<X> cls, ln1<? super X, ? extends V> ln1, Executor executor) {
        vm1 vm1 = new vm1(lo1, cls, ln1);
        lo1.a(vm1, no1.a(executor, vm1));
        return vm1;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public abstract T a(F f, X x);

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final void b() {
        a((Future<?>) this.i);
        this.i = null;
        this.j = null;
        this.k = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void b(@NullableDecl T t);

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final String d() {
        String str;
        lo1<? extends V> lo1 = this.i;
        Class<X> cls = this.j;
        F f = this.k;
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
        if (cls != null && f != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append("]");
            return sb2.toString();
        } else if (d == null) {
            return null;
        } else {
            String valueOf4 = String.valueOf(str);
            String valueOf5 = String.valueOf(d);
            return valueOf5.length() != 0 ? valueOf4.concat(valueOf5) : new String(valueOf4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.google.android.gms.internal.ads.wm1<V, X extends java.lang.Throwable, F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wm1.run():void");
    }
}
