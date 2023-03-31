package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class hz implements r42<Set<ab0<n60>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ez> f2995a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2996b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<JSONObject> f2997c;

    private hz(e52<ez> e52, e52<Executor> e522, e52<JSONObject> e523) {
        this.f2995a = e52;
        this.f2996b = e522;
        this.f2997c = e523;
    }

    public static hz a(e52<ez> e52, e52<Executor> e522, e52<JSONObject> e523) {
        return new hz(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set emptySet = this.f2997c.get() == null ? Collections.emptySet() : Collections.singleton(new ab0(this.f2995a.get(), this.f2996b.get()));
        y42.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
