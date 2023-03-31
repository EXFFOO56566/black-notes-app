package com.google.android.gms.internal.ads;

import android.provider.Settings;
import com.google.android.gms.internal.ads.ba0;
import java.lang.reflect.InvocationTargetException;

public final class w52 extends x62 {
    public w52(l52 l52, String str, String str2, ba0.a aVar, int i, int i2) {
        super(l52, str, str2, aVar, i, 49);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.x62
    public final void a() {
        this.d.b(pi0.ENUM_FAILURE);
        try {
            this.d.b(((Boolean) this.e.invoke(null, new Object[]{this.f5373a.a()})).booleanValue() ? pi0.ENUM_TRUE : pi0.ENUM_FALSE);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
