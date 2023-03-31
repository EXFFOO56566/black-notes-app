package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;
import java.util.List;

public final class n62 extends x62 {
    private List<Long> h = null;

    public n62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2) {
        super(l52, str, str2, aVar, i, 31);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        this.d.x(-1);
        this.d.y(-1);
        if (this.h == null) {
            this.h = (List) this.e.invoke(null, this.f5373a.a());
        }
        List<Long> list = this.h;
        if (list != null && list.size() == 2) {
            synchronized (this.d) {
                this.d.x(this.h.get(0).longValue());
                this.d.y(this.h.get(1).longValue());
            }
        }
    }
}
