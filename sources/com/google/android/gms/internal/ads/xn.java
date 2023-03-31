package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* access modifiers changed from: package-private */
public final /* synthetic */ class xn implements zn {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5465a;

    xn(byte[] bArr) {
        this.f5465a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final void a(JsonWriter jsonWriter) {
        wn.a(this.f5465a, jsonWriter);
    }
}
