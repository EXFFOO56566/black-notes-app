package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import b.c.b.a.c.f;
import b.c.b.a.c.g;
import b.c.b.a.c.h;
import com.google.android.gms.ads.t.a;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class l52 {
    private static final String r = "l52";

    /* renamed from: a  reason: collision with root package name */
    protected Context f3499a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f3500b;

    /* renamed from: c  reason: collision with root package name */
    private DexClassLoader f3501c;
    private gs1 d;
    private byte[] e;
    private volatile a f = null;
    private volatile boolean g;
    private Future h;
    private boolean i;
    private volatile ba0 j;
    private Future k;
    private ud1 l;
    private boolean m;
    private boolean n;
    private Map<Pair<String, String>, v62> o;
    private boolean p;
    private j52 q;

    private l52(Context context) {
        boolean z = false;
        this.g = false;
        this.h = null;
        this.j = null;
        this.k = null;
        this.m = false;
        this.n = false;
        this.p = false;
        Context applicationContext = context.getApplicationContext();
        z = applicationContext != null ? true : z;
        this.i = z;
        this.f3499a = z ? applicationContext : context;
        this.o = new HashMap();
        if (this.q == null) {
            this.q = new j52(this.f3499a);
        }
    }

    public static l52 a(Context context, String str, String str2, boolean z) {
        l52 l52 = new l52(context);
        try {
            l52.f3500b = Executors.newCachedThreadPool(new k52());
            l52.g = z;
            if (z) {
                l52.h = l52.f3500b.submit(new n52(l52));
            }
            l52.f3500b.execute(new p52(l52));
            try {
                f a2 = f.a();
                l52.m = a2.a(l52.f3499a) > 0;
                l52.n = a2.b(l52.f3499a) == 0;
            } catch (Throwable unused) {
            }
            l52.a(0, true);
            if (q52.a()) {
                if (((Boolean) on2.e().a(zr2.g1)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            gs1 gs1 = new gs1(null);
            l52.d = gs1;
            try {
                l52.e = gs1.a(str);
                try {
                    File cacheDir = l52.f3499a.getCacheDir();
                    if (cacheDir == null) {
                        cacheDir = l52.f3499a.getDir("dex", 0);
                        if (cacheDir == null) {
                            throw new s42();
                        }
                    }
                    File file = new File(String.format("%s/%s.jar", cacheDir, "1582435991586"));
                    if (!file.exists()) {
                        byte[] a3 = l52.d.a(l52.e, str2);
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(a3, 0, a3.length);
                        fileOutputStream.close();
                    }
                    l52.b(cacheDir, "1582435991586");
                    try {
                        l52.f3501c = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, l52.f3499a.getClassLoader());
                        a(file);
                        l52.a(cacheDir, "1582435991586");
                        a(String.format("%s/%s.dex", cacheDir, "1582435991586"));
                        l52.l = new ud1(l52);
                        l52.p = true;
                        return l52;
                    } catch (Throwable th) {
                        a(file);
                        l52.a(cacheDir, "1582435991586");
                        a(String.format("%s/%s.dex", cacheDir, "1582435991586"));
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    throw new s42(e2);
                } catch (IOException e3) {
                    throw new s42(e3);
                } catch (jv1 e4) {
                    throw new s42(e4);
                } catch (NullPointerException e5) {
                    throw new s42(e5);
                }
            } catch (jv1 e6) {
                throw new s42(e6);
            }
        } catch (s42 unused2) {
        }
    }

    private static void a(File file) {
        if (!file.exists()) {
            Log.d(r, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ca, code lost:
        r10 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[ExcHandler: jv1 | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:20:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1 A[SYNTHETIC, Splitter:B:42:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d8 A[SYNTHETIC, Splitter:B:46:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e2 A[SYNTHETIC, Splitter:B:54:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e9 A[SYNTHETIC, Splitter:B:58:0x00e9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.io.File r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l52.a(java.io.File, java.lang.String):void");
    }

    private static void a(String str) {
        a(new File(str));
    }

    /* access modifiers changed from: private */
    public static boolean a(int i2, ba0 ba0) {
        if (i2 < 4) {
            return ba0 == null || !ba0.q() || ba0.p().equals("0000000000000000000000000000000000000000000000000000000000000000") || !ba0.u() || !ba0.v().p() || ba0.v().q() == -2;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[ExcHandler: jv1 | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:21:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e4 A[SYNTHETIC, Splitter:B:54:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00eb A[SYNTHETIC, Splitter:B:58:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f2 A[SYNTHETIC, Splitter:B:65:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f9 A[SYNTHETIC, Splitter:B:69:0x00f9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(java.io.File r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l52.b(java.io.File, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public final void p() {
        try {
            if (this.f == null && this.i) {
                a aVar = new a(this.f3499a);
                aVar.c();
                this.f = aVar;
            }
        } catch (g | h | IOException unused) {
            this.f = null;
        }
    }

    private final ba0 q() {
        try {
            return ti1.a(this.f3499a, this.f3499a.getPackageName(), Integer.toString(this.f3499a.getPackageManager().getPackageInfo(this.f3499a.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Context a() {
        return this.f3499a;
    }

    public final Method a(String str, String str2) {
        v62 v62 = this.o.get(new Pair(str, str2));
        if (v62 == null) {
            return null;
        }
        return v62.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        if (this.n) {
            Future<?> submit = this.f3500b.submit(new m52(this, i2, z));
            if (i2 == 0) {
                this.k = submit;
            }
        }
    }

    public final boolean a(String str, String str2, Class<?>... clsArr) {
        if (this.o.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.o.put(new Pair<>(str, str2), new v62(this, str, str2, clsArr));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final ba0 b(int i2, boolean z) {
        if (i2 > 0 && z) {
            try {
                Thread.sleep((long) (i2 * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return q();
    }

    public final boolean b() {
        return this.p;
    }

    public final int c() {
        return this.l != null ? ud1.a() : RecyclerView.UNDEFINED_DURATION;
    }

    public final boolean d() {
        return this.q.a();
    }

    public final ExecutorService e() {
        return this.f3500b;
    }

    public final DexClassLoader f() {
        return this.f3501c;
    }

    public final gs1 g() {
        return this.d;
    }

    public final byte[] h() {
        return this.e;
    }

    public final boolean i() {
        return this.m;
    }

    public final ud1 j() {
        return this.l;
    }

    public final boolean k() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final j52 l() {
        return this.q;
    }

    public final ba0 m() {
        return this.j;
    }

    public final Future n() {
        return this.k;
    }

    public final a o() {
        if (!this.g) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        Future future = this.h;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.h = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.h.cancel(true);
            }
        }
        return this.f;
    }
}
