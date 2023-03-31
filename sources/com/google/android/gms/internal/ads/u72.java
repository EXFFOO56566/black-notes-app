package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* access modifiers changed from: package-private */
public final class u72 implements r72 {

    /* renamed from: a  reason: collision with root package name */
    private final j82[] f4908a;

    /* renamed from: b  reason: collision with root package name */
    private final se2 f4909b;

    /* renamed from: c  reason: collision with root package name */
    private final pe2 f4910c;
    private final sk1 d;
    private final w72 e;
    private final CopyOnWriteArraySet<q72> f;
    private final p82 g;
    private final q82 h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private o82 o;
    private Object p;
    private ee2 q;
    private pe2 r;
    private k82 s;
    private z72 t;
    private int u;
    private long v;

    @SuppressLint({"HandlerLeak"})
    public u72(j82[] j82Arr, se2 se2, i82 i82) {
        String str = ag2.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        mf2.b(j82Arr.length > 0);
        mf2.a(j82Arr);
        this.f4908a = j82Arr;
        mf2.a(se2);
        this.f4909b = se2;
        this.j = false;
        this.k = 1;
        this.f = new CopyOnWriteArraySet<>();
        this.f4910c = new pe2(new ne2[j82Arr.length]);
        this.o = o82.f3963a;
        this.g = new p82();
        this.h = new q82();
        this.q = ee2.d;
        this.r = this.f4910c;
        this.s = k82.d;
        this.d = new x72(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        z72 z72 = new z72(0, 0);
        this.t = z72;
        this.e = new w72(j82Arr, se2, i82, this.j, 0, this.d, z72, this);
    }

    private final int b() {
        if (this.o.a() || this.l > 0) {
            return this.u;
        }
        this.o.a(this.t.f5710a, this.h, false);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final long H() {
        if (this.o.a()) {
            return -9223372036854775807L;
        }
        return p72.a(this.o.a(b(), this.g, false).i);
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final int T() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final long U() {
        if (this.o.a() || this.l > 0) {
            return this.v;
        }
        this.o.a(this.t.f5710a, this.h, false);
        return this.h.a() + p72.a(this.t.d);
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final boolean V() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final int W() {
        return this.f4908a.length;
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final long X() {
        if (this.o.a() || this.l > 0) {
            return this.v;
        }
        this.o.a(this.t.f5710a, this.h, false);
        return this.h.a() + p72.a(this.t.f5712c);
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final void a() {
        this.e.b();
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final void a(long j2) {
        int b2 = b();
        if (b2 < 0 || (!this.o.a() && b2 >= this.o.b())) {
            throw new f82(this.o, b2, j2);
        }
        this.l++;
        this.u = b2;
        if (!this.o.a()) {
            this.o.a(b2, this.g, false);
            long b3 = this.g.j + (j2 == -9223372036854775807L ? this.g.h : p72.b(j2));
            long j3 = this.o.a(0, this.h, false).f4290c;
            if (j3 != -9223372036854775807L) {
                int i2 = (b3 > j3 ? 1 : (b3 == j3 ? 0 : -1));
            }
        }
        if (j2 == -9223372036854775807L) {
            this.v = 0;
            this.e.a(this.o, b2, -9223372036854775807L);
            return;
        }
        this.v = j2;
        this.e.a(this.o, b2, p72.b(j2));
        Iterator<q72> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.m--;
                return;
            case 1:
                this.k = message.arg1;
                Iterator<q72> it = this.f.iterator();
                while (it.hasNext()) {
                    it.next().a(this.j, this.k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.n = z;
                Iterator<q72> it2 = this.f.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.n);
                }
                return;
            case 3:
                if (this.m == 0) {
                    ue2 ue2 = (ue2) message.obj;
                    this.i = true;
                    this.q = ue2.f4939a;
                    this.r = ue2.f4940b;
                    this.f4909b.a(ue2.f4941c);
                    Iterator<q72> it3 = this.f.iterator();
                    while (it3.hasNext()) {
                        it3.next().a(this.q, this.r);
                    }
                    return;
                }
                return;
            case 4:
                int i2 = this.l - 1;
                this.l = i2;
                if (i2 == 0) {
                    this.t = (z72) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<q72> it4 = this.f.iterator();
                        while (it4.hasNext()) {
                            it4.next().a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.l == 0) {
                    this.t = (z72) message.obj;
                    Iterator<q72> it5 = this.f.iterator();
                    while (it5.hasNext()) {
                        it5.next().a();
                    }
                    return;
                }
                return;
            case 6:
                b82 b82 = (b82) message.obj;
                this.l -= b82.d;
                if (this.m == 0) {
                    this.o = b82.f1889a;
                    this.p = b82.f1890b;
                    this.t = b82.f1891c;
                    Iterator<q72> it6 = this.f.iterator();
                    while (it6.hasNext()) {
                        it6.next().a(this.o, this.p);
                    }
                    return;
                }
                return;
            case 7:
                k82 k82 = (k82) message.obj;
                if (!this.s.equals(k82)) {
                    this.s = k82;
                    Iterator<q72> it7 = this.f.iterator();
                    while (it7.hasNext()) {
                        it7.next().a(k82);
                    }
                    return;
                }
                return;
            case 8:
                o72 o72 = (o72) message.obj;
                Iterator<q72> it8 = this.f.iterator();
                while (it8.hasNext()) {
                    it8.next().a(o72);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final void a(nd2 nd2) {
        if (!this.o.a() || this.p != null) {
            this.o = o82.f3963a;
            this.p = null;
            Iterator<q72> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a(this.o, this.p);
            }
        }
        if (this.i) {
            this.i = false;
            this.q = ee2.d;
            this.r = this.f4910c;
            this.f4909b.a((Object) null);
            Iterator<q72> it2 = this.f.iterator();
            while (it2.hasNext()) {
                it2.next().a(this.q, this.r);
            }
        }
        this.m++;
        this.e.a(nd2, true);
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final void a(q72 q72) {
        this.f.remove(q72);
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final void a(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.e.a(z);
            Iterator<q72> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a(z, this.k);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final void a(s72... s72Arr) {
        this.e.b(s72Arr);
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final void b(q72 q72) {
        this.f.add(q72);
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final void b(s72... s72Arr) {
        this.e.a(s72Arr);
    }

    @Override // com.google.android.gms.internal.ads.r72
    public final void stop() {
        this.e.c();
    }
}
