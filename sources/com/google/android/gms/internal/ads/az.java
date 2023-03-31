package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class az implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ vy f1834a;

    az(vy vyVar) {
        this.f1834a = vyVar;
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        if (this.f1834a.a(map)) {
            this.f1834a.f5183c.execute(new zy(this));
        }
    }
}
