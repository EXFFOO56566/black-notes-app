package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class rc2 extends wc2 {
    public static final Parcelable.Creator<rc2> CREATOR = new tc2();

    /* renamed from: c  reason: collision with root package name */
    private final String f4479c;
    private final String d;
    private final int e;
    private final byte[] f;

    rc2(Parcel parcel) {
        super("APIC");
        this.f4479c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.createByteArray();
    }

    public rc2(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f4479c = str;
        this.d = null;
        this.e = 3;
        this.f = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rc2.class == obj.getClass()) {
            rc2 rc2 = (rc2) obj;
            return this.e == rc2.e && ag2.a(this.f4479c, rc2.f4479c) && ag2.a(this.d, rc2.d) && Arrays.equals(this.f, rc2.f);
        }
    }

    public final int hashCode() {
        int i = (this.e + 527) * 31;
        String str = this.f4479c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4479c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeByteArray(this.f);
    }
}
