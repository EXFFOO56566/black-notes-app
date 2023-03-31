package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final /* synthetic */ class lu0 implements id0 {

    /* renamed from: a  reason: collision with root package name */
    private final ro f3606a;

    lu0(ro roVar) {
        this.f3606a = roVar;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void a(boolean z, Context context) {
        ro roVar = this.f3606a;
        try {
            q.b();
            n.a(context, (AdOverlayInfoParcel) roVar.get(), true);
        } catch (Exception unused) {
        }
    }
}
