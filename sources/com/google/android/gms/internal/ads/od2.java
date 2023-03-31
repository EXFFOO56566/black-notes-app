package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

public final class od2 implements nd2 {

    /* renamed from: b  reason: collision with root package name */
    private final nd2[] f3981b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<nd2> f3982c;
    private final p82 d = new p82();
    private md2 e;
    private o82 f;
    private Object g;
    private int h = -1;
    private qd2 i;

    public od2(nd2... nd2Arr) {
        this.f3981b = nd2Arr;
        this.f3982c = new ArrayList<>(Arrays.asList(nd2Arr));
    }

    /* access modifiers changed from: private */
    public final void a(int i2, o82 o82, Object obj) {
        qd2 qd2;
        if (this.i == null) {
            int b2 = o82.b();
            int i3 = 0;
            while (true) {
                if (i3 >= b2) {
                    if (this.h == -1) {
                        this.h = o82.c();
                    } else if (o82.c() != this.h) {
                        qd2 = new qd2(1);
                    }
                    qd2 = null;
                } else if (o82.a(i3, this.d, false).e) {
                    qd2 = new qd2(0);
                    break;
                } else {
                    i3++;
                }
            }
            this.i = qd2;
        }
        if (this.i == null) {
            this.f3982c.remove(this.f3981b[i2]);
            if (i2 == 0) {
                this.f = o82;
                this.g = obj;
            }
            if (this.f3982c.isEmpty()) {
                this.e.a(this.f, this.g);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nd2
    public final ld2 a(int i2, we2 we2) {
        int length = this.f3981b.length;
        ld2[] ld2Arr = new ld2[length];
        for (int i3 = 0; i3 < length; i3++) {
            ld2Arr[i3] = this.f3981b[i3].a(i2, we2);
        }
        return new pd2(ld2Arr);
    }

    @Override // com.google.android.gms.internal.ads.nd2
    public final void a() {
        qd2 qd2 = this.i;
        if (qd2 == null) {
            for (nd2 nd2 : this.f3981b) {
                nd2.a();
            }
            return;
        }
        throw qd2;
    }

    @Override // com.google.android.gms.internal.ads.nd2
    public final void a(ld2 ld2) {
        pd2 pd2 = (pd2) ld2;
        int i2 = 0;
        while (true) {
            nd2[] nd2Arr = this.f3981b;
            if (i2 < nd2Arr.length) {
                nd2Arr[i2].a(pd2.f4151b[i2]);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nd2
    public final void a(r72 r72, boolean z, md2 md2) {
        this.e = md2;
        int i2 = 0;
        while (true) {
            nd2[] nd2Arr = this.f3981b;
            if (i2 < nd2Arr.length) {
                nd2Arr[i2].a(r72, false, new rd2(this, i2));
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nd2
    public final void b() {
        for (nd2 nd2 : this.f3981b) {
            nd2.b();
        }
    }
}
