package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ef2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f2417a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2418b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f2419c;
    public final List<bb2> d;
    public final boolean e;

    private ef2(int i, byte[] bArr, Map<String, String> map, List<bb2> list, boolean z, long j) {
        this.f2417a = i;
        this.f2418b = bArr;
        this.f2419c = map;
        this.d = list == null ? null : Collections.unmodifiableList(list);
        this.e = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ef2(int r9, byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11, boolean r12, long r13) {
        /*
            r8 = this;
            if (r11 != 0) goto L_0x0005
            r0 = 0
        L_0x0003:
            r4 = r0
            goto L_0x0042
        L_0x0005:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0003
        L_0x0010:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            java.util.Set r1 = r11.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0003
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.google.android.gms.internal.ads.bb2 r3 = new com.google.android.gms.internal.ads.bb2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r3.<init>(r4, r2)
            r0.add(r3)
            goto L_0x0021
        L_0x0042:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ef2.<init>(int, byte[], java.util.Map, boolean, long):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ef2(int r9, byte[] r10, boolean r11, long r12, java.util.List<com.google.android.gms.internal.ads.bb2> r14) {
        /*
            r8 = this;
            if (r14 != 0) goto L_0x0005
            r0 = 0
        L_0x0003:
            r3 = r0
            goto L_0x0033
        L_0x0005:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L_0x0003
        L_0x0010:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L_0x001b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0003
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.bb2 r2 = (com.google.android.gms.internal.ads.bb2) r2
            java.lang.String r3 = r2.a()
            java.lang.String r2 = r2.b()
            r0.put(r3, r2)
            goto L_0x001b
        L_0x0033:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ef2.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    @Deprecated
    public ef2(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }
}
