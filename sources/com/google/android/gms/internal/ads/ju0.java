package com.google.android.gms.internal.ads;

import a.c.b.a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.common.util.l;
import java.util.concurrent.Executor;

public final class ju0 implements jt0<ac0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3277a;

    /* renamed from: b  reason: collision with root package name */
    private final ad0 f3278b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3279c;
    private final gd1 d;

    public ju0(Context context, Executor executor, ad0 ad0, gd1 gd1) {
        this.f3277a = context;
        this.f3278b = ad0;
        this.f3279c = executor;
        this.d = gd1;
    }

    private static String a(id1 id1) {
        try {
            return id1.s.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(Uri uri, vd1 vd1, id1 id1, Object obj) {
        try {
            a a2 = new a.C0005a().a();
            a2.f62a.setData(uri);
            d dVar = new d(a2.f62a);
            ro roVar = new ro();
            cc0 a3 = this.f3278b.a(new d30(vd1, id1, null), new fc0(new lu0(roVar)));
            roVar.b(new AdOverlayInfoParcel(dVar, null, a3.j(), null, new fo(0, 0, false)));
            this.d.c();
            return yn1.a(a3.i());
        } catch (Throwable th) {
            co.b("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<ac0> a(vd1 vd1, id1 id1) {
        String a2 = a(id1);
        return yn1.a(yn1.a((Object) null), new mu0(this, a2 != null ? Uri.parse(a2) : null, vd1, id1), this.f3279c);
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        return (this.f3277a instanceof Activity) && l.b() && y.a(this.f3277a) && !TextUtils.isEmpty(a(id1));
    }
}
