package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.x;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class ed extends a {
    public static final Parcelable.Creator<ed> CREATOR = new dd();

    /* renamed from: b  reason: collision with root package name */
    private final int f2399b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2400c;
    private final int d;

    ed(int i, int i2, int i3) {
        this.f2399b = i;
        this.f2400c = i2;
        this.d = i3;
    }

    public static ed a(x xVar) {
        xVar.a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ed)) {
            ed edVar = (ed) obj;
            return edVar.d == this.d && edVar.f2400c == this.f2400c && edVar.f2399b == this.f2399b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f2399b, this.f2400c, this.d});
    }

    public final String toString() {
        int i = this.f2399b;
        int i2 = this.f2400c;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f2399b);
        c.a(parcel, 2, this.f2400c);
        c.a(parcel, 3, this.d);
        c.a(parcel, a2);
    }
}
