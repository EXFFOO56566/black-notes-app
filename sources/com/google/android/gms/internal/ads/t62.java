package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;

public final class t62 extends x62 {
    public t62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2) {
        super(l52, str, str2, aVar, i, 48);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        ba0.a aVar;
        pi0 pi0;
        this.d.a(pi0.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.e.invoke(null, this.f5373a.a())).booleanValue();
        synchronized (this.d) {
            if (booleanValue) {
                aVar = this.d;
                pi0 = pi0.ENUM_TRUE;
            } else {
                aVar = this.d;
                pi0 = pi0.ENUM_FALSE;
            }
            aVar.a(pi0);
        }
    }
}
