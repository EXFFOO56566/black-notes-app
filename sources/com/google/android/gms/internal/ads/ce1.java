package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.e;
import java.util.ArrayList;
import java.util.List;

public final class ce1 {
    public static hd1 a(um2 um2) {
        return um2.j ? new hd1(-3, 0, true) : new hd1(um2.f, um2.f4977c, false);
    }

    public static hd1 a(List<hd1> list, hd1 hd1) {
        return list.get(0);
    }

    public static um2 a(Context context, List<hd1> list) {
        ArrayList arrayList = new ArrayList();
        for (hd1 hd1 : list) {
            if (hd1.f2898c) {
                arrayList.add(e.n);
            } else {
                arrayList.add(new e(hd1.f2896a, hd1.f2897b));
            }
        }
        return new um2(context, (e[]) arrayList.toArray(new e[arrayList.size()]));
    }
}
