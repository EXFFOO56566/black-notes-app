package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

public class fl extends gh2<String> {
    private final Object o = new Object();
    private c0<String> p;

    public fl(int i, String str, c0<String> c0Var, gq2 gq2) {
        super(i, str, gq2);
        this.p = c0Var;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gh2
    public final ar2<String> a(ef2 ef2) {
        String str;
        try {
            byte[] bArr = ef2.f2418b;
            String str2 = "ISO-8859-1";
            String str3 = ef2.f2419c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(ef2.f2418b);
        }
        return ar2.a(str, qg.a(ef2));
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        c0<String> c0Var;
        synchronized (this.o) {
            c0Var = this.p;
        }
        if (c0Var != null) {
            c0Var.a(str);
        }
    }
}
