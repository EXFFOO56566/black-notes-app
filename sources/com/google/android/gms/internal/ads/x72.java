package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;

final class x72 extends sk1 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ u72 f5382a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    x72(u72 u72, Looper looper) {
        super(looper);
        this.f5382a = u72;
    }

    public final void handleMessage(Message message) {
        this.f5382a.a(message);
    }
}
