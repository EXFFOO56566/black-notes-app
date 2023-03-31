package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class fo extends a {
    public static final Parcelable.Creator<fo> CREATOR = new ko();

    /* renamed from: b  reason: collision with root package name */
    public String f2633b;

    /* renamed from: c  reason: collision with root package name */
    public int f2634c;
    public int d;
    public boolean e;
    private boolean f;

    public fo(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public fo(int i, int i2, boolean z, boolean z2) {
        this(i, i2, true, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private fo(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x0005
            java.lang.String r11 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r11 = "1"
        L_0x0007:
            int r12 = r11.length()
            int r12 = r12 + 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "afma-sdk-a-v"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fo.<init>(int, int, boolean, boolean, boolean):void");
    }

    fo(String str, int i, int i2, boolean z, boolean z2) {
        this.f2633b = str;
        this.f2634c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
    }

    public static fo d() {
        return new fo(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f2633b, false);
        c.a(parcel, 3, this.f2634c);
        c.a(parcel, 4, this.d);
        c.a(parcel, 5, this.e);
        c.a(parcel, 6, this.f);
        c.a(parcel, a2);
    }
}
