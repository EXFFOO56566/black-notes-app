package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class g52 implements nk1 {

    /* renamed from: a  reason: collision with root package name */
    private final ni1 f2713a;

    /* renamed from: b  reason: collision with root package name */
    private final aj1 f2714b;

    /* renamed from: c  reason: collision with root package name */
    private final s52 f2715c;
    private final j52 d;

    g52(ni1 ni1, aj1 aj1, s52 s52, j52 j52) {
        this.f2713a = ni1;
        this.f2714b = aj1;
        this.f2715c = s52;
        this.d = j52;
    }

    private final Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("v", this.f2713a.a());
        hashMap.put("gms", Boolean.valueOf(this.f2713a.c()));
        hashMap.put("int", this.f2714b.a());
        hashMap.put("up", Boolean.valueOf(this.d.a()));
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.nk1
    public final Map<String, Object> a() {
        return d();
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        this.f2715c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.nk1
    public final Map<String, Object> b() {
        Map<String, Object> d2 = d();
        d2.put("lts", Long.valueOf(this.f2715c.a()));
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.nk1
    public final Map<String, Object> c() {
        Map<String, Object> d2 = d();
        d2.put("gai", Boolean.valueOf(this.f2713a.b()));
        d2.put("did", this.f2714b.b());
        d2.put("dst", Integer.valueOf(this.f2714b.d()));
        d2.put("doo", Boolean.valueOf(this.f2714b.c()));
        return d2;
    }
}
