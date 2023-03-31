package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class cn {

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Bitmap> f2142a = new ConcurrentHashMap();

    public cn() {
        new AtomicInteger(0);
    }

    public final Bitmap a(Integer num) {
        return this.f2142a.get(num);
    }
}
