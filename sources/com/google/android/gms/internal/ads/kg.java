package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

public final class kg {

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, mg> f3384a = new WeakHashMap<>();

    public final Future<ig> a(Context context) {
        return jo.f3256a.a(new jg(this, context));
    }
}
