package com.google.android.gms.common.api.internal;

public final class j<L> {

    /* renamed from: a  reason: collision with root package name */
    private final L f1578a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1579b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f1578a == jVar.f1578a && this.f1579b.equals(jVar.f1579b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f1578a) * 31) + this.f1579b.hashCode();
    }
}
