package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.r;
import java.util.Collections;

public class e<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1536a;

    /* renamed from: b  reason: collision with root package name */
    private final a<O> f1537b;

    /* renamed from: c  reason: collision with root package name */
    private final O f1538c;
    private final b<O> d;
    private final Looper e;
    private final int f;
    private final f g;
    protected final f h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f1539a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f1540b;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        public static class C0072a {

            /* renamed from: a  reason: collision with root package name */
            private n f1541a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f1542b;

            public C0072a a(n nVar) {
                r.a(nVar, "StatusExceptionMapper must not be null.");
                this.f1541a = nVar;
                return this;
            }

            public a a() {
                if (this.f1541a == null) {
                    this.f1541a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.f1542b == null) {
                    this.f1542b = Looper.getMainLooper();
                }
                return new a(this.f1541a, this.f1542b);
            }
        }

        static {
            new C0072a().a();
        }

        private a(n nVar, Account account, Looper looper) {
            this.f1539a = nVar;
            this.f1540b = looper;
        }
    }

    public e(Context context, a<O> aVar, O o, a aVar2) {
        r.a(context, "Null context is not permitted.");
        r.a(aVar, "Api must not be null.");
        r.a(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f1536a = context.getApplicationContext();
        this.f1537b = aVar;
        this.f1538c = o;
        this.e = aVar2.f1540b;
        this.d = b.a(aVar, o);
        this.g = new a0(this);
        f a2 = f.a(this.f1536a);
        this.h = a2;
        this.f = a2.a();
        n nVar = aVar2.f1539a;
        this.h.a((e<?>) this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.n r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.a(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.n):void");
    }

    private final <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends k, A>> T a(int i, T t) {
        t.b();
        this.h.a(this, i, t);
        return t;
    }

    public a.f a(Looper looper, f.a<O> aVar) {
        return this.f1537b.c().a(this.f1536a, looper, b().a(), this.f1538c, aVar, aVar);
    }

    public f a() {
        return this.g;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends k, A>> T a(T t) {
        a(1, t);
        return t;
    }

    public g0 a(Context context, Handler handler) {
        return new g0(context, handler, b().a());
    }

    /* access modifiers changed from: protected */
    public d.a b() {
        Account account;
        GoogleSignInAccount b2;
        GoogleSignInAccount b3;
        d.a aVar = new d.a();
        O o = this.f1538c;
        if (!(o instanceof a.d.b) || (b3 = ((a.d.b) o).b()) == null) {
            O o2 = this.f1538c;
            account = o2 instanceof a.d.AbstractC0070a ? ((a.d.AbstractC0070a) o2).R() : null;
        } else {
            account = b3.R();
        }
        aVar.a(account);
        O o3 = this.f1538c;
        aVar.a((!(o3 instanceof a.d.b) || (b2 = ((a.d.b) o3).b()) == null) ? Collections.emptySet() : b2.m());
        aVar.a(this.f1536a.getClass().getName());
        aVar.b(this.f1536a.getPackageName());
        return aVar;
    }

    public b<O> c() {
        return this.d;
    }

    public Context d() {
        return this.f1536a;
    }

    public final int e() {
        return this.f;
    }

    public Looper f() {
        return this.e;
    }
}
