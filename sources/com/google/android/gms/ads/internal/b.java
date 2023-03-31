package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;

public abstract class b<T extends IInterface> extends c<T> {
    protected b(Context context, Looper looper, int i, c.a aVar, c.b bVar, String str) {
        super(context, looper, i, aVar, bVar, null);
    }
}
