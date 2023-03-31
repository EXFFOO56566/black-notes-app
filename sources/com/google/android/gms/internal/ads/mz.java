package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class mz implements r42<Set<ab0<q60>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ez> f3768a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3769b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<JSONObject> f3770c;

    private mz(e52<ez> e52, e52<Executor> e522, e52<JSONObject> e523) {
        this.f3768a = e52;
        this.f3769b = e522;
        this.f3770c = e523;
    }

    public static mz a(e52<ez> e52, e52<Executor> e522, e52<JSONObject> e523) {
        return new mz(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set emptySet = this.f3770c.get() == null ? Collections.emptySet() : Collections.singleton(new ab0(this.f3768a.get(), this.f3769b.get()));
        y42.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
