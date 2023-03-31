package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class n21 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final bn2 f3790a;

    public n21(bn2 bn2) {
        this.f3790a = bn2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bn2 bn2 = this.f3790a;
        if (bn2 != null) {
            int i = bn2.f1980b;
            if (i == 1) {
                bundle2.putString("avo", "p");
            } else if (i == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
