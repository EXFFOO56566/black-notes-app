package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class jb2 extends kb2 {
    public final List<mb2> A0 = new ArrayList();
    public final List<jb2> B0 = new ArrayList();
    public final long z0;

    public jb2(int i, long j) {
        super(i);
        this.z0 = j;
    }

    public final mb2 d(int i) {
        int size = this.A0.size();
        for (int i2 = 0; i2 < size; i2++) {
            mb2 mb2 = this.A0.get(i2);
            if (mb2.f3366a == i) {
                return mb2;
            }
        }
        return null;
    }

    public final jb2 e(int i) {
        int size = this.B0.size();
        for (int i2 = 0; i2 < size; i2++) {
            jb2 jb2 = this.B0.get(i2);
            if (jb2.f3366a == i) {
                return jb2;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final String toString() {
        String c2 = kb2.c(this.f3366a);
        String arrays = Arrays.toString(this.A0.toArray());
        String arrays2 = Arrays.toString(this.B0.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(c2);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
