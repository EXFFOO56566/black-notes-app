package com.google.android.gms.internal.ads;

public final class p42<T> implements r42<T> {

    /* renamed from: a  reason: collision with root package name */
    private e52<T> f4109a;

    public static <T> void a(e52<T> e52, e52<T> e522) {
        y42.a(e522);
        p42 p42 = (p42) e52;
        if (p42.f4109a == null) {
            p42.f4109a = e522;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final T get() {
        e52<T> e52 = this.f4109a;
        if (e52 != null) {
            return e52.get();
        }
        throw new IllegalStateException();
    }
}
