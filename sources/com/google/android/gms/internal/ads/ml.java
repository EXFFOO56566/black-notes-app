package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* access modifiers changed from: package-private */
public final class ml extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ gl f3725a;

    private ml(gl glVar) {
        this.f3725a = glVar;
    }

    /* synthetic */ ml(gl glVar, il ilVar) {
        this(glVar);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f3725a.f2778c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f3725a.f2778c = false;
        }
    }
}
