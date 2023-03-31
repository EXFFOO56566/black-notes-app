package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.ok2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
public final class jf1 implements kf1 {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<uf1, hf1> f3213a;

    /* renamed from: b  reason: collision with root package name */
    private nf1 f3214b;

    /* renamed from: c  reason: collision with root package name */
    private lf1 f3215c = new lf1();

    public jf1(nf1 nf1) {
        this.f3213a = new ConcurrentHashMap<>(nf1.i);
        this.f3214b = nf1;
    }

    private final void a(rf1<?> rf1, ig1 ig1) {
        if (rf1 != null) {
            ok2.c p = ok2.p();
            ok2.a.C0077a p2 = ok2.a.p();
            p2.a(ok2.b.IN_MEMORY);
            ok2.d.a p3 = ok2.d.p();
            p3.a(ig1.f3081b);
            p3.a(ig1.f3082c);
            p2.a(p3);
            p.a(p2);
            rf1.f4494a.c().c((ok2) ((rz1) p.e()));
        }
        b();
    }

    private final void b() {
        if (nf1.d()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3214b.g);
            sb.append(" PoolCollection");
            sb.append(this.f3215c.g());
            int i = 0;
            for (Map.Entry<uf1, hf1> entry : this.f3213a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < entry.getValue().b(); i2++) {
                    sb.append("[O]");
                }
                for (int b2 = entry.getValue().b(); b2 < this.f3214b.i; b2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(entry.getValue().f());
                sb.append("\n");
            }
            while (i < this.f3214b.h) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            co.a(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.kf1
    public final nf1 a() {
        return this.f3214b;
    }

    @Override // com.google.android.gms.internal.ads.kf1
    @Deprecated
    public final uf1 a(rm2 rm2, String str, bn2 bn2) {
        return new tf1(rm2, str, new hg(this.f3214b.e).a().j, this.f3214b.k, bn2);
    }

    @Override // com.google.android.gms.internal.ads.kf1
    public final synchronized boolean a(uf1 uf1) {
        hf1 hf1 = this.f3213a.get(uf1);
        if (hf1 != null) {
            return hf1.b() < this.f3214b.i;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.kf1
    public final synchronized boolean a(uf1 uf1, rf1<?> rf1) {
        boolean a2;
        ConcurrentHashMap<uf1, hf1> concurrentHashMap;
        hf1 hf1 = this.f3213a.get(uf1);
        rf1.d = q.j().a();
        if (hf1 == null) {
            hf1 = new hf1(this.f3214b.i, this.f3214b.j * 1000);
            if (this.f3213a.size() == this.f3214b.h) {
                int i = mf1.f3702a[this.f3214b.m - 1];
                long j = Long.MAX_VALUE;
                uf1 uf12 = null;
                if (i == 1) {
                    for (Map.Entry<uf1, hf1> entry : this.f3213a.entrySet()) {
                        if (entry.getValue().a() < j) {
                            j = entry.getValue().a();
                            uf12 = entry.getKey();
                        }
                    }
                    if (uf12 != null) {
                        concurrentHashMap = this.f3213a;
                    }
                    this.f3215c.d();
                } else if (i != 2) {
                    if (i == 3) {
                        int i2 = Integer.MAX_VALUE;
                        for (Map.Entry<uf1, hf1> entry2 : this.f3213a.entrySet()) {
                            if (entry2.getValue().e() < i2) {
                                i2 = entry2.getValue().e();
                                uf12 = entry2.getKey();
                            }
                        }
                        if (uf12 != null) {
                            concurrentHashMap = this.f3213a;
                        }
                    }
                    this.f3215c.d();
                } else {
                    for (Map.Entry<uf1, hf1> entry3 : this.f3213a.entrySet()) {
                        if (entry3.getValue().d() < j) {
                            j = entry3.getValue().d();
                            uf12 = entry3.getKey();
                        }
                    }
                    if (uf12 != null) {
                        concurrentHashMap = this.f3213a;
                    }
                    this.f3215c.d();
                }
                concurrentHashMap.remove(uf12);
                this.f3215c.d();
            }
            this.f3213a.put(uf1, hf1);
            this.f3215c.c();
        }
        a2 = hf1.a(rf1);
        this.f3215c.e();
        of1 f = this.f3215c.f();
        ig1 g = hf1.g();
        if (rf1 != null) {
            ok2.c p = ok2.p();
            ok2.a.C0077a p2 = ok2.a.p();
            p2.a(ok2.b.IN_MEMORY);
            ok2.e.a p3 = ok2.e.p();
            p3.a(f.f3985b);
            p3.b(f.f3986c);
            p3.a(g.f3082c);
            p2.a(p3);
            p.a(p2);
            rf1.f4494a.c().a((ok2) ((rz1) p.e()));
        }
        b();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.kf1
    public final synchronized rf1<?> b(uf1 uf1) {
        rf1<?> rf1;
        hf1 hf1 = this.f3213a.get(uf1);
        rf1 = null;
        if (hf1 != null) {
            rf1 = hf1.c();
            if (rf1 == null) {
                this.f3215c.b();
            }
            a(rf1, hf1.g());
        } else {
            this.f3215c.a();
            a((rf1<?>) null, (ig1) null);
        }
        return rf1;
    }
}
