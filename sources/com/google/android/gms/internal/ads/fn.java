package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

final class fn implements ud {

    /* renamed from: a  reason: collision with root package name */
    private File f2624a = null;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f2625b;

    fn(Context context) {
        this.f2625b = context;
    }

    @Override // com.google.android.gms.internal.ads.ud
    public final File a() {
        if (this.f2624a == null) {
            this.f2624a = new File(this.f2625b.getCacheDir(), "volley");
        }
        return this.f2624a;
    }
}
