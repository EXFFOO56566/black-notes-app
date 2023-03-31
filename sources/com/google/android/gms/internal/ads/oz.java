package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class oz implements r42<Set<ab0<o>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ez> f4070a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f4071b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<JSONObject> f4072c;

    private oz(e52<ez> e52, e52<Executor> e522, e52<JSONObject> e523) {
        this.f4070a = e52;
        this.f4071b = e522;
        this.f4072c = e523;
    }

    public static oz a(e52<ez> e52, e52<Executor> e522, e52<JSONObject> e523) {
        return new oz(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set emptySet = this.f4072c.get() == null ? Collections.emptySet() : Collections.singleton(new ab0(this.f4070a.get(), this.f4071b.get()));
        y42.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
