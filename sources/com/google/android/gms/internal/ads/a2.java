package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.s.c;

public final class a2 extends c.b {

    /* renamed from: a  reason: collision with root package name */
    private final v1 f1676a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f1677b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f1678c;
    private final double d;
    private final int e;
    private final int f;

    public a2(v1 v1Var) {
        Drawable drawable;
        int i;
        this.f1676a = v1Var;
        Uri uri = null;
        try {
            a l1 = v1Var.l1();
            if (l1 != null) {
                drawable = (Drawable) b.Q(l1);
                this.f1677b = drawable;
                uri = this.f1676a.l0();
                this.f1678c = uri;
                double d2 = 1.0d;
                d2 = this.f1676a.s0();
                this.d = d2;
                int i2 = -1;
                i = this.f1676a.getWidth();
                this.e = i;
                i2 = this.f1676a.getHeight();
                this.f = i2;
            }
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
        }
        drawable = null;
        this.f1677b = drawable;
        try {
            uri = this.f1676a.l0();
        } catch (RemoteException e3) {
            co.b(BuildConfig.FLAVOR, e3);
        }
        this.f1678c = uri;
        double d22 = 1.0d;
        try {
            d22 = this.f1676a.s0();
        } catch (RemoteException e4) {
            co.b(BuildConfig.FLAVOR, e4);
        }
        this.d = d22;
        int i22 = -1;
        try {
            i = this.f1676a.getWidth();
        } catch (RemoteException e5) {
            co.b(BuildConfig.FLAVOR, e5);
            i = -1;
        }
        this.e = i;
        try {
            i22 = this.f1676a.getHeight();
        } catch (RemoteException e6) {
            co.b(BuildConfig.FLAVOR, e6);
        }
        this.f = i22;
    }

    @Override // com.google.android.gms.ads.s.c.b
    public final Drawable a() {
        return this.f1677b;
    }

    @Override // com.google.android.gms.ads.s.c.b
    public final int b() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.s.c.b
    public final double c() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.s.c.b
    public final Uri d() {
        return this.f1678c;
    }

    @Override // com.google.android.gms.ads.s.c.b
    public final int e() {
        return this.e;
    }
}
