package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class k8 implements d5<e9> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ w8 f3337a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r7 f3338b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f8 f3339c;

    k8(f8 f8Var, w8 w8Var, r7 r7Var) {
        this.f3339c = f8Var;
        this.f3337a = w8Var;
        this.f3338b = r7Var;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(e9 e9Var, Map map) {
        synchronized (this.f3339c.f2551a) {
            if (this.f3337a.a() != -1) {
                if (this.f3337a.a() != 1) {
                    this.f3339c.h = 0;
                    this.f3339c.e.a(this.f3338b);
                    this.f3337a.a(this.f3338b);
                    this.f3339c.g = this.f3337a;
                    wk.e("Successfully loaded JS Engine.");
                }
            }
        }
    }
}
