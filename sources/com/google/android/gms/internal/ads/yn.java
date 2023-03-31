package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class yn implements zn {

    /* renamed from: a  reason: collision with root package name */
    private final int f5616a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f5617b;

    yn(int i, Map map) {
        this.f5616a = i;
        this.f5617b = map;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final void a(JsonWriter jsonWriter) {
        wn.a(this.f5616a, this.f5617b, jsonWriter);
    }
}
