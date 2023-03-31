package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ao implements zn {

    /* renamed from: a  reason: collision with root package name */
    private final String f1792a;

    ao(String str) {
        this.f1792a = str;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final void a(JsonWriter jsonWriter) {
        wn.a(this.f1792a, jsonWriter);
    }
}
