package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class k31 implements y61<g31> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f3315a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3316b;

    public k31(ko1 ko1, Context context) {
        this.f3315a = ko1;
        this.f3316b = context;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<g31> a() {
        return this.f3315a.a(new i31(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ g31 b() {
        double d;
        Intent registerReceiver = this.f3316b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            d = ((double) registerReceiver.getIntExtra("level", -1)) / ((double) registerReceiver.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new g31(d, z);
    }
}
