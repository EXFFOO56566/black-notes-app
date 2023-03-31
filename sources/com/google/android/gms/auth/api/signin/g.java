package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.w.b;
import java.util.ArrayList;

public final class g implements Parcelable.Creator<GoogleSignInOptions> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.k(parcel, a2);
                    break;
                case 2:
                    arrayList = b.c(parcel, a2, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) b.a(parcel, a2, Account.CREATOR);
                    break;
                case 4:
                    z = b.h(parcel, a2);
                    break;
                case 5:
                    z2 = b.h(parcel, a2);
                    break;
                case 6:
                    z3 = b.h(parcel, a2);
                    break;
                case 7:
                    str = b.d(parcel, a2);
                    break;
                case 8:
                    str2 = b.d(parcel, a2);
                    break;
                case 9:
                    arrayList2 = b.c(parcel, a2, a.CREATOR);
                    break;
                case 10:
                    str3 = b.d(parcel, a2);
                    break;
                default:
                    b.n(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
