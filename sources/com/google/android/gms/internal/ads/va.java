package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.d.a;

public abstract class va extends j72 implements sa {
    public va() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        boolean z;
        Parcelable parcelable;
        xa xaVar = null;
        switch (i) {
            case 1:
                a a2 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                um2 um2 = (um2) i72.a(parcel, um2.CREATOR);
                rm2 rm2 = (rm2) i72.a(parcel, rm2.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xaVar = queryLocalInterface instanceof xa ? (xa) queryLocalInterface : new za(readStrongBinder);
                }
                a(a2, um2, rm2, readString, xaVar);
                parcel2.writeNoException();
                return true;
            case 2:
                iInterface = F1();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 3:
                a a3 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                rm2 rm22 = (rm2) i72.a(parcel, rm2.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xaVar = queryLocalInterface2 instanceof xa ? (xa) queryLocalInterface2 : new za(readStrongBinder2);
                }
                b(a3, rm22, readString2, xaVar);
                parcel2.writeNoException();
                return true;
            case 4:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 5:
                destroy();
                parcel2.writeNoException();
                return true;
            case 6:
                a a4 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                um2 um22 = (um2) i72.a(parcel, um2.CREATOR);
                rm2 rm23 = (rm2) i72.a(parcel, rm2.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xaVar = queryLocalInterface3 instanceof xa ? (xa) queryLocalInterface3 : new za(readStrongBinder3);
                }
                a(a4, um22, rm23, readString3, readString4, xaVar);
                parcel2.writeNoException();
                return true;
            case 7:
                a a5 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                rm2 rm24 = (rm2) i72.a(parcel, rm2.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xaVar = queryLocalInterface4 instanceof xa ? (xa) queryLocalInterface4 : new za(readStrongBinder4);
                }
                a(a5, rm24, readString5, readString6, xaVar);
                parcel2.writeNoException();
                return true;
            case 8:
                p();
                parcel2.writeNoException();
                return true;
            case 9:
                z();
                parcel2.writeNoException();
                return true;
            case 10:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), (rm2) i72.a(parcel, rm2.CREATOR), parcel.readString(), oh.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                a((rm2) i72.a(parcel, rm2.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                showVideo();
                parcel2.writeNoException();
                return true;
            case 13:
                z = isInitialized();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 14:
                a a6 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                rm2 rm25 = (rm2) i72.a(parcel, rm2.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xaVar = queryLocalInterface5 instanceof xa ? (xa) queryLocalInterface5 : new za(readStrongBinder5);
                }
                a(a6, rm25, readString7, readString8, xaVar, (m1) i72.a(parcel, m1.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                iInterface = n1();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 16:
                iInterface = J0();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 17:
                parcelable = zzti();
                parcel2.writeNoException();
                i72.b(parcel2, parcelable);
                return true;
            case 18:
                parcelable = getInterstitialAdapterInfo();
                parcel2.writeNoException();
                i72.b(parcel2, parcelable);
                return true;
            case 19:
                parcelable = A1();
                parcel2.writeNoException();
                i72.b(parcel2, parcelable);
                return true;
            case 20:
                a((rm2) i72.a(parcel, rm2.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                h(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                z = f1();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 23:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), oh.a(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                iInterface = z0();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 25:
                a(i72.a(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                iInterface = getVideoController();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 27:
                iInterface = P1();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 28:
                a a7 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                rm2 rm26 = (rm2) i72.a(parcel, rm2.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xaVar = queryLocalInterface6 instanceof xa ? (xa) queryLocalInterface6 : new za(readStrongBinder6);
                }
                a(a7, rm26, readString9, xaVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                F(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), j6.a(parcel.readStrongBinder()), parcel.createTypedArrayList(o6.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                a a8 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                rm2 rm27 = (rm2) i72.a(parcel, rm2.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xaVar = queryLocalInterface7 instanceof xa ? (xa) queryLocalInterface7 : new za(readStrongBinder7);
                }
                c(a8, rm27, readString10, xaVar);
                parcel2.writeNoException();
                return true;
            case 33:
                parcelable = h0();
                parcel2.writeNoException();
                i72.b(parcel2, parcelable);
                return true;
            case 34:
                parcelable = a0();
                parcel2.writeNoException();
                i72.b(parcel2, parcelable);
                return true;
        }
    }
}
