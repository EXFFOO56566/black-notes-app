package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

/* access modifiers changed from: package-private */
public final class q12 implements a12 {

    /* renamed from: a  reason: collision with root package name */
    private final c12 f4259a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4260b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f4261c;
    private final int d;

    q12(c12 c12, String str, Object[] objArr) {
        this.f4259a = c12;
        this.f4260b = str;
        this.f4261c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a12
    public final int a() {
        return (this.d & 1) == 1 ? rz1.f.i : rz1.f.j;
    }

    @Override // com.google.android.gms.internal.ads.a12
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.a12
    public final c12 c() {
        return this.f4259a;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f4260b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f4261c;
    }
}
