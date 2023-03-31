package com.google.android.gms.internal.ads;

import java.util.Iterator;

public abstract class vl1<E> {
    vl1() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.vl1<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public vl1<E> a(Iterable<? extends E> iterable) {
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public abstract vl1<E> a(E e);

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.vl1<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public vl1<E> a(Iterator<? extends E> it) {
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
