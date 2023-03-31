package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* access modifiers changed from: package-private */
public final class kg2 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: b  reason: collision with root package name */
    private final int[] f3388b = new int[1];

    /* renamed from: c  reason: collision with root package name */
    private sk1 f3389c;
    private SurfaceTexture d;
    private Error e;
    private RuntimeException f;
    private ig2 g;

    public kg2() {
        super("dummySurface");
    }

    public final ig2 a(boolean z) {
        boolean z2;
        start();
        this.f3389c = new sk1(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f3389c.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.g == null && this.f == null && this.e == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f;
        if (runtimeException == null) {
            Error error = this.e;
            if (error == null) {
                return this.g;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void a() {
        this.f3389c.sendEmptyMessage(3);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                boolean z = message.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                mf2.b(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                mf2.b(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                mf2.b(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                mf2.b(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                mf2.b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                mf2.b(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f3388b, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f3388b[0]);
                this.d = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.g = new ig2(this, this.d, z);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.f = e2;
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                try {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e3);
                    this.e = e3;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i == 2) {
            this.d.updateTexImage();
            return true;
        } else if (i != 3) {
            return true;
        } else {
            try {
                this.d.release();
                this.g = null;
                this.d = null;
                GLES20.glDeleteTextures(1, this.f3388b, 0);
            } catch (Throwable th2) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th2);
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
            }
            quit();
            return true;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f3389c.sendEmptyMessage(2);
    }
}
