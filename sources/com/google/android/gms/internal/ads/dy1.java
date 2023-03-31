package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public abstract class dy1 implements Serializable, Iterable<Byte> {

    /* renamed from: c  reason: collision with root package name */
    public static final dy1 f2334c = new oy1(uz1.f5030b);
    private static final jy1 d = (ay1.a() ? new qy1(null) : new hy1(null));

    /* renamed from: b  reason: collision with root package name */
    private int f2335b = 0;

    static {
        new fy1();
    }

    dy1() {
    }

    /* access modifiers changed from: private */
    public static int a(byte b2) {
        return b2 & 255;
    }

    public static dy1 a(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            dy1 a2 = i2 == 0 ? null : a(bArr, 0, i2);
            if (a2 == null) {
                return a(arrayList);
            }
            arrayList.add(a2);
            i = Math.min(i << 1, 8192);
        }
    }

    public static dy1 a(Iterable<dy1> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<dy1> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        return i == 0 ? f2334c : a(iterable.iterator(), i);
    }

    public static dy1 a(String str) {
        return new oy1(str.getBytes(uz1.f5029a));
    }

    private static dy1 a(Iterator<dy1> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            dy1 a2 = a(it, i2);
            dy1 a3 = a(it, i - i2);
            if (Integer.MAX_VALUE - a2.size() >= a3.size()) {
                return s12.a(a2, a3);
            }
            int size = a2.size();
            int size2 = a3.size();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static dy1 a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static dy1 a(byte[] bArr, int i, int i2) {
        c(i, i + i2, bArr.length);
        return new oy1(d.a(bArr, i, i2));
    }

    static dy1 b(byte[] bArr) {
        return new oy1(bArr);
    }

    static void b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    static ly1 h(int i) {
        return new ly1(i, null);
    }

    public static ry1 m() {
        return new ry1(128);
    }

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public abstract dy1 a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void a(ey1 ey1);

    @Deprecated
    public final void a(byte[] bArr, int i, int i2, int i3) {
        c(i, i + i3, size());
        c(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            b(bArr, i, i2, i3);
        }
    }

    public final byte[] a() {
        int size = size();
        if (size == 0) {
            return uz1.f5030b;
        }
        byte[] bArr = new byte[size];
        b(bArr, 0, 0, size);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract int b(int i, int i2, int i3);

    /* renamed from: b */
    public my1 iterator() {
        return new gy1(this);
    }

    /* access modifiers changed from: protected */
    public abstract void b(byte[] bArr, int i, int i2, int i3);

    public final String d() {
        return size() == 0 ? BuildConfig.FLAVOR : a(uz1.f5029a);
    }

    public abstract boolean e();

    public abstract boolean equals(Object obj);

    public abstract byte f(int i);

    /* access modifiers changed from: package-private */
    public abstract byte g(int i);

    public abstract ty1 g();

    public final int hashCode() {
        int i = this.f2335b;
        if (i == 0) {
            int size = size();
            i = b(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f2335b = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract int i();

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* access modifiers changed from: protected */
    public abstract boolean k();

    /* access modifiers changed from: protected */
    public final int l() {
        return this.f2335b;
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? n22.a(this) : String.valueOf(n22.a(a(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
