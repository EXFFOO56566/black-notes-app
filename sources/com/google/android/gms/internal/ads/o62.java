package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;
import java.lang.reflect.InvocationTargetException;

public final class o62 extends x62 {
    public o62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2) {
        super(l52, str, str2, aVar, i, 73);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        try {
            this.d.d(((Boolean) this.e.invoke(null, new Object[]{this.f5373a.a()})).booleanValue() ? pi0.ENUM_TRUE : pi0.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.d.d(pi0.ENUM_FAILURE);
        }
    }
}
