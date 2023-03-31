package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class xr implements Iterable<vr> {

    /* renamed from: b  reason: collision with root package name */
    private final List<vr> f5482b = new ArrayList();

    public static boolean a(gq gqVar) {
        vr b2 = b(gqVar);
        if (b2 == null) {
            return false;
        }
        b2.d.b();
        return true;
    }

    static vr b(gq gqVar) {
        Iterator<vr> it = q.y().iterator();
        while (it.hasNext()) {
            vr next = it.next();
            if (next.f5147c == gqVar) {
                return next;
            }
        }
        return null;
    }

    public final void a(vr vrVar) {
        this.f5482b.add(vrVar);
    }

    public final void b(vr vrVar) {
        this.f5482b.remove(vrVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<vr> iterator() {
        return this.f5482b.iterator();
    }
}
