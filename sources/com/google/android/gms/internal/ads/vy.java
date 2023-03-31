package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

public final class vy {

    /* renamed from: a  reason: collision with root package name */
    private final String f5181a;

    /* renamed from: b  reason: collision with root package name */
    private final v9 f5182b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f5183c;
    private ez d;
    private final d5<Object> e = new yy(this);
    private final d5<Object> f = new az(this);

    public vy(String str, v9 v9Var, Executor executor) {
        this.f5181a = str;
        this.f5182b = v9Var;
        this.f5183c = executor;
    }

    /* access modifiers changed from: private */
    public final boolean a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f5181a);
    }

    public final void a() {
        this.f5182b.b("/updateActiveView", this.e);
        this.f5182b.b("/untrackActiveViewUnit", this.f);
    }

    public final void a(ez ezVar) {
        this.f5182b.a("/updateActiveView", this.e);
        this.f5182b.a("/untrackActiveViewUnit", this.f);
        this.d = ezVar;
    }

    public final void a(ws wsVar) {
        wsVar.b("/updateActiveView", this.e);
        wsVar.b("/untrackActiveViewUnit", this.f);
    }

    public final void b(ws wsVar) {
        wsVar.a("/updateActiveView", this.e);
        wsVar.a("/untrackActiveViewUnit", this.f);
    }
}
