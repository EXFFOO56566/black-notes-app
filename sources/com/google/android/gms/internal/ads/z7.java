package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class z7 {
    private static final Comparator<byte[]> e = new cb();

    /* renamed from: a  reason: collision with root package name */
    private final List<byte[]> f5704a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<byte[]> f5705b = new ArrayList(64);

    /* renamed from: c  reason: collision with root package name */
    private int f5706c = 0;
    private final int d = 4096;

    public z7(int i) {
    }

    private final synchronized void a() {
        while (this.f5706c > this.d) {
            byte[] remove = this.f5704a.remove(0);
            this.f5705b.remove(remove);
            this.f5706c -= remove.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.f5704a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f5705b, bArr, e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f5705b.add(binarySearch, bArr);
                this.f5706c += bArr.length;
                a();
            }
        }
    }

    public final synchronized byte[] a(int i) {
        for (int i2 = 0; i2 < this.f5705b.size(); i2++) {
            byte[] bArr = this.f5705b.get(i2);
            if (bArr.length >= i) {
                this.f5706c -= bArr.length;
                this.f5705b.remove(i2);
                this.f5704a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
