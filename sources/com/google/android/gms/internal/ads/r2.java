package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class r2 extends j72 implements o2 {
    public r2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        String str;
        switch (i) {
            case 2:
                iInterface = n();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 3:
                str = b();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 4:
                List h = h();
                parcel2.writeNoException();
                parcel2.writeList(h);
                return true;
            case 5:
                str = d();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 6:
                iInterface = d0();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 7:
                str = f();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                str = q();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 9:
                Bundle g = g();
                parcel2.writeNoException();
                i72.b(parcel2, g);
                return true;
            case 10:
                destroy();
                parcel2.writeNoException();
                return true;
            case 11:
                iInterface = getVideoController();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 12:
                b((Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean a2 = a((Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                i72.a(parcel2, a2);
                return true;
            case 14:
                d((Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                iInterface = e();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 16:
                iInterface = c();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 17:
                str = a();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
