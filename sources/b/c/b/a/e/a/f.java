package b.c.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;

public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // b.c.b.a.e.a.d
    public final boolean J() {
        Parcel a2 = a(6, r0());
        boolean a3 = c.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // b.c.b.a.e.a.d
    public final boolean f(boolean z) {
        Parcel r0 = r0();
        c.a(r0, true);
        Parcel a2 = a(2, r0);
        boolean a3 = c.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // b.c.b.a.e.a.d
    public final String s1() {
        Parcel a2 = a(1, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
