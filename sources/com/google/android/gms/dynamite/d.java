package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class d implements DynamiteModule.b {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.AbstractC0075b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int a2 = bVar.a(context, str);
        aVar.f1664a = a2;
        aVar.f1665b = a2 != 0 ? bVar.a(context, str, false) : bVar.a(context, str, true);
        if (aVar.f1664a == 0 && aVar.f1665b == 0) {
            aVar.f1666c = 0;
        } else if (aVar.f1664a >= aVar.f1665b) {
            aVar.f1666c = -1;
        } else {
            aVar.f1666c = 1;
        }
        return aVar;
    }
}
