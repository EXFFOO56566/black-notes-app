package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b.c.b.a.e.b.a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;

public final class j extends h<v> {
    private final GoogleSignInOptions z;

    public j(Context context, Looper looper, d dVar, GoogleSignInOptions googleSignInOptions, f.a aVar, f.b bVar) {
        super(context, looper, 91, dVar, aVar, bVar);
        GoogleSignInOptions.a aVar2;
        if (googleSignInOptions == null) {
            aVar2 = new GoogleSignInOptions.a();
        }
        aVar2.a(a.a());
        if (!dVar.d().isEmpty()) {
            for (Scope scope : dVar.d()) {
                aVar2.a(scope, new Scope[0]);
            }
        }
        this.z = aVar2.a();
    }

    public final GoogleSignInOptions B() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof v ? (v) queryLocalInterface : new u(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String c() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int e() {
        return b.c.b.a.c.j.f1165a;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String l() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
