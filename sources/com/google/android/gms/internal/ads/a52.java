package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class a52<T> implements r42<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<e52<T>> f1702a;

    /* renamed from: b  reason: collision with root package name */
    private final List<e52<Collection<T>>> f1703b;

    static {
        v42.a(Collections.emptySet());
    }

    private a52(List<e52<T>> list, List<e52<Collection<T>>> list2) {
        this.f1702a = list;
        this.f1703b = list2;
    }

    public static <T> c52<T> a(int i, int i2) {
        return new c52<>(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        int size = this.f1702a.size();
        ArrayList arrayList = new ArrayList(this.f1703b.size());
        int size2 = this.f1703b.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = this.f1703b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet b2 = q42.b(size);
        int size3 = this.f1702a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            T t = this.f1702a.get(i2).get();
            y42.a(t);
            b2.add(t);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                y42.a(obj);
                b2.add(obj);
            }
        }
        return Collections.unmodifiableSet(b2);
    }
}
