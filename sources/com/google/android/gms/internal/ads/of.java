package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class of extends j72 implements qf {
    public of() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            rf rfVar = null;
            tf tfVar = null;
            tf tfVar2 = null;
            tf tfVar3 = null;
            tf tfVar4 = null;
            if (i == 2) {
                jf jfVar = (jf) i72.a(parcel, jf.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    rfVar = queryLocalInterface instanceof rf ? (rf) queryLocalInterface : new uf(readStrongBinder);
                }
                a(jfVar, rfVar);
            } else if (i == 4) {
                zf zfVar = (zf) i72.a(parcel, zf.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    tfVar4 = queryLocalInterface2 instanceof tf ? (tf) queryLocalInterface2 : new vf(readStrongBinder2);
                }
                a(zfVar, tfVar4);
            } else if (i == 5) {
                zf zfVar2 = (zf) i72.a(parcel, zf.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    tfVar3 = queryLocalInterface3 instanceof tf ? (tf) queryLocalInterface3 : new vf(readStrongBinder3);
                }
                c(zfVar2, tfVar3);
            } else if (i == 6) {
                zf zfVar3 = (zf) i72.a(parcel, zf.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    tfVar2 = queryLocalInterface4 instanceof tf ? (tf) queryLocalInterface4 : new vf(readStrongBinder4);
                }
                b(zfVar3, tfVar2);
            } else if (i != 7) {
                return false;
            } else {
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    tfVar = queryLocalInterface5 instanceof tf ? (tf) queryLocalInterface5 : new vf(readStrongBinder5);
                }
                a(readString, tfVar);
            }
            parcel2.writeNoException();
        } else {
            lf a2 = a((jf) i72.a(parcel, jf.CREATOR));
            parcel2.writeNoException();
            i72.b(parcel2, a2);
        }
        return true;
    }
}
