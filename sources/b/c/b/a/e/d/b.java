package b.c.b.a.e.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f1194b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1195c;

    protected b(IBinder iBinder, String str) {
        this.f1194b = iBinder;
        this.f1195c = str;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f1194b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1194b;
    }

    /* access modifiers changed from: protected */
    public final Parcel r0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1195c);
        return obtain;
    }
}
