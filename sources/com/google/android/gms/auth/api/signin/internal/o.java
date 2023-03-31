package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class o {

    /* renamed from: b  reason: collision with root package name */
    private static o f1524b;

    /* renamed from: a  reason: collision with root package name */
    private c f1525a;

    private o(Context context) {
        c a2 = c.a(context);
        this.f1525a = a2;
        a2.b();
        this.f1525a.c();
    }

    public static synchronized o a(Context context) {
        o b2;
        synchronized (o.class) {
            b2 = b(context.getApplicationContext());
        }
        return b2;
    }

    private static synchronized o b(Context context) {
        synchronized (o.class) {
            if (f1524b != null) {
                return f1524b;
            }
            o oVar = new o(context);
            f1524b = oVar;
            return oVar;
        }
    }

    public final synchronized void a() {
        this.f1525a.a();
    }

    public final synchronized void a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f1525a.a(googleSignInAccount, googleSignInOptions);
    }
}
