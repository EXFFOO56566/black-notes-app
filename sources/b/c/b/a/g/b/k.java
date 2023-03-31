package b.c.b.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.w.b;

public final class k implements Parcelable.Creator<l> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        b.c.b.a.c.b bVar = null;
        t tVar = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.k(parcel, a2);
            } else if (a3 == 2) {
                bVar = (b.c.b.a.c.b) b.a(parcel, a2, b.c.b.a.c.b.CREATOR);
            } else if (a3 != 3) {
                b.n(parcel, a2);
            } else {
                tVar = (t) b.a(parcel, a2, t.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new l(i, bVar, tVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i) {
        return new l[i];
    }
}
