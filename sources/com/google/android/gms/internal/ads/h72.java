package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class h72 implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f2873b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2874c;

    protected h72(IBinder iBinder, String str) {
        this.f2873b = iBinder;
        this.f2874c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f2873b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2873b;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2873b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void c(int i, Parcel parcel) {
        try {
            this.f2873b.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel r0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2874c);
        return obtain;
    }
}
