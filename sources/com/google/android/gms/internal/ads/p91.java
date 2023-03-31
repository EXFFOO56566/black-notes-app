package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.k90;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class p91 implements d01<h00> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4128a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4129b;

    /* renamed from: c  reason: collision with root package name */
    private final kv f4130c;
    private final ea1 d;
    private final mb1<b00, h00> e;
    private final ViewGroup f;
    @GuardedBy("this")
    private final be1 g;
    @GuardedBy("this")
    @Nullable
    private lo1<h00> h;

    public p91(Context context, Executor executor, kv kvVar, mb1<b00, h00> mb1, ea1 ea1, be1 be1) {
        this.f4128a = context;
        this.f4129b = executor;
        this.f4130c = kvVar;
        this.e = mb1;
        this.d = ea1;
        this.g = be1;
        this.f = new FrameLayout(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized a00 a(lb1 lb1) {
        a00 i;
        ea1 a2 = ea1.a(this.d);
        k90.a aVar = new k90.a();
        aVar.a((a60) a2, this.f4129b);
        aVar.a((q70) a2, this.f4129b);
        aVar.a(a2);
        i = this.f4130c.i();
        i.b(new i00(this.f));
        g50.a aVar2 = new g50.a();
        aVar2.a(this.f4128a);
        aVar2.a(((u91) lb1).f4919a);
        i.e(aVar2.a());
        i.d(aVar.a());
        return i;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.d.a(1);
    }

    public final void a(bn2 bn2) {
        this.g.a(bn2);
    }

    @Override // com.google.android.gms.internal.ads.d01
    public final synchronized boolean a(rm2 rm2, String str, c01 c01, f01<? super h00> f01) {
        r.a("loadAd must be called on the main UI thread.");
        if (str == null) {
            co.b("Ad unit ID should not be null for app open ad.");
            this.f4129b.execute(new t91(this));
            return false;
        } else if (this.h != null) {
            return false;
        } else {
            ie1.a(this.f4128a, rm2.g);
            be1 be1 = this.g;
            be1.a(str);
            be1.a(um2.i());
            be1.a(rm2);
            zd1 d2 = be1.d();
            u91 u91 = new u91(null);
            u91.f4919a = d2;
            lo1<h00> a2 = this.e.a(new nb1(u91), new s91(this));
            this.h = a2;
            yn1.a(a2, new v91(this, f01, u91), this.f4129b);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.d01
    public final boolean u() {
        lo1<h00> lo1 = this.h;
        return lo1 != null && !lo1.isDone();
    }
}
