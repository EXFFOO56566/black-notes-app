package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.wk;

public final class r extends c {
    public r(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.internal.ads.be, com.google.android.gms.ads.internal.overlay.c
    public final void k(Bundle bundle) {
        wk.e("AdOverlayParcel is null or does not contain valid overlay type.");
        this.n = 3;
        this.f1413b.finish();
    }
}
