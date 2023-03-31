package com.google.android.gms.ads.s;

import android.os.RemoteException;
import android.view.View;
import b.c.b.a.d.a;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.h2;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static WeakHashMap<View, f> f1472c = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private h2 f1473a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<View> f1474b;

    private final void a(a aVar) {
        WeakReference<View> weakReference = this.f1474b;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            co.d("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f1472c.containsKey(view)) {
            f1472c.put(view, this);
        }
        h2 h2Var = this.f1473a;
        if (h2Var != null) {
            try {
                h2Var.e(aVar);
            } catch (RemoteException e) {
                co.b("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void a(c cVar) {
        a((a) cVar.a());
    }

    public final void a(k kVar) {
        a((a) kVar.k());
    }
}
