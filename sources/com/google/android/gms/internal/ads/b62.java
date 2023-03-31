package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;

public final class b62 extends x62 {
    public b62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2) {
        super(l52, str, str2, aVar, i, 5);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        this.d.m(-1);
        this.d.n(-1);
        int[] iArr = (int[]) this.e.invoke(null, this.f5373a.a());
        synchronized (this.d) {
            this.d.m((long) iArr[0]);
            this.d.n((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.d.f((long) iArr[2]);
            }
        }
    }
}
