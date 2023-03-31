package com.google.android.material.bottomappbar;

import b.c.b.b.z.f;
import b.c.b.b.z.m;

public class a extends f implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private float f5869b;

    /* renamed from: c  reason: collision with root package name */
    private float f5870c;
    private float d;
    private float e;
    private float f;

    /* access modifiers changed from: package-private */
    public float a() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        this.e = f2;
    }

    @Override // b.c.b.b.z.f
    public void a(float f2, float f3, float f4, m mVar) {
        float f5 = this.d;
        if (f5 == 0.0f) {
            mVar.a(f2, 0.0f);
            return;
        }
        float f6 = ((this.f5870c * 2.0f) + f5) / 2.0f;
        float f7 = f4 * this.f5869b;
        float f8 = f3 + this.f;
        float f9 = (this.e * f4) + ((1.0f - f4) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar.a(f2, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        mVar.a(f12, 0.0f);
        float f15 = f7 * 2.0f;
        mVar.a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - degrees, degrees);
        mVar.a(f2, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void b(float f2) {
        this.f5870c = f2;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f5870c;
    }

    /* access modifiers changed from: package-private */
    public void c(float f2) {
        this.f5869b = f2;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f5869b;
    }

    public void d(float f2) {
        this.d = f2;
    }

    /* access modifiers changed from: package-private */
    public void e(float f2) {
        this.f = f2;
    }

    public float f() {
        return this.d;
    }
}
