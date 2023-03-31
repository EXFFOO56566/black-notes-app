package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.common.internal.w.b;

public final class i implements Parcelable.Creator<SignInAccount> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = BuildConfig.FLAVOR;
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 4) {
                str = b.d(parcel, a2);
            } else if (a3 == 7) {
                googleSignInAccount = (GoogleSignInAccount) b.a(parcel, a2, GoogleSignInAccount.CREATOR);
            } else if (a3 != 8) {
                b.n(parcel, a2);
            } else {
                str2 = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i) {
        return new SignInAccount[i];
    }
}
