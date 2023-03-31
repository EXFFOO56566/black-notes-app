package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.ik2;
import javax.annotation.ParametersAreNonnullByDefault;

public final class rd0 implements u50, pa0 {

    /* renamed from: b  reason: collision with root package name */
    private final zi f4483b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4484c;
    private final cj d;
    private final View e;
    private String f;
    private final ik2.a g;

    public rd0(zi ziVar, Context context, cj cjVar, View view, ik2.a aVar) {
        this.f4483b = ziVar;
        this.f4484c = context;
        this.d = cjVar;
        this.e = view;
        this.g = aVar;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void A() {
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void B() {
        View view = this.e;
        if (!(view == null || this.f == null)) {
            this.d.c(view.getContext(), this.f);
        }
        this.f4483b.a(true);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void G() {
    }

    @Override // com.google.android.gms.internal.ads.u50
    @ParametersAreNonnullByDefault
    public final void a(ug ugVar, String str, String str2) {
        if (this.d.a(this.f4484c)) {
            try {
                this.d.a(this.f4484c, this.d.e(this.f4484c), this.f4483b.j(), ugVar.m(), ugVar.I());
            } catch (RemoteException e2) {
                co.c("Remote Exception to get reward item.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pa0
    public final void w() {
        String b2 = this.d.b(this.f4484c);
        this.f = b2;
        String valueOf = String.valueOf(b2);
        String str = this.g == ik2.a.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void x() {
        this.f4483b.a(false);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void y() {
    }
}
