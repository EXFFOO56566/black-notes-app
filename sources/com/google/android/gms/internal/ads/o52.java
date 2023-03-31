package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* access modifiers changed from: package-private */
public final class o52 {

    /* renamed from: a  reason: collision with root package name */
    static mp1 f3950a;

    static boolean a(l52 l52) {
        Method a2;
        if (f3950a != null) {
            return true;
        }
        String str = (String) on2.e().a(zr2.e1);
        if (str == null || str.length() == 0) {
            str = (l52 == null || (a2 = l52.a("M2qSAa8M0FWknYOLhqt+/Fg7hndA+iGyFQHluQ13JM7VYcVOxfDpnSG4HdwfsR6f", "z17NkROhoKeGkbS2tgYHIJsoqSFhSwk9HYPzNbT9RcI=")) == null) ? null : (String) a2.invoke(null, new Object[0]);
            if (str == null) {
                return false;
            }
        }
        try {
            rp1 a3 = vp1.a(xq0.a(str, true));
            for (vu1 vu1 : qr1.f4379a.p()) {
                if (vu1.p().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                } else if (vu1.q().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                } else if (vu1.t().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                } else if (!vu1.t().equals("TinkAead") && !vu1.t().equals("TinkMac") && !vu1.t().equals("TinkHybridDecrypt") && !vu1.t().equals("TinkHybridEncrypt") && !vu1.t().equals("TinkPublicKeySign") && !vu1.t().equals("TinkPublicKeyVerify") && !vu1.t().equals("TinkStreamingAead") && !vu1.t().equals("TinkDeterministicAead")) {
                    ip1<?> b2 = bq1.b(vu1.t());
                    bq1.a((aq1) b2.a());
                    bq1.a(b2.a(vu1.p(), vu1.q(), vu1.r()), vu1.s());
                }
            }
            mp1 a4 = ur1.a(a3, null);
            f3950a = a4;
            return a4 != null;
        } catch (IllegalArgumentException unused) {
        }
    }
}
