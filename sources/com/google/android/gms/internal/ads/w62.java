package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.ba0;

public final class w62 extends x62 {
    private final View h;

    public w62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2, View view) {
        super(l52, str, str2, aVar, i, 57);
        this.h = view;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        if (this.h != null) {
            Boolean bool = (Boolean) on2.e().a(zr2.m1);
            DisplayMetrics displayMetrics = this.f5373a.a().getResources().getDisplayMetrics();
            t52 t52 = new t52((String) this.e.invoke(null, this.h, displayMetrics, bool));
            ba0.f.a p = ba0.f.p();
            p.a(t52.f4756b.longValue());
            p.b(t52.f4757c.longValue());
            p.c(t52.d.longValue());
            if (bool.booleanValue()) {
                p.d(t52.e.longValue());
            }
            this.d.a((ba0.f) ((rz1) p.e()));
        }
    }
}
