package com.google.android.gms.internal.ads;

import java.util.Iterator;

final /* synthetic */ class na1 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final ka1 f3819a;

    /* renamed from: b  reason: collision with root package name */
    private final rf1 f3820b;

    /* renamed from: c  reason: collision with root package name */
    private final l30 f3821c;

    na1(ka1 ka1, rf1 rf1, l30 l30) {
        this.f3819a = ka1;
        this.f3820b = rf1;
        this.f3821c = l30;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        rf1 rf1 = this.f3820b;
        l30 l30 = this.f3821c;
        vd1 vd1 = (vd1) obj;
        rf1.f4495b = vd1;
        Iterator<id1> it = vd1.f5093b.f4641a.iterator();
        boolean z = false;
        boolean z2 = false;
        loop0:
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            Iterator<String> it2 = it.next().f3066a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!it2.next().contains("FirstPartyRenderer")) {
                        break loop0;
                    }
                    z2 = true;
                }
            }
        }
        return !z ? yn1.a((Object) null) : l30.a(yn1.a(vd1));
    }
}
