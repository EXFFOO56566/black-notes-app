package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import b.c.b.a.c.b;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class wi1 implements c.a, c.b {

    /* renamed from: a  reason: collision with root package name */
    private final rj1 f5278a;

    /* renamed from: b  reason: collision with root package name */
    private final mj1 f5279b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5280c = new Object();
    private boolean d = false;
    private boolean e = false;

    wi1(Context context, Looper looper, mj1 mj1) {
        this.f5279b = mj1;
        this.f5278a = new rj1(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.f5280c) {
            if (this.f5278a.a() || this.f5278a.f()) {
                this.f5278a.i();
            }
            Binder.flushPendingCommands();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.f5280c) {
            if (!this.d) {
                this.d = true;
                this.f5278a.m();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void a(b bVar) {
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void b(int i) {
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void e(Bundle bundle) {
        synchronized (this.f5280c) {
            if (!this.e) {
                this.e = true;
                try {
                    this.f5278a.A().a(new pj1(this.f5279b.f()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    b();
                    throw th;
                }
                b();
            }
        }
    }
}
