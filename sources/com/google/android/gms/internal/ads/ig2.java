package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
public final class ig2 extends Surface {
    private static boolean d;
    private static boolean e;

    /* renamed from: b  reason: collision with root package name */
    private final kg2 f3083b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3084c;

    private ig2(kg2 kg2, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f3083b = kg2;
    }

    public static ig2 a(Context context, boolean z) {
        if (ag2.f1751a >= 17) {
            mf2.b(!z || a(context));
            return new kg2().a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (ig2.class) {
            if (!e) {
                if (ag2.f1751a >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(ag2.f1751a == 24 && (ag2.d.startsWith("SM-G950") || ag2.d.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    d = z2;
                }
                e = true;
            }
            z = d;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.f3083b) {
            if (!this.f3084c) {
                this.f3083b.a();
                this.f3084c = true;
            }
        }
    }
}
