package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.r.a;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

public final class so0 implements a, u50, a60, n60, q60, l70, m80, zh1, jm2 {

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f4688b;

    /* renamed from: c  reason: collision with root package name */
    private final go0 f4689c;
    private long d;

    public so0(go0 go0, kv kvVar) {
        this.f4689c = go0;
        this.f4688b = Collections.singletonList(kvVar);
    }

    private final void a(Class<?> cls, String str, Object... objArr) {
        go0 go0 = this.f4689c;
        List<Object> list = this.f4688b;
        String valueOf = String.valueOf(cls.getSimpleName());
        go0.a(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void A() {
        a(u50.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void B() {
        a(u50.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void G() {
        a(u50.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final void K() {
        a(n60.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final void a(int i) {
        a(a60.class, "onAdFailedToLoad", Integer.valueOf(i));
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void a(Context context) {
        a(q60.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void a(ph1 ph1, String str) {
        a(qh1.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void a(ph1 ph1, String str, Throwable th) {
        a(qh1.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.u50
    @ParametersAreNonnullByDefault
    public final void a(ug ugVar, String str, String str2) {
        a(u50.class, "onRewarded", ugVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a(vd1 vd1) {
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a(zf zfVar) {
        this.d = q.j().b();
        a(m80.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.ads.r.a
    public final void a(String str, String str2) {
        a(a.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void b(Context context) {
        a(q60.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void b(ph1 ph1, String str) {
        a(qh1.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void c(ph1 ph1, String str) {
        a(qh1.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void d(Context context) {
        a(q60.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.jm2
    public final void l() {
        a(jm2.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final void s() {
        long b2 = q.j().b() - this.d;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(b2);
        wk.e(sb.toString());
        a(l70.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void x() {
        a(u50.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void y() {
        a(u50.class, "onRewardedVideoStarted", new Object[0]);
    }
}
