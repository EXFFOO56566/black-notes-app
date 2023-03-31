package com.google.android.gms.internal.ads;

import b.c.a.a;
import b.c.a.b;
import java.util.Date;
import java.util.HashSet;

public final class ac {
    public static int a(a aVar) {
        int i = cc.f2095b[aVar.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static com.google.ads.mediation.a a(rm2 rm2, boolean z) {
        HashSet hashSet = rm2.f != null ? new HashSet(rm2.f) : null;
        Date date = new Date(rm2.f4521c);
        int i = rm2.e;
        return new com.google.ads.mediation.a(date, i != 1 ? i != 2 ? b.UNKNOWN : b.FEMALE : b.MALE, hashSet, z, rm2.l);
    }
}
