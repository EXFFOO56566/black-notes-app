package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class n8 implements d5<e9> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ eq1 f3809a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r7 f3810b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ hn f3811c;
    private final /* synthetic */ f8 d;

    n8(f8 f8Var, eq1 eq1, r7 r7Var, hn hnVar) {
        this.d = f8Var;
        this.f3809a = eq1;
        this.f3810b = r7Var;
        this.f3811c = hnVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(e9 e9Var, Map map) {
        synchronized (this.d.f2551a) {
            co.c("JS Engine is requesting an update");
            if (this.d.h == 0) {
                co.c("Starting reload.");
                this.d.h = 2;
                this.d.a(this.f3809a);
            }
            this.f3810b.a("/requestReload", (d5) this.f3811c.a());
        }
    }
}
