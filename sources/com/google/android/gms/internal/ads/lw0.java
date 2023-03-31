package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class lw0 {

    /* renamed from: a  reason: collision with root package name */
    private final d f3614a;

    /* renamed from: b  reason: collision with root package name */
    private final nw0 f3615b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f3616c = Collections.synchronizedList(new ArrayList());
    private final boolean d;

    public lw0(d dVar, nw0 nw0) {
        this.f3614a = dVar;
        this.f3615b = nw0;
        this.d = ((Boolean) on2.e().a(zr2.C3)).booleanValue();
    }

    /* access modifiers changed from: private */
    public final void a(String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        this.f3616c.add(sb2);
    }

    /* access modifiers changed from: package-private */
    public final <T> lo1<T> a(kd1 kd1, id1 id1, lo1<T> lo1) {
        long b2 = this.f3614a.b();
        String str = id1.t;
        if (str != null) {
            yn1.a(lo1, new ow0(this, str, b2, id1, kd1), jo.f);
        }
        return lo1;
    }

    public final String a() {
        return TextUtils.join("_", this.f3616c);
    }
}
