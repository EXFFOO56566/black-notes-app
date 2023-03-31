package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

public final class kx1 {

    /* renamed from: a  reason: collision with root package name */
    private static final px1 f3466a;

    static final class a extends px1 {
        a() {
        }

        @Override // com.google.android.gms.internal.ads.px1
        public final void a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }

        @Override // com.google.android.gms.internal.ads.px1
        public final void a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    static {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kx1.<clinit>():void");
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        f3466a.a(th, printWriter);
    }

    public static void a(Throwable th, Throwable th2) {
        f3466a.a(th, th2);
    }
}
