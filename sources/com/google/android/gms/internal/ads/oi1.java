package com.google.android.gms.internal.ads;

final class oi1 extends ni1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4000a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4001b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4002c;

    private oi1(String str, boolean z, boolean z2) {
        this.f4000a = str;
        this.f4001b = z;
        this.f4002c = z2;
    }

    @Override // com.google.android.gms.internal.ads.ni1
    public final String a() {
        return this.f4000a;
    }

    @Override // com.google.android.gms.internal.ads.ni1
    public final boolean b() {
        return this.f4001b;
    }

    @Override // com.google.android.gms.internal.ads.ni1
    public final boolean c() {
        return this.f4002c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ni1) {
            ni1 ni1 = (ni1) obj;
            return this.f4000a.equals(ni1.a()) && this.f4001b == ni1.b() && this.f4002c == ni1.c();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.f4000a.hashCode() ^ 1000003) * 1000003) ^ (this.f4001b ? 1231 : 1237)) * 1000003;
        if (!this.f4002c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f4000a;
        boolean z = this.f4001b;
        boolean z2 = this.f4002c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
