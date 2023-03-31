package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class pc extends j72 implements qc {
    public pc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static qc a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof qc ? (qc) queryLocalInterface : new sc(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        rc rcVar;
        ed edVar;
        boolean z;
        ec ecVar = null;
        lc ncVar = null;
        kc mcVar = null;
        lc ncVar2 = null;
        fc hcVar = null;
        if (i != 1) {
            if (i == 2) {
                edVar = h0();
            } else if (i != 3) {
                if (i == 5) {
                    rp2 videoController = getVideoController();
                    parcel2.writeNoException();
                    i72.a(parcel2, videoController);
                } else if (i == 10) {
                    y(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                } else if (i != 11) {
                    switch (i) {
                        case 13:
                            String readString = parcel.readString();
                            String readString2 = parcel.readString();
                            rm2 rm2 = (rm2) i72.a(parcel, rm2.CREATOR);
                            a a2 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder != null) {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                ecVar = queryLocalInterface instanceof ec ? (ec) queryLocalInterface : new gc(readStrongBinder);
                            }
                            a(readString, readString2, rm2, a2, ecVar, wa.a(parcel.readStrongBinder()), (um2) i72.a(parcel, um2.CREATOR));
                            break;
                        case 14:
                            String readString3 = parcel.readString();
                            String readString4 = parcel.readString();
                            rm2 rm22 = (rm2) i72.a(parcel, rm2.CREATOR);
                            a a3 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                hcVar = queryLocalInterface2 instanceof fc ? (fc) queryLocalInterface2 : new hc(readStrongBinder2);
                            }
                            a(readString3, readString4, rm22, a3, hcVar, wa.a(parcel.readStrongBinder()));
                            break;
                        case 15:
                            z = B(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            i72.a(parcel2, z);
                            break;
                        case 16:
                            String readString5 = parcel.readString();
                            String readString6 = parcel.readString();
                            rm2 rm23 = (rm2) i72.a(parcel, rm2.CREATOR);
                            a a4 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                            IBinder readStrongBinder3 = parcel.readStrongBinder();
                            if (readStrongBinder3 != null) {
                                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                ncVar2 = queryLocalInterface3 instanceof lc ? (lc) queryLocalInterface3 : new nc(readStrongBinder3);
                            }
                            a(readString5, readString6, rm23, a4, ncVar2, wa.a(parcel.readStrongBinder()));
                            break;
                        case 17:
                            z = H(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            i72.a(parcel2, z);
                            break;
                        case 18:
                            String readString7 = parcel.readString();
                            String readString8 = parcel.readString();
                            rm2 rm24 = (rm2) i72.a(parcel, rm2.CREATOR);
                            a a5 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                            IBinder readStrongBinder4 = parcel.readStrongBinder();
                            if (readStrongBinder4 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                mcVar = queryLocalInterface4 instanceof kc ? (kc) queryLocalInterface4 : new mc(readStrongBinder4);
                            }
                            a(readString7, readString8, rm24, a5, mcVar, wa.a(parcel.readStrongBinder()));
                            break;
                        case 19:
                            r(parcel.readString());
                            break;
                        case 20:
                            String readString9 = parcel.readString();
                            String readString10 = parcel.readString();
                            rm2 rm25 = (rm2) i72.a(parcel, rm2.CREATOR);
                            a a6 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                            IBinder readStrongBinder5 = parcel.readStrongBinder();
                            if (readStrongBinder5 != null) {
                                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                ncVar = queryLocalInterface5 instanceof lc ? (lc) queryLocalInterface5 : new nc(readStrongBinder5);
                            }
                            b(readString9, readString10, rm25, a6, ncVar, wa.a(parcel.readStrongBinder()));
                            break;
                        default:
                            return false;
                    }
                } else {
                    a(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
                }
                return true;
            } else {
                edVar = a0();
            }
            parcel2.writeNoException();
            i72.b(parcel2, edVar);
            return true;
        }
        a a7 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
        String readString11 = parcel.readString();
        Bundle bundle = (Bundle) i72.a(parcel, Bundle.CREATOR);
        Bundle bundle2 = (Bundle) i72.a(parcel, Bundle.CREATOR);
        um2 um2 = (um2) i72.a(parcel, um2.CREATOR);
        IBinder readStrongBinder6 = parcel.readStrongBinder();
        if (readStrongBinder6 == null) {
            rcVar = null;
        } else {
            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            rcVar = queryLocalInterface6 instanceof rc ? (rc) queryLocalInterface6 : new tc(readStrongBinder6);
        }
        a(a7, readString11, bundle, bundle2, um2, rcVar);
        parcel2.writeNoException();
        return true;
    }
}
