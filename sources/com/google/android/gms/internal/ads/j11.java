package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;

final /* synthetic */ class j11 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final zf f3164a;

    j11(zf zfVar) {
        this.f3164a = zfVar;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        zf zfVar = this.f3164a;
        l11 l11 = new l11(new JsonReader(new InputStreamReader((InputStream) obj)));
        l11.a(zfVar.f5745b);
        return yn1.a(l11);
    }
}
