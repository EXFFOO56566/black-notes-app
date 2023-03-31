package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* access modifiers changed from: package-private */
@TargetApi(23)
public final class ng2 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ mg2 f3843a;

    private ng2(mg2 mg2, MediaCodec mediaCodec) {
        this.f3843a = mg2;
        mediaCodec.setOnFrameRenderedListener(this, new sk1());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        mg2 mg2 = this.f3843a;
        if (this == mg2.y0) {
            mg2.o();
        }
    }
}
