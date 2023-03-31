package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.d.a;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.p;
import com.google.android.gms.ads.s.c;
import com.google.android.gms.ads.s.g;
import java.util.ArrayList;
import java.util.List;

public final class p2 extends g {

    /* renamed from: a  reason: collision with root package name */
    private final k2 f4090a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f4091b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final a2 f4092c;
    private final p d = new p();

    public p2(k2 k2Var) {
        v1 v1Var;
        IBinder iBinder;
        this.f4090a = k2Var;
        a2 a2Var = null;
        try {
            List h = k2Var.h();
            if (h != null) {
                for (Object obj : h) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        v1Var = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        v1Var = queryLocalInterface instanceof v1 ? (v1) queryLocalInterface : new x1(iBinder);
                    }
                    if (v1Var != null) {
                        this.f4091b.add(new a2(v1Var));
                    }
                }
            }
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
        try {
            v1 t = this.f4090a.t();
            if (t != null) {
                a2Var = new a2(t);
            }
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
        }
        this.f4092c = a2Var;
        try {
            if (this.f4090a.e() != null) {
                new s1(this.f4090a.e());
            }
        } catch (RemoteException e3) {
            co.b(BuildConfig.FLAVOR, e3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final a a() {
        try {
            return this.f4090a.n();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.g
    public final CharSequence b() {
        try {
            return this.f4090a.d();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.g
    public final CharSequence c() {
        try {
            return this.f4090a.f();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.g
    public final CharSequence d() {
        try {
            return this.f4090a.b();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.g
    public final c.b e() {
        return this.f4092c;
    }

    @Override // com.google.android.gms.ads.s.g
    public final List<c.b> f() {
        return this.f4091b;
    }

    @Override // com.google.android.gms.ads.s.g
    public final CharSequence g() {
        try {
            return this.f4090a.o();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.g
    public final Double h() {
        try {
            double k = this.f4090a.k();
            if (k == -1.0d) {
                return null;
            }
            return Double.valueOf(k);
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.g
    public final CharSequence i() {
        try {
            return this.f4090a.r();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.g
    public final p j() {
        try {
            if (this.f4090a.getVideoController() != null) {
                this.d.a(this.f4090a.getVideoController());
            }
        } catch (RemoteException e) {
            co.b("Exception occurred while getting video controller", e);
        }
        return this.d;
    }
}
