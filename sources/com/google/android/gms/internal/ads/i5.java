package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.util.e;
import java.util.Map;

public final class i5 implements d5<ws> {
    private static final Map<String, Integer> d = e.a(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a  reason: collision with root package name */
    private final c f3025a;

    /* renamed from: b  reason: collision with root package name */
    private final ld f3026b;

    /* renamed from: c  reason: collision with root package name */
    private final vd f3027c;

    public i5(c cVar, ld ldVar, vd vdVar) {
        this.f3025a = cVar;
        this.f3026b = ldVar;
        this.f3027c = vdVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        c cVar;
        ws wsVar2 = wsVar;
        int intValue = d.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (cVar = this.f3025a) != null && !cVar.b()) {
            this.f3025a.a(null);
        } else if (intValue == 1) {
            this.f3026b.a(map);
        } else if (intValue == 3) {
            new md(wsVar2, map).a();
        } else if (intValue == 4) {
            new gd(wsVar2, map).b();
        } else if (intValue == 5) {
            new nd(wsVar2, map).a();
        } else if (intValue == 6) {
            this.f3026b.a(true);
        } else if (intValue != 7) {
            co.c("Unknown MRAID command called.");
        } else {
            this.f3027c.a();
        }
    }
}
