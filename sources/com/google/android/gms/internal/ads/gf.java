package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.common.internal.c;

public final class gf extends b<qf> {
    public gf(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(vg.a(context), looper, 8, aVar, bVar, null);
    }

    public final qf A() {
        return (qf) super.w();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof qf ? (qf) queryLocalInterface : new sf(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String c() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String l() {
        return "com.google.android.gms.ads.service.START";
    }
}
