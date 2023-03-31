package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class v51 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f5054a;

    public v51(String str) {
        this.f5054a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("rtb", this.f5054a);
    }
}
