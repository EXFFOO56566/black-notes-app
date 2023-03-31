package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Account f1614a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f1615b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f1616c;
    private final Map<com.google.android.gms.common.api.a<?>, b> d;
    private final View e;
    private final String f;
    private final String g;
    private final b.c.b.a.g.a h;
    private Integer i;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f1617a;

        /* renamed from: b  reason: collision with root package name */
        private a.e.b<Scope> f1618b;

        /* renamed from: c  reason: collision with root package name */
        private Map<com.google.android.gms.common.api.a<?>, b> f1619c;
        private int d = 0;
        private View e;
        private String f;
        private String g;
        private b.c.b.a.g.a h = b.c.b.a.g.a.k;
        private boolean i;

        public final a a(Account account) {
            this.f1617a = account;
            return this;
        }

        public final a a(String str) {
            this.g = str;
            return this;
        }

        public final a a(Collection<Scope> collection) {
            if (this.f1618b == null) {
                this.f1618b = new a.e.b<>();
            }
            this.f1618b.addAll(collection);
            return this;
        }

        public final d a() {
            return new d(this.f1617a, this.f1618b, this.f1619c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final a b(String str) {
            this.f = str;
            return this;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Scope> f1620a;
    }

    public d(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i2, View view, String str, String str2, b.c.b.a.g.a aVar, boolean z) {
        this.f1614a = account;
        this.f1615b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.d = map == null ? Collections.emptyMap() : map;
        this.e = view;
        this.f = str;
        this.g = str2;
        this.h = aVar;
        HashSet hashSet = new HashSet(this.f1615b);
        for (b bVar : this.d.values()) {
            hashSet.addAll(bVar.f1620a);
        }
        this.f1616c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    public final Account a() {
        return this.f1614a;
    }

    public final Set<Scope> a(com.google.android.gms.common.api.a<?> aVar) {
        b bVar = this.d.get(aVar);
        if (bVar == null || bVar.f1620a.isEmpty()) {
            return this.f1615b;
        }
        HashSet hashSet = new HashSet(this.f1615b);
        hashSet.addAll(bVar.f1620a);
        return hashSet;
    }

    public final void a(Integer num) {
        this.i = num;
    }

    @Nullable
    @Deprecated
    public final String b() {
        Account account = this.f1614a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public final Account c() {
        Account account = this.f1614a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public final Set<Scope> d() {
        return this.f1616c;
    }

    @Nullable
    public final Integer e() {
        return this.i;
    }

    @Nullable
    public final String f() {
        return this.g;
    }

    @Nullable
    public final String g() {
        return this.f;
    }

    public final Set<Scope> h() {
        return this.f1615b;
    }

    @Nullable
    public final b.c.b.a.g.a i() {
        return this.h;
    }
}
