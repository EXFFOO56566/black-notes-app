package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public final class u51 implements y61<v61<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4901a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4902b;

    u51(Context context, String str) {
        this.f4901a = context;
        this.f4902b = str;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<v61<Bundle>> a() {
        return yn1.a(this.f4902b == null ? null : new t51(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.f4901a.getPackageName());
    }
}
