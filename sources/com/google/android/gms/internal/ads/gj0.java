package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final class gj0 implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final c3 f2770a;

    /* renamed from: b  reason: collision with root package name */
    private final jj0 f2771b;

    /* renamed from: c  reason: collision with root package name */
    private final l42<dj0> f2772c;

    public gj0(rf0 rf0, if0 if0, jj0 jj0, l42<dj0> l42) {
        this.f2770a = rf0.b(if0.e());
        this.f2771b = jj0;
        this.f2772c = l42;
    }

    public final void a() {
        if (this.f2770a != null) {
            this.f2771b.a("/nativeAdCustomClick", this);
        }
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f2770a.a(this.f2772c.get(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            co.c(sb.toString(), e);
        }
    }
}
