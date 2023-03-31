package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

final class am1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f1787b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f1788c;
    private final /* synthetic */ View d;
    private final /* synthetic */ Activity e;

    am1(yh1 yh1, Context context, String str, View view, Activity activity) {
        this.f1787b = context;
        this.f1788c = str;
        this.d = view;
        this.e = activity;
    }

    public final void run() {
        try {
            yh1.z.a(this.f1787b, this.f1788c, this.d, this.e);
        } catch (Exception e2) {
            yh1.B.a(2021, -1, e2);
        }
    }
}
