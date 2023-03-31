package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.common.internal.c;

public final class rj1 extends b<yj1> {
    private final int w;

    public rj1(Context context, Looper looper, c.a aVar, c.b bVar, int i) {
        super(context, looper, 116, aVar, bVar, null);
        this.w = i;
    }

    public final yj1 A() {
        return (yj1) super.w();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof yj1 ? (yj1) queryLocalInterface : new xj1(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String c() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.c
    public final int e() {
        return this.w;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String l() {
        return "com.google.android.gms.gass.START";
    }
}
