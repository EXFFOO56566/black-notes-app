package b.c.b.a.c;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import b.c.b.a.c.q.c;
import com.google.android.gms.common.internal.j0;
import com.google.android.gms.common.util.h;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f1163a = j.f1165a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f1164b = new f();

    f() {
    }

    public static f a() {
        return f1164b;
    }

    private static String a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f1163a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(c.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public int a(Context context) {
        return j.a(context);
    }

    public int a(Context context, int i) {
        int a2 = j.a(context, i);
        if (j.b(context, a2)) {
            return 18;
        }
        return a2;
    }

    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, null);
    }

    public PendingIntent a(Context context, int i, int i2, String str) {
        Intent a2 = a(context, i, str);
        if (a2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a2, 134217728);
    }

    public Intent a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !h.d(context)) ? j0.a("com.google.android.gms", a(context, str)) : j0.a();
        }
        if (i != 3) {
            return null;
        }
        return j0.a("com.google.android.gms");
    }

    public String a(int i) {
        return j.a(i);
    }

    public int b(Context context) {
        return a(context, f1163a);
    }

    public boolean b(int i) {
        return j.b(i);
    }
}
