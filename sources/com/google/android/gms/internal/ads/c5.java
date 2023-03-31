package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class c5 {

    /* renamed from: a  reason: collision with root package name */
    private static String f2059a = "Volley";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f2060b = Log.isLoggable("Volley", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final String f2061c = c5.class.getName();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final boolean f2062c = c5.f2060b;

        /* renamed from: a  reason: collision with root package name */
        private final List<b7> f2063a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private boolean f2064b = false;

        a() {
        }

        public final synchronized void a(String str) {
            long j;
            this.f2064b = true;
            if (this.f2063a.size() == 0) {
                j = 0;
            } else {
                j = this.f2063a.get(this.f2063a.size() - 1).f1878c - this.f2063a.get(0).f1878c;
            }
            if (j > 0) {
                long j2 = this.f2063a.get(0).f1878c;
                c5.a("(%-4d ms) %s", Long.valueOf(j), str);
                for (b7 b7Var : this.f2063a) {
                    long j3 = b7Var.f1878c;
                    c5.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(b7Var.f1877b), b7Var.f1876a);
                    j2 = j3;
                }
            }
        }

        public final synchronized void a(String str, long j) {
            if (!this.f2064b) {
                this.f2063a.add(new b7(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            if (!this.f2064b) {
                a("Request on the loose");
                c5.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        Log.d(f2059a, d(str, objArr));
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f2059a, d(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        Log.e(f2059a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f2060b) {
            Log.v(f2059a, d(str, objArr));
        }
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f2061c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
