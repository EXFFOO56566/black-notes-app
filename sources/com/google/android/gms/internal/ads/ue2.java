package com.google.android.gms.internal.ads;

public final class ue2 {

    /* renamed from: a  reason: collision with root package name */
    public final ee2 f4939a;

    /* renamed from: b  reason: collision with root package name */
    public final pe2 f4940b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4941c;
    public final l82[] d;

    public ue2(ee2 ee2, pe2 pe2, Object obj, l82[] l82Arr) {
        this.f4939a = ee2;
        this.f4940b = pe2;
        this.f4941c = obj;
        this.d = l82Arr;
    }

    public final boolean a(ue2 ue2, int i) {
        return ue2 != null && ag2.a(this.f4940b.a(i), ue2.f4940b.a(i)) && ag2.a(this.d[i], ue2.d[i]);
    }
}
