package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

public final class hj2 extends a {
    public static final Parcelable.Creator<hj2> CREATOR = new gj2();
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private ParcelFileDescriptor f2928b;

    public hj2() {
        this(null);
    }

    public hj2(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2928b = parcelFileDescriptor;
    }

    private final synchronized ParcelFileDescriptor g() {
        return this.f2928b;
    }

    public final synchronized boolean d() {
        return this.f2928b != null;
    }

    public final synchronized InputStream e() {
        if (this.f2928b == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f2928b);
        this.f2928b = null;
        return autoCloseInputStream;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) g(), i, false);
        c.a(parcel, a2);
    }
}
