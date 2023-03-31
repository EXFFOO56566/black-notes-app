package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class fk2 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f2613a;

    /* renamed from: b  reason: collision with root package name */
    private int f2614b;

    /* renamed from: c  reason: collision with root package name */
    private int f2615c;
    private final /* synthetic */ ak2 d;

    private fk2(ak2 ak2, byte[] bArr) {
        this.d = ak2;
        this.f2613a = bArr;
    }

    public final fk2 a(int i) {
        this.f2614b = i;
        return this;
    }

    public final synchronized void a() {
        try {
            if (this.d.f1779b) {
                this.d.f1778a.a(this.f2613a);
                this.d.f1778a.h(this.f2614b);
                this.d.f1778a.k(this.f2615c);
                this.d.f1778a.a((int[]) null);
                this.d.f1778a.R1();
            }
        } catch (RemoteException e) {
            co.a("Clearcut log failed", e);
        }
    }

    public final fk2 b(int i) {
        this.f2615c = i;
        return this;
    }
}
