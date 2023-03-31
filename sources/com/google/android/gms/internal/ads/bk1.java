package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.ga0;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class bk1 implements pi1 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1963a;

    /* renamed from: b  reason: collision with root package name */
    private final zj1 f1964b;

    /* renamed from: c  reason: collision with root package name */
    private final nk1 f1965c;
    private final ji1 d;

    bk1(Object obj, zj1 zj1, nk1 nk1, ji1 ji1) {
        this.f1963a = obj;
        this.f1964b = zj1;
        this.f1965c = nk1;
        this.d = ji1;
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ga0.a p = ga0.p();
        p.a(oh0.DG);
        p.a(dy1.a(bArr));
        return Base64.encodeToString(((ga0) ((rz1) p.e())).f(), 11);
    }

    private final synchronized byte[] a(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.d.a(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f1963a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f1963a, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final synchronized String a(Context context, String str) {
        Map<String, Object> c2;
        c2 = this.f1965c.c();
        c2.put("f", "q");
        c2.put("ctx", context);
        c2.put("aid", null);
        return a(a((Map<String, String>) null, c2));
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final synchronized String a(Context context, String str, View view, Activity activity) {
        Map<String, Object> a2;
        a2 = this.f1965c.a();
        a2.put("f", "v");
        a2.put("ctx", context);
        a2.put("aid", null);
        a2.put("view", view);
        a2.put("act", activity);
        return a(a((Map<String, String>) null, a2));
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final synchronized String a(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> b2;
        b2 = this.f1965c.b();
        b2.put("f", "c");
        b2.put("ctx", context);
        b2.put("cs", str2);
        b2.put("aid", null);
        b2.put("view", view);
        b2.put("act", activity);
        return a(a((Map<String, String>) null, b2));
    }

    public final synchronized void a() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1963a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f1963a, new Object[0]);
            this.d.a(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new lk1(2003, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final synchronized void a(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.f1963a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f1963a, hashMap);
            this.d.a(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new lk1(2005, e);
        }
    }

    /* access modifiers changed from: package-private */
    public final zj1 b() {
        return this.f1964b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c() {
        try {
        } catch (Exception e) {
            throw new lk1(2001, e);
        }
        return ((Boolean) this.f1963a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f1963a, new Object[0])).booleanValue();
    }

    public final synchronized int d() {
        try {
        } catch (Exception e) {
            throw new lk1(2006, e);
        }
        return ((Integer) this.f1963a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f1963a, new Object[0])).intValue();
    }
}
