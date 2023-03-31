package b.c.b.a.d;

import android.os.IBinder;
import android.os.IInterface;
import b.c.b.a.e.e.b;

public interface a extends IInterface {

    /* renamed from: b.c.b.a.d.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0058a extends b.c.b.a.e.e.a implements a {

        /* renamed from: b.c.b.a.d.a$a$a  reason: collision with other inner class name */
        public static class C0059a extends b implements a {
            C0059a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public AbstractBinderC0058a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0059a(iBinder);
        }
    }
}
