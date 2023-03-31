package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.ik2;
import com.google.android.gms.internal.ads.rz1;
import com.google.android.gms.internal.ads.tk2;

public final class vk2 extends rz1<vk2, a> implements e12 {
    private static final vk2 zzbzo;
    private static volatile l12<vk2> zzea;
    private int zzbzb;
    private String zzbzc = BuildConfig.FLAVOR;
    private int zzbzd;
    private int zzbze = 1000;
    private hl2 zzbzf;
    private zz1 zzbzg = rz1.n();
    private tk2 zzbzh;
    private uk2 zzbzi;
    private zk2 zzbzj;
    private ik2 zzbzk;
    private bl2 zzbzl;
    private nk2 zzbzm;
    private ok2 zzbzn;
    private int zzdl;

    public static final class a extends rz1.a<vk2, a> implements e12 {
        private a() {
            super(vk2.zzbzo);
        }

        /* synthetic */ a(hk2 hk2) {
            this();
        }

        public final a a(bl2 bl2) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vk2) this.f4576c).a((vk2) bl2);
            return this;
        }

        public final a a(ik2.b bVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vk2) this.f4576c).a((vk2) ((ik2) ((rz1) bVar.e())));
            return this;
        }

        public final a a(nk2 nk2) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vk2) this.f4576c).a((vk2) nk2);
            return this;
        }

        public final a a(ok2 ok2) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vk2) this.f4576c).a((vk2) ok2);
            return this;
        }

        public final a a(tk2.a aVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vk2) this.f4576c).a((vk2) ((tk2) ((rz1) aVar.e())));
            return this;
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vk2) this.f4576c).a((vk2) iterable);
            return this;
        }

        public final a a(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vk2) this.f4576c).a((vk2) str);
            return this;
        }

        public final String m() {
            return ((vk2) this.f4576c).p();
        }

        public final tk2 n() {
            return ((vk2) this.f4576c).q();
        }

        public final ik2 o() {
            return ((vk2) this.f4576c).r();
        }

        public final a p() {
            if (this.d) {
                i();
                this.d = false;
            }
            ((vk2) this.f4576c).s();
            return this;
        }
    }

    static {
        vk2 vk2 = new vk2();
        zzbzo = vk2;
        rz1.a(vk2.class, vk2);
    }

    private vk2() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(bl2 bl2) {
        bl2.getClass();
        this.zzbzl = bl2;
        this.zzdl |= 512;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(ik2 ik2) {
        ik2.getClass();
        this.zzbzk = ik2;
        this.zzdl |= 256;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(nk2 nk2) {
        nk2.getClass();
        this.zzbzm = nk2;
        this.zzdl |= 1024;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(ok2 ok2) {
        ok2.getClass();
        this.zzbzn = ok2;
        this.zzdl |= 2048;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(tk2 tk2) {
        tk2.getClass();
        this.zzbzh = tk2;
        this.zzdl |= 32;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iterable<? extends Long> iterable) {
        if (!this.zzbzg.h()) {
            zz1 zz1 = this.zzbzg;
            int size = zz1.size();
            this.zzbzg = zz1.b(size == 0 ? 10 : size << 1);
        }
        tx1.a(iterable, this.zzbzg);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdl |= 2;
        this.zzbzc = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void s() {
        this.zzbzg = rz1.n();
    }

    public static a t() {
        return (a) zzbzo.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (hk2.f2935a[i - 1]) {
            case 1:
                return new vk2();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzbzo, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\t\u0004\u0000\n\b\u0001\u000b\u000b\u0002\f\f\u0003\r\t\u0004\u000e\u0015\u000f\t\u0005\u0010\t\u0006\u0011\t\u0007\u0012\t\b\u0013\t\t\u0014\t\n\u0015\t\u000b", new Object[]{"zzdl", "zzbzb", "zzbzc", "zzbzd", "zzbze", wl2.b(), "zzbzf", "zzbzg", "zzbzh", "zzbzi", "zzbzj", "zzbzk", "zzbzl", "zzbzm", "zzbzn"});
            case 4:
                return zzbzo;
            case 5:
                l12<vk2> l12 = zzea;
                if (l12 == null) {
                    synchronized (vk2.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzbzo);
                            zzea = l12;
                        }
                    }
                }
                return l12;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String p() {
        return this.zzbzc;
    }

    public final tk2 q() {
        tk2 tk2 = this.zzbzh;
        return tk2 == null ? tk2.p() : tk2;
    }

    public final ik2 r() {
        ik2 ik2 = this.zzbzk;
        return ik2 == null ? ik2.q() : ik2;
    }
}
