package com.google.android.gms.internal.ads;

public final class ym0 implements r42<fn0> {
    public static ym0 a() {
        return bn0.a();
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        fn0 fn0 = new fn0(yj2.REQUEST_WILL_PROCESS_RESPONSE, yj2.REQUEST_DID_PROCESS_RESPONSE, yj2.REQUEST_FAILED_TO_PROCESS_RESPONSE);
        y42.a(fn0, "Cannot return null from a non-@Nullable @Provides method");
        return fn0;
    }
}
