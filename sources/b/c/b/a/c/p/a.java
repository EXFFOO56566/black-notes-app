package b.c.b.a.c.p;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.c;
import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1173a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f1174b;

    private a() {
        List list = Collections.EMPTY_LIST;
    }

    public static a a() {
        if (f1174b == null) {
            synchronized (f1173a) {
                if (f1174b == null) {
                    f1174b = new a();
                }
            }
        }
        return f1174b;
    }

    @SuppressLint({"UntrackedBindService"})
    public void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public final boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : c.a(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
