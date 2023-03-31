package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class mh0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final kh0 f3707a;

    /* renamed from: b  reason: collision with root package name */
    private final lo1 f3708b;

    /* renamed from: c  reason: collision with root package name */
    private final lo1 f3709c;
    private final lo1 d;
    private final lo1 e;
    private final lo1 f;
    private final JSONObject g;
    private final lo1 h;
    private final lo1 i;
    private final lo1 j;

    mh0(kh0 kh0, lo1 lo1, lo1 lo12, lo1 lo13, lo1 lo14, lo1 lo15, JSONObject jSONObject, lo1 lo16, lo1 lo17, lo1 lo18) {
        this.f3707a = kh0;
        this.f3708b = lo1;
        this.f3709c = lo12;
        this.d = lo13;
        this.e = lo14;
        this.f = lo15;
        this.g = jSONObject;
        this.h = lo16;
        this.i = lo17;
        this.j = lo18;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        lo1 lo1 = this.f3708b;
        lo1 lo12 = this.f3709c;
        lo1 lo13 = this.d;
        lo1 lo14 = this.e;
        lo1 lo15 = this.f;
        JSONObject jSONObject = this.g;
        lo1 lo16 = this.h;
        lo1 lo17 = this.i;
        lo1 lo18 = this.j;
        if0 if0 = (if0) lo1.get();
        if0.a((List) lo12.get());
        if0.a((v1) lo13.get());
        if0.b((v1) lo14.get());
        if0.a((o1) lo15.get());
        if0.b(ph0.b(jSONObject));
        if0.a(ph0.c(jSONObject));
        ws wsVar = (ws) lo16.get();
        if (wsVar != null) {
            if0.a(wsVar);
            if0.a(wsVar.getView());
            if0.a(wsVar.i());
        }
        ws wsVar2 = (ws) lo17.get();
        if (wsVar2 != null) {
            if0.b(wsVar2);
        }
        for (ei0 ei0 : (List) lo18.get()) {
            int i2 = ei0.f2428a;
            if (i2 == 1) {
                if0.a(ei0.f2429b, ei0.f2430c);
            } else if (i2 == 2) {
                if0.a(ei0.f2429b, ei0.d);
            }
        }
        return if0;
    }
}
