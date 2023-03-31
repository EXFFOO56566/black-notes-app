package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

public final class or {

    /* renamed from: a  reason: collision with root package name */
    private long f4032a;

    public final long a(ByteBuffer byteBuffer) {
        oy oyVar;
        lv lvVar;
        long j = this.f4032a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<mt> it = new kr(new pr(duplicate), qr.f4377c).a().iterator();
            while (true) {
                oyVar = null;
                if (!it.hasNext()) {
                    lvVar = null;
                    break;
                }
                mt next = it.next();
                if (next instanceof lv) {
                    lvVar = (lv) next;
                    break;
                }
            }
            Iterator<mt> it2 = lvVar.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                mt next2 = it2.next();
                if (next2 instanceof oy) {
                    oyVar = (oy) next2;
                    break;
                }
            }
            long c2 = (oyVar.c() * 1000) / oyVar.d();
            this.f4032a = c2;
            return c2;
        } catch (IOException | RuntimeException unused) {
            return 0;
        }
    }
}
