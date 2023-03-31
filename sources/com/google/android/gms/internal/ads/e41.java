package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class e41 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2367a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2368b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f2369c;

    private e41(String str, String str2, Bundle bundle) {
        this.f2367a = str;
        this.f2368b = str2;
        this.f2369c = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.f2367a);
        bundle2.putString("fc_consent", this.f2368b);
        bundle2.putBundle("iab_consent_info", this.f2369c);
    }
}
