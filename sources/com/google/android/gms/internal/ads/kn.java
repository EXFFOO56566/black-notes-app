package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

public final class kn {
    @Deprecated
    public static <T> T a(Context context, Callable<T> callable) {
        try {
            return (T) a(callable);
        } catch (Throwable th) {
            co.b("Unexpected exception.", th);
            bf.a(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public static <T> T a(nl1<T> nl1) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T t = nl1.get();
            StrictMode.setThreadPolicy(threadPolicy);
            return t;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private static <T> T a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
