package b.c.b.a.e.f;

import android.os.Bundle;
import android.os.Parcel;

public abstract class g0 extends a0 implements e0 {
    public g0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.e.f.a0
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        h((Bundle) q.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
