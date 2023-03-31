package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.p;

public final class sg extends xg {

    /* renamed from: b  reason: collision with root package name */
    private final String f4653b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4654c;

    public sg(String str, int i) {
        this.f4653b = str;
        this.f4654c = i;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final int I() {
        return this.f4654c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof sg)) {
            sg sgVar = (sg) obj;
            return p.a(this.f4653b, sgVar.f4653b) && p.a(Integer.valueOf(this.f4654c), Integer.valueOf(sgVar.f4654c));
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final String m() {
        return this.f4653b;
    }
}
