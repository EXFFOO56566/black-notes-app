package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ba0;
import java.util.concurrent.atomic.AtomicReference;

public final class a62 extends x62 {
    private static b72<String> i = new b72<>();
    private final Context h;

    public a62(l52 l52, String str, String str2, ba0.a aVar, int i2, int i3, Context context) {
        super(l52, str, str2, aVar, i2, 29);
        this.h = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        this.d.e("E");
        AtomicReference<String> a2 = i.a(this.h.getPackageName());
        if (a2.get() == null) {
            synchronized (a2) {
                if (a2.get() == null) {
                    a2.set((String) this.e.invoke(null, this.h));
                }
            }
        }
        String str = a2.get();
        synchronized (this.d) {
            this.d.e(xq0.a(str.getBytes(), true));
        }
    }
}
