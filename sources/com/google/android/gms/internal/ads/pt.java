package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

final class pt implements d5<ws> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ nt f4228a;

    pt(nt ntVar) {
        this.f4228a = ntVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f4228a) {
                        if (this.f4228a.G != parseInt) {
                            this.f4228a.G = parseInt;
                            this.f4228a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    co.c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
