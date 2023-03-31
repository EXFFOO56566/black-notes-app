package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;

public final class ki extends vh {

    /* renamed from: b  reason: collision with root package name */
    private final String f3399b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3400c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ki(uh uhVar) {
        this(uhVar != null ? uhVar.f4950b : BuildConfig.FLAVOR, uhVar != null ? uhVar.f4951c : 1);
    }

    public ki(String str, int i) {
        this.f3399b = str;
        this.f3400c = i;
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final int I() {
        return this.f3400c;
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final String m() {
        return this.f3399b;
    }
}
