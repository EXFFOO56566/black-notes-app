package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import b.c.b.a.e.b.c;
import b.c.b.a.e.b.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class s extends c implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.e.b.c
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                a((GoogleSignInAccount) e.a(parcel, GoogleSignInAccount.CREATOR), (Status) e.a(parcel, Status.CREATOR));
                throw null;
            case 102:
                b((Status) e.a(parcel, Status.CREATOR));
                break;
            case 103:
                c((Status) e.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
