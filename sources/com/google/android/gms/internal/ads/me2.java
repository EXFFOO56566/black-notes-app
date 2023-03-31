package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

public abstract class me2 extends se2 {

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Map<ee2, oe2>> f3700b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f3701c = new SparseBooleanArray();

    @Override // com.google.android.gms.internal.ads.se2
    public final ue2 a(m82[] m82Arr, ee2 ee2) {
        int[] iArr;
        int[] iArr2 = new int[(m82Arr.length + 1)];
        int length = m82Arr.length + 1;
        ae2[][] ae2Arr = new ae2[length][];
        int[][][] iArr3 = new int[(m82Arr.length + 1)][][];
        for (int i = 0; i < length; i++) {
            int i2 = ee2.f2410a;
            ae2Arr[i] = new ae2[i2];
            iArr3[i] = new int[i2][];
        }
        int length2 = m82Arr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = m82Arr[i3].c();
        }
        for (int i4 = 0; i4 < ee2.f2410a; i4++) {
            ae2 a2 = ee2.a(i4);
            int length3 = m82Arr.length;
            int i5 = 0;
            for (int i6 = 0; i6 < m82Arr.length; i6++) {
                m82 m82 = m82Arr[i6];
                for (int i7 = 0; i7 < a2.f1740a; i7++) {
                    int a3 = m82.a(a2.a(i7)) & 3;
                    if (a3 > i5) {
                        length3 = i6;
                        if (a3 == 3) {
                            break;
                        }
                        i5 = a3;
                    }
                }
            }
            if (length3 == m82Arr.length) {
                iArr = new int[a2.f1740a];
            } else {
                m82 m822 = m82Arr[length3];
                int[] iArr5 = new int[a2.f1740a];
                for (int i8 = 0; i8 < a2.f1740a; i8++) {
                    iArr5[i8] = m822.a(a2.a(i8));
                }
                iArr = iArr5;
            }
            int i9 = iArr2[length3];
            ae2Arr[length3][i9] = a2;
            iArr3[length3][i9] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
        }
        ee2[] ee2Arr = new ee2[m82Arr.length];
        int[] iArr6 = new int[m82Arr.length];
        for (int i10 = 0; i10 < m82Arr.length; i10++) {
            int i11 = iArr2[i10];
            ee2Arr[i10] = new ee2((ae2[]) Arrays.copyOf(ae2Arr[i10], i11));
            iArr3[i10] = (int[][]) Arrays.copyOf(iArr3[i10], i11);
            iArr6[i10] = m82Arr[i10].F();
        }
        ee2 ee22 = new ee2((ae2[]) Arrays.copyOf(ae2Arr[m82Arr.length], iArr2[m82Arr.length]));
        ne2[] a4 = a(m82Arr, ee2Arr, iArr3);
        int i12 = 0;
        while (true) {
            oe2 oe2 = null;
            if (i12 < m82Arr.length) {
                if (this.f3701c.get(i12)) {
                    a4[i12] = null;
                } else {
                    ee2 ee23 = ee2Arr[i12];
                    Map<ee2, oe2> map = this.f3700b.get(i12);
                    if (map != null) {
                        oe2 = map.get(ee23);
                    }
                    if (oe2 != null) {
                        throw new NoSuchMethodError();
                    }
                }
                i12++;
            } else {
                le2 le2 = new le2(iArr6, ee2Arr, iArr4, iArr3, ee22);
                l82[] l82Arr = new l82[m82Arr.length];
                for (int i13 = 0; i13 < m82Arr.length; i13++) {
                    l82Arr[i13] = a4[i13] != null ? l82.f3507b : null;
                }
                return new ue2(ee2, new pe2(a4), le2, l82Arr);
            }
        }
    }

    public final void a(int i, boolean z) {
        if (this.f3701c.get(i) != z) {
            this.f3701c.put(i, z);
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.se2
    public final void a(Object obj) {
        le2 le2 = (le2) obj;
    }

    /* access modifiers changed from: protected */
    public abstract ne2[] a(m82[] m82Arr, ee2[] ee2Arr, int[][][] iArr);
}
