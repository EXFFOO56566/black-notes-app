package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.i;
import java.io.File;

public final class dk1 {

    /* renamed from: a  reason: collision with root package name */
    private final File f2268a;

    /* renamed from: b  reason: collision with root package name */
    private final File f2269b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f2270c;
    private final a72 d;

    public dk1(Context context, a72 a72) {
        this.f2270c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        ck1.a(dir, false);
        this.f2268a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        ck1.a(dir2, true);
        this.f2269b = dir2;
        this.d = a72;
    }

    private final File a() {
        File file = new File(this.f2268a, Integer.toString(this.d.a()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static String a(g72 g72) {
        return i.a(g72.d().a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[SYNTHETIC, Splitter:B:11:0x0023] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.g72 b(int r6) {
        /*
            r5 = this;
            int r0 = com.google.android.gms.internal.ads.ik1.f3103a
            r1 = 0
            if (r6 != r0) goto L_0x0010
            android.content.SharedPreferences r6 = r5.f2270c
            java.lang.String r0 = r5.c()
        L_0x000b:
            java.lang.String r6 = r6.getString(r0, r1)
            goto L_0x001c
        L_0x0010:
            int r0 = com.google.android.gms.internal.ads.ik1.f3104b
            if (r6 != r0) goto L_0x001b
            android.content.SharedPreferences r6 = r5.f2270c
            java.lang.String r0 = r5.b()
            goto L_0x000b
        L_0x001b:
            r6 = r1
        L_0x001c:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0023
            return r1
        L_0x0023:
            byte[] r6 = com.google.android.gms.common.util.i.a(r6)     // Catch:{ b02 -> 0x0059 }
            com.google.android.gms.internal.ads.dy1 r6 = com.google.android.gms.internal.ads.dy1.a(r6)     // Catch:{ b02 -> 0x0059 }
            com.google.android.gms.internal.ads.g72 r6 = com.google.android.gms.internal.ads.g72.a(r6)     // Catch:{ b02 -> 0x0059 }
            java.lang.String r0 = r6.p()     // Catch:{ b02 -> 0x0059 }
            java.lang.String r2 = "pcam"
            java.io.File r3 = r5.a()     // Catch:{ b02 -> 0x0059 }
            java.io.File r2 = com.google.android.gms.internal.ads.ck1.a(r0, r2, r3)     // Catch:{ b02 -> 0x0059 }
            java.lang.String r3 = "pcbc"
            java.io.File r4 = r5.a()     // Catch:{ b02 -> 0x0059 }
            java.io.File r0 = com.google.android.gms.internal.ads.ck1.a(r0, r3, r4)     // Catch:{ b02 -> 0x0059 }
            boolean r2 = r2.exists()     // Catch:{ b02 -> 0x0059 }
            if (r2 == 0) goto L_0x0055
            boolean r0 = r0.exists()     // Catch:{ b02 -> 0x0059 }
            if (r0 == 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0059
            return r6
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dk1.b(int):com.google.android.gms.internal.ads.g72");
    }

    private final String b() {
        int a2 = this.d.a();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(a2);
        return sb.toString();
    }

    private final String c() {
        int a2 = this.d.a();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(a2);
        return sb.toString();
    }

    public final zj1 a(int i) {
        g72 b2 = b(i);
        if (b2 == null) {
            return null;
        }
        String p = b2.p();
        return new zj1(b2, ck1.a(p, "pcam", a()), ck1.a(p, "pcbc", a()), ck1.a(p, "pcopt", a()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0130, code lost:
        if (r0.commit() != false) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.c72 r8, com.google.android.gms.internal.ads.jk1 r9) {
        /*
        // Method dump skipped, instructions count: 381
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dk1.a(com.google.android.gms.internal.ads.c72, com.google.android.gms.internal.ads.jk1):boolean");
    }
}
