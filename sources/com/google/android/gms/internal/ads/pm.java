package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class pm {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f4202a;

    /* renamed from: b  reason: collision with root package name */
    private final double[] f4203b;

    /* renamed from: c  reason: collision with root package name */
    private final double[] f4204c;
    private final int[] d;
    private int e;

    private pm(qm qmVar) {
        int size = qm.a(qmVar).size();
        this.f4202a = (String[]) qm.b(qmVar).toArray(new String[size]);
        this.f4203b = a(qm.a(qmVar));
        this.f4204c = a(qm.c(qmVar));
        this.d = new int[size];
        this.e = 0;
    }

    private static double[] a(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final List<rm> a() {
        ArrayList arrayList = new ArrayList(this.f4202a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f4202a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d2 = this.f4204c[i];
            double d3 = this.f4203b[i];
            int[] iArr = this.d;
            arrayList.add(new rm(str, d2, d3, ((double) iArr[i]) / ((double) this.e), iArr[i]));
            i++;
        }
    }

    public final void a(double d2) {
        this.e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f4204c;
            if (i < dArr.length) {
                if (dArr[i] <= d2 && d2 < this.f4203b[i]) {
                    int[] iArr = this.d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d2 >= this.f4204c[i]) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
