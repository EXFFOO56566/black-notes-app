package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.x.b;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import org.json.JSONArray;

public final class uh extends a {
    public static final Parcelable.Creator<uh> CREATOR = new th();

    /* renamed from: b  reason: collision with root package name */
    public final String f4950b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4951c;

    public uh(b bVar) {
        this(bVar.m(), bVar.I());
    }

    public uh(String str, int i) {
        this.f4950b = str;
        this.f4951c = i;
    }

    public static uh a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new uh(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof uh)) {
            uh uhVar = (uh) obj;
            return p.a(this.f4950b, uhVar.f4950b) && p.a(Integer.valueOf(this.f4951c), Integer.valueOf(uhVar.f4951c));
        }
    }

    public final int hashCode() {
        return p.a(this.f4950b, Integer.valueOf(this.f4951c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f4950b, false);
        c.a(parcel, 3, this.f4951c);
        c.a(parcel, a2);
    }
}
