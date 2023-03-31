package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;

/* access modifiers changed from: package-private */
public final class pz1 implements z02 {

    /* renamed from: a  reason: collision with root package name */
    private static final pz1 f4252a = new pz1();

    private pz1() {
    }

    public static pz1 a() {
        return f4252a;
    }

    @Override // com.google.android.gms.internal.ads.z02
    public final a12 a(Class<?> cls) {
        if (!rz1.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (a12) rz1.a(cls.asSubclass(rz1.class)).a(rz1.f.f4579c, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.z02
    public final boolean b(Class<?> cls) {
        return rz1.class.isAssignableFrom(cls);
    }
}
