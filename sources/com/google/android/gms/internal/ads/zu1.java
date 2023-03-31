package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;

public final class zu1 extends rz1<zu1, a> implements e12 {
    private static volatile l12<zu1> zzea;
    private static final zu1 zzhpf;
    private int zzhox;
    private yz1<b> zzhpe = rz1.o();

    public static final class a extends rz1.a<zu1, a> implements e12 {
        private a() {
            super(zu1.zzhpf);
        }

        /* synthetic */ a(av1 av1) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((zu1) this.f4576c).b(i);
            return this;
        }

        public final a a(b bVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((zu1) this.f4576c).a((zu1) bVar);
            return this;
        }
    }

    public static final class b extends rz1<b, a> implements e12 {
        private static volatile l12<b> zzea;
        private static final b zzhpg;
        private String zzhnz = BuildConfig.FLAVOR;
        private int zzhoq;
        private int zzhpb;
        private int zzhpc;

        public static final class a extends rz1.a<b, a> implements e12 {
            private a() {
                super(b.zzhpg);
            }

            /* synthetic */ a(av1 av1) {
                this();
            }

            public final a a(int i) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((b) this.f4576c).b(i);
                return this;
            }

            public final a a(lv1 lv1) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((b) this.f4576c).a((b) lv1);
                return this;
            }

            public final a a(su1 su1) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((b) this.f4576c).a((b) su1);
                return this;
            }

            public final a a(String str) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((b) this.f4576c).a((b) str);
                return this;
            }
        }

        static {
            b bVar = new b();
            zzhpg = bVar;
            rz1.a(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(lv1 lv1) {
            this.zzhoq = lv1.a();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(su1 su1) {
            this.zzhpb = su1.a();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(String str) {
            str.getClass();
            this.zzhnz = str;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i) {
            this.zzhpc = i;
        }

        public static a p() {
            return (a) zzhpg.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            switch (av1.f1823a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case 3:
                    return rz1.a(zzhpg, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhnz", "zzhpb", "zzhpc", "zzhoq"});
                case 4:
                    return zzhpg;
                case 5:
                    l12<b> l12 = zzea;
                    if (l12 == null) {
                        synchronized (b.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzhpg);
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
    }

    static {
        zu1 zu1 = new zu1();
        zzhpf = zu1;
        rz1.a(zu1.class, zu1);
    }

    private zu1() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(b bVar) {
        bVar.getClass();
        if (!this.zzhpe.h()) {
            this.zzhpe = rz1.a(this.zzhpe);
        }
        this.zzhpe.add(bVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhox = i;
    }

    public static a p() {
        return (a) zzhpf.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i, Object obj, Object obj2) {
        switch (av1.f1823a[i - 1]) {
            case 1:
                return new zu1();
            case 2:
                return new a(null);
            case 3:
                return rz1.a(zzhpf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhox", "zzhpe", b.class});
            case 4:
                return zzhpf;
            case 5:
                l12<zu1> l12 = zzea;
                if (l12 == null) {
                    synchronized (zu1.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzhpf);
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
}
