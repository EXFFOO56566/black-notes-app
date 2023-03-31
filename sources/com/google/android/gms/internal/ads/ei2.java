package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* access modifiers changed from: package-private */
public final class ei2 implements Comparator<li2> {
    ei2(fi2 fi2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(li2 li2, li2 li22) {
        li2 li23 = li2;
        li2 li24 = li22;
        int i = li23.f3563c - li24.f3563c;
        return i != 0 ? i : (int) (li23.f3561a - li24.f3561a);
    }
}
