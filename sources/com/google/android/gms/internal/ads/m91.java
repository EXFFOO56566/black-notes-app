package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public final class m91 implements r42<x61<JSONObject>> {
    public static x61<JSONObject> a(zj zjVar, Object obj, t71 t71, r81 r81, l42<m71> l42, l42<x71> l422, l42<b81> l423, l42<h81> l424, l42<m81> l425, l42<w81> l426, l42<a91> l427, l42<o91> l428, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((i81) obj);
        hashSet.add(t71);
        hashSet.add(r81);
        if (((Boolean) on2.e().a(zr2.E2)).booleanValue()) {
            hashSet.add(l42.get());
        }
        if (((Boolean) on2.e().a(zr2.F2)).booleanValue()) {
            hashSet.add(l422.get());
        }
        if (((Boolean) on2.e().a(zr2.G2)).booleanValue()) {
            hashSet.add(l423.get());
        }
        if (((Boolean) on2.e().a(zr2.H2)).booleanValue()) {
            hashSet.add(l424.get());
        }
        if (((Boolean) on2.e().a(zr2.J2)).booleanValue()) {
            hashSet.add(new g51(l426.get(), ((Long) on2.e().a(zr2.C1)).longValue(), scheduledExecutorService));
        }
        if (((Boolean) on2.e().a(zr2.K2)).booleanValue()) {
            hashSet.add(l427.get());
        }
        if (((Boolean) on2.e().a(zr2.L2)).booleanValue()) {
            hashSet.add(l428.get());
        }
        x61<JSONObject> x61 = new x61<>(executor, hashSet);
        y42.a(x61, "Cannot return null from a non-@Nullable @Provides method");
        return x61;
    }
}
