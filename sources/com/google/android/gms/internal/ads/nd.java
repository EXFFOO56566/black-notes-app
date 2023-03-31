package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;

public final class nd {

    /* renamed from: a  reason: collision with root package name */
    private final ws f3829a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3830b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3831c;

    public nd(ws wsVar, Map<String, String> map) {
        this.f3829a = wsVar;
        this.f3831c = map.get("forceOrientation");
        this.f3830b = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean(map.get("allowOrientationChange")) : true;
    }

    public final void a() {
        int i;
        if (this.f3829a == null) {
            co.d("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f3831c)) {
            q.e();
            i = 7;
        } else if ("landscape".equalsIgnoreCase(this.f3831c)) {
            q.e();
            i = 6;
        } else {
            i = this.f3830b ? -1 : q.e().a();
        }
        this.f3829a.setRequestedOrientation(i);
    }
}
