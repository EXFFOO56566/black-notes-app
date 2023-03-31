package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import b.c.b.a.d.b;

public final class ak2 {

    /* renamed from: a  reason: collision with root package name */
    l72 f1778a;

    /* renamed from: b  reason: collision with root package name */
    boolean f1779b;

    public ak2() {
    }

    public ak2(Context context) {
        zr2.a(context);
        if (((Boolean) on2.e().a(zr2.g2)).booleanValue()) {
            try {
                this.f1778a = (l72) bo.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", dk2.f2271a);
                b.a(context);
                this.f1778a.b(b.a(context), "GMA_SDK");
                this.f1779b = true;
            } catch (RemoteException | Cdo | NullPointerException unused) {
                co.a("Cannot dynamite load clearcut");
            }
        }
    }

    public ak2(Context context, String str, String str2) {
        zr2.a(context);
        try {
            this.f1778a = (l72) bo.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", ek2.f2440a);
            b.a(context);
            this.f1778a.b(b.a(context), str, null);
            this.f1779b = true;
        } catch (RemoteException | Cdo | NullPointerException unused) {
            co.a("Cannot dynamite load clearcut");
        }
    }

    public final fk2 a(byte[] bArr) {
        return new fk2(this, bArr);
    }
}
