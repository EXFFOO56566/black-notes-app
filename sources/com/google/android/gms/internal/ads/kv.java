package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.nv;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

public abstract class kv implements jy {
    @GuardedBy("AppComponent.class")

    /* renamed from: a  reason: collision with root package name */
    private static kv f3451a;

    @Deprecated
    public static kv a(Context context, int i) {
        synchronized (kv.class) {
            if (f3451a == null) {
                return a(new fo(201004000, i, true, false), context, new fw());
            }
            return f3451a;
        }
    }

    public static kv a(Context context, ra raVar, int i) {
        kv a2 = a(context, i);
        a2.f().a(raVar);
        return a2;
    }

    @Deprecated
    private static kv a(fo foVar, Context context, ix.a aVar) {
        kv kvVar;
        synchronized (kv.class) {
            if (f3451a == null) {
                zw zwVar = new zw();
                nv.a aVar2 = new nv.a();
                aVar2.a(foVar);
                aVar2.a(context);
                zwVar.a(new nv(aVar2));
                zwVar.a(new ix(aVar));
                f3451a = zwVar.a();
                zr2.a(context);
                q.g().a(context, foVar);
                q.i().a(context);
                q.c().a(context);
                q.c().b(context);
                uk.a(context);
                q.f().a(context);
                q.x().a(context);
                if (((Boolean) on2.e().a(zr2.Z2)).booleanValue()) {
                    new ft0(context, foVar, new wj2(new ak2(context)), new os0(new ms0(context), f3451a.d())).a();
                }
            }
            kvVar = f3451a;
        }
        return kvVar;
    }

    /* access modifiers changed from: protected */
    public abstract r71 a(b91 b91);

    @Override // com.google.android.gms.internal.ads.jy
    public final r71 a(zf zfVar, int i) {
        return a(new b91(zfVar, i));
    }

    public abstract Executor a();

    public abstract ScheduledExecutorService b();

    public abstract Executor c();

    public abstract ko1 d();

    public abstract e80 e();

    public abstract rl0 f();

    public abstract ox g();

    public abstract j10 h();

    public abstract a00 i();

    public abstract fa1 j();

    public abstract zc0 k();

    public abstract yd0 l();

    public abstract ik0 m();

    public abstract zc1 n();

    public abstract l01 o();

    public abstract ke1<jj0> p();
}
