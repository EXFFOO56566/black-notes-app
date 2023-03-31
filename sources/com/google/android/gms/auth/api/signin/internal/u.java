package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.e.b.d;
import b.c.b.a.e.b.e;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class u extends d implements v {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.v
    public final void a(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel r0 = r0();
        e.a(r0, tVar);
        e.a(r0, googleSignInOptions);
        a(103, r0);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.v
    public final void b(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel r0 = r0();
        e.a(r0, tVar);
        e.a(r0, googleSignInOptions);
        a(102, r0);
    }
}
