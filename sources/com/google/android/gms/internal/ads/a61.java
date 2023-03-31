package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a61 implements jn1 {

    /* renamed from: a  reason: collision with root package name */
    private final y51 f1705a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1706b;

    /* renamed from: c  reason: collision with root package name */
    private final List f1707c;
    private final Bundle d;

    a61(y51 y51, String str, List list, Bundle bundle) {
        this.f1705a = y51;
        this.f1706b = str;
        this.f1707c = list;
        this.d = bundle;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final lo1 a() {
        return this.f1705a.a(this.f1706b, this.f1707c, this.d);
    }
}
