package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class qc2 implements Parcelable {
    public static final Parcelable.Creator<qc2> CREATOR = new pc2();

    /* renamed from: b  reason: collision with root package name */
    private final a[] f4314b;

    public interface a extends Parcelable {
    }

    qc2(Parcel parcel) {
        this.f4314b = new a[parcel.readInt()];
        int i = 0;
        while (true) {
            a[] aVarArr = this.f4314b;
            if (i < aVarArr.length) {
                aVarArr[i] = (a) parcel.readParcelable(a.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public qc2(List<? extends a> list) {
        a[] aVarArr = new a[list.size()];
        this.f4314b = aVarArr;
        list.toArray(aVarArr);
    }

    public final int a() {
        return this.f4314b.length;
    }

    public final a a(int i) {
        return this.f4314b[i];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qc2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4314b, ((qc2) obj).f4314b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4314b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4314b.length);
        for (a aVar : this.f4314b) {
            parcel.writeParcelable(aVar, 0);
        }
    }
}
