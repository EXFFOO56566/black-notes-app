package com.google.android.gms.common.api;

import a.e.a;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.b;
import java.util.ArrayList;

public class c extends Exception {

    /* renamed from: b  reason: collision with root package name */
    private final a<b<?>, b.c.b.a.c.b> f1535b;

    public c(a<b<?>, b.c.b.a.c.b> aVar) {
        this.f1535b = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (b<?> bVar : this.f1535b.keySet()) {
            b.c.b.a.c.b bVar2 = this.f1535b.get(bVar);
            if (bVar2.j()) {
                z = false;
            }
            String a2 = bVar.a();
            String valueOf = String.valueOf(bVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a2);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
