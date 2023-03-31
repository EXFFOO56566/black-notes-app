package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
public final class bh2 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long q = ((Long) on2.e().a(zr2.C0)).longValue();

    /* renamed from: b  reason: collision with root package name */
    private final Context f1952b;

    /* renamed from: c  reason: collision with root package name */
    private Application f1953c;
    private final WindowManager d;
    private final PowerManager e;
    private final KeyguardManager f;
    private BroadcastReceiver g;
    private WeakReference<ViewTreeObserver> h;
    private WeakReference<View> i;
    private jh2 j;
    private in k = new in(q);
    private boolean l = false;
    private int m = -1;
    private final HashSet<fh2> n = new HashSet<>();
    private final DisplayMetrics o;
    private final Rect p;

    public bh2(Context context, View view) {
        this.f1952b = context.getApplicationContext();
        this.d = (WindowManager) context.getSystemService("window");
        this.e = (PowerManager) this.f1952b.getSystemService("power");
        this.f = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.f1952b;
        if (context2 instanceof Application) {
            this.f1953c = (Application) context2;
            this.j = new jh2((Application) context2, this);
        }
        this.o = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.p = rect;
        rect.right = this.d.getDefaultDisplay().getWidth();
        this.p.bottom = this.d.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.i;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            b(view2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if (q.e().a(view)) {
                a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect a(Rect rect) {
        return new Rect(b(rect.left), b(rect.top), b(rect.right), b(rect.bottom));
    }

    /* access modifiers changed from: private */
    public final void a(int i2) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        if (this.n.size() != 0 && (weakReference = this.i) != null) {
            View view = weakReference.get();
            boolean z3 = i2 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e2) {
                    co.b("Failure getting view location.", e2);
                }
                int i3 = iArr[0];
                rect.left = i3;
                rect.top = iArr[1];
                rect.right = i3 + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            List<Rect> emptyList = (!((Boolean) on2.e().a(zr2.F0)).booleanValue() || view == null) ? Collections.emptyList() : c(view);
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            int i4 = this.m;
            if (i4 != -1) {
                windowVisibility = i4;
            }
            boolean z5 = !z4 && q.c().a(view, this.e, this.f) && z2 && z && windowVisibility == 0;
            if (z3 && !this.k.a() && z5 == this.l) {
                return;
            }
            if (z5 || this.l || i2 != 1) {
                hh2 hh2 = new hh2(q.j().b(), this.e.isScreenOn(), view != null && q.e().a(view), view != null ? view.getWindowVisibility() : 8, a(this.p), a(rect), a(rect2), z2, a(rect3), z, a(rect4), this.o.density, z5, emptyList);
                Iterator<fh2> it = this.n.iterator();
                while (it.hasNext()) {
                    it.next().a(hh2);
                }
                this.l = z5;
            }
        }
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = this.i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.m = i2;
            }
        }
    }

    private final void a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.g = new dh2(this);
            q.x().a(this.f1952b, this.g, intentFilter);
        }
        Application application = this.f1953c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception e2) {
                co.b("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    private final int b(int i2) {
        return (int) (((float) i2) / this.o.density);
    }

    private final void b(View view) {
        try {
            if (this.h != null) {
                ViewTreeObserver viewTreeObserver = this.h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.h = null;
            }
        } catch (Exception e2) {
            co.b("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
            co.b("Error while unregistering listeners from the ViewTreeObserver.", e3);
        }
        if (this.g != null) {
            try {
                q.x().a(this.f1952b, this.g);
            } catch (IllegalStateException e4) {
                co.b("Failed trying to unregister the receiver", e4);
            } catch (Exception e5) {
                q.g().a(e5, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.g = null;
        }
        Application application = this.f1953c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.j);
            } catch (Exception e6) {
                co.b("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    private final List<Rect> c(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (view2.isScrollContainer() && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(a(rect));
                }
            }
            return arrayList;
        } catch (Exception e2) {
            q.g().a(e2, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    private final void c() {
        gl.h.post(new eh2(this));
    }

    public final void a() {
        this.k.a(q);
    }

    public final void a(long j2) {
        this.k.a(j2);
    }

    public final void a(fh2 fh2) {
        this.n.add(fh2);
        a(3);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        a(3);
    }

    public final void b(fh2 fh2) {
        this.n.remove(fh2);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        a(3);
        c();
    }

    public final void onActivityDestroyed(Activity activity) {
        a(3);
        c();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        a(3);
        c();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        a(3);
        c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(3);
        c();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        a(3);
        c();
    }

    public final void onActivityStopped(Activity activity) {
        a(3);
        c();
    }

    public final void onGlobalLayout() {
        a(2);
        c();
    }

    public final void onScrollChanged() {
        a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.m = -1;
        a(view);
        a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.m = -1;
        a(3);
        c();
        b(view);
    }
}
