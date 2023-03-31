package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* access modifiers changed from: package-private */
public final class cf implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f2105a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ bf f2106b;

    cf(bf bfVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2106b = bfVar;
        this.f2105a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f2106b.a(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2105a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f2105a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
