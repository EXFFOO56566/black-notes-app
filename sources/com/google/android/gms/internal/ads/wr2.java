package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class wr2 implements b1 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ vr2 f5312a;

    wr2(vr2 vr2) {
        this.f5312a = vr2;
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final Boolean a(String str, boolean z) {
        return Boolean.valueOf(this.f5312a.e.getBoolean(str, z));
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final Double a(String str, double d) {
        return Double.valueOf((double) this.f5312a.e.getFloat(str, (float) d));
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final Long a(String str, long j) {
        try {
            return Long.valueOf(this.f5312a.e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.f5312a.e.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final String a(String str, String str2) {
        return this.f5312a.e.getString(str, str2);
    }
}
