package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.g;
import b.c.b.a.c.h;
import com.google.android.gms.ads.t.a;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final class xk extends sk {

    /* renamed from: c  reason: collision with root package name */
    private Context f5436c;

    xk(Context context) {
        this.f5436c = context;
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void a() {
        boolean z;
        try {
            z = a.b(this.f5436c);
        } catch (g | h | IOException | IllegalStateException e) {
            co.b("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        wn.a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        co.d(sb.toString());
    }
}
