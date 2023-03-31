package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.w.b;

public final class x implements Parcelable.Creator<SignInConfiguration> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                str = b.d(parcel, a2);
            } else if (a3 != 5) {
                b.n(parcel, a2);
            } else {
                googleSignInOptions = (GoogleSignInOptions) b.a(parcel, a2, GoogleSignInOptions.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
