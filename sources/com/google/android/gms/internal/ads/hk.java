package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

public final class hk {

    /* renamed from: a  reason: collision with root package name */
    private final d f2929a;

    /* renamed from: b  reason: collision with root package name */
    private final tk f2930b;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<gk> f2931c;
    private final Object d = new Object();
    private final String e;
    private final String f;
    @GuardedBy("lock")
    private long g = -1;
    @GuardedBy("lock")
    private long h = -1;
    @GuardedBy("lock")
    private long i = -1;
    @GuardedBy("lock")
    private long j = 0;
    @GuardedBy("lock")
    private long k = -1;
    @GuardedBy("lock")
    private long l = -1;

    hk(d dVar, tk tkVar, String str, String str2) {
        this.f2929a = dVar;
        this.f2930b = tkVar;
        this.e = str;
        this.f = str2;
        this.f2931c = new LinkedList<>();
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.e);
            bundle.putString("slotid", this.f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.k);
            bundle.putLong("tresponse", this.l);
            bundle.putLong("timp", this.h);
            bundle.putLong("tload", this.i);
            bundle.putLong("pcc", this.j);
            bundle.putLong("tfetch", this.g);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<gk> it = this.f2931c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final void a(long j2) {
        synchronized (this.d) {
            this.l = j2;
            if (j2 != -1) {
                this.f2930b.a(this);
            }
        }
    }

    public final void a(rm2 rm2) {
        synchronized (this.d) {
            long b2 = this.f2929a.b();
            this.k = b2;
            this.f2930b.a(rm2, b2);
        }
    }

    public final void a(boolean z) {
        synchronized (this.d) {
            if (this.l != -1) {
                this.i = this.f2929a.b();
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            if (this.l != -1 && this.h == -1) {
                this.h = this.f2929a.b();
                this.f2930b.a(this);
            }
            this.f2930b.a();
        }
    }

    public final void c() {
        synchronized (this.d) {
            if (this.l != -1) {
                gk gkVar = new gk(this);
                gkVar.d();
                this.f2931c.add(gkVar);
                this.j++;
                this.f2930b.b();
                this.f2930b.a(this);
            }
        }
    }

    public final void d() {
        synchronized (this.d) {
            if (this.l != -1 && !this.f2931c.isEmpty()) {
                gk last = this.f2931c.getLast();
                if (last.b() == -1) {
                    last.c();
                    this.f2930b.a(this);
                }
            }
        }
    }

    public final String e() {
        return this.e;
    }
}
