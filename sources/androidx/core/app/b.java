package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* access modifiers changed from: package-private */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f763a = a();

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f764b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f765c = c();
    protected static final Method d = b(f763a);
    protected static final Method e = a(f763a);
    protected static final Method f = c(f763a);
    private static final Handler g = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f766b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f767c;

        a(d dVar, Object obj) {
            this.f766b = dVar;
            this.f767c = obj;
        }

        public void run() {
            this.f766b.f772b = this.f767c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    public static class RunnableC0043b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Application f768b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f769c;

        RunnableC0043b(Application application, d dVar) {
            this.f768b = application;
            this.f769c = dVar;
        }

        public void run() {
            this.f768b.unregisterActivityLifecycleCallbacks(this.f769c);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f770b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f771c;

        c(Object obj, Object obj2) {
            this.f770b = obj;
            this.f771c = obj2;
        }

        public void run() {
            try {
                if (b.d != null) {
                    b.d.invoke(this.f770b, this.f771c, false, "AppCompat recreation");
                    return;
                }
                b.e.invoke(this.f770b, this.f771c, false);
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b  reason: collision with root package name */
        Object f772b;

        /* renamed from: c  reason: collision with root package name */
        private Activity f773c;
        private boolean d = false;
        private boolean e = false;
        private boolean f = false;

        d(Activity activity) {
            this.f773c = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f773c == activity) {
                this.f773c = null;
                this.e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.e && !this.f && !this.d && b.a(this.f772b, activity)) {
                this.f = true;
                this.f772b = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f773c == activity) {
                this.d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (d() && f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = f765c.get(activity);
                if (obj2 == null || (obj = f764b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                g.post(new a(dVar, obj2));
                try {
                    if (d()) {
                        f.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                    } else {
                        activity.recreate();
                    }
                    return true;
                } finally {
                    g.post(new RunnableC0043b(application, dVar));
                }
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    protected static boolean a(Object obj, Activity activity) {
        try {
            Object obj2 = f765c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            g.postAtFrontOfQueue(new c(f764b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
