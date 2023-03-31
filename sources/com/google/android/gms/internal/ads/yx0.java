package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.e70;
import java.util.Iterator;

public final class yx0<AdT, AdapterT, ListenerT extends e70> implements jt0<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final kt0<AdapterT, ListenerT> f5664a;

    /* renamed from: b  reason: collision with root package name */
    private final mt0<AdT, AdapterT, ListenerT> f5665b;

    /* renamed from: c  reason: collision with root package name */
    private final sh1 f5666c;
    private final ko1 d;

    public yx0(sh1 sh1, ko1 ko1, kt0<AdapterT, ListenerT> kt0, mt0<AdT, AdapterT, ListenerT> mt0) {
        this.f5666c = sh1;
        this.d = ko1;
        this.f5665b = mt0;
        this.f5664a = kt0;
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<AdT> a(vd1 vd1, id1 id1) {
        lt0<AdapterT, ListenerT> lt0;
        Iterator<String> it = id1.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                lt0 = null;
                break;
            }
            try {
                lt0 = this.f5664a.a(it.next(), id1.s);
                break;
            } catch (fe1 unused) {
            }
        }
        if (lt0 == null) {
            return yn1.a((Throwable) new aw0("unable to instantiate mediation adapter class"));
        }
        ro roVar = new ro();
        lt0.f3601c.a(new dy0(this, roVar));
        if (id1.E) {
            Bundle bundle = vd1.f5092a.f4150a.d.n;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.f5666c.a(ph1.ADAPTER_LOAD_AD_SYN).a(new by0(this, vd1, id1, lt0), this.d).a(ph1.ADAPTER_LOAD_AD_ACK).a((lo1) roVar).a(ph1.ADAPTER_WRAP_ADAPTER).a((zg1<O2, O2>) new ay0(this, vd1, id1, lt0)).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(vd1 vd1, id1 id1, lt0 lt0, Void r4) {
        return this.f5665b.b(vd1, id1, lt0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(vd1 vd1, id1 id1, lt0 lt0) {
        this.f5665b.a(vd1, id1, lt0);
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        return !id1.q.isEmpty();
    }
}
