package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class j02 extends xx1<String> implements i02, RandomAccess {
    private static final j02 d;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f3163c;

    static {
        j02 j02 = new j02();
        d = j02;
        j02.c();
    }

    public j02() {
        this(10);
    }

    public j02(int i) {
        this(new ArrayList(i));
    }

    private j02(ArrayList<Object> arrayList) {
        this.f3163c = arrayList;
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof dy1 ? ((dy1) obj).d() : uz1.c((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.i02
    public final void a(dy1 dy1) {
        a();
        this.f3163c.add(dy1);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.f3163c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.List, java.util.AbstractList
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof i02) {
            collection = ((i02) collection).f();
        }
        boolean addAll = this.f3163c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.i02
    public final Object c(int i) {
        return this.f3163c.get(i);
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void clear() {
        a();
        this.f3163c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.yz1
    public final /* synthetic */ yz1 e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f3163c);
            return new j02(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.i02
    public final List<?> f() {
        return Collections.unmodifiableList(this.f3163c);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        Object obj = this.f3163c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof dy1) {
            dy1 dy1 = (dy1) obj;
            String d2 = dy1.d();
            if (dy1.e()) {
                this.f3163c.set(i, d2);
            }
            return d2;
        }
        byte[] bArr = (byte[]) obj;
        String c2 = uz1.c(bArr);
        if (uz1.b(bArr)) {
            this.f3163c.set(i, c2);
        }
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.i02
    public final i02 j() {
        return h() ? new t22(this) : this;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        Object remove = this.f3163c.remove(i);
        ((AbstractList) this).modCount++;
        return a(remove);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        a();
        return a(this.f3163c.set(i, (String) obj));
    }

    public final int size() {
        return this.f3163c.size();
    }
}
