package com.google.android.gms.internal.ads;

public final class ro0 implements r42<so0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<go0> f4526a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<kv> f4527b;

    private ro0(e52<go0> e52, e52<kv> e522) {
        this.f4526a = e52;
        this.f4527b = e522;
    }

    public static ro0 a(e52<go0> e52, e52<kv> e522) {
        return new ro0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new so0(this.f4526a.get(), this.f4527b.get());
    }
}
