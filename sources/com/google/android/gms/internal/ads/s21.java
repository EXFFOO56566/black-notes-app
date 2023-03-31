package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class s21 implements r42<r21> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Executor> f4591a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ik> f4592b;

    private s21(e52<Executor> e52, e52<ik> e522) {
        this.f4591a = e52;
        this.f4592b = e522;
    }

    public static r21 a(Executor executor, ik ikVar) {
        return new r21(executor, ikVar);
    }

    public static s21 a(e52<Executor> e52, e52<ik> e522) {
        return new s21(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f4591a.get(), this.f4592b.get());
    }
}
