package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;

public final class m62 extends x62 {
    private static volatile String h;
    private static final Object i = new Object();

    public m62(l52 l52, String str, String str2, ba0.a aVar, int i2, int i3) {
        super(l52, str, str2, aVar, i2, 1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        this.d.b("E");
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (String) this.e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.d) {
            this.d.b(h);
        }
    }
}
