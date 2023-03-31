package com.google.android.gms.internal.ads;

import java.io.Closeable;

public class kr extends b42 implements Closeable {
    static {
        j42.a(kr.class);
    }

    public kr(d42 d42, ls lsVar) {
        a(d42, d42.size(), lsVar);
    }

    @Override // com.google.android.gms.internal.ads.b42, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1861c.close();
    }

    @Override // com.google.android.gms.internal.ads.b42
    public String toString() {
        String obj = this.f1861c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
