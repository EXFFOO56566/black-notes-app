package com.google.android.gms.internal.ads;

import android.net.Uri;

final class ed2 implements lf2 {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f2404a;

    /* renamed from: b  reason: collision with root package name */
    private final ye2 f2405b;

    /* renamed from: c  reason: collision with root package name */
    private final hd2 f2406c;
    private final of2 d;
    private final ta2 e = new ta2();
    private volatile boolean f;
    private boolean g = true;
    private long h;
    private long i = -1;
    private final /* synthetic */ ad2 j;

    public ed2(ad2 ad2, Uri uri, ye2 ye2, hd2 hd2, of2 of2) {
        this.j = ad2;
        mf2.a(uri);
        this.f2404a = uri;
        mf2.a(ye2);
        this.f2405b = ye2;
        mf2.a(hd2);
        this.f2406c = hd2;
        this.d = of2;
    }

    public final void a(long j2, long j3) {
        this.e.f4776a = j2;
        this.h = j3;
        this.g = true;
    }

    @Override // com.google.android.gms.internal.ads.lf2
    public final boolean a() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.lf2
    public final void b() {
        this.f = true;
    }

    @Override // com.google.android.gms.internal.ads.lf2
    public final void c() {
        Throwable th;
        int i2 = 0;
        while (i2 == 0 && !this.f) {
            ka2 ka2 = null;
            try {
                long j2 = this.e.f4776a;
                long a2 = this.f2405b.a(new ze2(this.f2404a, j2, -1, ad2.f(this.j)));
                this.i = a2;
                if (a2 != -1) {
                    this.i = a2 + j2;
                }
                ka2 ka22 = new ka2(this.f2405b, j2, this.i);
                try {
                    na2 a3 = this.f2406c.a(ka22, this.f2405b.l0());
                    if (this.g) {
                        a3.a(j2, this.h);
                        this.g = false;
                    }
                    while (i2 == 0 && !this.f) {
                        this.d.a();
                        i2 = a3.a(ka22, this.e);
                        if (ka22.c() > ad2.g(this.j) + j2) {
                            j2 = ka22.c();
                            this.d.c();
                            ad2.i(this.j).post(ad2.h(this.j));
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else {
                        this.e.f4776a = ka22.c();
                    }
                    ag2.a(this.f2405b);
                } catch (Throwable th2) {
                    th = th2;
                    ka2 = ka22;
                    this.e.f4776a = ka2.c();
                    ag2.a(this.f2405b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (!(i2 == 1 || ka2 == null)) {
                    this.e.f4776a = ka2.c();
                }
                ag2.a(this.f2405b);
                throw th;
            }
        }
    }
}
