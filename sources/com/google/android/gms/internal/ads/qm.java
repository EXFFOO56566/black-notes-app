package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class qm {

    /* renamed from: a */
    private final List<String> f4353a = new ArrayList();

    /* renamed from: b */
    private final List<Double> f4354b = new ArrayList();

    /* renamed from: c */
    private final List<Double> f4355c = new ArrayList();

    public final pm a() {
        return new pm(this);
    }

    public final qm a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f4353a.size()) {
            double doubleValue = this.f4355c.get(i).doubleValue();
            double doubleValue2 = this.f4354b.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f4353a.add(i, str);
        this.f4355c.add(i, Double.valueOf(d));
        this.f4354b.add(i, Double.valueOf(d2));
        return this;
    }
}
