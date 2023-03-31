package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import b.c.b.a.c.o.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import java.util.Iterator;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static a f1521a = new a("GoogleSignInCommon", new String[0]);

    public static g<Status> a(f fVar, Context context, boolean z) {
        f1521a.a("Signing out", new Object[0]);
        a(context);
        return z ? h.a(Status.f, fVar) : fVar.a(new l(fVar));
    }

    private static void a(Context context) {
        o.a(context).a();
        Iterator<f> it = f.c().iterator();
        if (!it.hasNext()) {
            com.google.android.gms.common.api.internal.f.c();
        } else {
            it.next().b();
            throw null;
        }
    }

    public static g<Status> b(f fVar, Context context, boolean z) {
        f1521a.a("Revoking access", new Object[0]);
        String d = c.a(context).d();
        a(context);
        return z ? e.a(d) : fVar.a(new n(fVar));
    }
}
