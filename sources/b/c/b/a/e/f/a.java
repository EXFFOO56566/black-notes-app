package b.c.b.a.e.f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f1198b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1199c;

    protected a(IBinder iBinder, String str) {
        this.f1198b = iBinder;
        this.f1199c = str;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f1198b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1198b;
    }

    /* access modifiers changed from: protected */
    public final Parcel r0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1199c);
        return obtain;
    }
}
