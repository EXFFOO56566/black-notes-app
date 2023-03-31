package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import javax.annotation.ParametersAreNonnullByDefault;

public final class ak0 implements n5 {

    /* renamed from: b  reason: collision with root package name */
    private final v60 f1775b;

    /* renamed from: c  reason: collision with root package name */
    private final uh f1776c;
    private final String d;
    private final String e;

    public ak0(v60 v60, id1 id1) {
        this.f1775b = v60;
        this.f1776c = id1.l;
        this.d = id1.j;
        this.e = id1.k;
    }

    @Override // com.google.android.gms.internal.ads.n5
    @ParametersAreNonnullByDefault
    public final void a(uh uhVar) {
        int i;
        String str;
        uh uhVar2 = this.f1776c;
        if (uhVar2 != null) {
            uhVar = uhVar2;
        }
        if (uhVar != null) {
            str = uhVar.f4950b;
            i = uhVar.f4951c;
        } else {
            str = BuildConfig.FLAVOR;
            i = 1;
        }
        this.f1775b.a(new sg(str, i), this.d, this.e);
    }

    @Override // com.google.android.gms.internal.ads.n5
    public final void j() {
        this.f1775b.V();
    }

    @Override // com.google.android.gms.internal.ads.n5
    public final void z() {
        this.f1775b.U();
    }
}
