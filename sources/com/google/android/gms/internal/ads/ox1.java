package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class ox1 {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<rx1, List<Throwable>> f4065a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f4066b = new ReferenceQueue<>();

    ox1() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f4066b.poll();
            if (poll == null) {
                break;
            }
            this.f4065a.remove(poll);
        }
        List<Throwable> list = this.f4065a.get(new rx1(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f4065a.putIfAbsent(new rx1(th, this.f4066b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
