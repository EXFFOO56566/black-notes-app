package com.google.android.gms.internal.ads;

public final class e91 implements r42<String> {

    /* renamed from: a  reason: collision with root package name */
    private final b91 f2387a;

    public e91(b91 b91) {
        this.f2387a = b91;
    }

    public static String a(b91 b91) {
        String a2 = b91.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f2387a);
    }
}
