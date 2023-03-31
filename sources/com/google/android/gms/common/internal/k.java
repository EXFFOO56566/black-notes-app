package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import b.c.b.a.c.f;
import com.google.android.gms.common.api.a;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f1631a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private f f1632b;

    public k(f fVar) {
        r.a(fVar);
        this.f1632b = fVar;
    }

    public int a(Context context, a.f fVar) {
        r.a(context);
        r.a(fVar);
        int i = 0;
        if (!fVar.d()) {
            return 0;
        }
        int e = fVar.e();
        int i2 = this.f1631a.get(e, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f1631a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f1631a.keyAt(i3);
            if (keyAt > e && this.f1631a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f1632b.a(context, e);
        }
        this.f1631a.put(e, i);
        return i;
    }

    public void a() {
        this.f1631a.clear();
    }
}
