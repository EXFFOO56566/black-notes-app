package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class w21 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5199a = false;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5200b = false;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5201c;

    public w21(boolean z, boolean z2, boolean z3) {
        this.f5201c = z3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("c_pcbg", this.f5199a);
        bundle2.putBoolean("c_phbg", this.f5200b);
        bundle2.putBoolean("ar_lr", this.f5201c);
    }
}
