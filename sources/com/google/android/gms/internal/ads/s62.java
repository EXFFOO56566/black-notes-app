package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;

public final class s62 extends x62 {
    public s62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2) {
        super(l52, str, str2, aVar, i, 51);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        synchronized (this.d) {
            i52 i52 = new i52((String) this.e.invoke(null, new Object[0]));
            this.d.c(i52.f3031b.longValue());
            this.d.d(i52.f3032c.longValue());
        }
    }
}
