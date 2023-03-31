package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.s.c;
import java.util.ArrayList;
import java.util.List;

public final class s1 extends c.a {

    /* renamed from: a  reason: collision with root package name */
    private final o1 f4587a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f4588b = new ArrayList();

    public s1(o1 o1Var) {
        v1 v1Var;
        IBinder iBinder;
        this.f4587a = o1Var;
        try {
            o1Var.D0();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
        try {
            for (v1 v1Var2 : o1Var.q0()) {
                if (!(v1Var2 instanceof IBinder) || (iBinder = (IBinder) v1Var2) == null) {
                    v1Var = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    v1Var = queryLocalInterface instanceof v1 ? (v1) queryLocalInterface : new x1(iBinder);
                }
                if (v1Var != null) {
                    this.f4588b.add(new a2(v1Var));
                }
            }
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
        }
    }
}
