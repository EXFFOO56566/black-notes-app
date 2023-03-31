package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

class js1 implements aq1<wp1> {

    static class a implements wp1 {

        /* renamed from: a  reason: collision with root package name */
        private final yp1<wp1> f3274a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f3275b;

        private a(yp1<wp1> yp1) {
            this.f3275b = new byte[]{0};
            this.f3274a = yp1;
        }

        @Override // com.google.android.gms.internal.ads.wp1
        public final byte[] a(byte[] bArr) {
            if (this.f3274a.b().c().equals(lv1.LEGACY)) {
                return cw1.a(this.f3274a.b().d(), this.f3274a.b().a().a(cw1.a(bArr, this.f3275b)));
            }
            return cw1.a(this.f3274a.b().d(), this.f3274a.b().a().a(bArr));
        }
    }

    static {
        Logger.getLogger(js1.class.getName());
    }

    js1() {
    }

    @Override // com.google.android.gms.internal.ads.aq1
    public final Class<wp1> a() {
        return wp1.class;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.yp1] */
    @Override // com.google.android.gms.internal.ads.aq1
    public final /* synthetic */ wp1 a(yp1<wp1> yp1) {
        return new a(yp1);
    }
}
