package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e70;

public final class cy0<AdT, AdapterT, ListenerT extends e70> implements r42<yx0<AdT, AdapterT, ListenerT>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<sh1> f2182a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f2183b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<kt0<AdapterT, ListenerT>> f2184c;
    private final e52<mt0<AdT, AdapterT, ListenerT>> d;

    private cy0(e52<sh1> e52, e52<ko1> e522, e52<kt0<AdapterT, ListenerT>> e523, e52<mt0<AdT, AdapterT, ListenerT>> e524) {
        this.f2182a = e52;
        this.f2183b = e522;
        this.f2184c = e523;
        this.d = e524;
    }

    public static <AdT, AdapterT, ListenerT extends e70> cy0<AdT, AdapterT, ListenerT> a(e52<sh1> e52, e52<ko1> e522, e52<kt0<AdapterT, ListenerT>> e523, e52<mt0<AdT, AdapterT, ListenerT>> e524) {
        return new cy0<>(e52, e522, e523, e524);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new yx0(this.f2182a.get(), this.f2183b.get(), this.f2184c.get(), this.d.get());
    }
}
