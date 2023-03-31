package com.google.android.gms.common.util;

import a.e.a;
import a.e.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class e {
    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        Map b2 = b(3, false);
        b2.put(k, v);
        b2.put(k2, v2);
        b2.put(k3, v3);
        return Collections.unmodifiableMap(b2);
    }

    public static <K, V> Map<K, V> a(K[] kArr, V[] vArr) {
        if (kArr.length == vArr.length) {
            int length = kArr.length;
            if (length == 0) {
                return Collections.emptyMap();
            }
            if (length == 1) {
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            Map b2 = b(kArr.length, false);
            for (int i = 0; i < kArr.length; i++) {
                b2.put(kArr[i], vArr[i]);
            }
            return Collections.unmodifiableMap(b2);
        }
        int length2 = kArr.length;
        int length3 = vArr.length;
        StringBuilder sb = new StringBuilder(66);
        sb.append("Key and values array lengths not equal: ");
        sb.append(length2);
        sb.append(" != ");
        sb.append(length3);
        throw new IllegalArgumentException(sb.toString());
    }

    private static <T> Set<T> a(int i, boolean z) {
        return i <= (z ? 128 : 256) ? new b(i) : new HashSet(i, z ? 0.75f : 1.0f);
    }

    @Deprecated
    public static <T> Set<T> a(T t, T t2, T t3) {
        Set a2 = a(3, false);
        a2.add(t);
        a2.add(t2);
        a2.add(t3);
        return Collections.unmodifiableSet(a2);
    }

    @Deprecated
    public static <T> Set<T> a(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set a2 = a(2, false);
            a2.add(t);
            a2.add(t2);
            return Collections.unmodifiableSet(a2);
        } else if (length == 3) {
            return a(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set a3 = a(tArr.length, false);
                Collections.addAll(a3, tArr);
                return Collections.unmodifiableSet(a3);
            }
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            Set a4 = a(4, false);
            a4.add(t3);
            a4.add(t4);
            a4.add(t5);
            a4.add(t6);
            return Collections.unmodifiableSet(a4);
        }
    }

    private static <K, V> Map<K, V> b(int i, boolean z) {
        return i <= 256 ? new a(i) : new HashMap(i, 1.0f);
    }
}
