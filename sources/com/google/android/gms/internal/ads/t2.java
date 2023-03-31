package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.d.a;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.p;
import com.google.android.gms.ads.s.c;
import com.google.android.gms.ads.s.h;
import java.util.ArrayList;
import java.util.List;

public final class t2 extends h {

    /* renamed from: a  reason: collision with root package name */
    private final o2 f4742a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f4743b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final a2 f4744c;
    private final p d = new p();

    public t2(o2 o2Var) {
        v1 v1Var;
        IBinder iBinder;
        this.f4742a = o2Var;
        a2 a2Var = null;
        try {
            List h = o2Var.h();
            if (h != null) {
                for (Object obj : h) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        v1Var = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        v1Var = queryLocalInterface instanceof v1 ? (v1) queryLocalInterface : new x1(iBinder);
                    }
                    if (v1Var != null) {
                        this.f4743b.add(new a2(v1Var));
                    }
                }
            }
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
        try {
            v1 d0 = this.f4742a.d0();
            if (d0 != null) {
                a2Var = new a2(d0);
            }
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
        }
        this.f4744c = a2Var;
        try {
            if (this.f4742a.e() != null) {
                new s1(this.f4742a.e());
            }
        } catch (RemoteException e3) {
            co.b(BuildConfig.FLAVOR, e3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final a a() {
        try {
            return this.f4742a.n();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.h
    public final CharSequence b() {
        try {
            return this.f4742a.q();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.h
    public final CharSequence c() {
        try {
            return this.f4742a.d();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.h
    public final CharSequence d() {
        try {
            return this.f4742a.f();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.h
    public final CharSequence e() {
        try {
            return this.f4742a.b();
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.h
    public final List<c.b> f() {
        return this.f4743b;
    }

    @Override // com.google.android.gms.ads.s.h
    public final c.b g() {
        return this.f4744c;
    }

    @Override // com.google.android.gms.ads.s.h
    public final p h() {
        try {
            if (this.f4742a.getVideoController() != null) {
                this.d.a(this.f4742a.getVideoController());
            }
        } catch (RemoteException e) {
            co.b("Exception occurred while getting video controller", e);
        }
        return this.d;
    }
}
