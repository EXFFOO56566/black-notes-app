package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;

public final class l62 extends x62 {
    public l62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2) {
        super(l52, str, str2, aVar, i, 3);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        boolean booleanValue = ((Boolean) on2.e().a(zr2.a1)).booleanValue();
        iu1 iu1 = new iu1((String) this.e.invoke(null, this.f5373a.a(), Boolean.valueOf(booleanValue)));
        synchronized (this.d) {
            this.d.l(iu1.f3136b);
            this.d.g(iu1.f3137c);
        }
    }
}
