package b.c.b.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

public final class s implements Parcelable.Creator<d> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                i = b.k(parcel, a2);
            } else if (a3 != 3) {
                b.n(parcel, a2);
            } else {
                j = b.l(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new d(str, i, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i) {
        return new d[i];
    }
}
