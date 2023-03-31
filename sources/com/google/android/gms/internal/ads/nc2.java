package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* access modifiers changed from: package-private */
@TargetApi(21)
public final class nc2 implements lc2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f3827a;

    /* renamed from: b  reason: collision with root package name */
    private MediaCodecInfo[] f3828b;

    public nc2(boolean z) {
        this.f3827a = z ? 1 : 0;
    }

    private final void c() {
        if (this.f3828b == null) {
            this.f3828b = new MediaCodecList(this.f3827a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.lc2
    public final int a() {
        c();
        return this.f3828b.length;
    }

    @Override // com.google.android.gms.internal.ads.lc2
    public final MediaCodecInfo a(int i) {
        c();
        return this.f3828b[i];
    }

    @Override // com.google.android.gms.internal.ads.lc2
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.google.android.gms.internal.ads.lc2
    public final boolean b() {
        return true;
    }
}
