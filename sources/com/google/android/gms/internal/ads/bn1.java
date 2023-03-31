package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

final class bn1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f1978b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ View f1979c;
    private final /* synthetic */ Activity d;

    bn1(yh1 yh1, Context context, View view, Activity activity) {
        this.f1978b = context;
        this.f1979c = view;
        this.d = activity;
    }

    public final void run() {
        try {
            yh1.z.a(this.f1978b, this.f1979c, this.d);
        } catch (Exception e) {
            yh1.B.a(2020, -1, e);
        }
    }
}
