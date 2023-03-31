package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import java.util.Map;

public final class p5 extends a {
    public static final Parcelable.Creator<p5> CREATOR = new s5();

    /* renamed from: b  reason: collision with root package name */
    private final String f4110b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f4111c;
    private final String[] d;

    p5(String str, String[] strArr, String[] strArr2) {
        this.f4110b = str;
        this.f4111c = strArr;
        this.d = strArr2;
    }

    public static p5 a(gh2<?> gh2) {
        Map<String, String> b2 = gh2.b();
        int size = b2.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry<String, String> entry : b2.entrySet()) {
            strArr[i] = entry.getKey();
            strArr2[i] = entry.getValue();
            i++;
        }
        return new p5(gh2.e(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4110b, false);
        c.a(parcel, 2, this.f4111c, false);
        c.a(parcel, 3, this.d, false);
        c.a(parcel, a2);
    }
}
