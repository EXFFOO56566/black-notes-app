package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.it1;
import com.google.android.gms.internal.ads.ju1;
import com.google.android.gms.internal.ads.rs1;
import com.google.android.gms.internal.ads.vs1;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class xr1 implements fw1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f5484a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5485b;

    /* renamed from: c  reason: collision with root package name */
    private it1 f5486c;
    private rs1 d;
    private int e;

    xr1(uu1 uu1) {
        String p = uu1.p();
        this.f5484a = p;
        if (p.equals(iq1.f3126b)) {
            try {
                jt1 a2 = jt1.a(uu1.q(), dz1.a());
                this.f5486c = (it1) bq1.b(uu1);
                this.f5485b = a2.p();
            } catch (b02 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else if (this.f5484a.equals(iq1.f3125a)) {
            try {
                ss1 a3 = ss1.a(uu1.q(), dz1.a());
                this.d = (rs1) bq1.b(uu1);
                this.e = a3.p().p();
                this.f5485b = this.e + a3.q().p();
            } catch (b02 e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(this.f5484a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    @Override // com.google.android.gms.internal.ads.fw1
    public final int a() {
        return this.f5485b;
    }

    @Override // com.google.android.gms.internal.ads.fw1
    public final fp1 a(byte[] bArr) {
        c12 c12;
        if (bArr.length == this.f5485b) {
            if (this.f5484a.equals(iq1.f3126b)) {
                it1.a r = it1.r();
                r.a((rz1) this.f5486c);
                it1.a aVar = r;
                aVar.a(dy1.a(bArr, 0, this.f5485b));
                c12 = (it1) ((rz1) aVar.e());
            } else if (this.f5484a.equals(iq1.f3125a)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.e, this.f5485b);
                vs1.a s = vs1.s();
                s.a((rz1) this.d.q());
                vs1.a aVar2 = s;
                aVar2.a(dy1.a(copyOfRange));
                ju1.a s2 = ju1.s();
                s2.a((rz1) this.d.r());
                ju1.a aVar3 = s2;
                aVar3.a(dy1.a(copyOfRange2));
                rs1.a s3 = rs1.s();
                s3.a(this.d.p());
                s3.a((vs1) ((rz1) aVar2.e()));
                s3.a((ju1) ((rz1) aVar3.e()));
                c12 = (rs1) ((rz1) s3.e());
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            return (fp1) bq1.a(this.f5484a, c12, fp1.class);
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
