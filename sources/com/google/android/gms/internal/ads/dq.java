package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

final class dq implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final SensorManager f2291a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f2292b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Display f2293c;
    private final float[] d = new float[9];
    private final float[] e = new float[9];
    @GuardedBy("sensorThreadLock")
    private float[] f;
    private Handler g;
    private fq h;

    dq(Context context) {
        this.f2291a = (SensorManager) context.getSystemService("sensor");
        this.f2293c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void a(int i, int i2) {
        float[] fArr = this.e;
        float f2 = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.g == null) {
            Sensor defaultSensor = this.f2291a.getDefaultSensor(11);
            if (defaultSensor == null) {
                co.b("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            sk1 sk1 = new sk1(handlerThread.getLooper());
            this.g = sk1;
            if (!this.f2291a.registerListener(this, defaultSensor, 0, sk1)) {
                co.b("SensorManager.registerListener failed.");
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(fq fqVar) {
        this.h = fqVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(float[] fArr) {
        synchronized (this.f2292b) {
            if (this.f == null) {
                return false;
            }
            System.arraycopy(this.f, 0, fArr, 0, this.f.length);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.g != null) {
            this.f2291a.unregisterListener(this);
            this.g.post(new cq(this));
            this.g = null;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f2292b) {
                if (this.f == null) {
                    this.f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.d, fArr);
            int rotation = this.f2293c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
            } else if (rotation != 3) {
                System.arraycopy(this.d, 0, this.e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
            }
            a(1, 3);
            a(2, 6);
            a(5, 7);
            synchronized (this.f2292b) {
                System.arraycopy(this.e, 0, this.f, 0, 9);
            }
            fq fqVar = this.h;
            if (fqVar != null) {
                fqVar.a();
            }
        }
    }
}
