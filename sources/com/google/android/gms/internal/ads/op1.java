package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.c12;
import com.google.android.gms.internal.ads.ou1;
import java.security.GeneralSecurityException;

public class op1<PrimitiveT, KeyProtoT extends c12> implements lp1<PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    private final qp1<KeyProtoT> f4030a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<PrimitiveT> f4031b;

    public op1(qp1<KeyProtoT> qp1, Class<PrimitiveT> cls) {
        if (qp1.d().contains(cls) || Void.class.equals(cls)) {
            this.f4030a = qp1;
            this.f4031b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", qp1.toString(), cls.getName()));
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: java.lang.Class<PrimitiveT>, java.lang.Class<P> */
    private final PrimitiveT b(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.f4031b)) {
            this.f4030a.a(keyprotot);
            return (PrimitiveT) this.f4030a.a(keyprotot, (Class<PrimitiveT>) this.f4031b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    private final np1<?, KeyProtoT> c() {
        return new np1<>(this.f4030a.f());
    }

    @Override // com.google.android.gms.internal.ads.lp1
    public final ou1 a(dy1 dy1) {
        try {
            KeyProtoT a2 = c().a(dy1);
            ou1.a s = ou1.s();
            s.a(this.f4030a.a());
            s.a(a2.d());
            s.a(this.f4030a.c());
            return (ou1) ((rz1) s.e());
        } catch (b02 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.lp1
    public final Class<PrimitiveT> a() {
        return this.f4031b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.internal.ads.c12 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.lp1
    public final PrimitiveT a(c12 c12) {
        String valueOf = String.valueOf(this.f4030a.b().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.f4030a.b().isInstance(c12)) {
            return b(c12);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.ads.lp1
    public final c12 b(dy1 dy1) {
        try {
            return c().a(dy1);
        } catch (b02 e) {
            String valueOf = String.valueOf(this.f4030a.f().a().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.lp1
    public final String b() {
        return this.f4030a.a();
    }

    @Override // com.google.android.gms.internal.ads.lp1
    public final PrimitiveT c(dy1 dy1) {
        try {
            return b(this.f4030a.a(dy1));
        } catch (b02 e) {
            String valueOf = String.valueOf(this.f4030a.b().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }
}
