package b.c.b.a.e.f;

import android.os.IBinder;
import android.os.IInterface;

public abstract class c0 extends a0 implements d0 {
    public static d0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof d0 ? (d0) queryLocalInterface : new f0(iBinder);
    }
}
