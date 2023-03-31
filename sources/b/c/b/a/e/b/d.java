package b.c.b.a.e.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class d implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f1191b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1192c;

    protected d(IBinder iBinder, String str) {
        this.f1191b = iBinder;
        this.f1192c = str;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f1191b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1191b;
    }

    /* access modifiers changed from: protected */
    public final Parcel r0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1192c);
        return obtain;
    }
}
