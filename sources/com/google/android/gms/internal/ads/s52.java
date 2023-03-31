package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class s52 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler n = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final Context f4602b;

    /* renamed from: c  reason: collision with root package name */
    private Application f4603c;
    private final PowerManager d;
    private final KeyguardManager e;
    private BroadcastReceiver f;
    private final j52 g;
    private WeakReference<ViewTreeObserver> h;
    private WeakReference<View> i;
    private mx1 j;
    private byte k = -1;
    private int l = -1;
    private long m = -3;

    public s52(Context context, j52 j52) {
        Context applicationContext = context.getApplicationContext();
        this.f4602b = applicationContext;
        this.g = j52;
        this.d = (PowerManager) applicationContext.getSystemService("power");
        this.e = (KeyguardManager) this.f4602b.getSystemService("keyguard");
        Context context2 = this.f4602b;
        if (context2 instanceof Application) {
            this.f4603c = (Application) context2;
            this.j = new mx1((Application) context2, this);
        }
        a((View) null);
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View b2 = b();
            if (b2 != null && peekDecorView != null && b2.getRootView() == peekDecorView.getRootView()) {
                this.l = i2;
            }
        }
    }

    private final View b() {
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private final void b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            u52 u52 = new u52(this);
            this.f = u52;
            this.f4602b.registerReceiver(u52, intentFilter);
        }
        Application application = this.f4603c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception unused) {
            }
        }
    }

    private final void c() {
        n.post(new v52(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(3:4|(1:8)|9)|10|11|(1:13)|15|(3:17|18|19)|21|(3:23|24|26)(1:28)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC, Splitter:B:17:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.h     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.h     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.h = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002e }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x002f
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002e }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002e }
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            android.content.BroadcastReceiver r4 = r3.f
            if (r4 == 0) goto L_0x003a
            android.content.Context r1 = r3.f4602b     // Catch:{ Exception -> 0x0038 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.f = r0
        L_0x003a:
            android.app.Application r4 = r3.f4603c
            if (r4 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.mx1 r0 = r3.j     // Catch:{ Exception -> 0x0043 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s52.c(android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
        if (r7 == false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s52.d():void");
    }

    public final long a() {
        if (this.m <= -2 && b() == null) {
            this.m = -3;
        }
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        long j2;
        View b2 = b();
        if (b2 != null) {
            b2.removeOnAttachStateChangeListener(this);
            c(b2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                b(view);
            }
            view.addOnAttachStateChangeListener(this);
            j2 = -2;
        } else {
            j2 = -3;
        }
        this.m = j2;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        d();
    }

    public final void onActivityDestroyed(Activity activity) {
        d();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        d();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        d();
        c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        d();
    }

    public final void onActivityStopped(Activity activity) {
        d();
    }

    public final void onGlobalLayout() {
        d();
    }

    public final void onScrollChanged() {
        d();
    }

    public final void onViewAttachedToWindow(View view) {
        this.l = -1;
        b(view);
        d();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.l = -1;
        d();
        c();
        c(view);
    }
}
