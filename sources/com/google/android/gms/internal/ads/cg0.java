package com.google.android.gms.internal.ads;

public final class cg0 implements r42<if0> {

    /* renamed from: a  reason: collision with root package name */
    private final wf0 f2113a;

    private cg0(wf0 wf0) {
        this.f2113a = wf0;
    }

    public static cg0 a(wf0 wf0) {
        return new cg0(wf0);
    }

    public static if0 b(wf0 wf0) {
        if0 a2 = wf0.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b(this.f2113a);
    }
}
