package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import b.c.b.a.c.q.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class bf implements ff {
    private static final Object f = new Object();
    private static ff g;
    private static ff h;

    /* renamed from: a  reason: collision with root package name */
    private final Object f1933a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1934b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap<Thread, Boolean> f1935c;
    private final ExecutorService d;
    private final fo e;

    private bf(Context context) {
        this(context, fo.d());
    }

    private bf(Context context, fo foVar) {
        this.f1933a = new Object();
        this.f1935c = new WeakHashMap<>();
        this.d = pk1.a().a(qk1.f4351a);
        this.f1934b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.e = foVar;
    }

    private final Uri.Builder a(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = c.a(this.f1934b).a();
        } catch (Throwable th) {
            co.b("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.f1934b.getPackageName();
        } catch (Throwable unused) {
            co.d("Cannot obtain package name, proceeding.");
            str4 = "unknown";
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.e.f2633b).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", zr2.a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "305933803").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", on2.f()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(w0.f5188c.a()));
    }

    public static ff a(Context context) {
        synchronized (f) {
            if (g == null) {
                if (w0.e.a().booleanValue()) {
                    g = new bf(context);
                } else {
                    g = new ef();
                }
            }
        }
        return g;
    }

    public static ff a(Context context, fo foVar) {
        synchronized (f) {
            if (h == null) {
                if (w0.e.a().booleanValue()) {
                    bf bfVar = new bf(context, foVar);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (bfVar.f1933a) {
                            bfVar.f1935c.put(thread, true);
                        }
                        thread.setUncaughtExceptionHandler(new cf(bfVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new df(bfVar, Thread.getDefaultUncaughtExceptionHandler()));
                    h = bfVar;
                } else {
                    h = new ef();
                }
            }
        }
        return h;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x003c
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x0037
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = 0
        L_0x000f:
            if (r6 >= r5) goto L_0x0032
            r7 = r4[r6]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.sn.b(r8)
            if (r8 == 0) goto L_0x001e
            r2 = 1
        L_0x001e:
            java.lang.Class<com.google.android.gms.internal.ads.bf> r8 = com.google.android.gms.internal.ads.bf.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x002f
            r3 = 1
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x000f
        L_0x0032:
            java.lang.Throwable r1 = r1.getCause()
            goto L_0x0007
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r10 = 0
        L_0x003d:
            if (r10 == 0) goto L_0x0046
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.a(r11, r0, r10)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bf.a(java.lang.Thread, java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void a(Throwable th, String str) {
        a(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void a(Throwable th, String str, float f2) {
        if (sn.a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            kx1.a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f2);
            if (f2 > 0.0f) {
                i2 = (int) (1.0f / f2);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a(name, stringWriter2, str, i2).toString());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.d.execute(new af(new io(), (String) obj));
                }
            }
        }
    }
}
