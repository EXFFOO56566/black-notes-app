package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public final class eg0 extends c2 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, xg0 {
    public static final String[] o = {"2011", "1009", "3010"};

    /* renamed from: b  reason: collision with root package name */
    private final String f2420b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private Map<String, WeakReference<View>> f2421c = new HashMap();
    private FrameLayout d;
    private FrameLayout e;
    private ko1 f;
    private View g;
    private final int h;
    @GuardedBy("this")
    private xe0 i;
    private bh2 j;
    private a k = null;
    private u1 l;
    private boolean m;
    private boolean n = false;

    public eg0(FrameLayout frameLayout, FrameLayout frameLayout2, int i2) {
        String str;
        this.d = frameLayout;
        this.e = frameLayout2;
        this.h = i2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f2420b = str;
        q.z();
        zo.a((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        q.z();
        zo.a((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f = jo.e;
        this.j = new bh2(this.d.getContext(), this.d);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void c2() {
        this.f.execute(new dg0(this));
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final a C0() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final FrameLayout G1() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized Map<String, WeakReference<View>> K0() {
        return this.f2421c;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final synchronized void L(a aVar) {
        if (!this.n) {
            this.k = aVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized String O1() {
        return this.f2420b;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final bh2 T1() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final synchronized void a(a aVar, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final synchronized void a(u1 u1Var) {
        if (!this.n) {
            this.m = true;
            this.l = u1Var;
            if (this.i != null) {
                this.i.l().a(u1Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized void a(String str, View view, boolean z) {
        if (!this.n) {
            if (view == null) {
                this.f2421c.remove(str);
                return;
            }
            this.f2421c.put(str, new WeakReference<>(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (gn.a(this.h)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final synchronized void a(String str, a aVar) {
        a(str, (View) b.Q(aVar), true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b2() {
        if (this.g == null) {
            View view = new View(this.d.getContext());
            this.g = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.d != this.g.getParent()) {
            this.d.addView(this.g);
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final synchronized void c(a aVar) {
        this.i.a((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final synchronized void destroy() {
        if (!this.n) {
            if (this.i != null) {
                this.i.b(this);
                this.i = null;
            }
            this.f2421c.clear();
            this.d.removeAllViews();
            this.e.removeAllViews();
            this.f2421c = null;
            this.d = null;
            this.e = null;
            this.g = null;
            this.j = null;
            this.n = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final synchronized void e(a aVar) {
        if (!this.n) {
            Object Q = b.Q(aVar);
            if (!(Q instanceof xe0)) {
                co.d("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            if (this.i != null) {
                this.i.b(this);
            }
            c2();
            xe0 xe0 = (xe0) Q;
            this.i = xe0;
            xe0.a(this);
            this.i.c(this.d);
            this.i.b(this.e);
            if (this.m) {
                this.i.l().a(this.l);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void j(a aVar) {
        onTouch(this.d, (MotionEvent) b.Q(aVar));
    }

    public final synchronized void onClick(View view) {
        if (this.i != null) {
            this.i.f();
            this.i.a(view, this.d, K0(), t0(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.i != null) {
            this.i.a(this.d, K0(), t0(), xe0.d(this.d));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.i != null) {
            this.i.a(this.d, K0(), t0(), xe0.d(this.d));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.i != null) {
            this.i.a(view, motionEvent, this.d);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized View q(String str) {
        if (this.n) {
            return null;
        }
        WeakReference<View> weakReference = this.f2421c.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final /* synthetic */ View r0() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final synchronized a t(String str) {
        return b.a(q(str));
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized Map<String, WeakReference<View>> t0() {
        return this.f2421c;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized Map<String, WeakReference<View>> u1() {
        return null;
    }
}
