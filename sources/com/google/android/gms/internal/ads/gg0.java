package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

public final class gg0 {

    /* renamed from: a  reason: collision with root package name */
    private final yk f2753a;

    /* renamed from: b  reason: collision with root package name */
    private final zd1 f2754b;

    /* renamed from: c  reason: collision with root package name */
    private final of0 f2755c;
    private final if0 d;
    private final pg0 e;
    private final Executor f;
    private final Executor g;
    private final m1 h;
    private final df0 i;

    public gg0(yk ykVar, zd1 zd1, of0 of0, if0 if0, pg0 pg0, Executor executor, Executor executor2, df0 df0) {
        this.f2753a = ykVar;
        this.f2754b = zd1;
        this.h = zd1.i;
        this.f2755c = of0;
        this.d = if0;
        this.e = pg0;
        this.f = executor;
        this.g = executor2;
        this.i = df0;
    }

    private static void a(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* access modifiers changed from: private */
    public static boolean a(xg0 xg0, String[] strArr) {
        Map<String, WeakReference<View>> t0 = xg0.t0();
        if (t0 == null) {
            return false;
        }
        for (String str : strArr) {
            if (t0.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final void a(xg0 xg0) {
        this.f.execute(new fg0(this, xg0));
    }

    public final boolean a(ViewGroup viewGroup) {
        View s = this.d.s();
        if (s == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (s.getParent() instanceof ViewGroup) {
            ((ViewGroup) s.getParent()).removeView(s);
        }
        viewGroup.addView(s, ((Boolean) on2.e().a(zr2.z1)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.d.s() == null) {
            return;
        }
        if (2 == this.d.o() || 1 == this.d.o()) {
            this.f2753a.a(this.f2754b.f, String.valueOf(this.d.o()), z);
        } else if (6 == this.d.o()) {
            this.f2753a.a(this.f2754b.f, "2", z);
            this.f2753a.a(this.f2754b.f, "1", z);
        }
    }

    public final void b(xg0 xg0) {
        if (xg0 != null && this.e != null && xg0.G1() != null && this.f2755c.c()) {
            try {
                xg0.G1().addView(this.e.a());
            } catch (it e2) {
                wk.e("web view can not be obtained", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00f5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void c(com.google.android.gms.internal.ads.xg0 r10) {
        /*
        // Method dump skipped, instructions count: 428
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gg0.c(com.google.android.gms.internal.ads.xg0):void");
    }
}
