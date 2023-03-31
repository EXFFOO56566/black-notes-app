package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new p();

    /* renamed from: b  reason: collision with root package name */
    private final int f1528b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1529c;

    Scope(int i, String str) {
        r.a(str, (Object) "scopeUri must not be null or empty");
        this.f1528b = i;
        this.f1529c = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final String d() {
        return this.f1529c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f1529c.equals(((Scope) obj).f1529c);
    }

    public final int hashCode() {
        return this.f1529c.hashCode();
    }

    public final String toString() {
        return this.f1529c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1528b);
        c.a(parcel, 2, d(), false);
        c.a(parcel, a2);
    }
}
