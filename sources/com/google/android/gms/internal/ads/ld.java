package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.e;

public final class ld extends wd {

    /* renamed from: c  reason: collision with root package name */
    private String f3529c = "top-right";
    private boolean d = true;
    private int e = 0;
    private int f = 0;
    private int g = -1;
    private int h = 0;
    private int i = 0;
    private int j = -1;
    private final Object k = new Object();
    private final ws l;
    private final Activity m;
    private lu n;
    private ImageView o;
    private LinearLayout p;
    private vd q;
    private PopupWindow r;
    private RelativeLayout s;
    private ViewGroup t;

    static {
        e.a("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public ld(ws wsVar, vd vdVar) {
        super(wsVar, "resize");
        this.l = wsVar;
        this.m = wsVar.a();
        this.q = vdVar;
    }

    public final void a(int i2, int i3) {
        this.e = i2;
        this.f = i3;
    }

    public final void a(int i2, int i3, boolean z) {
        synchronized (this.k) {
            this.e = i2;
            this.f = i3;
            PopupWindow popupWindow = this.r;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x041b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
        // Method dump skipped, instructions count: 1242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ld.a(java.util.Map):void");
    }

    public final void a(boolean z) {
        synchronized (this.k) {
            if (this.r != null) {
                this.r.dismiss();
                this.s.removeView(this.l.getView());
                if (this.t != null) {
                    this.t.removeView(this.o);
                    this.t.addView(this.l.getView());
                    this.l.a(this.n);
                }
                if (z) {
                    c("default");
                    if (this.q != null) {
                        this.q.b();
                    }
                }
                this.r = null;
                this.s = null;
                this.t = null;
                this.p = null;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.k) {
            z = this.r != null;
        }
        return z;
    }
}
