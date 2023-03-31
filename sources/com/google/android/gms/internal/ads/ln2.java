package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.c.j;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* access modifiers changed from: package-private */
public abstract class ln2<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final oo2 f3585a = c();

    ln2() {
    }

    private static oo2 c() {
        try {
            Object newInstance = cn2.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                co.d("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            return queryLocalInterface instanceof oo2 ? (oo2) queryLocalInterface : new qo2(iBinder);
        } catch (Exception unused) {
            co.d("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    private final T d() {
        oo2 oo2 = f3585a;
        if (oo2 == null) {
            co.d("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return a(oo2);
        } catch (RemoteException e) {
            co.c("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final T e() {
        try {
            return b();
        } catch (RemoteException e) {
            co.c("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T a(Context context, boolean z) {
        T t;
        boolean z2 = false;
        boolean z3 = z;
        if (!z3) {
            on2.a();
            if (!sn.c(context, j.f1165a)) {
                co.a("Google Play Services is not available.");
                z3 = true;
            }
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.b(context, ModuleDescriptor.MODULE_ID)) {
            z3 = true;
        }
        zr2.a(context);
        if (m0.f3635a.a().booleanValue()) {
            z3 = false;
        }
        if (z3) {
            t = d();
            if (t == null) {
                t = e();
            }
        } else {
            T e = e();
            int i = e == null ? 1 : 0;
            if (i != 0) {
                if (on2.h().nextInt(w0.f5186a.a().intValue()) == 0) {
                    z2 = true;
                }
                if (z2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    on2.a().a(context, on2.g().f2633b, "gmob-apps", bundle, true);
                }
            }
            t = e == null ? d() : e;
        }
        return t == null ? a() : t;
    }

    /* access modifiers changed from: protected */
    public abstract T a(oo2 oo2);

    /* access modifiers changed from: protected */
    public abstract T b();
}
