package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.on2;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.um2;

public final class e {
    public static final e g = new e(320, 50, "320x50_mb");
    public static final e h = new e(468, 60, "468x60_as");
    public static final e i = new e(320, 100, "320x100_as");
    public static final e j = new e(728, 90, "728x90_as");
    public static final e k = new e(300, 250, "300x250_as");
    public static final e l = new e(160, 600, "160x600_as");
    public static final e m = new e(-1, -2, "smart_banner");
    public static final e n = new e(-3, -4, "fluid");
    public static final e o = new e(0, 0, "invalid");
    public static final e p = new e(50, 50, "50x50_mb");

    /* renamed from: a  reason: collision with root package name */
    private final int f1386a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1387b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1388c;
    private boolean d;
    private boolean e;
    private int f;

    static {
        new e(-3, 0, "search_v2");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(int r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L_0x000a:
            r1 = -2
            if (r6 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r6)
        L_0x0014:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 4
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = "x"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "_as"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.<init>(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.e.<init>(int, int):void");
    }

    e(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i3 >= 0 || i3 == -2 || i3 == -4) {
            this.f1386a = i2;
            this.f1387b = i3;
            this.f1388c = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int a() {
        return this.f1387b;
    }

    public final int a(Context context) {
        int i2 = this.f1387b;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -2) {
            return um2.b(context.getResources().getDisplayMetrics());
        }
        on2.a();
        return sn.b(context, this.f1387b);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.f = i2;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.e = true;
    }

    public final int b() {
        return this.f1386a;
    }

    public final int b(Context context) {
        int i2 = this.f1386a;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -1) {
            return um2.a(context.getResources().getDisplayMetrics());
        }
        on2.a();
        return sn.b(context, this.f1386a);
    }

    public final boolean c() {
        return this.f1386a == -3 && this.f1387b == -4;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1386a == eVar.f1386a && this.f1387b == eVar.f1387b && this.f1388c.equals(eVar.f1388c);
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        return this.f1388c.hashCode();
    }

    public final String toString() {
        return this.f1388c;
    }
}
