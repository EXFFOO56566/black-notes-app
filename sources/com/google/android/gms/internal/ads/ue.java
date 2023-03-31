package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class ue extends h72 implements se {
    ue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.se
    public final void b(List<Uri> list) {
        Parcel r0 = r0();
        r0.writeTypedList(list);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.se
    public final void d(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(2, r0);
    }
}
