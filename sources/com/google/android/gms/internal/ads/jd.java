package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.q;

final class jd implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gd f3205b;

    jd(gd gdVar) {
        this.f3205b = gdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent a2 = this.f3205b.a();
        q.c();
        gl.a(gd.a(this.f3205b), a2);
    }
}
