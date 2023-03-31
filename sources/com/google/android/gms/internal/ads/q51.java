package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class q51 implements r42<o51> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f4276a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Bundle> f4277b;

    private q51(e52<ko1> e52, e52<Bundle> e522) {
        this.f4276a = e52;
        this.f4277b = e522;
    }

    public static q51 a(e52<ko1> e52, e52<Bundle> e522) {
        return new q51(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new o51(this.f4276a.get(), this.f4277b.get());
    }
}
