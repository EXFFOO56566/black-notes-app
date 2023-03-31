package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import com.google.android.gms.internal.ads.fo;
import com.google.android.gms.internal.ads.jm2;
import com.google.android.gms.internal.ads.l4;
import com.google.android.gms.internal.ads.n4;
import com.google.android.gms.internal.ads.ws;

public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new m();

    /* renamed from: b  reason: collision with root package name */
    public final d f1411b;

    /* renamed from: c  reason: collision with root package name */
    public final jm2 f1412c;
    public final o d;
    public final ws e;
    public final n4 f;
    public final String g;
    public final boolean h;
    public final String i;
    public final t j;
    public final int k;
    public final int l;
    public final String m;
    public final fo n;
    public final String o;
    public final g p;
    public final l4 q;

    AdOverlayInfoParcel(d dVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, fo foVar, String str4, g gVar, IBinder iBinder6) {
        this.f1411b = dVar;
        this.f1412c = (jm2) b.Q(a.AbstractBinderC0058a.a(iBinder));
        this.d = (o) b.Q(a.AbstractBinderC0058a.a(iBinder2));
        this.e = (ws) b.Q(a.AbstractBinderC0058a.a(iBinder3));
        this.q = (l4) b.Q(a.AbstractBinderC0058a.a(iBinder6));
        this.f = (n4) b.Q(a.AbstractBinderC0058a.a(iBinder4));
        this.g = str;
        this.h = z;
        this.i = str2;
        this.j = (t) b.Q(a.AbstractBinderC0058a.a(iBinder5));
        this.k = i2;
        this.l = i3;
        this.m = str3;
        this.n = foVar;
        this.o = str4;
        this.p = gVar;
    }

    public AdOverlayInfoParcel(d dVar, jm2 jm2, o oVar, t tVar, fo foVar) {
        this.f1411b = dVar;
        this.f1412c = jm2;
        this.d = oVar;
        this.e = null;
        this.q = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = tVar;
        this.k = -1;
        this.l = 4;
        this.m = null;
        this.n = foVar;
        this.o = null;
        this.p = null;
    }

    public AdOverlayInfoParcel(jm2 jm2, o oVar, t tVar, ws wsVar, int i2, fo foVar, String str, g gVar, String str2, String str3) {
        this.f1411b = null;
        this.f1412c = null;
        this.d = oVar;
        this.e = wsVar;
        this.q = null;
        this.f = null;
        this.g = str2;
        this.h = false;
        this.i = str3;
        this.j = null;
        this.k = i2;
        this.l = 1;
        this.m = null;
        this.n = foVar;
        this.o = str;
        this.p = gVar;
    }

    public AdOverlayInfoParcel(jm2 jm2, o oVar, t tVar, ws wsVar, boolean z, int i2, fo foVar) {
        this.f1411b = null;
        this.f1412c = jm2;
        this.d = oVar;
        this.e = wsVar;
        this.q = null;
        this.f = null;
        this.g = null;
        this.h = z;
        this.i = null;
        this.j = tVar;
        this.k = i2;
        this.l = 2;
        this.m = null;
        this.n = foVar;
        this.o = null;
        this.p = null;
    }

    public AdOverlayInfoParcel(jm2 jm2, o oVar, l4 l4Var, n4 n4Var, t tVar, ws wsVar, boolean z, int i2, String str, fo foVar) {
        this.f1411b = null;
        this.f1412c = jm2;
        this.d = oVar;
        this.e = wsVar;
        this.q = l4Var;
        this.f = n4Var;
        this.g = null;
        this.h = z;
        this.i = null;
        this.j = tVar;
        this.k = i2;
        this.l = 3;
        this.m = str;
        this.n = foVar;
        this.o = null;
        this.p = null;
    }

    public AdOverlayInfoParcel(jm2 jm2, o oVar, l4 l4Var, n4 n4Var, t tVar, ws wsVar, boolean z, int i2, String str, String str2, fo foVar) {
        this.f1411b = null;
        this.f1412c = jm2;
        this.d = oVar;
        this.e = wsVar;
        this.q = l4Var;
        this.f = n4Var;
        this.g = str2;
        this.h = z;
        this.i = str;
        this.j = tVar;
        this.k = i2;
        this.l = 3;
        this.m = null;
        this.n = foVar;
        this.o = null;
        this.p = null;
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f1411b, i2, false);
        c.a(parcel, 3, b.a(this.f1412c).asBinder(), false);
        c.a(parcel, 4, b.a(this.d).asBinder(), false);
        c.a(parcel, 5, b.a(this.e).asBinder(), false);
        c.a(parcel, 6, b.a(this.f).asBinder(), false);
        c.a(parcel, 7, this.g, false);
        c.a(parcel, 8, this.h);
        c.a(parcel, 9, this.i, false);
        c.a(parcel, 10, b.a(this.j).asBinder(), false);
        c.a(parcel, 11, this.k);
        c.a(parcel, 12, this.l);
        c.a(parcel, 13, this.m, false);
        c.a(parcel, 14, (Parcelable) this.n, i2, false);
        c.a(parcel, 16, this.o, false);
        c.a(parcel, 17, (Parcelable) this.p, i2, false);
        c.a(parcel, 18, b.a(this.q).asBinder(), false);
        c.a(parcel, a2);
    }
}
