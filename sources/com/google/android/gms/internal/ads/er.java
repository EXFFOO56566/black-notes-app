package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public final class er implements q72, id2, nf2<ye2>, sg2 {
    private static int n;
    private static int o;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2474b;

    /* renamed from: c  reason: collision with root package name */
    private final br f2475c;
    private final j82 d;
    private final j82 e;
    private final me2 f;
    private final hq g;
    private r72 h;
    private ByteBuffer i;
    private boolean j;
    private nr k;
    private int l;
    private Set<WeakReference<xq>> m = new HashSet();

    public er(Context context, hq hqVar) {
        this.f2474b = context;
        this.g = hqVar;
        this.f2475c = new br();
        this.d = new mg2(this.f2474b, gc2.f2736a, 0, gl.h, this, -1);
        this.e = new o92(gc2.f2736a);
        this.f = new he2();
        if (wk.a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            wk.e(sb.toString());
        }
        n++;
        r72 a2 = v72.a(new j82[]{this.e, this.d}, this.f, this.f2475c);
        this.h = a2;
        a2.b(this);
    }

    private final nd2 a(Uri uri, String str) {
        xe2 grVar;
        if (!this.j || this.i.limit() <= 0) {
            grVar = this.g.h > 0 ? new gr(this, str) : new fr(this, str);
            if (this.g.i) {
                grVar = new ir(this, grVar);
            }
            if (this.i.limit() > 0) {
                byte[] bArr = new byte[this.i.limit()];
                this.i.get(bArr);
                grVar = new hr(grVar, bArr);
            }
        } else {
            byte[] bArr2 = new byte[this.i.limit()];
            this.i.get(bArr2);
            grVar = new dr(bArr2);
        }
        oa2 oa2 = lr.f3593a;
        hq hqVar = this.g;
        return new jd2(uri, grVar, oa2, hqVar.j, gl.h, this, null, hqVar.f);
    }

    public static int f() {
        return n;
    }

    public static int g() {
        return o;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ye2 a(xe2 xe2) {
        return new zq(this.f2474b, xe2.a(), this, new jr(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ye2 a(String str) {
        er erVar = this.g.i ? null : this;
        hq hqVar = this.g;
        return new bf2(str, null, erVar, hqVar.d, hqVar.e, true, null);
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, boolean z) {
        if (this.h != null) {
            s72 s72 = new s72(this.e, 2, Float.valueOf(f2));
            if (z) {
                this.h.a(s72);
                return;
            }
            this.h.b(s72);
        }
    }

    public final void a(int i2) {
        for (WeakReference<xq> weakReference : this.m) {
            xq xqVar = weakReference.get();
            if (xqVar != null) {
                xqVar.a(i2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void a(int i2, int i3, int i4, float f2) {
        nr nrVar = this.k;
        if (nrVar != null) {
            nrVar.a(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void a(int i2, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void a(Surface surface) {
    }

    /* access modifiers changed from: package-private */
    public final void a(Surface surface, boolean z) {
        if (this.h != null) {
            s72 s72 = new s72(this.d, 1, surface);
            if (z) {
                this.h.a(s72);
                return;
            }
            this.h.b(s72);
        }
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void a(e82 e82) {
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void a(ee2 ee2, pe2 pe2) {
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void a(k82 k82) {
    }

    public final void a(nr nrVar) {
        this.k = nrVar;
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void a(o72 o72) {
        nr nrVar = this.k;
        if (nrVar != null) {
            nrVar.a("onPlayerError", o72);
        }
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void a(o82 o82, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void a(y92 y92) {
    }

    @Override // com.google.android.gms.internal.ads.id2
    public final void a(IOException iOException) {
        nr nrVar = this.k;
        if (nrVar != null) {
            nrVar.a("onLoadError", iOException);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.nf2
    public final /* bridge */ /* synthetic */ void a(ye2 ye2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.google.android.gms.internal.ads.nf2
    public final /* synthetic */ void a(ye2 ye2, int i2) {
        this.l += i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.ads.ze2] */
    @Override // com.google.android.gms.internal.ads.nf2
    public final /* synthetic */ void a(ye2 ye2, ze2 ze2) {
        this.l = 0;
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void a(String str, long j2, long j3) {
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void a(boolean z, int i2) {
        nr nrVar = this.k;
        if (nrVar != null) {
            nrVar.a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z, long j2) {
        nr nrVar = this.k;
        if (nrVar != null) {
            nrVar.a(z, j2);
        }
    }

    public final void a(Uri[] uriArr, String str) {
        a(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void a(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        nd2 nd2;
        if (this.h != null) {
            this.i = byteBuffer;
            this.j = z;
            if (uriArr.length == 1) {
                nd2 = a(uriArr[0], str);
            } else {
                nd2[] nd2Arr = new nd2[uriArr.length];
                for (int i2 = 0; i2 < uriArr.length; i2++) {
                    nd2Arr[i2] = a(uriArr[i2], str);
                }
                nd2 = new od2(nd2Arr);
            }
            this.h.a(nd2);
            o++;
        }
    }

    public final long b() {
        return (long) this.l;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ye2 b(String str) {
        er erVar = this.g.i ? null : this;
        hq hqVar = this.g;
        xq xqVar = new xq(str, erVar, hqVar.d, hqVar.e, hqVar.h);
        this.m.add(new WeakReference<>(xqVar));
        return xqVar;
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void b(y92 y92) {
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.W(); i2++) {
                this.f.a(i2, !z);
            }
        }
    }

    public final void c() {
        r72 r72 = this.h;
        if (r72 != null) {
            r72.a(this);
            this.h.a();
            this.h = null;
            o--;
        }
    }

    public final r72 d() {
        return this.h;
    }

    public final br e() {
        return this.f2475c;
    }

    public final void finalize() {
        n--;
        if (wk.a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            wk.e(sb.toString());
        }
    }
}
