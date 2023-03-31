package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final class fm implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f2619b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f2620c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ boolean e;

    fm(hm hmVar, Context context, String str, boolean z, boolean z2) {
        this.f2619b = context;
        this.f2620c = str;
        this.d = z;
        this.e = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f2619b);
        builder.setMessage(this.f2620c);
        builder.setTitle(this.d ? "Error" : "Info");
        if (this.e) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new jm(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
