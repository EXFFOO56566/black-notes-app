package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* access modifiers changed from: package-private */
public final class df implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f2247a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ bf f2248b;

    df(bf bfVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2248b = bfVar;
        this.f2247a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f2248b.a(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2247a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f2247a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
