package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

final class wu implements d5<ws> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ uu f5315a;

    wu(uu uuVar) {
        this.f5315a = uuVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f5315a) {
                        if (uu.a(this.f5315a) != parseInt) {
                            uu.a(this.f5315a, parseInt);
                            this.f5315a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    co.c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
