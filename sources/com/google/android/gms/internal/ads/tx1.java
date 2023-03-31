package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.tx1;
import com.google.android.gms.internal.ads.wx1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class tx1<MessageType extends tx1<MessageType, BuilderType>, BuilderType extends wx1<MessageType, BuilderType>> implements c12 {
    protected int zzhsq = 0;

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        uz1.a(iterable);
        if (iterable instanceof i02) {
            List<?> f = ((i02) iterable).f();
            i02 i02 = (i02) list;
            int size = list.size();
            for (Object obj : f) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(i02.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = i02.size() - 1; size2 >= size; size2--) {
                        i02.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof dy1) {
                    i02.a((dy1) obj);
                } else {
                    i02.add((String) obj);
                }
            }
        } else if (iterable instanceof p12) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.c12
    public final dy1 d() {
        try {
            ly1 h = dy1.h(c());
            a(h.b());
            return h.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.c12
    public final byte[] f() {
        try {
            byte[] bArr = new byte[c()];
            xy1 a2 = xy1.a(bArr);
            a(a2);
            a2.b();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public int i() {
        throw new UnsupportedOperationException();
    }
}
