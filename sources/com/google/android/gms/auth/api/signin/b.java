package com.google.android.gms.auth.api.signin;

import android.content.Context;
import b.c.b.a.c.j;
import b.c.b.a.h.f;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;

public class b extends e<GoogleSignInOptions> {
    private static int i = C0068b.f1502a;

    private static class a implements q.a<c, GoogleSignInAccount> {
        private a() {
        }

        /* synthetic */ a(h hVar) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.k] */
        @Override // com.google.android.gms.common.internal.q.a
        public final /* synthetic */ GoogleSignInAccount a(c cVar) {
            return cVar.b();
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.auth.api.signin.b$b  reason: collision with other inner class name */
    public static final class C0068b {

        /* renamed from: a  reason: collision with root package name */
        public static final int f1502a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f1503b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f1504c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    static {
        new a(null);
    }

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, b.c.b.a.a.a.a.e, googleSignInOptions, new com.google.android.gms.common.api.internal.a());
    }

    private final synchronized int i() {
        if (i == C0068b.f1502a) {
            Context d = d();
            b.c.b.a.c.e a2 = b.c.b.a.c.e.a();
            int a3 = a2.a(d, j.f1165a);
            i = a3 == 0 ? C0068b.d : (a2.a(d, a3, null) != null || DynamiteModule.a(d, "com.google.android.gms.auth.api.fallback") == 0) ? C0068b.f1503b : C0068b.f1504c;
        }
        return i;
    }

    public f<Void> g() {
        return q.a(i.b(a(), d(), i() == C0068b.f1504c));
    }

    public f<Void> h() {
        return q.a(i.a(a(), d(), i() == C0068b.f1504c));
    }
}
