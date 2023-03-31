package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class vk implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ sk f5126b;

    vk(sk skVar) {
        this.f5126b = skVar;
    }

    public final void run() {
        this.f5126b.f4672b = Thread.currentThread();
        this.f5126b.a();
    }
}
