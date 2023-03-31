package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import b.c.b.a.e.b.c;

public abstract class q extends c implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.e.b.c
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            X0();
        } else if (i != 2) {
            return false;
        } else {
            e0();
        }
        return true;
    }
}
