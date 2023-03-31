package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class sw0<AdT> implements ln1<vd1, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final sh1 f4718a;

    /* renamed from: b  reason: collision with root package name */
    private final y50 f4719b;

    /* renamed from: c  reason: collision with root package name */
    private final ci1 f4720c;
    private final Executor d;
    private final ScheduledExecutorService e;
    private final p20<AdT> f;
    private final lw0 g;

    public sw0(sh1 sh1, lw0 lw0, y50 y50, ci1 ci1, p20<AdT> p20, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f4718a = sh1;
        this.g = lw0;
        this.f4719b = y50;
        this.f4720c = ci1;
        this.f = p20;
        this.d = executor;
        this.e = scheduledExecutorService;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(vd1 vd1, id1 id1, jt0 jt0, Throwable th) {
        lw0 lw0 = this.g;
        kd1 kd1 = vd1.f5093b.f4642b;
        lo1 a2 = yn1.a(jt0.a(vd1, id1), (long) id1.I, TimeUnit.MILLISECONDS, this.e);
        lw0.a(kd1, id1, a2);
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.ln1
    public final /* synthetic */ lo1 a(vd1 vd1) {
        vd1 vd12 = vd1;
        bh1 a2 = this.f4718a.a(ph1.RENDER_CONFIG_INIT).a(yn1.a((Throwable) new pw0("No ad configs", 3))).a();
        this.f4719b.a(new uy(vd12, this.f4720c), this.d);
        int i = 0;
        for (id1 id1 : vd12.f5093b.f4641a) {
            Iterator<String> it = id1.f3066a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                jt0<AdT> a3 = this.f.a(id1.f3067b, next);
                if (a3 != null && a3.b(vd12, id1)) {
                    kh1 a4 = this.f4718a.a(ph1.RENDER_CONFIG_WATERFALL, a2);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 26);
                    sb.append("render-config-");
                    sb.append(i);
                    sb.append("-");
                    sb.append(next);
                    a2 = a4.a(sb.toString()).a(Throwable.class, new rw0(this, vd12, id1, a3)).a();
                    break;
                }
            }
            i++;
        }
        return a2;
    }
}
