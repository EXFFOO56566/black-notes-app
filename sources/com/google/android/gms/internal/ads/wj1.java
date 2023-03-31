package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class wj1 extends a {
    public static final Parcelable.Creator<wj1> CREATOR = new vj1();

    /* renamed from: b  reason: collision with root package name */
    private final int f5284b;

    /* renamed from: c  reason: collision with root package name */
    private ba0 f5285c = null;
    private byte[] d;

    wj1(int i, byte[] bArr) {
        this.f5284b = i;
        this.d = bArr;
        e();
    }

    private final void e() {
        if (this.f5285c == null && this.d != null) {
            return;
        }
        if (this.f5285c != null && this.d == null) {
            return;
        }
        if (this.f5285c != null && this.d != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f5285c == null && this.d == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final ba0 d() {
        if (!(this.f5285c != null)) {
            try {
                this.f5285c = ba0.a(this.d, dz1.b());
                this.d = null;
            } catch (b02 e) {
                throw new IllegalStateException(e);
            }
        }
        e();
        return this.f5285c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5284b);
        byte[] bArr = this.d;
        if (bArr == null) {
            bArr = this.f5285c.f();
        }
        c.a(parcel, 2, bArr, false);
        c.a(parcel, a2);
    }
}
