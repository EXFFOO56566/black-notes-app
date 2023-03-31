package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class fc0 {

    /* renamed from: a  reason: collision with root package name */
    private final id0 f2569a;

    /* renamed from: b  reason: collision with root package name */
    private final ws f2570b;

    public fc0(id0 id0) {
        this(id0, null);
    }

    public fc0(id0 id0, ws wsVar) {
        this.f2569a = id0;
        this.f2570b = wsVar;
    }

    public final ab0<q80> a(Executor executor) {
        return new ab0<>(new hc0(this.f2570b), executor);
    }

    public final ws a() {
        return this.f2570b;
    }

    public Set<ab0<u50>> a(nd0 nd0) {
        return Collections.singleton(ab0.a(nd0, jo.f));
    }

    public final id0 b() {
        return this.f2569a;
    }

    public final View c() {
        ws wsVar = this.f2570b;
        if (wsVar != null) {
            return wsVar.getWebView();
        }
        return null;
    }

    public final View d() {
        ws wsVar = this.f2570b;
        if (wsVar == null) {
            return null;
        }
        return wsVar.getWebView();
    }
}
