package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class p51 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private String f4114a;

    public p51(String str) {
        this.f4114a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("request_id", this.f4114a);
    }
}
