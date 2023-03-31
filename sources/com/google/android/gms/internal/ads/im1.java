package com.google.android.gms.internal.ads;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class im1<K, V> extends yl1<K, V> {
    private final transient Object e;
    private final transient Object[] f;
    private final transient int g;

    static {
        new im1(null, new Object[0], 0);
    }

    private im1(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.f = objArr;
        this.g = i;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x00bd */
    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [int[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r10[r6] = (short) r3;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        r10[r7] = r4;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        r10[r6] = (byte) r3;
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> com.google.android.gms.internal.ads.im1<K, V> a(int r10, java.lang.Object[] r11) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.im1.a(int, java.lang.Object[]):com.google.android.gms.internal.ads.im1");
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.yl1
    public final cm1<Map.Entry<K, V>> a() {
        return new hm1(this, this.f, 0, this.g);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.yl1
    public final cm1<K> b() {
        return new jm1(this, new mm1(this.f, 0, this.g));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.yl1
    public final tl1<V> c() {
        return new mm1(this.f, 1, this.g);
    }

    @Override // java.util.Map, com.google.android.gms.internal.ads.yl1
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.e;
        Object[] objArr = this.f;
        int i = this.g;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int a2 = ql1.a(obj.hashCode());
                while (true) {
                    int i2 = a2 & length;
                    int i3 = bArr[i2] & 255;
                    if (i3 == 255) {
                        return null;
                    }
                    if (objArr[i3].equals(obj)) {
                        return (V) objArr[i3 ^ 1];
                    }
                    a2 = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int a3 = ql1.a(obj.hashCode());
                while (true) {
                    int i4 = a3 & length2;
                    int i5 = sArr[i4] & 65535;
                    if (i5 == 65535) {
                        return null;
                    }
                    if (objArr[i5].equals(obj)) {
                        return (V) objArr[i5 ^ 1];
                    }
                    a3 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int a4 = ql1.a(obj.hashCode());
                while (true) {
                    int i6 = a4 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (objArr[i7].equals(obj)) {
                        return (V) objArr[i7 ^ 1];
                    }
                    a4 = i6 + 1;
                }
            }
        }
    }

    public final int size() {
        return this.g;
    }
}
