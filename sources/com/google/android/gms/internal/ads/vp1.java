package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.yu1;
import java.security.GeneralSecurityException;

@Deprecated
public final class vp1 {
    @Deprecated
    public static final rp1 a(byte[] bArr) {
        try {
            yu1 a2 = yu1.a(bArr, dz1.a());
            for (yu1.a aVar : a2.q()) {
                if (aVar.s().r() == ou1.b.UNKNOWN_KEYMATERIAL || aVar.s().r() == ou1.b.SYMMETRIC || aVar.s().r() == ou1.b.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return rp1.a(a2);
        } catch (b02 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
