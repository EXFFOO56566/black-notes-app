package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class ab0<T> {

    /* renamed from: a  reason: collision with root package name */
    public T f1734a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f1735b;

    public ab0(T t, Executor executor) {
        this.f1734a = t;
        this.f1735b = executor;
    }

    public static <T> ab0<T> a(T t, Executor executor) {
        return new ab0<>(t, executor);
    }
}
