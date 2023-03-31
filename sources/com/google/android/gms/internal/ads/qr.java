package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class qr extends jq {

    /* renamed from: c  reason: collision with root package name */
    static final qr f4377c = new qr();

    qr() {
    }

    @Override // com.google.android.gms.internal.ads.jq
    public final mt a(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new lv() : "mvhd".equals(str) ? new oy() : new nx(str);
    }
}
