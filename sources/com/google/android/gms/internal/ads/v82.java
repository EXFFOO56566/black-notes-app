package com.google.android.gms.internal.ads;

public final class v82 {

    /* renamed from: a  reason: collision with root package name */
    private final sk1 f5065a;

    /* renamed from: b  reason: collision with root package name */
    private final w82 f5066b;

    public v82(sk1 sk1, w82 w82) {
        sk1 sk12;
        if (w82 != null) {
            mf2.a(sk1);
            sk12 = sk1;
        } else {
            sk12 = null;
        }
        this.f5065a = sk12;
        this.f5066b = w82;
    }

    public final void a(int i) {
        if (this.f5066b != null) {
            this.f5065a.post(new c92(this, i));
        }
    }

    public final void a(int i, long j, long j2) {
        if (this.f5066b != null) {
            this.f5065a.post(new a92(this, i, j, j2));
        }
    }

    public final void a(e82 e82) {
        if (this.f5066b != null) {
            this.f5065a.post(new b92(this, e82));
        }
    }

    public final void a(y92 y92) {
        if (this.f5066b != null) {
            this.f5065a.post(new y82(this, y92));
        }
    }

    public final void a(String str, long j, long j2) {
        if (this.f5066b != null) {
            this.f5065a.post(new x82(this, str, j, j2));
        }
    }

    public final void b(y92 y92) {
        if (this.f5066b != null) {
            this.f5065a.post(new d92(this, y92));
        }
    }
}
