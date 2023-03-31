package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.fo;
import com.google.android.gms.internal.ads.fr1;
import com.google.android.gms.internal.ads.jo;
import com.google.android.gms.internal.ads.on2;
import com.google.android.gms.internal.ads.sb1;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.wf1;
import com.google.android.gms.internal.ads.yr0;
import com.google.android.gms.internal.ads.zr2;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class h implements wf1, Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final List<Object[]> f1401b = new Vector();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<wf1> f1402c = new AtomicReference<>();
    private final AtomicReference<wf1> d = new AtomicReference<>();
    private final int e;
    private Context f;
    private fo g;
    private CountDownLatch h = new CountDownLatch(1);

    public h(Context context, fo foVar) {
        this.f = context;
        this.g = foVar;
        int intValue = ((Integer) on2.e().a(zr2.S0)).intValue();
        this.e = intValue != 1 ? intValue != 2 ? yr0.f5640a : yr0.f5642c : yr0.f5641b;
        if (!((Boolean) on2.e().a(zr2.i1)).booleanValue()) {
            on2.a();
            if (!sn.b()) {
                run();
                return;
            }
        }
        jo.f3256a.execute(this);
    }

    private final wf1 a() {
        return (this.e == yr0.f5641b ? this.d : this.f1402c).get();
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final boolean b() {
        try {
            this.h.await();
            return true;
        } catch (InterruptedException e2) {
            co.c("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    private final void c() {
        wf1 a2 = a();
        if (!(this.f1401b.isEmpty() || a2 == null)) {
            for (Object[] objArr : this.f1401b) {
                if (objArr.length == 1) {
                    a2.a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    a2.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f1401b.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final String a(Context context) {
        if (!b()) {
            return BuildConfig.FLAVOR;
        }
        int i = this.e;
        wf1 wf1 = ((i == yr0.f5641b || i == yr0.f5642c) ? this.d : this.f1402c).get();
        if (wf1 == null) {
            return BuildConfig.FLAVOR;
        }
        c();
        return wf1.a(b(context));
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final String a(Context context, View view, Activity activity) {
        wf1 a2 = a();
        return a2 != null ? a2.a(context, view, activity) : BuildConfig.FLAVOR;
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final String a(Context context, String str, View view) {
        return a(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final String a(Context context, String str, View view, Activity activity) {
        wf1 a2;
        if (!b() || (a2 = a()) == null) {
            return BuildConfig.FLAVOR;
        }
        c();
        return a2.a(b(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final void a(int i, int i2, int i3) {
        wf1 a2 = a();
        if (a2 != null) {
            c();
            a2.a(i, i2, i3);
            return;
        }
        this.f1401b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final void a(MotionEvent motionEvent) {
        wf1 a2 = a();
        if (a2 != null) {
            c();
            a2.a(motionEvent);
            return;
        }
        this.f1401b.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final void a(View view) {
        wf1 a2 = a();
        if (a2 != null) {
            a2.a(view);
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.g.e;
            if (!((Boolean) on2.e().a(zr2.s0)).booleanValue() && z2) {
                z = true;
            }
            if (this.e != yr0.f5641b) {
                this.f1402c.set(fr1.b(this.g.f2633b, b(this.f), z, this.e));
            }
            if (this.e != yr0.f5640a) {
                this.d.set(sb1.a(this.g.f2633b, b(this.f), z));
            }
        } finally {
            this.h.countDown();
            this.f = null;
            this.g = null;
        }
    }
}
