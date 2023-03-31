package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class pf {

    /* renamed from: a  reason: collision with root package name */
    private final int f4157a;

    /* renamed from: b  reason: collision with root package name */
    private final List<bb2> f4158b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4159c;
    private final InputStream d;

    public pf(int i, List<bb2> list) {
        this(i, list, -1, null);
    }

    public pf(int i, List<bb2> list, int i2, InputStream inputStream) {
        this.f4157a = i;
        this.f4158b = list;
        this.f4159c = i2;
        this.d = inputStream;
    }

    public final InputStream a() {
        return this.d;
    }

    public final int b() {
        return this.f4159c;
    }

    public final int c() {
        return this.f4157a;
    }

    public final List<bb2> d() {
        return Collections.unmodifiableList(this.f4158b);
    }
}
