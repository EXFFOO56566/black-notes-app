package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class tk implements xh2 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4825a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final yk f4826b;

    /* renamed from: c  reason: collision with root package name */
    private final rk f4827c;
    private final pk d;
    private final HashSet<hk> e = new HashSet<>();
    private final HashSet<qk> f = new HashSet<>();

    public tk(String str, yk ykVar) {
        this.d = new pk(str, ykVar);
        this.f4826b = ykVar;
        this.f4827c = new rk();
    }

    public final Bundle a(Context context, ok okVar) {
        HashSet<hk> hashSet = new HashSet<>();
        synchronized (this.f4825a) {
            hashSet.addAll(this.e);
            this.e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.d.a(context, this.f4827c.b()));
        Bundle bundle2 = new Bundle();
        Iterator<qk> it = this.f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<hk> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            okVar.a(hashSet);
            return bundle;
        }
        it.next();
        throw new NoSuchMethodError();
    }

    public final hk a(d dVar, String str) {
        return new hk(dVar, this, this.f4827c.a(), str);
    }

    public final void a() {
        synchronized (this.f4825a) {
            this.d.a();
        }
    }

    public final void a(hk hkVar) {
        synchronized (this.f4825a) {
            this.e.add(hkVar);
        }
    }

    public final void a(rm2 rm2, long j) {
        synchronized (this.f4825a) {
            this.d.a(rm2, j);
        }
    }

    public final void a(HashSet<hk> hashSet) {
        synchronized (this.f4825a) {
            this.e.addAll(hashSet);
        }
    }

    @Override // com.google.android.gms.internal.ads.xh2
    public final void a(boolean z) {
        long a2 = q.j().a();
        if (z) {
            if (a2 - this.f4826b.e() > ((Long) on2.e().a(zr2.p0)).longValue()) {
                this.d.d = -1;
                return;
            }
            this.d.d = this.f4826b.a();
            return;
        }
        this.f4826b.a(a2);
        this.f4826b.b(this.d.d);
    }

    public final void b() {
        synchronized (this.f4825a) {
            this.d.b();
        }
    }
}
