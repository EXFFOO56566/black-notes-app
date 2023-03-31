package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class il1<T> extends el1<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f3108b;

    il1(T t) {
        this.f3108b = t;
    }

    @Override // com.google.android.gms.internal.ads.el1
    public final T a() {
        return this.f3108b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof il1) {
            return this.f3108b.equals(((il1) obj).f3108b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3108b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3108b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
