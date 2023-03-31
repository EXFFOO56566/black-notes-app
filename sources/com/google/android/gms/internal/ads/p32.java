package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;
import java.util.Collections;
import java.util.List;

public final class p32 extends rz1<p32, b> implements e12 {
    private static volatile l12<p32> zzea;
    private static final p32 zzify;
    private int zzbxl;
    private int zzdl;
    private dy1 zzies = dy1.f2334c;
    private byte zziew = 2;
    private String zziez = BuildConfig.FLAVOR;
    private int zzifj;
    private String zzifk = BuildConfig.FLAVOR;
    private String zzifl = BuildConfig.FLAVOR;
    private a zzifm;
    private yz1<h> zzifn = rz1.o();
    private String zzifo = BuildConfig.FLAVOR;
    private f zzifp;
    private boolean zzifq;
    private yz1<String> zzifr = rz1.o();
    private String zzifs = BuildConfig.FLAVOR;
    private boolean zzift;
    private boolean zzifu;
    private i zzifv;
    private yz1<String> zzifw = rz1.o();
    private yz1<String> zzifx = rz1.o();

    public static final class a extends rz1<a, C0078a> implements e12 {
        private static volatile l12<a> zzea;
        private static final a zziga;
        private int zzdl;
        private String zzifz = BuildConfig.FLAVOR;

        /* renamed from: com.google.android.gms.internal.ads.p32$a$a  reason: collision with other inner class name */
        public static final class C0078a extends rz1.a<a, C0078a> implements e12 {
            private C0078a() {
                super(a.zziga);
            }

            /* synthetic */ C0078a(n32 n32) {
                this();
            }

            public final C0078a a(String str) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((a) this.f4576c).a((a) str);
                return this;
            }
        }

        static {
            a aVar = new a();
            zziga = aVar;
            rz1.a(a.class, aVar);
        }

        private a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(String str) {
            str.getClass();
            this.zzdl |= 1;
            this.zzifz = str;
        }

        public static C0078a p() {
            return (C0078a) zziga.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            switch (n32.f3793a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0078a(null);
                case 3:
                    return rz1.a(zziga, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdl", "zzifz"});
                case 4:
                    return zziga;
                case 5:
                    l12<a> l12 = zzea;
                    if (l12 == null) {
                        synchronized (a.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zziga);
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

    public static final class b extends rz1.a<p32, b> implements e12 {
        private b() {
            super(p32.zzify);
        }

        /* synthetic */ b(n32 n32) {
            this();
        }

        public final b a(a aVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).a((p32) aVar);
            return this;
        }

        public final b a(f fVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).a((p32) fVar);
            return this;
        }

        public final b a(g gVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).a((p32) gVar);
            return this;
        }

        public final b a(h hVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).a((p32) hVar);
            return this;
        }

        public final b a(i iVar) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).a((p32) iVar);
            return this;
        }

        public final b a(Iterable<String> iterable) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).a((p32) iterable);
            return this;
        }

        public final b a(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).a((p32) str);
            return this;
        }

        public final b b(Iterable<String> iterable) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).b((p32) iterable);
            return this;
        }

        public final b b(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).c(str);
            return this;
        }

        public final b c(String str) {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).b((p32) str);
            return this;
        }

        public final String m() {
            return ((p32) this.f4576c).p();
        }

        public final List<h> n() {
            return Collections.unmodifiableList(((p32) this.f4576c).q());
        }

        public final String o() {
            return ((p32) this.f4576c).r();
        }

        public final b p() {
            if (this.d) {
                i();
                this.d = false;
            }
            ((p32) this.f4576c).s();
            return this;
        }
    }

    public static final class c extends rz1<c, a> implements e12 {
        private static volatile l12<c> zzea;
        private static final c zzigc;
        private int zzdl;
        private dy1 zzhoa;
        private byte zziew = 2;
        private dy1 zzigb;

        public static final class a extends rz1.a<c, a> implements e12 {
            private a() {
                super(c.zzigc);
            }

            /* synthetic */ a(n32 n32) {
                this();
            }

            public final a a(dy1 dy1) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((c) this.f4576c).b(dy1);
                return this;
            }

            public final a b(dy1 dy1) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((c) this.f4576c).a((c) dy1);
                return this;
            }
        }

        static {
            c cVar = new c();
            zzigc = cVar;
            rz1.a(c.class, cVar);
        }

        private c() {
            dy1 dy1 = dy1.f2334c;
            this.zzigb = dy1;
            this.zzhoa = dy1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(dy1 dy1) {
            dy1.getClass();
            this.zzdl |= 2;
            this.zzhoa = dy1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(dy1 dy1) {
            dy1.getClass();
            this.zzdl |= 1;
            this.zzigb = dy1;
        }

        public static a p() {
            return (a) zzigc.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            int i2 = 1;
            switch (n32.f3793a[i - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return rz1.a(zzigc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԋ\u0000\u0002\n\u0001", new Object[]{"zzdl", "zzigb", "zzhoa"});
                case 4:
                    return zzigc;
                case 5:
                    l12<c> l12 = zzea;
                    if (l12 == null) {
                        synchronized (c.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzigc);
                                zzea = l12;
                            }
                        }
                    }
                    return l12;
                case 6:
                    return Byte.valueOf(this.zziew);
                case 7:
                    if (obj == null) {
                        i2 = 0;
                    }
                    this.zziew = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class d extends rz1<d, b> implements e12 {
        private static volatile l12<d> zzea;
        private static final d zzigi;
        private int zzdl;
        private byte zziew = 2;
        private a zzigd;
        private yz1<c> zzige = rz1.o();
        private dy1 zzigf;
        private dy1 zzigg;
        private int zzigh;

        public static final class a extends rz1<a, C0079a> implements e12 {
            private static volatile l12<a> zzea;
            private static final a zzigm;
            private int zzdl;
            private dy1 zzigj;
            private dy1 zzigk;
            private dy1 zzigl;

            /* renamed from: com.google.android.gms.internal.ads.p32$d$a$a  reason: collision with other inner class name */
            public static final class C0079a extends rz1.a<a, C0079a> implements e12 {
                private C0079a() {
                    super(a.zzigm);
                }

                /* synthetic */ C0079a(n32 n32) {
                    this();
                }
            }

            static {
                a aVar = new a();
                zzigm = aVar;
                rz1.a(a.class, aVar);
            }

            private a() {
                dy1 dy1 = dy1.f2334c;
                this.zzigj = dy1;
                this.zzigk = dy1;
                this.zzigl = dy1;
            }

            /* access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.rz1
            public final Object a(int i, Object obj, Object obj2) {
                switch (n32.f3793a[i - 1]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C0079a(null);
                    case 3:
                        return rz1.a(zzigm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzigj", "zzigk", "zzigl"});
                    case 4:
                        return zzigm;
                    case 5:
                        l12<a> l12 = zzea;
                        if (l12 == null) {
                            synchronized (a.class) {
                                l12 = zzea;
                                if (l12 == null) {
                                    l12 = new rz1.c<>(zzigm);
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

        public static final class b extends rz1.a<d, b> implements e12 {
            private b() {
                super(d.zzigi);
            }

            /* synthetic */ b(n32 n32) {
                this();
            }

            public final b a(c cVar) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((d) this.f4576c).a((d) cVar);
                return this;
            }
        }

        static {
            d dVar = new d();
            zzigi = dVar;
            rz1.a(d.class, dVar);
        }

        private d() {
            dy1 dy1 = dy1.f2334c;
            this.zzigf = dy1;
            this.zzigg = dy1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(c cVar) {
            cVar.getClass();
            if (!this.zzige.h()) {
                this.zzige = rz1.a(this.zzige);
            }
            this.zzige.add(cVar);
        }

        public static b p() {
            return (b) zzigi.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            int i2 = 1;
            switch (n32.f3793a[i - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new b(null);
                case 3:
                    return rz1.a(zzigi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003", new Object[]{"zzdl", "zzigd", "zzige", c.class, "zzigf", "zzigg", "zzigh"});
                case 4:
                    return zzigi;
                case 5:
                    l12<d> l12 = zzea;
                    if (l12 == null) {
                        synchronized (d.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzigi);
                                zzea = l12;
                            }
                        }
                    }
                    return l12;
                case 6:
                    return Byte.valueOf(this.zziew);
                case 7:
                    if (obj == null) {
                        i2 = 0;
                    }
                    this.zziew = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class e extends rz1<e, b> implements e12 {
        private static volatile l12<e> zzea;
        private static final e zzigp;
        private int zzdl;
        private byte zziew = 2;
        private yz1<c> zzige = rz1.o();
        private dy1 zzigf;
        private dy1 zzigg;
        private int zzigh;
        private a zzign;
        private dy1 zzigo;

        public static final class a extends rz1<a, C0080a> implements e12 {
            private static volatile l12<a> zzea;
            private static final a zzigs;
            private int zzdl;
            private dy1 zzigl;
            private int zzigq;
            private dy1 zzigr;

            /* renamed from: com.google.android.gms.internal.ads.p32$e$a$a  reason: collision with other inner class name */
            public static final class C0080a extends rz1.a<a, C0080a> implements e12 {
                private C0080a() {
                    super(a.zzigs);
                }

                /* synthetic */ C0080a(n32 n32) {
                    this();
                }
            }

            static {
                a aVar = new a();
                zzigs = aVar;
                rz1.a(a.class, aVar);
            }

            private a() {
                dy1 dy1 = dy1.f2334c;
                this.zzigr = dy1;
                this.zzigl = dy1;
            }

            /* access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.rz1
            public final Object a(int i, Object obj, Object obj2) {
                switch (n32.f3793a[i - 1]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C0080a(null);
                    case 3:
                        return rz1.a(zzigs, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzigq", "zzigr", "zzigl"});
                    case 4:
                        return zzigs;
                    case 5:
                        l12<a> l12 = zzea;
                        if (l12 == null) {
                            synchronized (a.class) {
                                l12 = zzea;
                                if (l12 == null) {
                                    l12 = new rz1.c<>(zzigs);
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

        public static final class b extends rz1.a<e, b> implements e12 {
            private b() {
                super(e.zzigp);
            }

            /* synthetic */ b(n32 n32) {
                this();
            }
        }

        static {
            e eVar = new e();
            zzigp = eVar;
            rz1.a(e.class, eVar);
        }

        private e() {
            dy1 dy1 = dy1.f2334c;
            this.zzigf = dy1;
            this.zzigg = dy1;
            this.zzigo = dy1;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            int i2 = 1;
            switch (n32.f3793a[i - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new b(null);
                case 3:
                    return rz1.a(zzigp, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\n\u0004", new Object[]{"zzdl", "zzign", "zzige", c.class, "zzigf", "zzigg", "zzigh", "zzigo"});
                case 4:
                    return zzigp;
                case 5:
                    l12<e> l12 = zzea;
                    if (l12 == null) {
                        synchronized (e.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzigp);
                                zzea = l12;
                            }
                        }
                    }
                    return l12;
                case 6:
                    return Byte.valueOf(this.zziew);
                case 7:
                    if (obj == null) {
                        i2 = 0;
                    }
                    this.zziew = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class f extends rz1<f, b> implements e12 {
        private static volatile l12<f> zzea;
        private static final f zzigv;
        private int zzbxl;
        private int zzdl;
        private String zzigt = BuildConfig.FLAVOR;
        private dy1 zzigu = dy1.f2334c;

        public enum a implements tz1 {
            TYPE_UNKNOWN(0),
            TYPE_CREATIVE(1);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f4099b;

            static {
                new u32();
            }

            private a(int i) {
                this.f4099b = i;
            }

            public static a a(int i) {
                if (i == 0) {
                    return TYPE_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return TYPE_CREATIVE;
            }

            public static vz1 b() {
                return t32.f4749a;
            }

            @Override // com.google.android.gms.internal.ads.tz1
            public final int a() {
                return this.f4099b;
            }

            public final String toString() {
                return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4099b + " name=" + name() + '>';
            }
        }

        public static final class b extends rz1.a<f, b> implements e12 {
            private b() {
                super(f.zzigv);
            }

            /* synthetic */ b(n32 n32) {
                this();
            }

            public final b a(dy1 dy1) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((f) this.f4576c).a((f) dy1);
                return this;
            }

            public final b a(a aVar) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((f) this.f4576c).a((f) aVar);
                return this;
            }

            public final b a(String str) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((f) this.f4576c).a((f) str);
                return this;
            }
        }

        static {
            f fVar = new f();
            zzigv = fVar;
            rz1.a(f.class, fVar);
        }

        private f() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(dy1 dy1) {
            dy1.getClass();
            this.zzdl |= 4;
            this.zzigu = dy1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(a aVar) {
            this.zzbxl = aVar.a();
            this.zzdl |= 1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(String str) {
            str.getClass();
            this.zzdl |= 2;
            this.zzigt = str;
        }

        public static b p() {
            return (b) zzigv.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            switch (n32.f3793a[i - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new b(null);
                case 3:
                    return rz1.a(zzigv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzbxl", a.b(), "zzigt", "zzigu"});
                case 4:
                    return zzigv;
                case 5:
                    l12<f> l12 = zzea;
                    if (l12 == null) {
                        synchronized (f.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzigv);
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

    public enum g implements tz1 {
        UNKNOWN(0),
        URL_PHISHING(1),
        URL_MALWARE(2),
        URL_UNWANTED(3),
        CLIENT_SIDE_PHISHING_URL(4),
        CLIENT_SIDE_MALWARE_URL(5),
        DANGEROUS_DOWNLOAD_RECOVERY(6),
        DANGEROUS_DOWNLOAD_WARNING(7),
        OCTAGON_AD(8),
        OCTAGON_AD_SB_MATCH(9);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4101b;

        static {
            new v32();
        }

        private g(int i) {
            this.f4101b = i;
        }

        public static g a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return URL_PHISHING;
                case 2:
                    return URL_MALWARE;
                case 3:
                    return URL_UNWANTED;
                case 4:
                    return CLIENT_SIDE_PHISHING_URL;
                case 5:
                    return CLIENT_SIDE_MALWARE_URL;
                case 6:
                    return DANGEROUS_DOWNLOAD_RECOVERY;
                case 7:
                    return DANGEROUS_DOWNLOAD_WARNING;
                case 8:
                    return OCTAGON_AD;
                case 9:
                    return OCTAGON_AD_SB_MATCH;
                default:
                    return null;
            }
        }

        public static vz1 b() {
            return w32.f5207a;
        }

        @Override // com.google.android.gms.internal.ads.tz1
        public final int a() {
            return this.f4101b;
        }

        public final String toString() {
            return "<" + g.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4101b + " name=" + name() + '>';
        }
    }

    public static final class h extends rz1<h, b> implements e12 {
        private static volatile l12<h> zzea;
        private static final h zzihs;
        private int zzdl;
        private byte zziew = 2;
        private String zziez = BuildConfig.FLAVOR;
        private int zzihk;
        private d zzihl;
        private e zzihm;
        private int zzihn;
        private xz1 zziho = rz1.m();
        private String zzihp = BuildConfig.FLAVOR;
        private int zzihq;
        private yz1<String> zzihr = rz1.o();

        public enum a implements tz1 {
            AD_RESOURCE_UNKNOWN(0),
            AD_RESOURCE_CREATIVE(1),
            AD_RESOURCE_POST_CLICK(2),
            AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f4103b;

            static {
                new x32();
            }

            private a(int i) {
                this.f4103b = i;
            }

            public static a a(int i) {
                if (i == 0) {
                    return AD_RESOURCE_UNKNOWN;
                }
                if (i == 1) {
                    return AD_RESOURCE_CREATIVE;
                }
                if (i == 2) {
                    return AD_RESOURCE_POST_CLICK;
                }
                if (i != 3) {
                    return null;
                }
                return AD_RESOURCE_AUTO_CLICK_DESTINATION;
            }

            public static vz1 b() {
                return y32.f5535a;
            }

            @Override // com.google.android.gms.internal.ads.tz1
            public final int a() {
                return this.f4103b;
            }

            public final String toString() {
                return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4103b + " name=" + name() + '>';
            }
        }

        public static final class b extends rz1.a<h, b> implements e12 {
            private b() {
                super(h.zzihs);
            }

            /* synthetic */ b(n32 n32) {
                this();
            }

            public final b a(int i) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((h) this.f4576c).b((h) i);
                return this;
            }

            public final b a(d dVar) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((h) this.f4576c).a((h) dVar);
                return this;
            }

            public final b a(a aVar) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((h) this.f4576c).a((h) aVar);
                return this;
            }

            public final b a(String str) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((h) this.f4576c).a((h) str);
                return this;
            }

            public final b b(String str) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((h) this.f4576c).b((h) str);
                return this;
            }
        }

        static {
            h hVar = new h();
            zzihs = hVar;
            rz1.a(h.class, hVar);
        }

        private h() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(d dVar) {
            dVar.getClass();
            this.zzihl = dVar;
            this.zzdl |= 4;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(a aVar) {
            this.zzihq = aVar.a();
            this.zzdl |= 64;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(String str) {
            str.getClass();
            this.zzdl |= 2;
            this.zziez = str;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i) {
            this.zzdl |= 1;
            this.zzihk = i;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(String str) {
            str.getClass();
            if (!this.zzihr.h()) {
                this.zzihr = rz1.a(this.zzihr);
            }
            this.zzihr.add(str);
        }

        public static b r() {
            return (b) zzihs.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            int i2 = 1;
            switch (n32.f3793a[i - 1]) {
                case 1:
                    return new h();
                case 2:
                    return new b(null);
                case 3:
                    return rz1.a(zzihs, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001Ԅ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0016\u0007\b\u0005\b\f\u0006\t\u001a", new Object[]{"zzdl", "zzihk", "zziez", "zzihl", "zzihm", "zzihn", "zziho", "zzihp", "zzihq", a.b(), "zzihr"});
                case 4:
                    return zzihs;
                case 5:
                    l12<h> l12 = zzea;
                    if (l12 == null) {
                        synchronized (h.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zzihs);
                                zzea = l12;
                            }
                        }
                    }
                    return l12;
                case 6:
                    return Byte.valueOf(this.zziew);
                case 7:
                    if (obj == null) {
                        i2 = 0;
                    }
                    this.zziew = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String p() {
            return this.zziez;
        }

        public final int q() {
            return this.zzihr.size();
        }
    }

    public static final class i extends rz1<i, a> implements e12 {
        private static volatile l12<i> zzea;
        private static final i zziib;
        private int zzdl;
        private String zzihy = BuildConfig.FLAVOR;
        private long zzihz;
        private boolean zziia;

        public static final class a extends rz1.a<i, a> implements e12 {
            private a() {
                super(i.zziib);
            }

            /* synthetic */ a(n32 n32) {
                this();
            }

            public final a a(long j) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((i) this.f4576c).a((i) j);
                return this;
            }

            public final a a(String str) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((i) this.f4576c).a((i) str);
                return this;
            }

            public final a a(boolean z) {
                if (this.d) {
                    i();
                    this.d = false;
                }
                ((i) this.f4576c).a((i) z);
                return this;
            }
        }

        static {
            i iVar = new i();
            zziib = iVar;
            rz1.a(i.class, iVar);
        }

        private i() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(long j) {
            this.zzdl |= 2;
            this.zzihz = j;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(String str) {
            str.getClass();
            this.zzdl |= 1;
            this.zzihy = str;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(boolean z) {
            this.zzdl |= 4;
            this.zziia = z;
        }

        public static a p() {
            return (a) zziib.j();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.rz1
        public final Object a(int i, Object obj, Object obj2) {
            switch (n32.f3793a[i - 1]) {
                case 1:
                    return new i();
                case 2:
                    return new a(null);
                case 3:
                    return rz1.a(zziib, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002", new Object[]{"zzdl", "zzihy", "zzihz", "zziia"});
                case 4:
                    return zziib;
                case 5:
                    l12<i> l12 = zzea;
                    if (l12 == null) {
                        synchronized (i.class) {
                            l12 = zzea;
                            if (l12 == null) {
                                l12 = new rz1.c<>(zziib);
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
        p32 p32 = new p32();
        zzify = p32;
        rz1.a(p32.class, p32);
    }

    private p32() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        aVar.getClass();
        this.zzifm = aVar;
        this.zzdl |= 32;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(f fVar) {
        fVar.getClass();
        this.zzifp = fVar;
        this.zzdl |= 128;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(g gVar) {
        this.zzbxl = gVar.a();
        this.zzdl |= 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(h hVar) {
        hVar.getClass();
        if (!this.zzifn.h()) {
            this.zzifn = rz1.a(this.zzifn);
        }
        this.zzifn.add(hVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(i iVar) {
        iVar.getClass();
        this.zzifv = iVar;
        this.zzdl |= 8192;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Iterable<String> iterable) {
        if (!this.zzifw.h()) {
            this.zzifw = rz1.a(this.zzifw);
        }
        tx1.a(iterable, this.zzifw);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        str.getClass();
        this.zzdl |= 4;
        this.zziez = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(Iterable<String> iterable) {
        if (!this.zzifx.h()) {
            this.zzifx = rz1.a(this.zzifx);
        }
        tx1.a(iterable, this.zzifx);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(String str) {
        str.getClass();
        this.zzdl |= 64;
        this.zzifo = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(String str) {
        str.getClass();
        this.zzdl |= 8;
        this.zzifk = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void s() {
        this.zzdl &= -65;
        this.zzifo = zzify.zzifo;
    }

    public static b t() {
        return (b) zzify.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rz1
    public final Object a(int i2, Object obj, Object obj2) {
        int i3 = 1;
        switch (n32.f3793a[i2 - 1]) {
            case 1:
                return new p32();
            case 2:
                return new b(null);
            case 3:
                return rz1.a(zzify, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001\b\u0002\u0002\b\u0003\u0003\b\u0004\u0004Л\u0005\u0007\b\u0006\u001a\u0007\b\t\b\u0007\n\t\u0007\u000b\n\f\u0000\u000b\f\u0001\f\t\u0005\r\b\u0006\u000e\t\u0007\u000f\n\f\u0011\t\r\u0014\u001a\u0015\u001a", new Object[]{"zzdl", "zziez", "zzifk", "zzifl", "zzifn", h.class, "zzifq", "zzifr", "zzifs", "zzift", "zzifu", "zzbxl", g.b(), "zzifj", o32.b(), "zzifm", "zzifo", "zzifp", "zzies", "zzifv", "zzifw", "zzifx"});
            case 4:
                return zzify;
            case 5:
                l12<p32> l12 = zzea;
                if (l12 == null) {
                    synchronized (p32.class) {
                        l12 = zzea;
                        if (l12 == null) {
                            l12 = new rz1.c<>(zzify);
                            zzea = l12;
                        }
                    }
                }
                return l12;
            case 6:
                return Byte.valueOf(this.zziew);
            case 7:
                if (obj == null) {
                    i3 = 0;
                }
                this.zziew = (byte) i3;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String p() {
        return this.zziez;
    }

    public final List<h> q() {
        return this.zzifn;
    }

    public final String r() {
        return this.zzifo;
    }
}
