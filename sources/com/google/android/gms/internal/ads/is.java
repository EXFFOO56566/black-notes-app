package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class is extends wr implements nf2<ye2> {
    private String e;
    private final hq f;
    private boolean g;
    private final js h = new js();
    private final or i = new or();
    private ByteBuffer j;
    private boolean k;
    private final Object l = new Object();
    private boolean m;

    public is(gq gqVar, hq hqVar) {
        super(gqVar);
        this.f = hqVar;
    }

    private final void f() {
        int a2 = (int) this.h.a();
        int a3 = (int) this.i.a(this.j);
        int position = this.j.position();
        int round = Math.round(((float) a3) * (((float) position) / ((float) a2)));
        boolean z = round > 0;
        int f2 = er.f();
        int g2 = er.g();
        String str = this.e;
        a(str, b(str), position, a2, (long) round, (long) a3, z, f2, g2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.nf2
    public final /* bridge */ /* synthetic */ void a(ye2 ye2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.google.android.gms.internal.ads.nf2
    public final /* bridge */ /* synthetic */ void a(ye2 ye2, int i2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.ads.ze2] */
    @Override // com.google.android.gms.internal.ads.nf2
    public final /* synthetic */ void a(ye2 ye2, ze2 ze2) {
        ye2 ye22 = ye2;
        if (ye22 instanceof bf2) {
            this.h.a((bf2) ye22);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        if (r21.j.remaining() > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cb, code lost:
        if (r21.g != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cd, code lost:
        r12 = r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        if ((r12 - r16) < r4) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d7, code lost:
        f();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e3, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ed, code lost:
        r1 = new java.lang.StringBuilder(49);
        r1.append("Timeout exceeded. Limit: ");
        r1.append(r6);
        r1.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010b, code lost:
        r1 = r21.j.limit();
        r3 = new java.lang.StringBuilder(35);
        r3.append("Precache abort at ");
        r3.append(r1);
        r3.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0130, code lost:
        throw new java.io.IOException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0136, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0137, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return true;
     */
    @Override // com.google.android.gms.internal.ads.wr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.is.a(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.wr
    public final String b(String str) {
        String valueOf = String.valueOf(super.b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final void b() {
        this.g = true;
    }

    public final ByteBuffer c() {
        synchronized (this.l) {
            if (this.j != null && !this.k) {
                this.j.flip();
                this.k = true;
            }
            this.g = true;
        }
        return this.j;
    }

    public final String d() {
        return this.e;
    }

    public final boolean e() {
        return this.m;
    }
}
