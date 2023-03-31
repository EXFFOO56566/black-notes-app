package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
public final class oq extends rp implements TextureView.SurfaceTextureListener, nr {
    private final gq d;
    private final kq e;
    private final boolean f;
    private final hq g;
    private op h;
    private Surface i;
    private er j;
    private String k;
    private String[] l;
    private boolean m;
    private int n = 1;
    private eq o;
    private final boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private float w;

    public oq(Context context, kq kqVar, gq gqVar, boolean z, boolean z2, hq hqVar) {
        super(context);
        this.f = z2;
        this.d = gqVar;
        this.e = kqVar;
        this.p = z;
        this.g = hqVar;
        setSurfaceTextureListener(this);
        this.e.a(this);
    }

    private final void a(float f2, boolean z) {
        er erVar = this.j;
        if (erVar != null) {
            erVar.a(f2, z);
        } else {
            co.d("Trying to set volume before player is initalized.");
        }
    }

    private final void a(Surface surface, boolean z) {
        er erVar = this.j;
        if (erVar != null) {
            erVar.a(surface, z);
        } else {
            co.d("Trying to set surface before player is initalized.");
        }
    }

    private final void c(int i2, int i3) {
        float f2 = i3 > 0 ? ((float) i2) / ((float) i3) : 1.0f;
        if (this.w != f2) {
            this.w = f2;
            requestLayout();
        }
    }

    private final void l() {
        er erVar = this.j;
        if (erVar != null) {
            erVar.b(false);
        }
    }

    private final er m() {
        return new er(this.d.getContext(), this.g);
    }

    private final String n() {
        return q.c().a(this.d.getContext(), this.d.b().f2633b);
    }

    private final boolean o() {
        return this.j != null && !this.m;
    }

    private final boolean p() {
        return o() && this.n != 1;
    }

    private final void q() {
        String str;
        String str2;
        if (this.j == null && (str = this.k) != null && this.i != null) {
            if (str.startsWith("cache:")) {
                wr d2 = this.d.d(this.k);
                if (d2 instanceof ms) {
                    er c2 = ((ms) d2).c();
                    this.j = c2;
                    if (c2.d() == null) {
                        str2 = "Precached video player has been released.";
                    }
                } else if (d2 instanceof is) {
                    is isVar = (is) d2;
                    String n2 = n();
                    ByteBuffer c3 = isVar.c();
                    boolean e2 = isVar.e();
                    String d3 = isVar.d();
                    if (d3 == null) {
                        str2 = "Stream cache URL is null.";
                    } else {
                        er m2 = m();
                        this.j = m2;
                        m2.a(new Uri[]{Uri.parse(d3)}, n2, c3, e2);
                    }
                } else {
                    String valueOf = String.valueOf(this.k);
                    co.d(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
                co.d(str2);
                return;
            }
            this.j = m();
            String n3 = n();
            Uri[] uriArr = new Uri[this.l.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.l;
                if (i2 >= strArr.length) {
                    break;
                }
                uriArr[i2] = Uri.parse(strArr[i2]);
                i2++;
            }
            this.j.a(uriArr, n3);
            this.j.a((nr) this);
            a(this.i, false);
            int T = this.j.d().T();
            this.n = T;
            if (T == 3) {
                r();
            }
        }
    }

    private final void r() {
        if (!this.q) {
            this.q = true;
            gl.h.post(new nq(this));
            a();
            this.e.b();
            if (this.r) {
                c();
            }
        }
    }

    private final void s() {
        c(this.s, this.t);
    }

    private final void t() {
        er erVar = this.j;
        if (erVar != null) {
            erVar.b(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.lq, com.google.android.gms.internal.ads.rp
    public final void a() {
        a(this.f4530c.a(), false);
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void a(float f2, float f3) {
        eq eqVar = this.o;
        if (eqVar != null) {
            eqVar.a(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void a(int i2) {
        if (this.n != i2) {
            this.n = i2;
            if (i2 == 3) {
                r();
            } else if (i2 == 4) {
                if (this.g.f2962a) {
                    l();
                }
                this.e.d();
                this.f4530c.c();
                gl.h.post(new qq(this));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void a(int i2, int i3) {
        this.s = i2;
        this.t = i3;
        s();
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void a(op opVar) {
        this.h = opVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        op opVar = this.h;
        if (opVar != null) {
            opVar.a("ExoPlayerAdapter error", str);
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void a(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        co.d(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.m = true;
        if (this.g.f2962a) {
            l();
        }
        gl.h.post(new pq(this, sb2));
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void a(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.k = str;
            this.l = (String[]) Arrays.copyOf(strArr, strArr.length);
            q();
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void a(boolean z, long j2) {
        if (this.d != null) {
            jo.e.execute(new yq(this, z, j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void b() {
        if (p()) {
            if (this.g.f2962a) {
                l();
            }
            this.j.d().a(false);
            this.e.d();
            this.f4530c.c();
            gl.h.post(new rq(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void b(int i2) {
        if (p()) {
            this.j.d().a((long) i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2, int i3) {
        op opVar = this.h;
        if (opVar != null) {
            opVar.a(i2, i3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z, long j2) {
        this.d.a(z, j2);
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void c() {
        if (p()) {
            if (this.g.f2962a) {
                t();
            }
            this.j.d().a(true);
            this.e.c();
            this.f4530c.b();
            this.f4529b.a();
            gl.h.post(new sq(this));
            return;
        }
        this.r = true;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void c(int i2) {
        er erVar = this.j;
        if (erVar != null) {
            erVar.e().c(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void d() {
        if (o()) {
            this.j.d().stop();
            if (this.j != null) {
                a((Surface) null, true);
                er erVar = this.j;
                if (erVar != null) {
                    erVar.a((nr) null);
                    this.j.c();
                    this.j = null;
                }
                this.n = 1;
                this.m = false;
                this.q = false;
                this.r = false;
            }
        }
        this.e.d();
        this.f4530c.c();
        this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void d(int i2) {
        er erVar = this.j;
        if (erVar != null) {
            erVar.e().d(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final String e() {
        String str = this.p ? " spherical" : BuildConfig.FLAVOR;
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void e(int i2) {
        er erVar = this.j;
        if (erVar != null) {
            erVar.e().a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        op opVar = this.h;
        if (opVar != null) {
            opVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void f(int i2) {
        er erVar = this.j;
        if (erVar != null) {
            erVar.e().b(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        op opVar = this.h;
        if (opVar != null) {
            opVar.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void g(int i2) {
        er erVar = this.j;
        if (erVar != null) {
            erVar.a(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final int getCurrentPosition() {
        if (p()) {
            return (int) this.j.d().X();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final int getDuration() {
        if (p()) {
            return (int) this.j.d().H();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final int getVideoHeight() {
        return this.t;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final int getVideoWidth() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        op opVar = this.h;
        if (opVar != null) {
            opVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(int i2) {
        op opVar = this.h;
        if (opVar != null) {
            opVar.onWindowVisibilityChanged(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        op opVar = this.h;
        if (opVar != null) {
            opVar.e();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        op opVar = this.h;
        if (opVar != null) {
            opVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        op opVar = this.h;
        if (opVar != null) {
            opVar.a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oq.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.p) {
            eq eqVar = new eq(getContext());
            this.o = eqVar;
            eqVar.a(surfaceTexture, i2, i3);
            this.o.start();
            SurfaceTexture c2 = this.o.c();
            if (c2 != null) {
                surfaceTexture = c2;
            } else {
                this.o.b();
                this.o = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.i = surface;
        if (this.j == null) {
            q();
        } else {
            a(surface, true);
            if (!this.g.f2962a) {
                t();
            }
        }
        if (this.s == 0 || this.t == 0) {
            c(i2, i3);
        } else {
            s();
        }
        gl.h.post(new uq(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        eq eqVar = this.o;
        if (eqVar != null) {
            eqVar.b();
            this.o = null;
        }
        if (this.j != null) {
            l();
            Surface surface = this.i;
            if (surface != null) {
                surface.release();
            }
            this.i = null;
            a((Surface) null, true);
        }
        gl.h.post(new wq(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        eq eqVar = this.o;
        if (eqVar != null) {
            eqVar.a(i2, i3);
        }
        gl.h.post(new tq(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.e.b(this);
        this.f4529b.a(surfaceTexture, this.h);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        wk.e(sb.toString());
        gl.h.post(new vq(this, i2));
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void setVideoPath(String str) {
        if (str != null) {
            this.k = str;
            this.l = new String[]{str};
            q();
        }
    }
}
