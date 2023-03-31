package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class gf2 {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f2750a;

    /* renamed from: b  reason: collision with root package name */
    private if2<? extends lf2> f2751b;

    /* renamed from: c  reason: collision with root package name */
    private IOException f2752c;

    public gf2(String str) {
        this.f2750a = ag2.a(str);
    }

    public final <T extends lf2> long a(T t, jf2<T> jf2, int i) {
        Looper myLooper = Looper.myLooper();
        mf2.b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new if2(this, myLooper, t, jf2, i, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    public final void a(int i) {
        IOException iOException = this.f2752c;
        if (iOException == null) {
            if2<? extends lf2> if2 = this.f2751b;
            if (if2 != null) {
                if2.a(if2.d);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void a(Runnable runnable) {
        if2<? extends lf2> if2 = this.f2751b;
        if (if2 != null) {
            if2.a(true);
        }
        this.f2750a.execute(runnable);
        this.f2750a.shutdown();
    }

    public final boolean a() {
        return this.f2751b != null;
    }

    public final void b() {
        this.f2751b.a(false);
    }
}
