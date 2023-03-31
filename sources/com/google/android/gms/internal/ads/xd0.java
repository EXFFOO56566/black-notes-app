package com.google.android.gms.internal.ads;

public final class xd0 implements r42<vd0> {

    /* renamed from: a  reason: collision with root package name */
    private final vd0 f5412a;

    private xd0(vd0 vd0) {
        this.f5412a = vd0;
    }

    public static xd0 a(vd0 vd0) {
        return new xd0(vd0);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        vd0 vd0 = this.f5412a;
        if (vd0 != null) {
            y42.a(vd0, "Cannot return null from a non-@Nullable @Provides method");
            return vd0;
        }
        throw null;
    }
}
