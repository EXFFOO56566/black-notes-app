package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* access modifiers changed from: package-private */
public final class i implements Comparable<i>, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Calendar f5917b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5918c = o.e().format(this.f5917b.getTime());
    final int d;
    final int e = this.f5917b.get(1);
    final int f = this.f5917b.getMaximum(7);
    final int g = this.f5917b.getActualMaximum(5);

    static class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return i.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    private i(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = o.a(calendar);
        this.f5917b = a2;
        this.d = a2.get(2);
        this.f5917b.getTimeInMillis();
    }

    static i a(int i, int i2) {
        Calendar d2 = o.d();
        d2.set(1, i);
        d2.set(2, i2);
        return new i(d2);
    }

    static i l() {
        return new i(o.b());
    }

    /* renamed from: a */
    public int compareTo(i iVar) {
        return this.f5917b.compareTo(iVar.f5917b);
    }

    /* access modifiers changed from: package-private */
    public long a(int i) {
        Calendar a2 = o.a(this.f5917b);
        a2.set(5, i);
        return a2.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public int b() {
        int firstDayOfWeek = this.f5917b.get(7) - this.f5917b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    public int b(i iVar) {
        if (this.f5917b instanceof GregorianCalendar) {
            return ((iVar.e - this.e) * 12) + (iVar.d - this.d);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* access modifiers changed from: package-private */
    public i b(int i) {
        Calendar a2 = o.a(this.f5917b);
        a2.add(2, i);
        return new i(a2);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f5918c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.d == iVar.d && this.e == iVar.e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    /* access modifiers changed from: package-private */
    public long j() {
        return this.f5917b.getTimeInMillis();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.d);
    }
}
