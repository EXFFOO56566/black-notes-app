package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

public final class x92 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f5392a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f5393b;

    /* renamed from: c  reason: collision with root package name */
    private int f5394c;
    public int[] d;
    public int[] e;
    private int f;
    private final MediaCodec.CryptoInfo g;
    private final z92 h;

    public x92() {
        z92 z92 = null;
        MediaCodec.CryptoInfo cryptoInfo = ag2.f1751a >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.g = cryptoInfo;
        this.h = ag2.f1751a >= 24 ? new z92(cryptoInfo) : z92;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo a() {
        return this.g;
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.f5393b = bArr;
        this.f5392a = bArr2;
        this.f5394c = i2;
        int i3 = ag2.f1751a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.g;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i2;
            if (i3 >= 24) {
                z92.a(this.h, 0, 0);
            }
        }
    }
}
