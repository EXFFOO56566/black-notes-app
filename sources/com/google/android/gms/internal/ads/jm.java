package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.q;

final class jm implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fm f3248b;

    jm(fm fmVar) {
        this.f3248b = fmVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        q.c();
        gl.a(this.f3248b.f2619b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
