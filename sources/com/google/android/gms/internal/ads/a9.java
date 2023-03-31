package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

public class a9 implements de2 {

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f1720c = c5.f2060b;

    /* renamed from: a  reason: collision with root package name */
    private final d6 f1721a;

    /* renamed from: b  reason: collision with root package name */
    private final z7 f1722b;

    public a9(d6 d6Var) {
        this(d6Var, new z7(4096));
    }

    private a9(d6 d6Var, z7 z7Var) {
        this.f1721a = d6Var;
        this.f1722b = z7Var;
    }

    private static void a(String str, gh2<?> gh2, e3 e3Var) {
        d2 p = gh2.p();
        int o = gh2.o();
        try {
            p.a(e3Var);
            gh2.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(o)));
        } catch (e3 e) {
            gh2.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(o)));
            throw e;
        }
    }

    private final byte[] a(InputStream inputStream, int i) {
        gm gmVar = new gm(this.f1722b, i);
        if (inputStream != null) {
            try {
                byte[] a2 = this.f1722b.a(1024);
                while (true) {
                    int read = inputStream.read(a2);
                    if (read == -1) {
                        break;
                    }
                    gmVar.write(a2, 0, read);
                }
                byte[] byteArray = gmVar.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        c5.c("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f1722b.a(a2);
                gmVar.close();
                return byteArray;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        c5.c("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f1722b.a((byte[]) null);
                gmVar.close();
                throw th;
            }
        } else {
            throw new d1();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0201, code lost:
        throw new com.google.android.gms.internal.ads.hi2(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0202, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0203, code lost:
        r2 = java.lang.String.valueOf(r22.e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0213, code lost:
        if (r2.length() != 0) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0215, code lost:
        r2 = "Bad URL ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021a, code lost:
        r2 = new java.lang.String("Bad URL ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0222, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0223, code lost:
        r0 = new com.google.android.gms.internal.ads.e4();
        r5 = "socket";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018e, code lost:
        r17 = r5;
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0192, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0193, code lost:
        r17 = r5;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0196, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0199, code lost:
        r0 = r8.c();
        com.google.android.gms.internal.ads.c5.b("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r22.e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b0, code lost:
        if (r13 != null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b2, code lost:
        r5 = new com.google.android.gms.internal.ads.ef2(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r3, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c2, code lost:
        if (r0 == 401) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cb, code lost:
        if (r0 < 400) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d7, code lost:
        throw new com.google.android.gms.internal.ads.y72(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01da, code lost:
        if (r0 < 500) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e5, code lost:
        throw new com.google.android.gms.internal.ads.d1(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01eb, code lost:
        throw new com.google.android.gms.internal.ads.d1(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ec, code lost:
        r0 = new com.google.android.gms.internal.ads.go(r5);
        r5 = "auth";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f4, code lost:
        r0 = new com.google.android.gms.internal.ads.fg2();
        r5 = "network";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0202 A[ExcHandler: MalformedURLException (r0v2 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01fc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0199  */
    @Override // com.google.android.gms.internal.ads.de2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.ef2 a(com.google.android.gms.internal.ads.gh2<?> r22) {
        /*
        // Method dump skipped, instructions count: 559
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a9.a(com.google.android.gms.internal.ads.gh2):com.google.android.gms.internal.ads.ef2");
    }
}
