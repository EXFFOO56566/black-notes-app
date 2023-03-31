package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public abstract class ho1<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private static final Runnable f2953b = new io1();

    /* renamed from: c  reason: collision with root package name */
    private static final Runnable f2954c = new io1();
    private static final Runnable d = new io1();

    ho1() {
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f2954c)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (((Runnable) getAndSet(f2953b)) == d) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void a(@NullableDecl T t, @NullableDecl Throwable th);

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public abstract T c();

    /* access modifiers changed from: package-private */
    public abstract String d();

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.google.android.gms.internal.ads.ho1<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !b();
            if (z) {
                try {
                    obj = c();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f2953b)) {
                        Runnable runnable = (Runnable) get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            if (runnable != f2954c && runnable != d) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable2 = d;
                                if (runnable == runnable2 || compareAndSet(f2954c, runnable2)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = (Runnable) get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    if (z) {
                        a(null, th);
                        return;
                    }
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, f2953b)) {
                Runnable runnable3 = (Runnable) get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    if (runnable3 != f2954c && runnable3 != d) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable4 = d;
                        if (runnable3 == runnable4 || compareAndSet(f2954c, runnable4)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable3 = (Runnable) get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                a(obj, null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f2953b) {
            str = "running=[DONE]";
        } else if (runnable == f2954c) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String d2 = d();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(d2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(d2);
        return sb2.toString();
    }
}
