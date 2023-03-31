package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.e.e.c;

public interface m extends IInterface {

    public static abstract class a extends b.c.b.a.e.e.a implements m {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.e.e.a
        public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                a(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                a(parcel.readInt(), parcel.readStrongBinder(), (f0) c.a(parcel, f0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(int i, Bundle bundle);

    void a(int i, IBinder iBinder, Bundle bundle);

    void a(int i, IBinder iBinder, f0 f0Var);
}
