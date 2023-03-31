package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.b;
import com.google.android.gms.common.util.o;

public final class w extends q {

    /* renamed from: b  reason: collision with root package name */
    private final Context f1526b;

    public w(Context context) {
        this.f1526b = context;
    }

    private final void r0() {
        if (!o.a(this.f1526b, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.r
    public final void X0() {
        r0();
        c a2 = c.a(this.f1526b);
        GoogleSignInAccount b2 = a2.b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.p;
        if (b2 != null) {
            googleSignInOptions = a2.c();
        }
        b a3 = a.a(this.f1526b, googleSignInOptions);
        if (b2 != null) {
            a3.g();
        } else {
            a3.h();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.r
    public final void e0() {
        r0();
        o.a(this.f1526b).a();
    }
}
