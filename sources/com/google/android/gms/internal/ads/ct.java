package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ct implements zn1<Map<String, String>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ List f2162a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2163b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ vs f2164c;

    ct(vs vsVar, List list, String str) {
        this.f2164c = vsVar;
        this.f2162a = list;
        this.f2163b = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(Map<String, String> map) {
        this.f2164c.a((vs) map, (Map) this.f2162a, (List) this.f2163b);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
    }
}
