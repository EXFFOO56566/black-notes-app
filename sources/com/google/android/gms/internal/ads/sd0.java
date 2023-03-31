package com.google.android.gms.internal.ads;

import java.util.Map;

public final class sd0 implements r42<td0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Map<String, jt0<q20>>> f4638a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Map<String, jt0<xe0>>> f4639b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Map<String, mv0<xe0>>> f4640c;
    private final e52<p20<n00>> d;
    private final e52<rf0> e;

    public sd0(e52<Map<String, jt0<q20>>> e52, e52<Map<String, jt0<xe0>>> e522, e52<Map<String, mv0<xe0>>> e523, e52<p20<n00>> e524, e52<rf0> e525) {
        this.f4638a = e52;
        this.f4639b = e522;
        this.f4640c = e523;
        this.d = e524;
        this.e = e525;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new td0(this.f4638a.get(), this.f4639b.get(), this.f4640c.get(), this.d, this.e.get());
    }
}
