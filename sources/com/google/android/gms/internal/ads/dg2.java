package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final class dg2 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f2253a;

    dg2(String str) {
        this.f2253a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f2253a);
    }
}
