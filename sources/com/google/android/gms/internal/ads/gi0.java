package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class gi0 {

    /* renamed from: a  reason: collision with root package name */
    private final zd1 f2765a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f2766b;

    /* renamed from: c  reason: collision with root package name */
    private final pk0 f2767c;

    public gi0(zd1 zd1, Executor executor, pk0 pk0) {
        this.f2765a = zd1;
        this.f2766b = executor;
        this.f2767c = pk0;
    }

    private final void a(ws wsVar) {
        wsVar.b("/video", p4.l);
        wsVar.b("/videoMeta", p4.m);
        wsVar.b("/precache", new fs());
        wsVar.b("/delayPageLoaded", p4.p);
        wsVar.b("/instrument", p4.n);
        wsVar.b("/log", p4.g);
        wsVar.b("/videoClicked", p4.h);
        wsVar.P().a(true);
        wsVar.b("/click", p4.f4106c);
        if (this.f2765a.f5738c != null) {
            wsVar.P().b(true);
            wsVar.b("/open", new h5(null, null));
            return;
        }
        wsVar.P().b(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(Object obj) {
        ws a2 = this.f2767c.a(um2.e(), false);
        so c2 = so.c(a2);
        a(a2);
        a2.P().a(new ki0(c2));
        a2.loadUrl((String) on2.e().a(zr2.t1));
        return c2;
    }

    public final lo1<ws> a(String str, String str2) {
        return yn1.a(yn1.a((Object) null), new ii0(this, str, str2), this.f2766b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(String str, String str2, Object obj) {
        ws a2 = this.f2767c.a(um2.e(), false);
        so c2 = so.c(a2);
        a(a2);
        a2.a(this.f2765a.f5738c != null ? lu.h() : lu.g());
        a2.P().a(new ji0(this, a2, c2));
        a2.a(str, str2, (String) null);
        return c2;
    }

    public final lo1<ws> a(JSONObject jSONObject) {
        return yn1.a(yn1.a(yn1.a((Object) null), new hi0(this), this.f2766b), new fi0(this, jSONObject), this.f2766b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(JSONObject jSONObject, ws wsVar) {
        so c2 = so.c(wsVar);
        wsVar.a(this.f2765a.f5738c != null ? lu.h() : lu.g());
        wsVar.P().a(new mi0(this, wsVar, c2));
        wsVar.b("google.afma.nativeAds.renderVideo", jSONObject);
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ws wsVar, so soVar, boolean z) {
        if (z) {
            if (!(this.f2765a.f5737b == null || wsVar.i() == null)) {
                wsVar.i().b(this.f2765a.f5737b);
            }
            soVar.a();
            return;
        }
        soVar.a(new pw0("Instream video Web View failed to load.", 0));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(ws wsVar, so soVar, boolean z) {
        if (!(this.f2765a.f5737b == null || wsVar.i() == null)) {
            wsVar.i().b(this.f2765a.f5737b);
        }
        soVar.a();
    }
}
