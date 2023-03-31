package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class wm2 extends a {
    public static final Parcelable.Creator<wm2> CREATOR = new zm2();

    /* renamed from: b  reason: collision with root package name */
    public final int f5294b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5295c;
    public final String d;
    public final long e;

    public wm2(int i, int i2, String str, long j) {
        this.f5294b = i;
        this.f5295c = i2;
        this.d = str;
        this.e = j;
    }

    public static wm2 a(JSONObject jSONObject) {
        return new wm2(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5294b);
        c.a(parcel, 2, this.f5295c);
        c.a(parcel, 3, this.d, false);
        c.a(parcel, 4, this.e);
        c.a(parcel, a2);
    }
}
