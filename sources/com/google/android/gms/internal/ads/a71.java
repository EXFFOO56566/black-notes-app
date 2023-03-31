package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

final /* synthetic */ class a71 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final y61 f1709b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1710c;

    a71(y61 y61, long j) {
        this.f1709b = y61;
        this.f1710c = j;
    }

    public final void run() {
        y61 y61 = this.f1709b;
        long j = this.f1710c;
        String canonicalName = y61.getClass().getCanonicalName();
        long b2 = q.j().b() - j;
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(b2);
        wk.e(sb.toString());
    }
}
