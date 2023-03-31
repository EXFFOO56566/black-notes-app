package com.google.android.gms.internal.ads;

final class hp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2955b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f2956c;
    private final /* synthetic */ dp d;

    hp(dp dpVar, String str, String str2) {
        this.d = dpVar;
        this.f2955b = str;
        this.f2956c = str2;
    }

    public final void run() {
        if (dp.a(this.d) != null) {
            dp.a(this.d).a(this.f2955b, this.f2956c);
        }
    }
}
