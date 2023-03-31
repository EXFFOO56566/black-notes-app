package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final class od implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ md f3979b;

    od(md mdVar) {
        this.f3979b = mdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3979b.a("User canceled the download.");
    }
}
