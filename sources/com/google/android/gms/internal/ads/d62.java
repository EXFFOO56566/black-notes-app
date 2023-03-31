package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;

public final class d62 extends x62 {
    private long h;

    public d62(l52 l52, String str, String str2, ba0.a aVar, long j, int i, int i2) {
        super(l52, str, str2, aVar, i, 25);
        this.h = j;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        long longValue = ((Long) this.e.invoke(null, new Object[0])).longValue();
        synchronized (this.d) {
            this.d.k(longValue);
            if (this.h != 0) {
                this.d.t(longValue - this.h);
                this.d.w(this.h);
            }
        }
    }
}
