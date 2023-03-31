package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

final class x40 implements q60, l70 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f5361b;

    /* renamed from: c  reason: collision with root package name */
    private final id1 f5362c;
    private final ie d;

    public x40(Context context, id1 id1, ie ieVar) {
        this.f5361b = context;
        this.f5362c = id1;
        this.d = ieVar;
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void a(Context context) {
        this.d.a();
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void b(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void d(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final void s() {
        ge geVar = this.f5362c.U;
        if (geVar != null && geVar.f2744a) {
            ArrayList arrayList = new ArrayList();
            if (!this.f5362c.U.f2745b.isEmpty()) {
                arrayList.add(this.f5362c.U.f2745b);
            }
            this.d.a(this.f5361b, arrayList);
        }
    }
}
