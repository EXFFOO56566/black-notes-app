package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ba0;
import java.util.concurrent.ExecutionException;

public final class z52 extends x62 {
    private static final b72<au0> j = new b72<>();
    private final Context h;
    private s20 i = null;

    public z52(l52 l52, String str, String str2, ba0.a aVar, int i2, int i3, Context context, s20 s20) {
        super(l52, str, str2, aVar, i2, 27);
        this.h = context;
        this.i = s20;
    }

    private static String a(s20 s20) {
        if (s20 == null || !s20.p() || q52.b(s20.q().p())) {
            return null;
        }
        return s20.q().p();
    }

    private final String c() {
        try {
            if (this.f5373a.n() != null) {
                this.f5373a.n().get();
            }
            ba0 m = this.f5373a.m();
            if (m == null || !m.q()) {
                return null;
            }
            return m.p();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        if (com.google.android.gms.internal.ads.q52.b(r1) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    @Override // com.google.android.gms.internal.ads.x62
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z52.a():void");
    }
}
