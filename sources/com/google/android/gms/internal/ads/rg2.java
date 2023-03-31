package com.google.android.gms.internal.ads;

import android.view.Surface;

public final class rg2 {

    /* renamed from: a  reason: collision with root package name */
    private final sk1 f4501a;

    /* renamed from: b  reason: collision with root package name */
    private final sg2 f4502b;

    public rg2(sk1 sk1, sg2 sg2) {
        sk1 sk12;
        if (sg2 != null) {
            mf2.a(sk1);
            sk12 = sk1;
        } else {
            sk12 = null;
        }
        this.f4501a = sk12;
        this.f4502b = sg2;
    }

    public final void a(int i, int i2, int i3, float f) {
        if (this.f4502b != null) {
            this.f4501a.post(new yg2(this, i, i2, i3, f));
        }
    }

    public final void a(int i, long j) {
        if (this.f4502b != null) {
            this.f4501a.post(new vg2(this, i, j));
        }
    }

    public final void a(Surface surface) {
        if (this.f4502b != null) {
            this.f4501a.post(new xg2(this, surface));
        }
    }

    public final void a(e82 e82) {
        if (this.f4502b != null) {
            this.f4501a.post(new wg2(this, e82));
        }
    }

    public final void a(y92 y92) {
        if (this.f4502b != null) {
            this.f4501a.post(new ug2(this, y92));
        }
    }

    public final void a(String str, long j, long j2) {
        if (this.f4502b != null) {
            this.f4501a.post(new tg2(this, str, j, j2));
        }
    }

    public final void b(y92 y92) {
        if (this.f4502b != null) {
            this.f4501a.post(new zg2(this, y92));
        }
    }
}
