package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class yy implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ vy f5667a;

    yy(vy vyVar) {
        this.f5667a = vyVar;
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        if (this.f5667a.a(map)) {
            this.f5667a.f5183c.execute(new xy(this));
        }
    }
}
