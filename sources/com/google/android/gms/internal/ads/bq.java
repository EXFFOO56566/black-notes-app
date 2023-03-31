package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
public final class bq {

    /* renamed from: a  reason: collision with root package name */
    private final long f1986a = TimeUnit.MILLISECONDS.toNanos(((Long) on2.e().a(zr2.u)).longValue());

    /* renamed from: b  reason: collision with root package name */
    private long f1987b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1988c = true;

    bq() {
    }

    public final void a() {
        this.f1988c = true;
    }

    public final void a(SurfaceTexture surfaceTexture, op opVar) {
        if (opVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f1988c || Math.abs(timestamp - this.f1987b) >= this.f1986a) {
                this.f1988c = false;
                this.f1987b = timestamp;
                gl.h.post(new aq(this, opVar));
            }
        }
    }
}
