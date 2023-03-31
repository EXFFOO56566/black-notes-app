package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ik2;
import com.google.android.gms.internal.ads.tk2;
import com.google.android.gms.internal.ads.vk2;

final /* synthetic */ class am0 implements zj2 {

    /* renamed from: a  reason: collision with root package name */
    private final ik2.a f1784a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1785b;

    /* renamed from: c  reason: collision with root package name */
    private final hl2 f1786c;
    private final String d;

    am0(ik2.a aVar, String str, hl2 hl2, String str2) {
        this.f1784a = aVar;
        this.f1785b = str;
        this.f1786c = hl2;
        this.d = str2;
    }

    @Override // com.google.android.gms.internal.ads.zj2
    public final void a(vk2.a aVar) {
        ik2.a aVar2 = this.f1784a;
        String str = this.f1785b;
        hl2 hl2 = this.f1786c;
        String str2 = this.d;
        ik2.b bVar = (ik2.b) aVar.o().k();
        bVar.a(aVar2);
        aVar.a(bVar);
        tk2.a aVar3 = (tk2.a) aVar.n().k();
        aVar3.a(str);
        aVar3.a(hl2);
        aVar.a(aVar3);
        aVar.a(str2);
    }
}
