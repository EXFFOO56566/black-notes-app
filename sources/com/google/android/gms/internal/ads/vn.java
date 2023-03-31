package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class vn implements zn {

    /* renamed from: a  reason: collision with root package name */
    private final String f5135a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5136b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f5137c;
    private final byte[] d;

    vn(String str, String str2, Map map, byte[] bArr) {
        this.f5135a = str;
        this.f5136b = str2;
        this.f5137c = map;
        this.d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final void a(JsonWriter jsonWriter) {
        wn.a(this.f5135a, this.f5136b, this.f5137c, this.d, jsonWriter);
    }
}
