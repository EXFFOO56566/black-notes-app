package com.google.android.gms.internal.ads;

public final class xf1 implements uf1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f5422a;

    public xf1(String str) {
        this.f5422a = str;
    }

    @Override // com.google.android.gms.internal.ads.uf1
    public final boolean equals(Object obj) {
        if (!(obj instanceof xf1)) {
            return false;
        }
        return this.f5422a.equals(((xf1) obj).f5422a);
    }

    @Override // com.google.android.gms.internal.ads.uf1
    public final int hashCode() {
        return this.f5422a.hashCode();
    }

    public final String toString() {
        return this.f5422a;
    }
}
