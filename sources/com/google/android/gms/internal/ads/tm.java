package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class tm {

    /* renamed from: a  reason: collision with root package name */
    private static hm2 f4832a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4833b = new Object();

    static {
        new sm();
    }

    public tm(Context context) {
        a(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.hm2 a(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.tm.f4833b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.hm2 r1 = com.google.android.gms.internal.ads.tm.f4832a     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.zr2.a(r3)     // Catch:{ all -> 0x0036 }
            boolean r1 = com.google.android.gms.common.util.c.a()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.kr2<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zr2.Q1     // Catch:{ all -> 0x0036 }
            com.google.android.gms.internal.ads.vr2 r2 = com.google.android.gms.internal.ads.on2.e()     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.hm2 r3 = com.google.android.gms.internal.ads.im.a(r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0030
        L_0x002c:
            com.google.android.gms.internal.ads.hm2 r3 = com.google.android.gms.internal.ads.ho.a(r3)     // Catch:{ all -> 0x0036 }
        L_0x0030:
            com.google.android.gms.internal.ads.tm.f4832a = r3     // Catch:{ all -> 0x0036 }
        L_0x0032:
            com.google.android.gms.internal.ads.hm2 r3 = com.google.android.gms.internal.ads.tm.f4832a     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return r3
        L_0x0036:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tm.a(android.content.Context):com.google.android.gms.internal.ads.hm2");
    }

    public static lo1<ef2> a(String str) {
        ro roVar = new ro();
        f4832a.a(new ym(str, roVar));
        return roVar;
    }

    public final lo1<String> a(int i, String str, Map<String, String> map, byte[] bArr) {
        wm wmVar = new wm(null);
        vm vmVar = new vm(this, str, wmVar);
        wn wnVar = new wn(null);
        um umVar = new um(this, i, str, wmVar, vmVar, bArr, map, wnVar);
        if (wn.a()) {
            try {
                wnVar.a(str, "GET", umVar.b(), umVar.m());
            } catch (go e) {
                co.d(e.getMessage());
            }
        }
        f4832a.a(umVar);
        return wmVar;
    }

    public final lo1<String> a(String str, Map<String, String> map) {
        return a(0, str, map, null);
    }
}
