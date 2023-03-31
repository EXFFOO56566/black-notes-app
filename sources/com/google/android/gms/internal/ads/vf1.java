package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

public final class vf1 {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<qf1, zf1<? extends k20>> f5105a = new HashMap<>();

    public final <AdT extends k20> zf1<AdT> a(qf1 qf1, Context context, df1 df1, hg1<AdT> hg1) {
        zf1<AdT> zf1 = (zf1<AdT>) this.f5105a.get(qf1);
        if (zf1 != null) {
            return zf1;
        }
        jf1 jf1 = new jf1(nf1.a(qf1, context));
        zf1<AdT> zf12 = new zf1<>(jf1, new ag1(jf1, df1, hg1));
        this.f5105a.put(qf1, zf12);
        return zf12;
    }
}
