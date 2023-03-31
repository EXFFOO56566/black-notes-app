package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class qi2 implements Comparator<di2> {
    public qi2(ni2 ni2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(di2 di2, di2 di22) {
        di2 di23 = di2;
        di2 di24 = di22;
        if (di23.b() < di24.b()) {
            return -1;
        }
        if (di23.b() > di24.b()) {
            return 1;
        }
        if (di23.a() < di24.a()) {
            return -1;
        }
        if (di23.a() > di24.a()) {
            return 1;
        }
        float d = (di23.d() - di23.b()) * (di23.c() - di23.a());
        float d2 = (di24.d() - di24.b()) * (di24.c() - di24.a());
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }
}
