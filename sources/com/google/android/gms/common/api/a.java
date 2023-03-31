package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.r;
import java.util.Set;

public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0069a<?, O> f1532a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f1533b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1534c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0069a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o, f.a aVar, f.b bVar) {
            throw null;
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public interface AbstractC0070a extends c, AbstractC0071d {
            Account R();
        }

        public interface b extends c {
            GoogleSignInAccount b();
        }

        public interface c extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d  reason: collision with other inner class name */
        public interface AbstractC0071d extends d {
        }

        public interface e extends c, AbstractC0071d {
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(c.AbstractC0073c cVar);

        void a(c.e eVar);

        void a(l lVar, Set<Scope> set);

        boolean a();

        Set<Scope> b();

        boolean d();

        int e();

        boolean f();

        b.c.b.a.c.d[] g();

        String h();

        void i();

        boolean k();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public interface h<T extends IInterface> extends b {
        T a(IBinder iBinder);

        void a(int i, T t);

        String c();

        String l();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.common.api.a$a<C extends com.google.android.gms.common.api.a$f, O extends com.google.android.gms.common.api.a$d> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.common.api.a$g<C extends com.google.android.gms.common.api.a$f> */
    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0069a<C, O> aVar, g<C> gVar) {
        r.a(aVar, "Cannot construct an Api with a null ClientBuilder");
        r.a(gVar, "Cannot construct an Api with a null ClientKey");
        this.f1534c = str;
        this.f1532a = aVar;
        this.f1533b = gVar;
    }

    public final c<?> a() {
        g<?> gVar = this.f1533b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public final String b() {
        return this.f1534c;
    }

    public final AbstractC0069a<?, O> c() {
        r.b(this.f1532a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f1532a;
    }
}
