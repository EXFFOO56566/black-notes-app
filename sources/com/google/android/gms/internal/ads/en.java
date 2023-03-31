package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

public final class en extends sk {

    /* renamed from: c  reason: collision with root package name */
    private final io f2451c;
    private final String d;

    public en(Context context, String str, String str2) {
        this(str2, q.c().a(context, str));
    }

    private en(String str, String str2) {
        this.f2451c = new io(str2);
        this.d = str;
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void a() {
        this.f2451c.a(this.d);
    }
}
