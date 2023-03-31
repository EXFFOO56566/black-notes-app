package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class sb1 implements wf1 {
    private static sb1 l;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4626b;

    /* renamed from: c  reason: collision with root package name */
    private final dk1 f4627c;
    private final kk1 d;
    private final g52 e;
    private final ji1 f;
    private final Executor g;
    private final a72 h;
    private volatile long i = 0;
    private final Object j = new Object();
    private volatile boolean k;

    private sb1(Context context, ji1 ji1, dk1 dk1, kk1 kk1, g52 g52, Executor executor, a72 a72) {
        this.f4626b = context;
        this.f = ji1;
        this.f4627c = dk1;
        this.d = kk1;
        this.e = g52;
        this.g = executor;
        this.h = a72;
    }

    static sb1 a(Context context, ji1 ji1, ni1 ni1) {
        return a(context, ji1, ni1, Executors.newCachedThreadPool());
    }

    private static sb1 a(Context context, ji1 ji1, ni1 ni1, Executor executor) {
        aj1 aj1 = new aj1(context, executor, ji1, ni1);
        j52 j52 = new j52(context);
        g52 g52 = new g52(ni1, aj1, new s52(context, j52), j52);
        a72 a2 = new qj1(context, ji1).a();
        return new sb1(context, ji1, new dk1(context, a2), new kk1(context, g52, ji1), g52, executor, a2);
    }

    public static synchronized sb1 a(String str, Context context, boolean z) {
        sb1 sb1;
        synchronized (sb1.class) {
            if (l == null) {
                mi1 d2 = ni1.d();
                d2.a(str);
                d2.a(z);
                ni1 a2 = d2.a();
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                sb1 a3 = a(context, ji1.a(context, newCachedThreadPool), a2, newCachedThreadPool);
                l = a3;
                a3.a();
                l.d();
            }
            sb1 = l;
        }
        return sb1;
    }

    /* access modifiers changed from: private */
    public final void c() {
        String str;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        zj1 a2 = this.f4627c.a(ik1.f3103a);
        if (a2 != null) {
            String p = a2.b().p();
            str = a2.b().q();
            str2 = p;
        } else {
            str2 = null;
            str = null;
        }
        try {
            hk1 a3 = vi1.a(this.f4626b, 1, this.h, str2, str, "1", this.f);
            if (a3.f2934c != null) {
                if (a3.f2934c.length != 0) {
                    c72 a4 = c72.a(dy1.a(a3.f2934c), dz1.b());
                    boolean z = false;
                    if (!a4.p().p().isEmpty() && !a4.p().q().isEmpty()) {
                        if (a4.r().a().length != 0) {
                            zj1 a5 = this.f4627c.a(ik1.f3103a);
                            if (a5 != null) {
                                g72 b2 = a5.b();
                                if (b2 != null) {
                                    if (a4.p().p().equals(b2.p())) {
                                        if (!a4.p().q().equals(b2.q())) {
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    if (!z) {
                        this.f.a(5010, System.currentTimeMillis() - currentTimeMillis);
                        return;
                    } else if (!this.f4627c.a(a4, null)) {
                        this.f.a(4009, System.currentTimeMillis() - currentTimeMillis);
                        return;
                    } else {
                        this.d.a(this.f4627c.a(ik1.f3103a));
                        this.i = System.currentTimeMillis() / 1000;
                        return;
                    }
                }
            }
            this.f.a(5009, System.currentTimeMillis() - currentTimeMillis);
        } catch (b02 e2) {
            this.f.a(4002, System.currentTimeMillis() - currentTimeMillis, e2);
        }
    }

    private final void d() {
        if (!this.k) {
            synchronized (this.j) {
                if (!this.k) {
                    if ((System.currentTimeMillis() / 1000) - this.i >= 3600) {
                        zj1 b2 = this.d.b();
                        if (b2 == null || b2.a(3600)) {
                            b();
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final String a(Context context) {
        d();
        pi1 a2 = this.d.a();
        if (a2 == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a2.a(context, (String) null);
        this.f.a(5001, System.currentTimeMillis() - currentTimeMillis, a3, null);
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final String a(Context context, View view, Activity activity) {
        d();
        pi1 a2 = this.d.a();
        if (a2 == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a2.a(context, null, view, activity);
        this.f.a(5002, System.currentTimeMillis() - currentTimeMillis, a3, null);
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final String a(Context context, String str, View view) {
        return a(context, str, view, (Activity) null);
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final String a(Context context, String str, View view, Activity activity) {
        d();
        pi1 a2 = this.d.a();
        if (a2 == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a2.a(context, null, str, view, activity);
        this.f.a(5000, System.currentTimeMillis() - currentTimeMillis, a3, null);
        return a3;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        long currentTimeMillis = System.currentTimeMillis();
        zj1 a2 = this.f4627c.a(ik1.f3103a);
        if (a2 == null || a2.a()) {
            this.f.a(4013, System.currentTimeMillis() - currentTimeMillis);
        } else {
            this.d.a(a2);
        }
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final void a(int i2, int i3, int i4) {
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final void a(MotionEvent motionEvent) {
        pi1 a2 = this.d.a();
        if (a2 != null) {
            try {
                a2.a((String) null, motionEvent);
            } catch (lk1 e2) {
                this.f.a(e2.a(), -1, e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final void a(View view) {
        this.e.a(view);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.g.execute(new ve1(this));
    }
}
