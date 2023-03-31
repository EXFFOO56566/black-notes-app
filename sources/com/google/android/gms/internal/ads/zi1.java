package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.github.ajalt.reprint.module.spass.SpassReprintModule;
import com.google.android.gms.internal.ads.ba0;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class zi1 implements wf1 {
    protected static volatile l52 u;

    /* renamed from: b  reason: collision with root package name */
    protected MotionEvent f5761b;

    /* renamed from: c  reason: collision with root package name */
    protected LinkedList<MotionEvent> f5762c = new LinkedList<>();
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected long j = 0;
    protected double k;
    private double l;
    private double m;
    protected float n;
    protected float o;
    protected float p;
    protected float q;
    private boolean r = false;
    protected boolean s = false;
    protected DisplayMetrics t;

    protected zi1(Context context) {
        try {
            if (((Boolean) on2.e().a(zr2.f1)).booleanValue()) {
                zs0.a();
            } else {
                o52.a(u);
            }
            this.t = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final String a(Context context, String str, int i2, View view, Activity activity, byte[] bArr) {
        String str2;
        ud1 ud1;
        int i3;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) on2.e().a(zr2.V0)).booleanValue();
        ba0.a aVar = null;
        if (booleanValue) {
            ud1 = u != null ? u.j() : null;
            str2 = ((Boolean) on2.e().a(zr2.f1)).booleanValue() ? "be" : "te";
        } else {
            ud1 = null;
            str2 = null;
        }
        try {
            if (i2 == yr0.f) {
                aVar = c(context, view, activity);
                this.r = true;
                i3 = SpassReprintModule.STATUS_HW_UNAVAILABLE;
            } else if (i2 == yr0.e) {
                aVar = b(context, view, activity);
                i3 = 1008;
            } else {
                aVar = a(context, null);
                i3 = 1000;
            }
            if (booleanValue && ud1 != null) {
                ud1.a(i3, -1, System.currentTimeMillis() - currentTimeMillis, str2);
            }
        } catch (Exception e2) {
            if (booleanValue && ud1 != null) {
                ud1.a(i2 == yr0.f ? SpassReprintModule.STATUS_LOCKED_OUT : i2 == yr0.e ? 1009 : i2 == yr0.d ? 1001 : -1, -1, System.currentTimeMillis() - currentTimeMillis, str2, e2);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (aVar != null) {
            try {
                if (((ba0) ((rz1) aVar.e())).c() != 0) {
                    String a2 = zs0.a((ba0) ((rz1) aVar.e()), str);
                    if (!booleanValue || ud1 == null) {
                        return a2;
                    }
                    ud1.a(i2 == yr0.f ? 1006 : i2 == yr0.e ? 1010 : i2 == yr0.d ? 1004 : -1, -1, System.currentTimeMillis() - currentTimeMillis2, str2);
                    return a2;
                }
            } catch (Exception e3) {
                String num = Integer.toString(7);
                if (!booleanValue || ud1 == null) {
                    return num;
                }
                ud1.a(i2 == yr0.f ? 1007 : i2 == yr0.e ? 1011 : i2 == yr0.d ? 1005 : -1, -1, System.currentTimeMillis() - currentTimeMillis2, str2, e3);
                return num;
            }
        }
        return Integer.toString(5);
    }

    private final void a() {
        this.h = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.i = 0;
        this.j = 0;
        if (this.f5762c.size() > 0) {
            Iterator<MotionEvent> it = this.f5762c.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f5762c.clear();
        } else {
            MotionEvent motionEvent = this.f5761b;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f5761b = null;
    }

    /* access modifiers changed from: protected */
    public abstract long a(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    public abstract ba0.a a(Context context, s20 s20);

    @Override // com.google.android.gms.internal.ads.wf1
    public String a(Context context) {
        if (q52.a()) {
            if (((Boolean) on2.e().a(zr2.h1)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return a(context, null, yr0.d, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public String a(Context context, View view, Activity activity) {
        return a(context, null, yr0.e, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public final String a(Context context, String str, View view) {
        return a(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public String a(Context context, String str, View view, Activity activity) {
        return a(context, str, yr0.f, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public void a(int i2, int i3, int i4) {
        MotionEvent motionEvent;
        if (this.f5761b != null) {
            if (((Boolean) on2.e().a(zr2.T0)).booleanValue()) {
                a();
            } else {
                this.f5761b.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.t;
        if (displayMetrics != null) {
            float f2 = displayMetrics.density;
            motionEvent = MotionEvent.obtain(0, (long) i4, 1, ((float) i2) * f2, ((float) i3) * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.f5761b = motionEvent;
        this.s = false;
    }

    @Override // com.google.android.gms.internal.ads.wf1
    public void a(MotionEvent motionEvent) {
        boolean z = false;
        if (this.r) {
            a();
            this.r = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 0.0d;
            this.l = (double) motionEvent.getRawX();
            this.m = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d2 = rawX - this.l;
            double d3 = rawY - this.m;
            this.k += Math.sqrt((d2 * d2) + (d3 * d3));
            this.l = rawX;
            this.m = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.n = motionEvent.getX();
            this.o = motionEvent.getY();
            this.p = motionEvent.getRawX();
            this.q = motionEvent.getRawY();
            this.d++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f5761b = obtain;
            this.f5762c.add(obtain);
            if (this.f5762c.size() > 6) {
                this.f5762c.remove().recycle();
            }
            this.f++;
            this.h = a(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.e += (long) (motionEvent.getHistorySize() + 1);
            try {
                r52 b2 = b(motionEvent);
                if ((b2 == null || b2.e == null || b2.h == null) ? false : true) {
                    this.i += b2.e.longValue() + b2.h.longValue();
                }
                if (!(this.t == null || b2 == null || b2.f == null || b2.i == null)) {
                    z = true;
                }
                if (z) {
                    this.j += b2.f.longValue() + b2.i.longValue();
                }
            } catch (s42 unused) {
            }
        } else if (action2 == 3) {
            this.g++;
        }
        this.s = true;
    }

    /* access modifiers changed from: protected */
    public abstract ba0.a b(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    public abstract r52 b(MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    public abstract ba0.a c(Context context, View view, Activity activity);
}
