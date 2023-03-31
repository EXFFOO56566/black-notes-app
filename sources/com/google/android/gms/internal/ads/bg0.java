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
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public final class bg0 extends g2 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, xg0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<View> f1944b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f1945c = new HashMap();
    private final Map<String, WeakReference<View>> d = new HashMap();
    private final Map<String, WeakReference<View>> e = new HashMap();
    @GuardedBy("this")
    private xe0 f;
    private bh2 g;

    public bg0(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        q.z();
        zo.a(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        q.z();
        zo.a(view, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f1944b = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f1945c.put(key, new WeakReference<>(value));
                if (!"1098".equals(key) && !"3011".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.e.putAll(this.f1945c);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.d.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.e.putAll(this.d);
        this.g = new bh2(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized a C0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final FrameLayout G1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized Map<String, WeakReference<View>> K0() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized String O1() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final bh2 T1() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized void a(String str, View view, boolean z) {
        if (view == null) {
            this.e.remove(str);
            this.f1945c.remove(str);
            this.d.remove(str);
            return;
        }
        this.e.put(str, new WeakReference<>(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f1945c.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.h2
    public final synchronized void c(a aVar) {
        if (this.f != null) {
            Object Q = b.Q(aVar);
            if (!(Q instanceof View)) {
                co.d("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f.a((View) Q);
        }
    }

    @Override // com.google.android.gms.internal.ads.h2
    public final synchronized void e(a aVar) {
        Object Q = b.Q(aVar);
        if (!(Q instanceof xe0)) {
            co.d("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.f != null) {
            this.f.b(this);
        }
        if (((xe0) Q).j()) {
            xe0 xe0 = (xe0) Q;
            this.f = xe0;
            xe0.a(this);
            this.f.c(r0());
            return;
        }
        co.b("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    public final synchronized void onClick(View view) {
        if (this.f != null) {
            this.f.a(view, r0(), K0(), t0(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.f != null) {
            this.f.a(r0(), K0(), t0(), xe0.d(r0()));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.f != null) {
            this.f.a(r0(), K0(), t0(), xe0.d(r0()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f != null) {
            this.f.a(view, motionEvent, r0());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.h2
    public final synchronized void p1() {
        if (this.f != null) {
            this.f.b(this);
            this.f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized View q(String str) {
        WeakReference<View> weakReference = this.e.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final View r0() {
        return this.f1944b.get();
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized Map<String, WeakReference<View>> t0() {
        return this.f1945c;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final synchronized Map<String, WeakReference<View>> u1() {
        return this.d;
    }
}
