package com.google.android.gms.internal.ads;

public final class li2 {

    /* renamed from: a  reason: collision with root package name */
    final long f3561a;

    /* renamed from: b  reason: collision with root package name */
    final String f3562b;

    /* renamed from: c  reason: collision with root package name */
    final int f3563c;

    li2(long j, String str, int i) {
        this.f3561a = j;
        this.f3562b = str;
        this.f3563c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof li2)) {
            li2 li2 = (li2) obj;
            return li2.f3561a == this.f3561a && li2.f3563c == this.f3563c;
        }
    }

    public final int hashCode() {
        return (int) this.f3561a;
    }
}
