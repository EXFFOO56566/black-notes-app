package b.c.b.a.e.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f1196b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1197c;

    protected b(IBinder iBinder, String str) {
        this.f1196b = iBinder;
        this.f1197c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f1196b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1196b;
    }

    /* access modifiers changed from: protected */
    public final Parcel r0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1197c);
        return obtain;
    }
}
