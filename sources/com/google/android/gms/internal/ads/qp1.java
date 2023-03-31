package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.c12;
import com.google.android.gms.internal.ads.ou1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class qp1<KeyProtoT extends c12> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyProtoT> f4370a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, sp1<?, KeyProtoT>> f4371b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f4372c;

    @SafeVarargs
    protected qp1(Class<KeyProtoT> cls, sp1<?, KeyProtoT>... sp1Arr) {
        this.f4370a = cls;
        HashMap hashMap = new HashMap();
        for (sp1<?, KeyProtoT> sp1 : sp1Arr) {
            if (hashMap.containsKey(sp1.a())) {
                String valueOf = String.valueOf(sp1.a().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(sp1.a(), sp1);
            }
        }
        this.f4372c = sp1Arr.length > 0 ? sp1Arr[0].a() : Void.class;
        this.f4371b = Collections.unmodifiableMap(hashMap);
    }

    public abstract KeyProtoT a(dy1 dy1);

    public final <P> P a(KeyProtoT keyprotot, Class<P> cls) {
        sp1<?, KeyProtoT> sp1 = this.f4371b.get(cls);
        if (sp1 != null) {
            return (P) sp1.a(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract String a();

    public abstract void a(KeyProtoT keyprotot);

    public final Class<KeyProtoT> b() {
        return this.f4370a;
    }

    public abstract ou1.b c();

    public final Set<Class<?>> d() {
        return this.f4371b.keySet();
    }

    /* access modifiers changed from: package-private */
    public final Class<?> e() {
        return this.f4372c;
    }

    public pp1<?, KeyProtoT> f() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
