package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class b implements DynamiteModule.b {
    b() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.AbstractC0075b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int a2 = bVar.a(context, str);
        aVar.f1664a = a2;
        if (a2 != 0) {
            aVar.f1666c = -1;
        } else {
            int a3 = bVar.a(context, str, true);
            aVar.f1665b = a3;
            if (a3 != 0) {
                aVar.f1666c = 1;
            }
        }
        return aVar;
    }
}
