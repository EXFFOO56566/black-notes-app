package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class xe extends a {
    public static final Parcelable.Creator<xe> CREATOR = new ze();

    /* renamed from: b  reason: collision with root package name */
    public final View f5413b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f5414c;

    public xe(IBinder iBinder, IBinder iBinder2) {
        this.f5413b = (View) b.Q(a.AbstractBinderC0058a.a(iBinder));
        this.f5414c = (Map) b.Q(a.AbstractBinderC0058a.a(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, b.a(this.f5413b).asBinder(), false);
        c.a(parcel, 2, b.a(this.f5414c).asBinder(), false);
        c.a(parcel, a2);
    }
}
