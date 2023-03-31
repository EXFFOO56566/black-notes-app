package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.c5;
import java.util.Collections;
import java.util.Map;

public abstract class gh2<T> implements Comparable<gh2<T>> {

    /* renamed from: b  reason: collision with root package name */
    private final c5.a f2763b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2764c;
    private final String d;
    private final int e;
    private final Object f;
    private gq2 g;
    private Integer h;
    private hm2 i;
    private boolean j;
    private boolean k;
    private d2 l;
    private m61 m;
    private cj2 n;

    public gh2(int i2, String str, gq2 gq2) {
        Uri parse;
        String host;
        this.f2763b = c5.a.f2062c ? new c5.a() : null;
        this.f = new Object();
        this.j = true;
        int i3 = 0;
        this.k = false;
        this.m = null;
        this.f2764c = i2;
        this.d = str;
        this.g = gq2;
        this.l = new y62();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i3 = host.hashCode();
        }
        this.e = i3;
    }

    /* access modifiers changed from: protected */
    public abstract ar2<T> a(ef2 ef2);

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.gh2<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final gh2<?> a(hm2 hm2) {
        this.i = hm2;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.gh2<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final gh2<?> a(m61 m61) {
        this.m = m61;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        hm2 hm2 = this.i;
        if (hm2 != null) {
            hm2.a(this, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ar2<?> ar2) {
        cj2 cj2;
        synchronized (this.f) {
            cj2 = this.n;
        }
        if (cj2 != null) {
            cj2.a(this, ar2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(cj2 cj2) {
        synchronized (this.f) {
            this.n = cj2;
        }
    }

    public final void a(e3 e3Var) {
        gq2 gq2;
        synchronized (this.f) {
            gq2 = this.g;
        }
        if (gq2 != null) {
            gq2.a(e3Var);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public final void a(String str) {
        if (c5.a.f2062c) {
            this.f2763b.a(str, Thread.currentThread().getId());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.gh2<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final gh2<?> b(int i2) {
        this.h = Integer.valueOf(i2);
        return this;
    }

    public Map<String, String> b() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        hm2 hm2 = this.i;
        if (hm2 != null) {
            hm2.b(this);
        }
        if (c5.a.f2062c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new ck2(this, str, id));
                return;
            }
            this.f2763b.a(str, id);
            this.f2763b.a(toString());
        }
    }

    public final int c() {
        return this.f2764c;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        gh2 gh2 = (gh2) obj;
        gn2 gn2 = gn2.NORMAL;
        return gn2 == gn2 ? this.h.intValue() - gh2.h.intValue() : gn2.ordinal() - gn2.ordinal();
    }

    public final String e() {
        return this.d;
    }

    public final boolean f() {
        synchronized (this.f) {
        }
        return false;
    }

    public final int h() {
        return this.e;
    }

    public final String j() {
        String str = this.d;
        int i2 = this.f2764c;
        if (i2 == 0 || i2 == -1) {
            return str;
        }
        String num = Integer.toString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final m61 l() {
        return this.m;
    }

    public byte[] m() {
        return null;
    }

    public final boolean n() {
        return this.j;
    }

    public final int o() {
        return this.l.j0();
    }

    public final d2 p() {
        return this.l;
    }

    public final void q() {
        synchronized (this.f) {
            this.k = true;
        }
    }

    public final boolean r() {
        boolean z;
        synchronized (this.f) {
            z = this.k;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        cj2 cj2;
        synchronized (this.f) {
            cj2 = this.n;
        }
        if (cj2 != null) {
            cj2.a(this);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.e));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        f();
        String str = this.d;
        String valueOf2 = String.valueOf(gn2.NORMAL);
        String valueOf3 = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }
}
