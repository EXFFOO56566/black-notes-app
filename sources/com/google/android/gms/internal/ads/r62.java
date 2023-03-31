package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;

public final class r62 extends x62 {
    private final s52 h;
    private long i;

    public r62(l52 l52, String str, String str2, ba0.a aVar, int i2, int i3, s52 s52) {
        super(l52, str, str2, aVar, i2, 53);
        this.h = s52;
        if (s52 != null) {
            this.i = s52.a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        if (this.h != null) {
            this.d.e(((Long) this.e.invoke(null, Long.valueOf(this.i))).longValue());
        }
    }
}
