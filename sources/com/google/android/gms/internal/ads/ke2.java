package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class ke2 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3381a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3382b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3383c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;

    public ke2() {
        this(null, null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    private ke2(String str, String str2, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, int i5, int i6, boolean z5) {
        this.f3381a = true;
        this.f3382b = Integer.MAX_VALUE;
        this.f3383c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = true;
        this.f = true;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ke2.class == obj.getClass()) {
            ke2 ke2 = (ke2) obj;
            return this.f3381a == ke2.f3381a && this.f3382b == ke2.f3382b && this.f3383c == ke2.f3383c && this.e == ke2.e && this.f == ke2.f && this.i == ke2.i && this.g == ke2.g && this.h == ke2.h && this.d == ke2.d && TextUtils.equals(null, null) && TextUtils.equals(null, null);
        }
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.f3381a ? 1 : 0)) * 31) + this.f3382b) * 31) + this.f3383c) * 31) + this.d) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + this.g) * 31) + this.h;
    }
}
