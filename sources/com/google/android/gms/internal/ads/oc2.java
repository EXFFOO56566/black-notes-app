package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* access modifiers changed from: package-private */
public final class oc2 implements lc2 {
    private oc2() {
    }

    @Override // com.google.android.gms.internal.ads.lc2
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.lc2
    public final MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.lc2
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // com.google.android.gms.internal.ads.lc2
    public final boolean b() {
        return false;
    }
}
