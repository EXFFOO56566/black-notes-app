package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;
import com.google.android.gms.internal.ads.rz1.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class rz1<MessageType extends rz1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends tx1<MessageType, BuilderType> {
    private static Map<Object, rz1<?, ?>> zzhxx = new ConcurrentHashMap();
    protected r22 zzhxv = r22.d();
    private int zzhxw = -1;

    public static abstract class a<MessageType extends rz1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends wx1<MessageType, BuilderType> {

        /* renamed from: b  reason: collision with root package name */
        private final MessageType f4575b;

        /* renamed from: c  reason: collision with root package name */
        protected MessageType f4576c;
        protected boolean d = false;

        protected a(MessageType messagetype) {
            this.f4575b = messagetype;
            this.f4576c = (MessageType) ((rz1) messagetype.a(f.d, null, null));
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            n12.a().a(messagetype).b(messagetype, messagetype2);
        }

        private final BuilderType b(byte[] bArr, int i, int i2, dz1 dz1) {
            if (this.d) {
                i();
                this.d = false;
            }
            try {
                n12.a().a(this.f4576c).a(this.f4576c, bArr, 0, i2 + 0, new cy1(dz1));
                return this;
            } catch (b02 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw b02.a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        public final BuilderType a(MessageType messagetype) {
            if (this.d) {
                i();
                this.d = false;
            }
            a(this.f4576c, messagetype);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.rz1$a<MessageType extends com.google.android.gms.internal.ads.rz1<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.rz1$a<MessageType, BuilderType>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.wx1
        public final /* synthetic */ wx1 a(tx1 tx1) {
            a((rz1) tx1);
            return this;
        }

        public final /* synthetic */ wx1 a(byte[] bArr, int i, int i2, dz1 dz1) {
            b(bArr, 0, i2, dz1);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.internal.ads.rz1$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Object
        public /* synthetic */ Object clone() {
            a aVar = (a) this.f4575b.a(f.e, null, null);
            aVar.a((rz1) b());
            return aVar;
        }

        @Override // com.google.android.gms.internal.ads.e12
        public final /* synthetic */ c12 h() {
            return this.f4575b;
        }

        /* access modifiers changed from: protected */
        public void i() {
            MessageType messagetype = (MessageType) ((rz1) this.f4576c.a(f.d, null, null));
            a(messagetype, this.f4576c);
            this.f4576c = messagetype;
        }

        @Override // com.google.android.gms.internal.ads.e12
        public final boolean isInitialized() {
            return rz1.a((rz1) this.f4576c, false);
        }

        /* renamed from: j */
        public MessageType b() {
            if (this.d) {
                return this.f4576c;
            }
            MessageType messagetype = this.f4576c;
            n12.a().a(messagetype).b(messagetype);
            this.d = true;
            return this.f4576c;
        }

        /* renamed from: k */
        public final MessageType e() {
            MessageType messagetype = (MessageType) ((rz1) b());
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new o22(messagetype);
        }
    }

    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends rz1<MessageType, BuilderType> implements e12 {
        protected gz1<e> zzhxy = gz1.g();

        /* access modifiers changed from: package-private */
        public final gz1<e> p() {
            if (this.zzhxy.b()) {
                this.zzhxy = (gz1) this.zzhxy.clone();
            }
            return this.zzhxy;
        }
    }

    public static class c<T extends rz1<T, ?>> extends yx1<T> {
        public c(T t) {
        }
    }

    public static class d<ContainingType extends c12, Type> extends bz1<ContainingType, Type> {
    }

    static final class e implements iz1<e> {
        @Override // com.google.android.gms.internal.ads.iz1
        public final int a() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.iz1
        public final b12 a(b12 b12, c12 c12) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.iz1
        public final h12 a(h12 h12, h12 h122) {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.iz1
        public final f32 d() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.iz1
        public final m32 g() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.iz1
        public final boolean i() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.iz1
        public final boolean k() {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final int f4577a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f4578b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f4579c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 1;
        public static final int l = 2;

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    private static <T extends rz1<T, ?>> T a(T t) {
        if (t == null || t.isInitialized()) {
            return t;
        }
        b02 b02 = new b02(new o22(t).getMessage());
        b02.a(t);
        throw b02;
    }

    protected static <T extends rz1<T, ?>> T a(T t, dy1 dy1) {
        T t2 = (T) b(t, dy1, dz1.a());
        a(t2);
        a(t2);
        return t2;
    }

    protected static <T extends rz1<T, ?>> T a(T t, dy1 dy1, dz1 dz1) {
        T t2 = (T) b(t, dy1, dz1);
        a(t2);
        return t2;
    }

    private static <T extends rz1<T, ?>> T a(T t, ty1 ty1, dz1 dz1) {
        T t2 = (T) ((rz1) t.a(f.d, null, null));
        try {
            z12 a2 = n12.a().a(t2);
            a2.a(t2, wy1.a(ty1), dz1);
            a2.b(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof b02) {
                throw ((b02) e2.getCause());
            }
            b02 b02 = new b02(e2.getMessage());
            b02.a(t2);
            throw b02;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof b02) {
                throw ((b02) e3.getCause());
            }
            throw e3;
        }
    }

    protected static <T extends rz1<T, ?>> T a(T t, byte[] bArr) {
        T t2 = (T) a(t, bArr, 0, bArr.length, dz1.a());
        a(t2);
        return t2;
    }

    private static <T extends rz1<T, ?>> T a(T t, byte[] bArr, int i, int i2, dz1 dz1) {
        T t2 = (T) ((rz1) t.a(f.d, null, null));
        try {
            z12 a2 = n12.a().a(t2);
            a2.a(t2, bArr, 0, i2, new cy1(dz1));
            a2.b(t2);
            if (t2.zzhsq == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof b02) {
                throw ((b02) e2.getCause());
            }
            b02 b02 = new b02(e2.getMessage());
            b02.a(t2);
            throw b02;
        } catch (IndexOutOfBoundsException unused) {
            b02 a3 = b02.a();
            a3.a(t2);
            throw a3;
        }
    }

    protected static <T extends rz1<T, ?>> T a(T t, byte[] bArr, dz1 dz1) {
        T t2 = (T) a(t, bArr, 0, bArr.length, dz1);
        a(t2);
        return t2;
    }

    static <T extends rz1<?, ?>> T a(Class<T> cls) {
        rz1<?, ?> rz1 = zzhxx.get(cls);
        if (rz1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                rz1 = (T) zzhxx.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (rz1 == null) {
            rz1 = (T) ((rz1) ((rz1) y22.a(cls)).a(f.f, (Object) null, (Object) null));
            if (rz1 != null) {
                zzhxx.put(cls, rz1);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) rz1;
    }

    protected static xz1 a(xz1 xz1) {
        int size = xz1.size();
        return xz1.d(size == 0 ? 10 : size << 1);
    }

    protected static <E> yz1<E> a(yz1<E> yz1) {
        int size = yz1.size();
        return yz1.e(size == 0 ? 10 : size << 1);
    }

    protected static Object a(c12 c12, String str, Object[] objArr) {
        return new q12(c12, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <T extends rz1<?, ?>> void a(Class<T> cls, T t) {
        zzhxx.put(cls, t);
    }

    protected static final <T extends rz1<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(f.f4577a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean a2 = n12.a().a(t).a(t);
        if (z) {
            t.a(f.f4578b, a2 ? t : null, null);
        }
        return a2;
    }

    private static <T extends rz1<T, ?>> T b(T t, dy1 dy1, dz1 dz1) {
        try {
            ty1 g = dy1.g();
            T t2 = (T) a(t, g, dz1);
            try {
                g.a(0);
                return t2;
            } catch (b02 e2) {
                e2.a(t2);
                throw e2;
            }
        } catch (b02 e3) {
            throw e3;
        }
    }

    protected static xz1 m() {
        return sz1.b();
    }

    protected static zz1 n() {
        return q02.b();
    }

    protected static <E> yz1<E> o() {
        return r12.b();
    }

    @Override // com.google.android.gms.internal.ads.c12
    public final /* synthetic */ b12 a() {
        a aVar = (a) a(f.e, (Object) null, (Object) null);
        aVar.a((rz1) this);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tx1
    public final void a(int i) {
        this.zzhxw = i;
    }

    @Override // com.google.android.gms.internal.ads.c12
    public final void a(xy1 xy1) {
        n12.a().a(this).a((Object) this, (l32) az1.a(xy1));
    }

    @Override // com.google.android.gms.internal.ads.c12
    public final int c() {
        if (this.zzhxw == -1) {
            this.zzhxw = n12.a().a(this).c(this);
        }
        return this.zzhxw;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return n12.a().a(this).a(this, (rz1) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c12
    public final /* synthetic */ b12 g() {
        return (a) a(f.e, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.e12
    public final /* synthetic */ c12 h() {
        return (rz1) a(f.f, (Object) null, (Object) null);
    }

    public int hashCode() {
        int i = this.zzhsq;
        if (i != 0) {
            return i;
        }
        int d2 = n12.a().a(this).d(this);
        this.zzhsq = d2;
        return d2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tx1
    public final int i() {
        return this.zzhxw;
    }

    @Override // com.google.android.gms.internal.ads.e12
    public final boolean isInitialized() {
        return a(this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends rz1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType j() {
        return (BuilderType) ((a) a(f.e, (Object) null, (Object) null));
    }

    public final BuilderType k() {
        BuilderType buildertype = (BuilderType) ((a) a(f.e, (Object) null, (Object) null));
        buildertype.a(this);
        return buildertype;
    }

    public String toString() {
        return d12.a(this, super.toString());
    }
}
