package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class sc2 extends wc2 {
    public static final Parcelable.Creator<sc2> CREATOR = new uc2();

    /* renamed from: c  reason: collision with root package name */
    private final String f4636c;
    public final String d;
    public final String e;

    sc2(Parcel parcel) {
        super("COMM");
        this.f4636c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    public sc2(String str, String str2, String str3) {
        super("COMM");
        this.f4636c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sc2.class == obj.getClass()) {
            sc2 sc2 = (sc2) obj;
            return ag2.a(this.d, sc2.d) && ag2.a(this.f4636c, sc2.f4636c) && ag2.a(this.e, sc2.e);
        }
    }

    public final int hashCode() {
        String str = this.f4636c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5252b);
        parcel.writeString(this.f4636c);
        parcel.writeString(this.e);
    }
}
