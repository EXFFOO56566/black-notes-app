package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.ba0;

public final class y52 extends x62 {
    private final Activity h;
    private final View i;

    public y52(l52 l52, String str, String str2, ba0.a aVar, int i2, int i3, View view, Activity activity) {
        super(l52, str, str2, aVar, i2, 62);
        this.i = view;
        this.h = activity;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        if (this.i != null) {
            boolean booleanValue = ((Boolean) on2.e().a(zr2.Y0)).booleanValue();
            Object[] objArr = (Object[]) this.e.invoke(null, this.i, this.h, Boolean.valueOf(booleanValue));
            synchronized (this.d) {
                this.d.i(((Long) objArr[0]).longValue());
                this.d.j(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.d.i((String) objArr[2]);
                }
            }
        }
    }
}
