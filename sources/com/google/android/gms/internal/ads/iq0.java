package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

final class iq0 implements zn1<vd1> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ dq0 f3124a;

    iq0(dq0 dq0) {
        this.f3124a = dq0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(vd1 vd1) {
        vd1 vd12 = vd1;
        if (((Boolean) on2.e().a(zr2.Z2)).booleanValue()) {
            this.f3124a.f.a(vd12.f5093b.f4642b.e);
            this.f3124a.f.a(vd12.f5093b.f4642b.f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        if (((Boolean) on2.e().a(zr2.Z2)).booleanValue()) {
            Matcher matcher = dq0.g.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f3124a.f.a(Integer.parseInt(matcher.group(1)));
            }
        }
    }
}
