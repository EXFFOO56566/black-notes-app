package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class Status extends a implements k, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new q();
    public static final Status f = new Status(0);
    public static final Status g = new Status(14);
    public static final Status h = new Status(8);
    public static final Status i = new Status(15);
    public static final Status j = new Status(16);

    /* renamed from: b  reason: collision with root package name */
    private final int f1530b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1531c;
    private final String d;
    private final PendingIntent e;

    static {
        new Status(17);
        new Status(18);
    }

    public Status(int i2) {
        this(i2, null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.f1530b = i2;
        this.f1531c = i3;
        this.d = str;
        this.e = pendingIntent;
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }

    @Override // com.google.android.gms.common.api.k
    public final Status a() {
        return this;
    }

    public final int d() {
        return this.f1531c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f1530b == status.f1530b && this.f1531c == status.f1531c && p.a(this.d, status.d) && p.a(this.e, status.e);
    }

    public final boolean g() {
        return this.e != null;
    }

    public final int hashCode() {
        return p.a(Integer.valueOf(this.f1530b), Integer.valueOf(this.f1531c), this.d, this.e);
    }

    public final boolean i() {
        return this.f1531c <= 0;
    }

    public final String j() {
        String str = this.d;
        return str != null ? str : d.a(this.f1531c);
    }

    public final String toString() {
        p.a a2 = p.a(this);
        a2.a("statusCode", j());
        a2.a("resolution", this.e);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, d());
        c.a(parcel, 2, e(), false);
        c.a(parcel, 3, (Parcelable) this.e, i2, false);
        c.a(parcel, 1000, this.f1530b);
        c.a(parcel, a2);
    }
}
