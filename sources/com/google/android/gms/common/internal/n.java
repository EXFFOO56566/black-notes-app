package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class n implements o {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f1639b;

    n(IBinder iBinder) {
        this.f1639b = iBinder;
    }

    @Override // com.google.android.gms.common.internal.o
    public final void a(m mVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                gVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1639b.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1639b;
    }
}
