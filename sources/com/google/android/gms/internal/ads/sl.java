package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
public class sl extends pl {
    @Override // com.google.android.gms.internal.ads.ll, com.google.android.gms.internal.ads.pl
    public final boolean a(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
