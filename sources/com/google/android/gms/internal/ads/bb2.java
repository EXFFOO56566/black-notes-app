package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class bb2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f1915a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1916b;

    public bb2(String str, String str2) {
        this.f1915a = str;
        this.f1916b = str2;
    }

    public final String a() {
        return this.f1915a;
    }

    public final String b() {
        return this.f1916b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bb2.class == obj.getClass()) {
            bb2 bb2 = (bb2) obj;
            return TextUtils.equals(this.f1915a, bb2.f1915a) && TextUtils.equals(this.f1916b, bb2.f1916b);
        }
    }

    public final int hashCode() {
        return (this.f1915a.hashCode() * 31) + this.f1916b.hashCode();
    }

    public final String toString() {
        String str = this.f1915a;
        String str2 = this.f1916b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
