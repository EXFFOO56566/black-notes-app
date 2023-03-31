package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new x();

    /* renamed from: b  reason: collision with root package name */
    private final String f1509b;

    /* renamed from: c  reason: collision with root package name */
    private GoogleSignInOptions f1510c;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        r.b(str);
        this.f1509b = str;
        this.f1510c = googleSignInOptions;
    }

    public final GoogleSignInOptions d() {
        return this.f1510c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f1509b.equals(signInConfiguration.f1509b)) {
            GoogleSignInOptions googleSignInOptions = this.f1510c;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f1510c;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        b bVar = new b();
        bVar.a(this.f1509b);
        bVar.a(this.f1510c);
        return bVar.a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f1509b, false);
        c.a(parcel, 5, (Parcelable) this.f1510c, i, false);
        c.a(parcel, a2);
    }
}
