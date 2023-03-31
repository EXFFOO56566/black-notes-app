package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dp0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ro f2289b;

    dp0(uo0 uo0, ro roVar) {
        this.f2289b = roVar;
    }

    public final void run() {
        ro roVar = this.f2289b;
        String c2 = q.g().i().i().c();
        if (!TextUtils.isEmpty(c2)) {
            roVar.b(c2);
        } else {
            roVar.a(new Exception());
        }
    }
}
