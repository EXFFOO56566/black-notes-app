package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.p;
import com.google.android.gms.ads.s.b;
import com.google.android.gms.ads.s.i;
import java.util.WeakHashMap;

public final class x2 implements i {

    /* renamed from: c  reason: collision with root package name */
    private static WeakHashMap<IBinder, x2> f5352c = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final s2 f5353a;

    /* renamed from: b  reason: collision with root package name */
    private final b f5354b;

    private x2(s2 s2Var) {
        Context context;
        new p();
        this.f5353a = s2Var;
        b bVar = null;
        try {
            context = (Context) b.c.b.a.d.b.Q(s2Var.P0());
        } catch (RemoteException | NullPointerException e) {
            co.b(BuildConfig.FLAVOR, e);
            context = null;
        }
        if (context != null) {
            b bVar2 = new b(context);
            try {
                if (this.f5353a.O(b.c.b.a.d.b.a(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e2) {
                co.b(BuildConfig.FLAVOR, e2);
            }
        }
        this.f5354b = bVar;
    }

    public static x2 a(s2 s2Var) {
        synchronized (f5352c) {
            x2 x2Var = f5352c.get(s2Var.asBinder());
            if (x2Var != null) {
                return x2Var;
            }
            x2 x2Var2 = new x2(s2Var);
            f5352c.put(s2Var.asBinder(), x2Var2);
            return x2Var2;
        }
    }

    @Override // com.google.android.gms.ads.s.i
    public final String Y() {
        try {
            return this.f5353a.Y();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    public final s2 a() {
        return this.f5353a;
    }
}
