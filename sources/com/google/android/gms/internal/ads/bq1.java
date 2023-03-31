package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.yu1;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class bq1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f1990a = Logger.getLogger(bq1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap<String, a> f1991b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap<String, b> f1992c = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> d = new ConcurrentHashMap();
    private static final ConcurrentMap<String, ip1<?>> e = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, aq1<?>> f = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    public interface a {
        <P> lp1<P> a(Class<P> cls);

        Set<Class<?>> a();

        lp1<?> b();

        Class<?> c();

        Class<?> d();
    }

    interface b {
    }

    private static <KeyProtoT extends c12> a a(qp1<KeyProtoT> qp1) {
        return new dq1(qp1);
    }

    private static synchronized a a(String str) {
        a aVar;
        synchronized (bq1.class) {
            if (!f1991b.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            aVar = f1991b.get(str);
        }
        return aVar;
    }

    private static <P> lp1<P> a(String str, Class<P> cls) {
        a a2 = a(str);
        if (cls == null) {
            return (lp1<P>) a2.b();
        }
        if (a2.a().contains(cls)) {
            return a2.a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(a2.d());
        Set<Class<?>> a3 = a2.a();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : a3) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static synchronized ou1 a(uu1 uu1) {
        ou1 a2;
        synchronized (bq1.class) {
            lp1<?> c2 = c(uu1.p());
            if (d.get(uu1.p()).booleanValue()) {
                a2 = c2.a(uu1.q());
            } else {
                String valueOf = String.valueOf(uu1.p());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: com.google.android.gms.internal.ads.yp1<P> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <P> yp1<P> a(rp1 rp1, lp1<P> lp1, Class<P> cls) {
        a(cls);
        Class<P> cls2 = cls;
        jq1.b(rp1.a());
        yp1<P> yp1 = (yp1<P>) yp1.a(cls2);
        for (yu1.a aVar : rp1.a().q()) {
            if (aVar.p() == su1.ENABLED) {
                xp1 a2 = yp1.a(a(aVar.s().p(), aVar.s().q(), cls2), aVar);
                if (aVar.t() == rp1.a().p()) {
                    yp1.a(a2);
                }
            }
        }
        return yp1;
    }

    public static <P> P a(yp1<P> yp1) {
        aq1<?> aq1 = f.get(yp1.a());
        if (aq1 != null) {
            return (P) aq1.a(yp1);
        }
        String valueOf = String.valueOf(yp1.a().getName());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
    }

    private static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static <P> P a(String str, c12 c12, Class<P> cls) {
        a(cls);
        return (P) a(str, cls).a(c12);
    }

    private static <P> P a(String str, dy1 dy1, Class<P> cls) {
        return (P) a(str, cls).c(dy1);
    }

    public static <P> P a(String str, byte[] bArr, Class<P> cls) {
        dy1 a2 = dy1.a(bArr);
        a(cls);
        return (P) a(str, a2, cls);
    }

    public static synchronized <P> void a(aq1<P> aq1) {
        synchronized (bq1.class) {
            if (aq1 != null) {
                Class<P> a2 = aq1.a();
                if (f.containsKey(a2)) {
                    aq1<?> aq12 = f.get(a2);
                    if (!aq1.getClass().equals(aq12.getClass())) {
                        Logger logger = f1990a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(a2.toString());
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", a2.getName(), aq12.getClass().getName(), aq1.getClass().getName()));
                    }
                }
                f.put(a2, aq1);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    public static synchronized <KeyProtoT extends c12, PublicKeyProtoT extends c12> void a(cq1<KeyProtoT, PublicKeyProtoT> cq1, qp1<PublicKeyProtoT> qp1, boolean z) {
        Class<?> c2;
        synchronized (bq1.class) {
            String a2 = cq1.a();
            String a3 = qp1.a();
            a(a2, cq1.getClass(), true);
            a(a3, qp1.getClass(), false);
            if (!a2.equals(a3)) {
                if (f1991b.containsKey(a2) && (c2 = f1991b.get(a2).c()) != null) {
                    if (!c2.equals(qp1.getClass())) {
                        Logger logger = f1990a;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 96 + String.valueOf(a3).length());
                        sb.append("Attempted overwrite of a registered key manager for key type ");
                        sb.append(a2);
                        sb.append(" with inconsistent public key type ");
                        sb.append(a3);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", cq1.getClass().getName(), c2.getName(), qp1.getClass().getName()));
                    }
                }
                if (!f1991b.containsKey(a2) || f1991b.get(a2).c() == null) {
                    f1991b.put(a2, new hq1(cq1, qp1));
                    f1992c.put(a2, b(cq1));
                }
                d.put(a2, true);
                if (!f1991b.containsKey(a3)) {
                    f1991b.put(a3, a((qp1) qp1));
                }
                d.put(a3, false);
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized <P> void a(lp1<P> lp1, boolean z) {
        synchronized (bq1.class) {
            if (lp1 != null) {
                String b2 = lp1.b();
                a(b2, lp1.getClass(), z);
                if (!f1991b.containsKey(b2)) {
                    f1991b.put(b2, new fq1(lp1));
                }
                d.put(b2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <KeyProtoT extends c12> void a(qp1<KeyProtoT> qp1, boolean z) {
        synchronized (bq1.class) {
            String a2 = qp1.a();
            a(a2, qp1.getClass(), true);
            if (!f1991b.containsKey(a2)) {
                f1991b.put(a2, a((qp1) qp1));
                f1992c.put(a2, b(qp1));
            }
            d.put(a2, true);
        }
    }

    private static synchronized <P> void a(String str, Class<?> cls, boolean z) {
        synchronized (bq1.class) {
            if (f1991b.containsKey(str)) {
                a aVar = f1991b.get(str);
                if (!aVar.d().equals(cls)) {
                    Logger logger = f1990a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(str);
                    logger.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, aVar.d().getName(), cls.getName()));
                } else if (z && !d.get(str).booleanValue()) {
                    String valueOf2 = String.valueOf(str);
                    throw new GeneralSecurityException(valueOf2.length() != 0 ? "New keys are already disallowed for key type ".concat(valueOf2) : new String("New keys are already disallowed for key type "));
                }
            }
        }
    }

    private static <KeyProtoT extends c12> b b(qp1<KeyProtoT> qp1) {
        return new gq1(qp1);
    }

    public static synchronized c12 b(uu1 uu1) {
        c12 b2;
        synchronized (bq1.class) {
            lp1<?> c2 = c(uu1.p());
            if (d.get(uu1.p()).booleanValue()) {
                b2 = c2.b(uu1.q());
            } else {
                String valueOf = String.valueOf(uu1.p());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return b2;
    }

    @Deprecated
    public static ip1<?> b(String str) {
        String str2;
        String str3;
        if (str != null) {
            ip1<?> ip1 = e.get(str.toLowerCase());
            if (ip1 != null) {
                return ip1;
            }
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call DeterministicAeadConfig.register().";
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call StreamingAeadConfig.register().";
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call HybridConfig.register().";
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call MacConfig.register().";
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call SignatureConfig.register().";
            } else {
                if (str.toLowerCase().startsWith("tink")) {
                    str2 = String.valueOf(format);
                    str3 = "Maybe call TinkConfig.register().";
                }
                throw new GeneralSecurityException(format);
            }
            format = str2.concat(str3);
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    private static lp1<?> c(String str) {
        return a(str).b();
    }
}
