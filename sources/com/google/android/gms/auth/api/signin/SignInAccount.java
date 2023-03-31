package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import javax.annotation.Nullable;

public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new i();
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private String f1500b;

    /* renamed from: c  reason: collision with root package name */
    private GoogleSignInAccount f1501c;
    @Deprecated
    private String d;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f1501c = googleSignInAccount;
        r.a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f1500b = str;
        r.a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
        this.d = str2;
    }

    @Nullable
    public final GoogleSignInAccount b() {
        return this.f1501c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 4, this.f1500b, false);
        c.a(parcel, 7, (Parcelable) this.f1501c, i, false);
        c.a(parcel, 8, this.d, false);
        c.a(parcel, a2);
    }
}
