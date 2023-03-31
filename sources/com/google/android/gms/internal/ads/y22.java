package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class y22 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f5528a = Logger.getLogger(y22.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f5529b = c();

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f5530c = ay1.b();
    private static final boolean d = d(Long.TYPE);
    private static final boolean e = d(Integer.TYPE);
    private static final c f;
    private static final boolean g = e();
    private static final boolean h = d();
    private static final long i = ((long) b(byte[].class));
    static final boolean j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, byte b2) {
            if (y22.j) {
                y22.a(obj, j, b2);
            } else {
                y22.b(obj, j, b2);
            }
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, boolean z) {
            if (y22.j) {
                y22.b(obj, j, z);
            } else {
                y22.c(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final boolean c(Object obj, long j) {
            return y22.j ? y22.i(obj, j) : y22.j(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final float d(Object obj, long j) {
            return Float.intBitsToFloat(a(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(b(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final byte f(Object obj, long j) {
            return y22.j ? y22.g(obj, j) : y22.h(obj, j);
        }
    }

    static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, byte b2) {
            if (y22.j) {
                y22.a(obj, j, b2);
            } else {
                y22.b(obj, j, b2);
            }
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, boolean z) {
            if (y22.j) {
                y22.b(obj, j, z);
            } else {
                y22.c(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final boolean c(Object obj, long j) {
            return y22.j ? y22.i(obj, j) : y22.j(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final float d(Object obj, long j) {
            return Float.intBitsToFloat(a(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(b(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final byte f(Object obj, long j) {
            return y22.j ? y22.g(obj, j) : y22.h(obj, j);
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f5531a;

        c(Unsafe unsafe) {
            this.f5531a = unsafe;
        }

        public final int a(Object obj, long j) {
            return this.f5531a.getInt(obj, j);
        }

        public abstract void a(Object obj, long j, byte b2);

        public abstract void a(Object obj, long j, double d);

        public abstract void a(Object obj, long j, float f);

        public final void a(Object obj, long j, int i) {
            this.f5531a.putInt(obj, j, i);
        }

        public final void a(Object obj, long j, long j2) {
            this.f5531a.putLong(obj, j, j2);
        }

        public abstract void a(Object obj, long j, boolean z);

        public final long b(Object obj, long j) {
            return this.f5531a.getLong(obj, j);
        }

        public abstract boolean c(Object obj, long j);

        public abstract float d(Object obj, long j);

        public abstract double e(Object obj, long j);

        public abstract byte f(Object obj, long j);
    }

    static final class d extends c {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, byte b2) {
            this.f5531a.putByte(obj, j, b2);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, double d) {
            this.f5531a.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, float f) {
            this.f5531a.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final void a(Object obj, long j, boolean z) {
            this.f5531a.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final boolean c(Object obj, long j) {
            return this.f5531a.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final float d(Object obj, long j) {
            return this.f5531a.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final double e(Object obj, long j) {
            return this.f5531a.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.y22.c
        public final byte f(Object obj, long j) {
            return this.f5531a.getByte(obj, j);
        }
    }

    static {
        c cVar;
        c cVar2 = null;
        if (f5529b != null) {
            if (!ay1.a()) {
                cVar2 = new d(f5529b);
            } else if (d) {
                cVar2 = new a(f5529b);
            } else if (e) {
                cVar2 = new b(f5529b);
            }
        }
        f = cVar2;
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field f2 = f();
        if (!(f2 == null || (cVar = f) == null)) {
            cVar.f5531a.objectFieldOffset(f2);
        }
    }

    private y22() {
    }

    static byte a(byte[] bArr, long j2) {
        return f.f(bArr, i + j2);
    }

    static int a(Object obj, long j2) {
        return f.a(obj, j2);
    }

    static <T> T a(Class<T> cls) {
        try {
            return (T) f5529b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void a(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int a2 = a(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a2 & (~(255 << i2))));
    }

    static void a(Object obj, long j2, double d2) {
        f.a(obj, j2, d2);
    }

    static void a(Object obj, long j2, float f2) {
        f.a(obj, j2, f2);
    }

    static void a(Object obj, long j2, int i2) {
        f.a(obj, j2, i2);
    }

    static void a(Object obj, long j2, long j3) {
        f.a(obj, j2, j3);
    }

    static void a(Object obj, long j2, Object obj2) {
        f.f5531a.putObject(obj, j2, obj2);
    }

    static void a(Object obj, long j2, boolean z) {
        f.a(obj, j2, z);
    }

    static void a(byte[] bArr, long j2, byte b2) {
        f.a((Object) bArr, i + j2, b2);
    }

    static boolean a() {
        return h;
    }

    private static int b(Class<?> cls) {
        if (h) {
            return f.f5531a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long b(Object obj, long j2) {
        return f.b(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void b(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & (~(255 << i2))));
    }

    /* access modifiers changed from: private */
    public static void b(Object obj, long j2, boolean z) {
        a(obj, j2, z ? (byte) 1 : 0);
    }

    static boolean b() {
        return g;
    }

    private static int c(Class<?> cls) {
        if (h) {
            return f.f5531a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new x22());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void c(Object obj, long j2, boolean z) {
        b(obj, j2, z ? (byte) 1 : 0);
    }

    static boolean c(Object obj, long j2) {
        return f.c(obj, j2);
    }

    static float d(Object obj, long j2) {
        return f.d(obj, j2);
    }

    private static boolean d() {
        Unsafe unsafe = f5529b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (ay1.a()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f5528a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean d(Class<?> cls) {
        if (!ay1.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f5530c;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static double e(Object obj, long j2) {
        return f.e(obj, j2);
    }

    private static boolean e() {
        Unsafe unsafe = f5529b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (f() == null) {
                return false;
            }
            if (ay1.a()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f5528a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    static Object f(Object obj, long j2) {
        return f.f5531a.getObject(obj, j2);
    }

    private static Field f() {
        Field a2;
        if (ay1.a() && (a2 = a(Buffer.class, "effectiveDirectAddress")) != null) {
            return a2;
        }
        Field a3 = a(Buffer.class, "address");
        if (a3 == null || a3.getType() != Long.TYPE) {
            return null;
        }
        return a3;
    }

    /* access modifiers changed from: private */
    public static byte g(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte h(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean i(Object obj, long j2) {
        return g(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean j(Object obj, long j2) {
        return h(obj, j2) != 0;
    }
}
