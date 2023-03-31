package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0084a();

    /* renamed from: b  reason: collision with root package name */
    private final i f5891b;

    /* renamed from: c  reason: collision with root package name */
    private final i f5892c;
    private final i d;
    private final b e;
    private final int f;
    private final int g;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    static class C0084a implements Parcelable.Creator<a> {
        C0084a() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a((i) parcel.readParcelable(i.class.getClassLoader()), (i) parcel.readParcelable(i.class.getClassLoader()), (i) parcel.readParcelable(i.class.getClassLoader()), (b) parcel.readParcelable(b.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public interface b extends Parcelable {
        boolean a(long j);
    }

    private a(i iVar, i iVar2, i iVar3, b bVar) {
        this.f5891b = iVar;
        this.f5892c = iVar2;
        this.d = iVar3;
        this.e = bVar;
        if (iVar.compareTo(iVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (iVar3.compareTo(iVar2) <= 0) {
            this.g = iVar.b(iVar2) + 1;
            this.f = (iVar2.e - iVar.e) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* synthetic */ a(i iVar, i iVar2, i iVar3, b bVar, C0084a aVar) {
        this(iVar, iVar2, iVar3, bVar);
    }

    public b a() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public i b() {
        return this.f5892c;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.g;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public i e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5891b.equals(aVar.f5891b) && this.f5892c.equals(aVar.f5892c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    /* access modifiers changed from: package-private */
    public i g() {
        return this.f5891b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5891b, this.f5892c, this.d, this.e});
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5891b, 0);
        parcel.writeParcelable(this.f5892c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }
}
