package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class vr1 {
    public static ow1 a(eu1 eu1) {
        int i = yr1.f5644b[eu1.ordinal()];
        if (i == 1) {
            return ow1.NIST_P256;
        }
        if (i == 2) {
            return ow1.NIST_P384;
        }
        if (i == 3) {
            return ow1.NIST_P521;
        }
        String valueOf = String.valueOf(eu1);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static rw1 a(qt1 qt1) {
        int i = yr1.f5645c[qt1.ordinal()];
        if (i == 1) {
            return rw1.UNCOMPRESSED;
        }
        if (i == 2) {
            return rw1.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i == 3) {
            return rw1.COMPRESSED;
        }
        String valueOf = String.valueOf(qt1);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static String a(gu1 gu1) {
        int i = yr1.f5643a[gu1.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(gu1);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static void a(wt1 wt1) {
        mw1.a(a(wt1.p().p()));
        a(wt1.p().q());
        if (wt1.r() != qt1.UNKNOWN_FORMAT) {
            bq1.a(wt1.q().p());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
