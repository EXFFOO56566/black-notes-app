package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class v21 implements y61<Object> {
    private static final Object f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f5040a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5041b;

    /* renamed from: c  reason: collision with root package name */
    private final y30 f5042c;
    private final te1 d;
    private final zd1 e;

    public v21(String str, String str2, y30 y30, te1 te1, zd1 zd1) {
        this.f5040a = str;
        this.f5041b = str2;
        this.f5042c = y30;
        this.d = te1;
        this.e = zd1;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<Object> a() {
        Bundle bundle = new Bundle();
        if (((Boolean) on2.e().a(zr2.z2)).booleanValue()) {
            this.f5042c.a(this.e.d);
            bundle.putAll(this.d.a());
        }
        return yn1.a(new u21(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (!((Boolean) on2.e().a(zr2.z2)).booleanValue()) {
            if (((Boolean) on2.e().a(zr2.y2)).booleanValue()) {
                synchronized (f) {
                    this.f5042c.a(this.e.d);
                    bundle2.putBundle("quality_signals", this.d.a());
                }
                bundle2.putString("seq_num", this.f5040a);
                bundle2.putString("session_id", this.f5041b);
            }
            this.f5042c.a(this.e.d);
            bundle = this.d.a();
        }
        bundle2.putBundle("quality_signals", bundle);
        bundle2.putString("seq_num", this.f5040a);
        bundle2.putString("session_id", this.f5041b);
    }
}
