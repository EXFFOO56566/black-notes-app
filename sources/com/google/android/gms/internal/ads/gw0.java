package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class gw0<AdT> implements jt0<AdT> {
    private static Bundle a(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<AdT> a(vd1 vd1, id1 id1) {
        String optString = id1.s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, BuildConfig.FLAVOR);
        zd1 zd1 = vd1.f5092a.f4150a;
        be1 be1 = new be1();
        be1.a(zd1);
        be1.a(optString);
        Bundle a2 = a(zd1.d.n);
        Bundle a3 = a(a2.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        a3.putInt("gw", 1);
        String optString2 = id1.s.optString("mad_hac", null);
        if (optString2 != null) {
            a3.putString("mad_hac", optString2);
        }
        String optString3 = id1.s.optString("adJson", null);
        if (optString3 != null) {
            a3.putString("_ad", optString3);
        }
        a3.putBoolean("_noRefresh", true);
        Iterator<String> keys = id1.A.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = id1.A.optString(next, null);
            if (next != null) {
                a3.putString(next, optString4);
            }
        }
        a2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", a3);
        rm2 rm2 = zd1.d;
        be1.a(new rm2(rm2.f4520b, rm2.f4521c, a3, rm2.e, rm2.f, rm2.g, rm2.h, rm2.i, rm2.j, rm2.k, rm2.l, rm2.m, a2, rm2.o, rm2.p, rm2.q, rm2.r, rm2.s, rm2.t, rm2.u, rm2.v, rm2.w));
        zd1 d = be1.d();
        Bundle bundle = new Bundle();
        kd1 kd1 = vd1.f5093b.f4642b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(kd1.f3375a));
        bundle2.putInt("refresh_interval", kd1.f3377c);
        bundle2.putString("gws_query_id", kd1.f3376b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = vd1.f5092a.f4150a.f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", id1.t);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(id1.f3068c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(id1.d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(id1.n));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(id1.m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(id1.g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(id1.h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(id1.i));
        bundle3.putString("transaction_id", id1.j);
        bundle3.putString("valid_from_timestamp", id1.k);
        bundle3.putBoolean("is_closable_area_disabled", id1.G);
        if (id1.l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", id1.l.f4951c);
            bundle4.putString("rb_type", id1.l.f4950b);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return a(d, bundle);
    }

    /* access modifiers changed from: protected */
    public abstract lo1<AdT> a(zd1 zd1, Bundle bundle);

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        return !TextUtils.isEmpty(id1.s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, BuildConfig.FLAVOR));
    }
}
