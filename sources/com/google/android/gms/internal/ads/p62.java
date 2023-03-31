package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;

public final class p62 extends x62 {
    private final StackTraceElement[] h;

    public p62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(l52, str, str2, aVar, i, 45);
        this.h = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        StackTraceElement[] stackTraceElementArr = this.h;
        if (stackTraceElementArr != null) {
            h52 h52 = new h52((String) this.e.invoke(null, stackTraceElementArr));
            synchronized (this.d) {
                this.d.b(h52.f2866b.longValue());
                if (h52.f2867c.booleanValue()) {
                    this.d.c(h52.d.booleanValue() ? pi0.ENUM_FALSE : pi0.ENUM_TRUE);
                } else {
                    this.d.c(pi0.ENUM_FAILURE);
                }
            }
        }
    }
}
