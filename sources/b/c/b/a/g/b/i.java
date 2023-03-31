package b.c.b.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w.b;

public final class i implements Parcelable.Creator<j> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        s sVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.k(parcel, a2);
            } else if (a3 != 2) {
                b.n(parcel, a2);
            } else {
                sVar = (s) b.a(parcel, a2, s.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new j(i, sVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i) {
        return new j[i];
    }
}
