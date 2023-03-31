package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.common.internal.c;

public final class jj2 extends b<nj2> {
    jj2(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(vg.a(context), looper, 123, aVar, bVar, null);
    }

    public final nj2 A() {
        return (nj2) super.w();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof nj2 ? (nj2) queryLocalInterface : new mj2(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String c() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String l() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}
