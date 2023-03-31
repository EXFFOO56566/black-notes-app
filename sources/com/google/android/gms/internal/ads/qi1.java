package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;

/* access modifiers changed from: package-private */
public final class qi1 extends mi1 {

    /* renamed from: a  reason: collision with root package name */
    private String f4339a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f4340b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f4341c;

    qi1() {
    }

    @Override // com.google.android.gms.internal.ads.mi1
    public final mi1 a(String str) {
        if (str != null) {
            this.f4339a = str;
            return this;
        }
        throw new NullPointerException("Null clientVersion");
    }

    @Override // com.google.android.gms.internal.ads.mi1
    public final mi1 a(boolean z) {
        this.f4340b = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mi1
    public final ni1 a() {
        String str = this.f4339a;
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str2 = str2.concat(" clientVersion");
        }
        if (this.f4340b == null) {
            str2 = String.valueOf(str2).concat(" shouldGetAdvertisingId");
        }
        if (this.f4341c == null) {
            str2 = String.valueOf(str2).concat(" isGooglePlayServicesAvailable");
        }
        if (str2.isEmpty()) {
            return new oi1(this.f4339a, this.f4340b.booleanValue(), this.f4341c.booleanValue());
        }
        String valueOf = String.valueOf(str2);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    @Override // com.google.android.gms.internal.ads.mi1
    public final mi1 b(boolean z) {
        this.f4341c = true;
        return this;
    }
}
