package com.google.android.gms.internal.ads;

public final class rm0 implements r42<fn0> {
    public static rm0 a() {
        return vm0.a();
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        fn0 fn0 = new fn0(yj2.REQUEST_WILL_BUILD_URL, yj2.REQUEST_DID_BUILD_URL, yj2.REQUEST_FAILED_TO_BUILD_URL);
        y42.a(fn0, "Cannot return null from a non-@Nullable @Provides method");
        return fn0;
    }
}
