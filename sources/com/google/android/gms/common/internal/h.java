package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.c;
import java.util.Collections;
import java.util.Set;

public abstract class h<T extends IInterface> extends c<T> implements a.f {
    private final d w;
    private final Set<Scope> x;
    private final Account y;

    @Deprecated
    protected h(Context context, Looper looper, int i, d dVar, f.a aVar, f.b bVar) {
        this(context, looper, i, dVar, (e) aVar, (k) bVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected h(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.d r13, com.google.android.gms.common.api.internal.e r14, com.google.android.gms.common.api.internal.k r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.i.a(r10)
            b.c.b.a.c.e r4 = b.c.b.a.c.e.a()
            com.google.android.gms.common.internal.r.a(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.e r7 = (com.google.android.gms.common.api.internal.e) r7
            com.google.android.gms.common.internal.r.a(r15)
            r8 = r15
            com.google.android.gms.common.api.internal.k r8 = (com.google.android.gms.common.api.internal.k) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.h.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.e, com.google.android.gms.common.api.internal.k):void");
    }

    protected h(Context context, Looper looper, i iVar, b.c.b.a.c.e eVar, int i, d dVar, e eVar2, k kVar) {
        super(context, looper, iVar, eVar, i, a(eVar2), a(kVar), dVar.f());
        this.w = dVar;
        this.y = dVar.a();
        Set<Scope> d = dVar.d();
        b(d);
        this.x = d;
    }

    private static c.a a(e eVar) {
        if (eVar == null) {
            return null;
        }
        return new y(eVar);
    }

    private static c.b a(k kVar) {
        if (kVar == null) {
            return null;
        }
        return new z(kVar);
    }

    private final Set<Scope> b(Set<Scope> set) {
        a(set);
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    public final d A() {
        return this.w;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> a(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> b() {
        return k() ? this.x : Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public int e() {
        return super.e();
    }

    @Override // com.google.android.gms.common.internal.c
    public final Account p() {
        return this.y;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final Set<Scope> v() {
        return this.x;
    }
}
