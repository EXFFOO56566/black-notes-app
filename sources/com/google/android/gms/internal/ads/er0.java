package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* access modifiers changed from: package-private */
public final /* synthetic */ class er0 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final zf f2476a;

    er0(zf zfVar) {
        this.f2476a = zfVar;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        zf zfVar = this.f2476a;
        zfVar.l = new String(sm1.a((InputStream) obj), vk1.f5128a);
        return yn1.a(zfVar);
    }
}
