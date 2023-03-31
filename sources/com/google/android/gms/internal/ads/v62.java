package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class v62 {

    /* renamed from: a  reason: collision with root package name */
    private final l52 f5056a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5057b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5058c;
    private volatile Method d = null;
    private final Class<?>[] e;
    private CountDownLatch f = new CountDownLatch(1);

    public v62(l52 l52, String str, String str2, Class<?>... clsArr) {
        this.f5056a = l52;
        this.f5057b = str;
        this.f5058c = str2;
        this.e = clsArr;
        l52.e().submit(new z62(this));
    }

    private final String a(byte[] bArr, String str) {
        return new String(this.f5056a.g().a(bArr, str), "UTF-8");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:4:? A[ExcHandler: jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:6:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.l52 r0 = r3.f5056a     // Catch:{ all -> 0x0035 }
            dalvik.system.DexClassLoader r0 = r0.f()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.l52 r1 = r3.f5056a     // Catch:{ all -> 0x0035 }
            byte[] r1 = r1.h()     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = r3.f5057b     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r3.a(r1, r2)     // Catch:{ all -> 0x0035 }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x001e
        L_0x0018:
            java.util.concurrent.CountDownLatch r0 = r3.f
            r0.countDown()
            return
        L_0x001e:
            com.google.android.gms.internal.ads.l52 r1 = r3.f5056a     // Catch:{ jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            byte[] r1 = r1.h()     // Catch:{ jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.String r2 = r3.f5058c     // Catch:{ jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.String r1 = r3.a(r1, r2)     // Catch:{ jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.Class<?>[] r2 = r3.e     // Catch:{ jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            r3.d = r0     // Catch:{ jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.reflect.Method r0 = r3.d     // Catch:{ jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, jv1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            goto L_0x0018
        L_0x0035:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r1 = r3.f
            r1.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v62.b():void");
    }

    public final Method a() {
        if (this.d != null) {
            return this.d;
        }
        try {
            if (!this.f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
