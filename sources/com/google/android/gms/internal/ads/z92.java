package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

public final class z92 {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f5721a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f5722b;

    private z92(MediaCodec.CryptoInfo cryptoInfo) {
        this.f5721a = cryptoInfo;
        this.f5722b = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* access modifiers changed from: public */
    private final void a(int i, int i2) {
        this.f5722b.set(i, i2);
        this.f5721a.setPattern(this.f5722b);
    }
}
