package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.b;

public class nn2 extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3872a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private b f3873b;

    @Override // com.google.android.gms.ads.b
    public void a() {
        synchronized (this.f3872a) {
            if (this.f3873b != null) {
                this.f3873b.a();
            }
        }
    }

    @Override // com.google.android.gms.ads.b
    public void a(int i) {
        synchronized (this.f3872a) {
            if (this.f3873b != null) {
                this.f3873b.a(i);
            }
        }
    }

    public final void a(b bVar) {
        synchronized (this.f3872a) {
            this.f3873b = bVar;
        }
    }

    @Override // com.google.android.gms.ads.b
    public void c() {
        synchronized (this.f3872a) {
            if (this.f3873b != null) {
                this.f3873b.c();
            }
        }
    }

    @Override // com.google.android.gms.ads.b
    public void d() {
        synchronized (this.f3872a) {
            if (this.f3873b != null) {
                this.f3873b.d();
            }
        }
    }

    @Override // com.google.android.gms.ads.b
    public void e() {
        synchronized (this.f3872a) {
            if (this.f3873b != null) {
                this.f3873b.e();
            }
        }
    }
}
