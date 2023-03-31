package b.c.b.a.e.f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class j0 implements Parcelable.Creator<h0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h0 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    j = b.l(parcel, a2);
                    break;
                case 2:
                    j2 = b.l(parcel, a2);
                    break;
                case 3:
                    z = b.h(parcel, a2);
                    break;
                case 4:
                    str = b.d(parcel, a2);
                    break;
                case 5:
                    str2 = b.d(parcel, a2);
                    break;
                case 6:
                    str3 = b.d(parcel, a2);
                    break;
                case 7:
                    bundle = b.a(parcel, a2);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new h0(j, j2, z, str, str2, str3, bundle);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h0[] newArray(int i) {
        return new h0[i];
    }
}
