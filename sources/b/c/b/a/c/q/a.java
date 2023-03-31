package b.c.b.a.c.q;

import android.content.Context;
import com.google.android.gms.common.util.l;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f1175a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f1176b;

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f1175a == null || f1176b == null || f1175a != applicationContext) {
                f1176b = null;
                if (l.k()) {
                    z = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f1176b = true;
                    } catch (ClassNotFoundException unused) {
                        z = false;
                    }
                    f1175a = applicationContext;
                    return f1176b.booleanValue();
                }
                f1176b = z;
                f1175a = applicationContext;
                return f1176b.booleanValue();
            }
            return f1176b.booleanValue();
        }
    }
}
