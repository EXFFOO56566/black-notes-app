package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.b.a.d.a;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.Collections;
import java.util.List;

public final class tq2 extends uo2 {

    /* renamed from: b  reason: collision with root package name */
    private l6 f4846b;

    @Override // com.google.android.gms.internal.ads.vo2
    public final void L() {
        co.b("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        sn.f4682b.post(new vq2(this));
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final boolean N0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final List<e6> V1() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final String W1() {
        return BuildConfig.FLAVOR;
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(float f) {
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(a aVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(l6 l6Var) {
        this.f4846b = l6Var;
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(ra raVar) {
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(yq2 yq2) {
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void b(String str, a aVar) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b2() {
        l6 l6Var = this.f4846b;
        if (l6Var != null) {
            try {
                l6Var.a(Collections.emptyList());
            } catch (RemoteException e) {
                co.c("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void d(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void h(String str) {
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void l(String str) {
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final float o1() {
        return 1.0f;
    }
}
