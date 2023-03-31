package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;

public final class i62 extends x62 {
    private static volatile Long h;
    private static final Object i = new Object();

    public i62(l52 l52, String str, String str2, ba0.a aVar, int i2, int i3) {
        super(l52, str, str2, aVar, i2, 22);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (Long) this.e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.d) {
            this.d.v(h.longValue());
        }
    }
}
