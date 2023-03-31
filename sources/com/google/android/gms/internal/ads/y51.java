package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import b.c.b.a.d.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class y51 implements y61<v51> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f5538a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f5539b;

    /* renamed from: c  reason: collision with root package name */
    private final ez0 f5540c;
    private final Context d;
    private final zd1 e;
    private final cz0 f;
    private String g;

    public y51(ko1 ko1, ScheduledExecutorService scheduledExecutorService, String str, ez0 ez0, Context context, zd1 zd1, cz0 cz0) {
        this.f5538a = ko1;
        this.f5539b = scheduledExecutorService;
        this.g = str;
        this.f5540c = ez0;
        this.d = context;
        this.e = zd1;
        this.f = cz0;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<v51> a() {
        return ((Boolean) on2.e().a(zr2.I0)).booleanValue() ? yn1.a(new x51(this), this.f5538a) : yn1.a((Object) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(String str, List list, Bundle bundle) {
        ro roVar = new ro();
        this.f.a(str);
        qc b2 = this.f.b(str);
        if (b2 != null) {
            b2.a(b.a(this.d), this.g, bundle, (Bundle) list.get(0), this.e.e, new lz0(str, b2, roVar));
            return roVar;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 b() {
        Map<String, List<Bundle>> a2 = this.f5540c.a(this.g, this.e.f);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Bundle>> entry : a2.entrySet()) {
            String key = entry.getKey();
            List<Bundle> value = entry.getValue();
            Bundle bundle = this.e.d.n;
            arrayList.add(tn1.b(yn1.a(new a61(this, key, value, bundle != null ? bundle.getBundle(key) : null), this.f5538a)).a(((Long) on2.e().a(zr2.H0)).longValue(), TimeUnit.MILLISECONDS, this.f5539b).a(Throwable.class, new z51(key), this.f5538a));
        }
        return yn1.c(arrayList).a(new c61(arrayList), this.f5538a);
    }
}
