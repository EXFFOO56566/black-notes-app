package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.fj1;
import com.google.android.gms.internal.ads.mj1;

public final class xi1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5433a;

    /* renamed from: b  reason: collision with root package name */
    private final Looper f5434b;

    public xi1(Context context, Looper looper) {
        this.f5433a = context;
        this.f5434b = looper;
    }

    public final void a(String str) {
        mj1.b p = mj1.p();
        p.a(this.f5433a.getPackageName());
        p.a(mj1.a.BLOCKED_IMPRESSION);
        fj1.b p2 = fj1.p();
        p2.a(str);
        p2.a(fj1.a.BLOCKED_REASON_BACKGROUND);
        p.a(p2);
        new wi1(this.f5433a, this.f5434b, (mj1) ((rz1) p.e())).a();
    }
}
