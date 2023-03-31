package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class e61 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2374a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2375b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2376c;
    private final String d;
    private final Long e;

    public e61(String str, String str2, String str3, String str4, Long l) {
        this.f2374a = str;
        this.f2375b = str2;
        this.f2376c = str3;
        this.d = str4;
        this.e = l;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        ee1.a(bundle2, "gmp_app_id", this.f2374a);
        ee1.a(bundle2, "fbs_aiid", this.f2375b);
        ee1.a(bundle2, "fbs_aeid", this.f2376c);
        ee1.a(bundle2, "apm_id_origin", this.d);
        Long l = this.e;
        if (l != null) {
            bundle2.putLong("sai_timeout", l.longValue());
        }
    }
}
