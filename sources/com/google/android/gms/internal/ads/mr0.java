package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class mr0 extends of {

    /* renamed from: b  reason: collision with root package name */
    private final Context f3752b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3753c;
    private final rg d;
    private final ng e;
    private final jy f;
    private final HashMap<String, cs0> g;

    public mr0(Context context, Executor executor, rg rgVar, jy jyVar, ng ngVar, HashMap<String, cs0> hashMap) {
        zr2.a(context);
        this.f3752b = context;
        this.f3753c = executor;
        this.d = rgVar;
        this.e = ngVar;
        this.f = jyVar;
        this.g = hashMap;
    }

    private static lo1<fg> a(lo1<JSONObject> lo1, sh1 sh1, q9 q9Var) {
        return sh1.a(ph1.BUILD_URL, lo1).a((ln1) q9Var.a("AFMA_getAdDictionary", l9.f3510b, sr0.f4696a)).a();
    }

    private static lo1<JSONObject> a(zf zfVar, sh1 sh1, r71 r71) {
        qr0 qr0 = new qr0(r71);
        return sh1.a(ph1.GMS_SIGNALS, yn1.a(zfVar.f5745b)).a((ln1) qr0).a(tr0.f4848a).a();
    }

    private final void a(lo1<InputStream> lo1, tf tfVar) {
        yn1.a(yn1.a(lo1, new wr0(this), jo.f3256a), new zr0(this, tfVar), jo.f);
    }

    public final lo1<InputStream> A(String str) {
        if (!r0.f4423a.a().booleanValue()) {
            return yn1.a((Throwable) new Exception("Split request is disabled."));
        }
        as0 as0 = new as0(this);
        if (this.g.remove(str) != null) {
            return yn1.a(as0);
        }
        String valueOf = String.valueOf(str);
        return yn1.a((Throwable) new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final lf a(jf jfVar) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.lo1<java.io.InputStream> a(com.google.android.gms.internal.ads.zf r9, int r10) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mr0.a(com.google.android.gms.internal.ads.zf, int):com.google.android.gms.internal.ads.lo1");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream a(lo1 lo1, lo1 lo12) {
        String h = ((fg) lo1.get()).h();
        this.g.put(h, new cs0((fg) lo1.get(), (JSONObject) lo12.get()));
        return new ByteArrayInputStream(h.getBytes(vk1.f5128a));
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final void a(jf jfVar, rf rfVar) {
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final void a(zf zfVar, tf tfVar) {
        lo1<InputStream> a2 = a(zfVar, Binder.getCallingUid());
        a(a2, tfVar);
        a2.a(new vr0(this), this.f3753c);
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final void a(String str, tf tfVar) {
        a(A(str), tfVar);
    }

    public final lo1<InputStream> b(zf zfVar, int i) {
        if (!r0.f4423a.a().booleanValue()) {
            return yn1.a((Throwable) new Exception("Split request is disabled."));
        }
        nf1 nf1 = zfVar.k;
        if (nf1 == null) {
            return yn1.a((Throwable) new Exception("Pool configuration missing from request."));
        }
        if (nf1.h == 0 || nf1.i == 0) {
            return yn1.a((Throwable) new Exception("Caching is disabled."));
        }
        q9 a2 = q.p().a(this.f3752b, fo.d());
        r71 a3 = this.f.a(zfVar, i);
        sh1 c2 = a3.c();
        lo1<JSONObject> a4 = a(zfVar, c2, a3);
        lo1<fg> a5 = a(a4, c2, a2);
        return c2.a(ph1.GET_URL_AND_CACHE_KEY, a4, a5).a(new ur0(this, a5, a4)).a();
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final void b(zf zfVar, tf tfVar) {
        a(b(zfVar, Binder.getCallingUid()), tfVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b2() {
        no.a(this.e.a(), "persistFlags");
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final void c(zf zfVar, tf tfVar) {
        lo1<InputStream> lo1;
        int callingUid = Binder.getCallingUid();
        q9 a2 = q.p().a(this.f3752b, fo.d());
        if (!x0.f5340a.a().booleanValue()) {
            lo1 = yn1.a((Throwable) new Exception("Signal collection disabled."));
        } else {
            r71 a3 = this.f.a(zfVar, callingUid);
            x61<JSONObject> b2 = a3.b();
            lo1 = a3.c().a(ph1.GET_SIGNALS, yn1.a(zfVar.f5745b)).a((ln1) new xr0(b2)).a(ph1.JS_SIGNALS).a((ln1) a2.a("google.afma.request.getSignals", l9.f3510b, l9.f3511c)).a();
        }
        a(lo1, tfVar);
    }
}
