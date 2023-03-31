package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

public final class we1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ye1> f5260a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f5261b;

    /* renamed from: c  reason: collision with root package name */
    private final ik f5262c;

    public we1(Context context, fo foVar, ik ikVar) {
        this.f5261b = context;
        this.f5262c = ikVar;
    }

    private final ye1 a() {
        return new ye1(this.f5261b, this.f5262c.i(), this.f5262c.k());
    }

    private final ye1 b(String str) {
        vg c2 = vg.c(this.f5261b);
        try {
            c2.a(str);
            bl blVar = new bl();
            blVar.a(this.f5261b, str, false);
            cl clVar = new cl(this.f5262c.i(), blVar);
            return new ye1(c2, clVar, new tk(sn.c(), clVar));
        } catch (PackageManager.NameNotFoundException unused) {
            return a();
        }
    }

    public final ye1 a(String str) {
        if (str == null) {
            return a();
        }
        if (this.f5260a.containsKey(str)) {
            return this.f5260a.get(str);
        }
        ye1 b2 = b(str);
        this.f5260a.put(str, b2);
        return b2;
    }
}
