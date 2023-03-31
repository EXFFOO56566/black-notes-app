package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import javax.annotation.Nullable;

/* access modifiers changed from: package-private */
public final class cp0 implements zn1<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ uo0 f2152a;

    cp0(uo0 uo0) {
        this.f2152a = uo0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(@Nullable String str) {
        String str2 = str;
        synchronized (this) {
            this.f2152a.f4982b = true;
            this.f2152a.a((uo0) "com.google.android.gms.ads.MobileAds", (String) true, (boolean) BuildConfig.FLAVOR, (String) ((int) (q.j().b() - this.f2152a.f4983c)));
            this.f2152a.h.execute(new fp0(this, str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        synchronized (this) {
            this.f2152a.f4982b = true;
            this.f2152a.a((uo0) "com.google.android.gms.ads.MobileAds", (String) false, (boolean) "Internal Error.", (String) ((int) (q.j().b() - this.f2152a.f4983c)));
            this.f2152a.d.a(new Exception());
        }
    }
}
