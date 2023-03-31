package b.c.b.a.e.f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import b.c.b.a.c.q.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.g;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class i0 {
    private static volatile i0 j = null;
    private static Boolean k = null;
    private static Boolean l = null;
    private static String m = "use_dynamite_api";
    private static String n = "allow_remote_dynamite";

    /* renamed from: a  reason: collision with root package name */
    private final String f1204a;

    /* renamed from: b  reason: collision with root package name */
    protected final d f1205b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f1206c;
    private final b.c.b.a.f.a.a d;
    private List<Pair<Object, Object>> e;
    private int f;
    private boolean g;
    private String h;
    private d0 i;

    /* access modifiers changed from: package-private */
    public abstract class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final long f1207b;

        /* renamed from: c  reason: collision with root package name */
        final long f1208c;
        private final boolean d;

        a(i0 i0Var) {
            this(true);
        }

        a(boolean z) {
            this.f1207b = i0.this.f1205b.a();
            this.f1208c = i0.this.f1205b.b();
            this.d = z;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: protected */
        public void b() {
        }

        public void run() {
            if (i0.this.g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e2) {
                i0.this.a((i0) e2, (Exception) false, this.d);
                b();
            }
        }
    }

    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            i0.this.a((i0) new t(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            i0.this.a((i0) new y(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            i0.this.a((i0) new x(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            i0.this.a((i0) new u(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            b0 b0Var = new b0();
            i0.this.a((i0) new z(this, activity, b0Var));
            Bundle b2 = b0Var.b(50);
            if (b2 != null) {
                bundle.putAll(b2);
            }
        }

        public final void onActivityStarted(Activity activity) {
            i0.this.a((i0) new v(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            i0.this.a((i0) new w(this, activity));
        }
    }

    private i0(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f1204a = (str == null || !b(str2, str3)) ? "FA" : str;
        this.f1205b = g.d();
        this.f1206c = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.d = new b.c.b.a.f.a.a(this);
        boolean z = false;
        if (!(!e(context) || i())) {
            this.h = null;
            this.g = true;
            Log.w(this.f1204a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!b(str2, str3)) {
            this.h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.f1204a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f1204a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.g = true;
                return;
            }
        } else {
            this.h = str2;
        }
        a(new b(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f1204a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    public static i0 a(Context context) {
        return a(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static i0 a(Context context, String str, String str2, String str3, Bundle bundle) {
        r.a(context);
        if (j == null) {
            synchronized (i0.class) {
                if (j == null) {
                    j = new i0(context, str, str2, str3, bundle);
                }
            }
        }
        return j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        this.f1206c.execute(aVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (z) {
            Log.w(this.f1204a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f1204a, "Error with data collection. Data lost.", exc);
    }

    private final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        a(new r(this, l2, str, str2, bundle, z, z2));
    }

    private final void a(String str, String str2, Object obj, boolean z) {
        a(new p(this, str, str2, obj, z));
    }

    private static boolean a(Context context, String str) {
        r.b(str);
        try {
            ApplicationInfo a2 = c.a(context).a(context.getPackageName(), 128);
            if (a2 != null) {
                if (a2.metaData != null) {
                    return a2.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean b(String str, String str2) {
        return (str2 == null || str == null || i()) ? false : true;
    }

    private static boolean e(Context context) {
        try {
            com.google.android.gms.common.api.internal.g.a(context);
            return com.google.android.gms.common.api.internal.g.a() != null;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    public static int f(Context context) {
        return DynamiteModule.b(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    public static int g(Context context) {
        return DynamiteModule.a(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    public static void h(Context context) {
        synchronized (i0.class) {
            try {
                if (k != null && l != null) {
                    return;
                }
                if (a(context, "app_measurement_internal_disable_startup_flags")) {
                    k = false;
                    l = false;
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                k = Boolean.valueOf(sharedPreferences.getBoolean(m, false));
                l = Boolean.valueOf(sharedPreferences.getBoolean(n, false));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(m);
                edit.remove(n);
                edit.apply();
            } catch (Exception e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                k = false;
                l = false;
            }
        }
    }

    private static boolean i() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final Bundle a(Bundle bundle, boolean z) {
        b0 b0Var = new b0();
        a(new m(this, bundle, b0Var));
        if (z) {
            return b0Var.b(5000);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final d0 a(Context context, boolean z) {
        DynamiteModule.b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.k;
            } catch (DynamiteModule.a e2) {
                a((Exception) e2, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.j;
        }
        return c0.a(DynamiteModule.a(context, bVar, "com.google.android.gms.measurement.dynamite").a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    public final b.c.b.a.f.a.a a() {
        return this.d;
    }

    public final List<Bundle> a(String str, String str2) {
        b0 b0Var = new b0();
        a(new c(this, str, str2, b0Var));
        List<Bundle> list = (List) b0.a(b0Var.b(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        b0 b0Var = new b0();
        a(new k(this, str, str2, z, b0Var));
        Bundle b2 = b0Var.b(5000);
        if (b2 == null || b2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b2.size());
        for (String str3 : b2.keySet()) {
            Object obj = b2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void a(int i2, String str, Object obj, Object obj2, Object obj3) {
        a(new n(this, false, 5, str, obj, null, null));
    }

    public final void a(Activity activity, String str, String str2) {
        a(new d(this, activity, str, str2));
    }

    public final void a(Bundle bundle) {
        a(new s(this, bundle));
    }

    public final void a(String str) {
        a(new e(this, str));
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, null);
    }

    public final void a(String str, String str2, Object obj) {
        a(str, str2, obj, true);
    }

    public final String b() {
        b0 b0Var = new b0();
        a(new h(this, b0Var));
        return b0Var.a(500);
    }

    public final void b(String str) {
        a(new f(this, str));
    }

    public final void b(String str, String str2, Bundle bundle) {
        a(new k0(this, str, str2, bundle));
    }

    public final int c(String str) {
        b0 b0Var = new b0();
        a(new o(this, str, b0Var));
        Integer num = (Integer) b0.a(b0Var.b(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String c() {
        b0 b0Var = new b0();
        a(new g(this, b0Var));
        return b0Var.a(50);
    }

    public final long d() {
        b0 b0Var = new b0();
        a(new j(this, b0Var));
        Long l2 = (Long) b0.a(b0Var.b(500), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f1205b.a()).nextLong();
        int i2 = this.f + 1;
        this.f = i2;
        return nextLong + ((long) i2);
    }

    public final String e() {
        b0 b0Var = new b0();
        a(new i(this, b0Var));
        return b0Var.a(500);
    }

    public final String f() {
        b0 b0Var = new b0();
        a(new l(this, b0Var));
        return b0Var.a(500);
    }

    public final String g() {
        return this.h;
    }
}
