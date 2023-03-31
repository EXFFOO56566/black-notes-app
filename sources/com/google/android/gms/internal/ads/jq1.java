package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.yu1;
import com.google.android.gms.internal.ads.zu1;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

final class jq1 {
    static {
        Charset.forName("UTF-8");
    }

    public static zu1 a(yu1 yu1) {
        zu1.a p = zu1.p();
        p.a(yu1.p());
        for (yu1.a aVar : yu1.q()) {
            zu1.b.a p2 = zu1.b.p();
            p2.a(aVar.s().p());
            p2.a(aVar.p());
            p2.a(aVar.q());
            p2.a(aVar.t());
            p.a((zu1.b) ((rz1) p2.e()));
        }
        return (zu1) ((rz1) p.e());
    }

    public static void b(yu1 yu1) {
        int p = yu1.p();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (yu1.a aVar : yu1.q()) {
            if (aVar.p() == su1.ENABLED) {
                if (!aVar.r()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(aVar.t())));
                } else if (aVar.q() == lv1.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(aVar.t())));
                } else if (aVar.p() != su1.UNKNOWN_STATUS) {
                    if (aVar.t() == p) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (aVar.s().r() != ou1.b.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(aVar.t())));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
