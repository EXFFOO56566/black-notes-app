package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class vc2 extends wc2 {
    public static final Parcelable.Creator<vc2> CREATOR = new yc2();

    /* renamed from: c  reason: collision with root package name */
    private final String f5089c;
    private final String d;

    vc2(Parcel parcel) {
        super(parcel.readString());
        this.f5089c = parcel.readString();
        this.d = parcel.readString();
    }

    public vc2(String str, String str2, String str3) {
        super(str);
        this.f5089c = null;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vc2.class == obj.getClass()) {
            vc2 vc2 = (vc2) obj;
            return this.f5252b.equals(vc2.f5252b) && ag2.a(this.f5089c, vc2.f5089c) && ag2.a(this.d, vc2.d);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f5252b.hashCode() + 527) * 31;
        String str = this.f5089c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5252b);
        parcel.writeString(this.f5089c);
        parcel.writeString(this.d);
    }
}
