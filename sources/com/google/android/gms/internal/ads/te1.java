package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

public final class te1 implements ok, a60 {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<hk> f4798b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final Context f4799c;
    private final tk d;

    public te1(Context context, tk tkVar) {
        this.f4799c = context;
        this.d = tkVar;
    }

    public final Bundle a() {
        return this.d.a(this.f4799c, this);
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final synchronized void a(int i) {
        if (i != 3) {
            this.d.a(this.f4798b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ok
    public final synchronized void a(HashSet<hk> hashSet) {
        this.f4798b.clear();
        this.f4798b.addAll(hashSet);
    }
}
