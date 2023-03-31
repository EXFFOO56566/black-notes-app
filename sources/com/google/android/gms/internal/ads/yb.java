package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

final class yb {

    /* renamed from: a  reason: collision with root package name */
    long f5567a;

    /* renamed from: b  reason: collision with root package name */
    final String f5568b;

    /* renamed from: c  reason: collision with root package name */
    final String f5569c;
    final long d;
    final long e;
    final long f;
    final long g;
    final List<bb2> h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    yb(java.lang.String r14, com.google.android.gms.internal.ads.m61 r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f3670b
            long r3 = r15.f3671c
            long r5 = r15.d
            long r7 = r15.e
            long r9 = r15.f
            java.util.List<com.google.android.gms.internal.ads.bb2> r0 = r15.h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.bb2 r11 = new com.google.android.gms.internal.ads.bb2
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yb.<init>(java.lang.String, com.google.android.gms.internal.ads.m61):void");
    }

    private yb(String str, String str2, long j, long j2, long j3, long j4, List<bb2> list) {
        this.f5568b = str;
        this.f5569c = BuildConfig.FLAVOR.equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    static yb a(ve veVar) {
        if (ba.b((InputStream) veVar) == 538247942) {
            return new yb(ba.a(veVar), ba.a(veVar), ba.c(veVar), ba.c(veVar), ba.c(veVar), ba.c(veVar), ba.b(veVar));
        }
        throw new IOException();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(OutputStream outputStream) {
        try {
            ba.a(outputStream, 538247942);
            ba.a(outputStream, this.f5568b);
            ba.a(outputStream, this.f5569c == null ? BuildConfig.FLAVOR : this.f5569c);
            ba.a(outputStream, this.d);
            ba.a(outputStream, this.e);
            ba.a(outputStream, this.f);
            ba.a(outputStream, this.g);
            List<bb2> list = this.h;
            if (list != null) {
                ba.a(outputStream, list.size());
                for (bb2 bb2 : list) {
                    ba.a(outputStream, bb2.a());
                    ba.a(outputStream, bb2.b());
                }
            } else {
                ba.a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            c5.a("%s", e2.toString());
            return false;
        }
    }
}
