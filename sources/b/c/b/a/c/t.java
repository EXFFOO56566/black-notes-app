package b.c.b.a.c;

import android.content.Context;
import android.util.Log;
import javax.annotation.CheckReturnValue;

/* access modifiers changed from: package-private */
@CheckReturnValue
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static Context f1180a;

    static synchronized void a(Context context) {
        synchronized (t.class) {
            if (f1180a != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f1180a = context.getApplicationContext();
            }
        }
    }
}
