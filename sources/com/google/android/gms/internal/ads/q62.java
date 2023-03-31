package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;

public final class q62 extends x62 {
    private final boolean h;

    public q62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2) {
        super(l52, str, str2, aVar, i, 61);
        this.h = l52.d();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        long longValue = ((Long) this.e.invoke(null, this.f5373a.a(), Boolean.valueOf(this.h))).longValue();
        synchronized (this.d) {
            this.d.h(longValue);
        }
    }
}
