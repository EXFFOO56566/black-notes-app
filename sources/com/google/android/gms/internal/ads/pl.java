package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;

@TargetApi(18)
public class pl extends ql {
    @Override // com.google.android.gms.internal.ads.ll
    public final int a() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.ll
    public boolean a(View view) {
        return super.a(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final long d() {
        if (!((Boolean) on2.e().a(zr2.q1)).booleanValue()) {
            return -1;
        }
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }
}
