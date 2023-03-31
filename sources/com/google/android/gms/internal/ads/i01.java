package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.k90;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class i01 implements d01<k20> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final be1 f3006a;

    /* renamed from: b  reason: collision with root package name */
    private final kv f3007b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f3008c;
    private final b01 d;
    @GuardedBy("this")
    private y20 e;

    public i01(kv kvVar, Context context, b01 b01, be1 be1) {
        this.f3007b = kvVar;
        this.f3008c = context;
        this.d = b01;
        this.f3006a = be1;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.d.d().a(1);
    }

    @Override // com.google.android.gms.internal.ads.d01
    public final boolean a(rm2 rm2, String str, c01 c01, f01<? super k20> f01) {
        Executor a2;
        Runnable k01;
        q.c();
        if (gl.p(this.f3008c) && rm2.t == null) {
            co.b("Failed to load the ad because app ID is missing.");
            a2 = this.f3007b.a();
            k01 = new h01(this);
        } else if (str == null) {
            co.b("Ad unit ID should not be null for NativeAdLoader.");
            a2 = this.f3007b.a();
            k01 = new k01(this);
        } else {
            ie1.a(this.f3008c, rm2.g);
            int i = c01 instanceof e01 ? ((e01) c01).f2351a : 1;
            be1 be1 = this.f3006a;
            be1.a(rm2);
            be1.a(i);
            zd1 d2 = be1.d();
            yd0 l = this.f3007b.l();
            g50.a aVar = new g50.a();
            aVar.a(this.f3008c);
            aVar.a(d2);
            l.a(aVar.a());
            k90.a aVar2 = new k90.a();
            aVar2.a(this.d.c(), this.f3007b.a());
            aVar2.a(this.d.d(), this.f3007b.a());
            aVar2.a(this.d.e(), this.f3007b.a());
            aVar2.a(this.d.f(), this.f3007b.a());
            aVar2.a(this.d.b(), this.f3007b.a());
            aVar2.a(d2.m, this.f3007b.a());
            l.e(aVar2.a());
            l.b(this.d.a());
            zd0 c2 = l.c();
            this.f3007b.p().a(1);
            y20 y20 = new y20(this.f3007b.c(), this.f3007b.b(), c2.a().b());
            this.e = y20;
            y20.a(new j01(this, f01, c2));
            return true;
        }
        a2.execute(k01);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.d.d().a(8);
    }

    @Override // com.google.android.gms.internal.ads.d01
    public final boolean u() {
        y20 y20 = this.e;
        return y20 != null && y20.a();
    }
}
