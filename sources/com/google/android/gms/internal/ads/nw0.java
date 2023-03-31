package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

public final class nw0 {

    /* renamed from: a  reason: collision with root package name */
    private final he1 f3902a;

    /* renamed from: b  reason: collision with root package name */
    private final ml0 f3903b;

    /* renamed from: c  reason: collision with root package name */
    private final tn0 f3904c;

    public nw0(he1 he1, ml0 ml0, tn0 tn0) {
        this.f3902a = he1;
        this.f3903b = ml0;
        this.f3904c = tn0;
    }

    public final void a(kd1 kd1, id1 id1, int i, @Nullable nt0 nt0, long j) {
        nl0 nl0;
        sn0 a2 = this.f3904c.a();
        a2.a(kd1);
        a2.a(id1);
        a2.a("action", "adapter_status");
        a2.a("adapter_l", String.valueOf(j));
        a2.a("sc", Integer.toString(i));
        if (nt0 != null) {
            a2.a("arec", Integer.toString(nt0.b()));
            String a3 = this.f3902a.a(nt0.getMessage());
            if (a3 != null) {
                a2.a("areec", a3);
            }
        }
        ml0 ml0 = this.f3903b;
        Iterator<String> it = id1.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                nl0 = null;
                break;
            }
            nl0 = ml0.a(it.next());
            if (nl0 != null) {
                break;
            }
        }
        if (nl0 != null) {
            a2.a("ancn", nl0.f3863a);
            ed edVar = nl0.f3864b;
            if (edVar != null) {
                a2.a("adapter_v", edVar.toString());
            }
            ed edVar2 = nl0.f3865c;
            if (edVar2 != null) {
                a2.a("adapter_sv", edVar2.toString());
            }
        }
        a2.a();
    }
}
