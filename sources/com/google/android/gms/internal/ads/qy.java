package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class qy implements ly {

    /* renamed from: a  reason: collision with root package name */
    private final gd1 f4414a;

    public qy(gd1 gd1) {
        this.f4414a = gd1;
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f4414a.a(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
