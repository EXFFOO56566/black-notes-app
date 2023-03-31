package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class do2 extends j72 implements eo2 {
    public do2() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        boolean z;
        Parcelable parcelable;
        String str;
        rn2 rn2 = null;
        lp2 lp2 = null;
        io2 io2 = null;
        to2 to2 = null;
        qn2 qn2 = null;
        no2 no2 = null;
        switch (i) {
            case 1:
                iInterface = m1();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                z = D();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 4:
                z = a((rm2) i72.a(parcel, rm2.CREATOR));
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 5:
                p();
                parcel2.writeNoException();
                return true;
            case 6:
                z();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    rn2 = queryLocalInterface instanceof rn2 ? (rn2) queryLocalInterface : new tn2(readStrongBinder);
                }
                a(rn2);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    no2 = queryLocalInterface2 instanceof no2 ? (no2) queryLocalInterface2 : new po2(readStrongBinder2);
                }
                a(no2);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                x0();
                parcel2.writeNoException();
                return true;
            case 11:
                E1();
                parcel2.writeNoException();
                return true;
            case 12:
                parcelable = Z1();
                parcel2.writeNoException();
                i72.b(parcel2, parcelable);
                return true;
            case 13:
                a((um2) i72.a(parcel, um2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                a(ke.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                a(qe.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                str = a();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 19:
                a(x.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    qn2 = queryLocalInterface3 instanceof qn2 ? (qn2) queryLocalInterface3 : new sn2(readStrongBinder3);
                }
                a(qn2);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    to2 = queryLocalInterface4 instanceof to2 ? (to2) queryLocalInterface4 : new so2(readStrongBinder4);
                }
                b(to2);
                parcel2.writeNoException();
                return true;
            case 22:
                c(i72.a(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                z = u();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 24:
                a(hh.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                c(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                iInterface = getVideoController();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 29:
                a((er2) i72.a(parcel, er2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                a((xp2) i72.a(parcel, xp2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                str = D1();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 32:
                iInterface = S0();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 33:
                iInterface = t1();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 34:
                a(i72.a(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                str = V();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    io2 = queryLocalInterface5 instanceof io2 ? (io2) queryLocalInterface5 : new ko2(readStrongBinder5);
                }
                a(io2);
                parcel2.writeNoException();
                return true;
            case 37:
                parcelable = v();
                parcel2.writeNoException();
                i72.b(parcel2, parcelable);
                return true;
            case 38:
                s(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                a((bn2) i72.a(parcel, bn2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                a(vi2.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                iInterface = j();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    lp2 = queryLocalInterface6 instanceof lp2 ? (lp2) queryLocalInterface6 : new np2(readStrongBinder6);
                }
                a(lp2);
                parcel2.writeNoException();
                return true;
        }
    }
}
