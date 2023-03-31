package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class gg2 implements Parcelable {
    public static final Parcelable.Creator<gg2> CREATOR = new eg2();

    /* renamed from: b  reason: collision with root package name */
    public final int f2756b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2757c;
    public final int d;
    public final byte[] e;
    private int f;

    public gg2(int i, int i2, int i3, byte[] bArr) {
        this.f2756b = i;
        this.f2757c = i2;
        this.d = i3;
        this.e = bArr;
    }

    gg2(Parcel parcel) {
        this.f2756b = parcel.readInt();
        this.f2757c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gg2.class == obj.getClass()) {
            gg2 gg2 = (gg2) obj;
            return this.f2756b == gg2.f2756b && this.f2757c == gg2.f2757c && this.d == gg2.d && Arrays.equals(this.e, gg2.e);
        }
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = ((((((this.f2756b + 527) * 31) + this.f2757c) * 31) + this.d) * 31) + Arrays.hashCode(this.e);
        }
        return this.f;
    }

    public final String toString() {
        int i = this.f2756b;
        int i2 = this.f2757c;
        int i3 = this.d;
        boolean z = this.e != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2756b);
        parcel.writeInt(this.f2757c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e != null ? 1 : 0);
        byte[] bArr = this.e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
