package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

public final class c51 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2067a;

    public c51(String str) {
        this.f2067a = str;
    }

    /* access modifiers changed from: private */
    public static boolean a(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        ee1.a(bundle, "omid_v", this.f2067a);
    }
}
