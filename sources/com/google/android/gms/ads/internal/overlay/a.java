package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class a implements Parcelable.Creator<d> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    str = b.d(parcel, a2);
                    break;
                case 3:
                    str2 = b.d(parcel, a2);
                    break;
                case 4:
                    str3 = b.d(parcel, a2);
                    break;
                case 5:
                    str4 = b.d(parcel, a2);
                    break;
                case 6:
                    str5 = b.d(parcel, a2);
                    break;
                case 7:
                    str6 = b.d(parcel, a2);
                    break;
                case 8:
                    str7 = b.d(parcel, a2);
                    break;
                case 9:
                    intent = (Intent) b.a(parcel, a2, Intent.CREATOR);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new d(str, str2, str3, str4, str5, str6, str7, intent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i) {
        return new d[i];
    }
}
