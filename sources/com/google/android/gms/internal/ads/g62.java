package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.t.a;
import com.google.android.gms.internal.ads.ba0;
import java.io.IOException;

public final class g62 extends x62 {
    public g62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2) {
        super(l52, str, str2, aVar, i, 24);
    }

    private final void c() {
        a o = this.f5373a.o();
        if (o != null) {
            try {
                a.C0067a b2 = o.b();
                String a2 = q52.a(b2.a());
                if (a2 != null) {
                    synchronized (this.d) {
                        this.d.a(a2);
                        this.d.a(b2.b());
                        this.d.a(ba0.c.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        if (this.f5373a.i()) {
            c();
            return;
        }
        synchronized (this.d) {
            this.d.a((String) this.e.invoke(null, this.f5373a.a()));
        }
    }

    @Override // com.google.android.gms.internal.ads.x62
    /* renamed from: b */
    public final Void call() {
        if (this.f5373a.b()) {
            return super.call();
        }
        if (!this.f5373a.i()) {
            return null;
        }
        c();
        return null;
    }
}
