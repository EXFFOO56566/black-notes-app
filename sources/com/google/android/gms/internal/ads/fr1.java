package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ba0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class fr1 extends yh1 {
    private fr1(Context context, String str, boolean z, int i) {
        super(context, str, z, i);
    }

    public static fr1 a(String str, Context context, boolean z) {
        return b(str, context, false, yr0.f5640a);
    }

    public static fr1 b(String str, Context context, boolean z, int i) {
        yh1.a(context, z);
        yh1.a(str, context, z, i);
        return new fr1(context, str, z, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.yh1
    public final List<Callable<Void>> a(l52 l52, Context context, ba0.a aVar, s20 s20) {
        if (l52.e() == null || !this.v) {
            return super.a(l52, context, aVar, s20);
        }
        int c2 = l52.c();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.a(l52, context, aVar, s20));
        arrayList.add(new g62(l52, "hYPTVQdTm2q1YMo1lUce4yXfJpjfBpohGFUC3CCt6OsJQwu7mUSAt5mBInaYKugO", "pf4sJGlvLCh5M9DSeQtdmDF5FY3IMGGhi6Z7oCoKXow=", aVar, c2, 24));
        return arrayList;
    }
}
