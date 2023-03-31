package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.w.b;

public final class d0 implements Parcelable.Creator<s> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.k(parcel, a2);
            } else if (a3 == 2) {
                account = (Account) b.a(parcel, a2, Account.CREATOR);
            } else if (a3 == 3) {
                i2 = b.k(parcel, a2);
            } else if (a3 != 4) {
                b.n(parcel, a2);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.a(parcel, a2, GoogleSignInAccount.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new s(i, account, i2, googleSignInAccount);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s[] newArray(int i) {
        return new s[i];
    }
}
