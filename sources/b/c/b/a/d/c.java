package b.c.b.a.d;

import android.content.Context;
import android.os.IBinder;
import b.c.b.a.c.j;
import com.google.android.gms.common.internal.r;

public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f1186a;

    /* renamed from: b  reason: collision with root package name */
    private T f1187b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.f1186a = str;
    }

    /* access modifiers changed from: protected */
    public final T a(Context context) {
        if (this.f1187b == null) {
            r.a(context);
            Context b2 = j.b(context);
            if (b2 != null) {
                try {
                    this.f1187b = a((IBinder) b2.getClassLoader().loadClass(this.f1186a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new a("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new a("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new a("Could not access creator.", e3);
                }
            } else {
                throw new a("Could not get remote context.");
            }
        }
        return this.f1187b;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);
}
