package com.google.android.gms.auth.api.signin.internal;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static int f1514b = 31;

    /* renamed from: a  reason: collision with root package name */
    private int f1515a = 1;

    public int a() {
        return this.f1515a;
    }

    public b a(Object obj) {
        this.f1515a = (f1514b * this.f1515a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public final b a(boolean z) {
        this.f1515a = (f1514b * this.f1515a) + (z ? 1 : 0);
        return this;
    }
}
