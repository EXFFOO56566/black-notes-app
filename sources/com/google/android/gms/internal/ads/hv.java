package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import b.c.b.a.d.a;
import java.util.List;
import java.util.Map;

public abstract class hv extends j72 implements ev {
    public hv() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        switch (i) {
            case 1:
                f((Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle i3 = i((Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                i72.b(parcel2, i3);
                return true;
            case 3:
                c(parcel.readString(), parcel.readString(), (Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                a(parcel.readString(), parcel.readString(), a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map a2 = a(parcel.readString(), parcel.readString(), i72.a(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(a2);
                return true;
            case 6:
                int z = z(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z);
                return true;
            case 7:
                g((Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                a(parcel.readString(), parcel.readString(), (Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List b2 = b(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(b2);
                return true;
            case 10:
                str = q1();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 11:
                str = A0();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 12:
                long w1 = w1();
                parcel2.writeNoException();
                parcel2.writeLong(w1);
                return true;
            case 13:
                o(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                y(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                str = y1();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 17:
                str = T0();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 18:
                str = y0();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
