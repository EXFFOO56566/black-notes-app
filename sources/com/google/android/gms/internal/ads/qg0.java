package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class qg0 implements d5 {

    /* renamed from: a  reason: collision with root package name */
    private final pg0 f4326a;

    qg0(pg0 pg0) {
        this.f4326a = pg0;
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map map) {
        ws wsVar = (ws) obj;
        wsVar.P().a(new vg0(this.f4326a, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            wsVar.loadData(str, "text/html", "UTF-8");
        } else {
            wsVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
