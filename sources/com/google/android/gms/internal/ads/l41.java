package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class l41 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f3494a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3495b;

    public l41(String str, boolean z) {
        this.f3494a = str;
        this.f3495b = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.f3494a);
        if (this.f3495b) {
            bundle2.putString("de", "1");
        }
    }
}
