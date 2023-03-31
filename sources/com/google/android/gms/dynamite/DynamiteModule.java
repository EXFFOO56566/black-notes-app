package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

public final class DynamiteModule {
    @GuardedBy("DynamiteModule.class")

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f1661b = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: c  reason: collision with root package name */
    private static j f1662c = null;
    @GuardedBy("DynamiteModule.class")
    private static l d = null;
    @GuardedBy("DynamiteModule.class")
    private static String e = null;
    @GuardedBy("DynamiteModule.class")
    private static int f = -1;
    private static final ThreadLocal<c> g = new ThreadLocal<>();
    private static final b.AbstractC0075b h = new a();
    public static final b i = new c();
    public static final b j = new b();
    public static final b k = new g();

    /* renamed from: a  reason: collision with root package name */
    private final Context f1663a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        /* synthetic */ a(String str, a aVar) {
            this(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, Throwable th, a aVar) {
            this(str, th);
        }
    }

    public interface b {

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f1664a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f1665b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f1666c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public interface AbstractC0075b {
            int a(Context context, String str);

            int a(Context context, String str, boolean z);
        }

        a a(Context context, String str, AbstractC0075b bVar);
    }

    /* access modifiers changed from: private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Cursor f1667a;

        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public static class d implements b.AbstractC0075b {

        /* renamed from: a  reason: collision with root package name */
        private final int f1668a;

        public d(int i, int i2) {
            this.f1668a = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.AbstractC0075b
        public final int a(Context context, String str) {
            return this.f1668a;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.AbstractC0075b
        public final int a(Context context, String str, boolean z) {
            return 0;
        }
    }

    static {
        new e();
        new d();
        new f();
    }

    private DynamiteModule(Context context) {
        r.a(context);
        this.f1663a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        r1 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule a(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.b r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    private static DynamiteModule a(Context context, String str, int i2) {
        Boolean bool;
        b.c.b.a.d.a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f1661b;
            }
            if (bool == null) {
                throw new a("Failed to determine which loading route to use.", (a) null);
            } else if (bool.booleanValue()) {
                return b(context, str, i2);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i2);
                Log.i("DynamiteModule", sb.toString());
                j a2 = a(context);
                if (a2 != null) {
                    if (a2.I1() >= 2) {
                        aVar = a2.a(b.c.b.a.d.b.a(context), str, i2);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        aVar = a2.b(b.c.b.a.d.b.a(context), str, i2);
                    }
                    if (b.c.b.a.d.b.Q(aVar) != null) {
                        return new DynamiteModule((Context) b.c.b.a.d.b.Q(aVar));
                    }
                    throw new a("Failed to load remote module.", (a) null);
                }
                throw new a("Failed to create IDynamiteLoader.", (a) null);
            }
        } catch (RemoteException e2) {
            throw new a("Failed to load remote module.", e2, null);
        } catch (a e3) {
            throw e3;
        } catch (Throwable th) {
            f.a(context, th);
            throw new a("Failed to load remote module.", th, null);
        }
    }

    private static j a(Context context) {
        j jVar;
        synchronized (DynamiteModule.class) {
            if (f1662c != null) {
                return f1662c;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new i(iBinder);
                }
                if (jVar != null) {
                    f1662c = jVar;
                    return jVar;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    @GuardedBy("DynamiteModule.class")
    private static void a(ClassLoader classLoader) {
        l lVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                lVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                lVar = queryLocalInterface instanceof l ? (l) queryLocalInterface : new k(iBinder);
            }
            d = lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, null);
        }
    }

    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    private static int b(Context context, String str, boolean z) {
        j a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            if (a2.I1() >= 2) {
                return a2.a(b.c.b.a.d.b.a(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a2.b(b.c.b.a.d.b.a(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    private static DynamiteModule b(Context context, String str, int i2) {
        l lVar;
        b.c.b.a.d.a aVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            lVar = d;
        }
        if (lVar != null) {
            c cVar = g.get();
            if (cVar == null || cVar.f1667a == null) {
                throw new a("No result cursor", (a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f1667a;
            b.c.b.a.d.b.a((Object) null);
            if (b().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = lVar.b(b.c.b.a.d.b.a(applicationContext), str, i2, b.c.b.a.d.b.a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = lVar.a(b.c.b.a.d.b.a(applicationContext), str, i2, b.c.b.a.d.b.a(cursor));
            }
            Context context2 = (Context) b.c.b.a.d.b.Q(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new a("Failed to get module context", (a) null);
        }
        throw new a("DynamiteLoaderV2 was not cached.", (a) null);
    }

    private static Boolean b() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f >= 2);
        }
        return valueOf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a3 A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a4 A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public final Context a() {
        return this.f1663a;
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.f1663a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2, null);
        }
    }
}
