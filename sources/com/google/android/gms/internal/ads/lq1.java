package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

public class lq1 implements aq1<fp1> {

    static class a implements fp1 {

        /* renamed from: a  reason: collision with root package name */
        private final yp1<fp1> f3590a;

        private a(yp1<fp1> yp1) {
            this.f3590a = yp1;
        }

        @Override // com.google.android.gms.internal.ads.fp1
        public final byte[] a(byte[] bArr, byte[] bArr2) {
            return cw1.a(this.f3590a.b().d(), this.f3590a.b().a().a(bArr, bArr2));
        }
    }

    static {
        Logger.getLogger(lq1.class.getName());
    }

    lq1() {
    }

    @Override // com.google.android.gms.internal.ads.aq1
    public final Class<fp1> a() {
        return fp1.class;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.yp1] */
    @Override // com.google.android.gms.internal.ads.aq1
    public final /* synthetic */ fp1 a(yp1<fp1> yp1) {
        return new a(yp1);
    }
}
