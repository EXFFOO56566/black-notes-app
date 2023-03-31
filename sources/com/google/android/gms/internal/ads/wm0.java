package com.google.android.gms.internal.ads;

public final class wm0 implements r42<fn0> {
    public static wm0 a() {
        return zm0.a();
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        fn0 fn0 = new fn0(yj2.REQUEST_WILL_MAKE_NETWORK_REQUEST, yj2.REQUEST_DID_RECEIVE_NETWORK_RESPONSE, yj2.REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST);
        y42.a(fn0, "Cannot return null from a non-@Nullable @Provides method");
        return fn0;
    }
}
