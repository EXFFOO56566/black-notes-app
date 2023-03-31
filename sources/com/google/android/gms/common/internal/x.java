package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* access modifiers changed from: package-private */
public final class x extends f {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f1652b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f1653c;
    private final /* synthetic */ int d;

    x(Intent intent, Activity activity, int i) {
        this.f1652b = intent;
        this.f1653c = activity;
        this.d = i;
    }

    @Override // com.google.android.gms.common.internal.f
    public final void a() {
        Intent intent = this.f1652b;
        if (intent != null) {
            this.f1653c.startActivityForResult(intent, this.d);
        }
    }
}
