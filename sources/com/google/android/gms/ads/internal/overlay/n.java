package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.l;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.jm2;

public final class n {
    public static void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.l == 4 && adOverlayInfoParcel.d == null) {
            jm2 jm2 = adOverlayInfoParcel.f1412c;
            if (jm2 != null) {
                jm2.l();
            }
            q.a();
            b.a(context, adOverlayInfoParcel.f1411b, adOverlayInfoParcel.j);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.n.e);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.a(intent, adOverlayInfoParcel);
        if (!l.h()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        q.c();
        gl.a(context, intent);
    }
}
