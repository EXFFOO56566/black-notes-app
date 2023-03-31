package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.e;
import java.util.Date;
import java.util.Set;

public final class lb implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Date f3521a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3522b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f3523c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final boolean g;

    public lb(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f3521a = date;
        this.f3522b = i;
        this.f3523c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = z2;
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final boolean a() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final Date c() {
        return this.f3521a;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final boolean d() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final Set<String> e() {
        return this.f3523c;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final int h() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final Location k() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final int m() {
        return this.f3522b;
    }
}
