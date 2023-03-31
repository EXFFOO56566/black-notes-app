package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.p;
import com.google.android.gms.ads.s.c;
import com.google.android.gms.ads.s.k;
import java.util.ArrayList;
import java.util.List;

public final class b4 extends k {

    /* renamed from: a  reason: collision with root package name */
    private final w3 f1855a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f1856b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final a2 f1857c;
    private final p d = new p();
    private final List<Object> e = new ArrayList();

    public b4(w3 w3Var) {
        v1 v1Var;
        IBinder iBinder;
        this.f1855a = w3Var;
        a2 a2Var = null;
        try {
            List h = w3Var.h();
            if (h != null) {
                for (Object obj : h) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        v1Var = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        v1Var = queryLocalInterface instanceof v1 ? (v1) queryLocalInterface : new x1(iBinder);
                    }
                    if (v1Var != null) {
                        this.f1856b.add(new a2(v1Var));
                    }
                }
            }
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
        }
        try {
            List H0 = this.f1855a.H0();
            if (H0 != null) {
                for (Object obj2 : H0) {
                    cp2 a2 = obj2 instanceof IBinder ? ep2.a((IBinder) obj2) : null;
                    if (a2 != null) {
                        this.e.add(new hp2(a2));
                    }
                }
            }
        } catch (RemoteException e3) {
            co.b(BuildConfig.FLAVOR, e3);
        }
        try {
            v1 t = this.f1855a.t();
            if (t != null) {
                a2Var = new a2(t);
            }
        } catch (RemoteException e4) {
            co.b(BuildConfig.FLAVOR, e4);
        }
        this.f1857c = a2Var;
        try {
            if (this.f1855a.e() != null) {
                new s1(this.f1855a.e());
            }
        } catch (RemoteException e5) {
            co.b(BuildConfig.FLAVOR, e5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final a k() {
        try {
            return this.f1855a.n();
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.k
    public final String a() {
        try {
            return this.f1855a.q();
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.k
    public final String b() {
        try {
            return this.f1855a.d();
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.k
    public final String c() {
        try {
            return this.f1855a.f();
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.k
    public final String d() {
        try {
            return this.f1855a.b();
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.k
    public final c.b e() {
        return this.f1857c;
    }

    @Override // com.google.android.gms.ads.s.k
    public final List<c.b> f() {
        return this.f1856b;
    }

    @Override // com.google.android.gms.ads.s.k
    public final String g() {
        try {
            return this.f1855a.o();
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.k
    public final Double h() {
        try {
            double k = this.f1855a.k();
            if (k == -1.0d) {
                return null;
            }
            return Double.valueOf(k);
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.k
    public final String i() {
        try {
            return this.f1855a.r();
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.k
    public final p j() {
        try {
            if (this.f1855a.getVideoController() != null) {
                this.d.a(this.f1855a.getVideoController());
            }
        } catch (RemoteException e2) {
            co.b("Exception occurred while getting video controller", e2);
        }
        return this.d;
    }

    @Override // com.google.android.gms.ads.s.k
    public final Object l() {
        try {
            a c2 = this.f1855a.c();
            if (c2 != null) {
                return b.Q(c2);
            }
            return null;
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }
}
