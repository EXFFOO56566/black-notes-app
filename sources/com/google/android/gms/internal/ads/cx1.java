package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

public final class cx1 implements wp1 {

    /* renamed from: a  reason: collision with root package name */
    private final Mac f2179a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2180b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2181c;
    private final Key d;

    public cx1(String str, Key key, int i) {
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        } else if (key.getEncoded().length >= 16) {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c2 = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c2 = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c2 = 0;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        String valueOf = String.valueOf(str);
                        throw new NoSuchAlgorithmException(valueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(valueOf) : new String("unknown Hmac algorithm: "));
                    } else if (i > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                } else if (i > 32) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
            } else if (i > 20) {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
            this.f2181c = str;
            this.f2180b = i;
            this.d = key;
            Mac a2 = tw1.g.a(str);
            this.f2179a = a2;
            a2.init(key);
        } else {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.wp1
    public final byte[] a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.f2179a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = tw1.g.a(this.f2181c);
            mac.init(this.d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f2180b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f2180b);
        return bArr2;
    }
}
