package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class tp extends FrameLayout implements op {

    /* renamed from: b  reason: collision with root package name */
    private final gq f4839b;

    /* renamed from: c  reason: collision with root package name */
    private final FrameLayout f4840c;
    private final o d;
    private final iq e;
    private final long f;
    private rp g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private String n;
    private String[] o;
    private Bitmap p;
    private ImageView q;
    private boolean r;

    public tp(Context context, gq gqVar, int i2, boolean z, o oVar, hq hqVar) {
        super(context);
        this.f4839b = gqVar;
        this.d = oVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4840c = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        r.a(gqVar.c());
        rp a2 = gqVar.c().f1392b.a(context, gqVar, i2, z, oVar, hqVar);
        this.g = a2;
        if (a2 != null) {
            this.f4840c.addView(a2, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) on2.e().a(zr2.t)).booleanValue()) {
                n();
            }
        }
        this.q = new ImageView(context);
        this.f = ((Long) on2.e().a(zr2.x)).longValue();
        boolean booleanValue = ((Boolean) on2.e().a(zr2.v)).booleanValue();
        this.k = booleanValue;
        o oVar2 = this.d;
        if (oVar2 != null) {
            oVar2.a("spinner_used", booleanValue ? "1" : "0");
        }
        this.e = new iq(this);
        rp rpVar = this.g;
        if (rpVar != null) {
            rpVar.a(this);
        }
        if (this.g == null) {
            a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void a(gq gqVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        gqVar.a("onVideoEvent", hashMap);
    }

    public static void a(gq gqVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        gqVar.a("onVideoEvent", hashMap);
    }

    public static void a(gq gqVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        gqVar.a("onVideoEvent", hashMap);
    }

    /* access modifiers changed from: private */
    public final void b(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f4839b.a("onVideoEvent", hashMap);
    }

    private final boolean p() {
        return this.q.getParent() != null;
    }

    private final void q() {
        if (this.f4839b.a() != null && this.i && !this.j) {
            this.f4839b.a().getWindow().clearFlags(128);
            this.i = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void a() {
        rp rpVar = this.g;
        if (rpVar != null && this.m == 0) {
            b("canplaythrough", "duration", String.valueOf(((float) rpVar.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.g.getVideoWidth()), "videoHeight", String.valueOf(this.g.getVideoHeight()));
        }
    }

    public final void a(float f2, float f3) {
        rp rpVar = this.g;
        if (rpVar != null) {
            rpVar.a(f2, f3);
        }
    }

    public final void a(int i2) {
        rp rpVar = this.g;
        if (rpVar != null) {
            rpVar.b(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void a(int i2, int i3) {
        if (this.k) {
            int max = Math.max(i2 / ((Integer) on2.e().a(zr2.w)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) on2.e().a(zr2.w)).intValue(), 1);
            Bitmap bitmap = this.p;
            if (bitmap == null || bitmap.getWidth() != max || this.p.getHeight() != max2) {
                this.p = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.r = false;
            }
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (i4 != 0 && i5 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.setMargins(i2, i3, 0, 0);
            this.f4840c.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    public final void a(MotionEvent motionEvent) {
        rp rpVar = this.g;
        if (rpVar != null) {
            rpVar.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void a(String str, String str2) {
        b("error", "what", str, "extra", str2);
    }

    public final void a(String str, String[] strArr) {
        this.n = str;
        this.o = strArr;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z) {
        b("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void b() {
        if (this.r && this.p != null && !p()) {
            this.q.setImageBitmap(this.p);
            this.q.invalidate();
            this.f4840c.addView(this.q, new FrameLayout.LayoutParams(-1, -1));
            this.f4840c.bringChildToFront(this.q);
        }
        this.e.a();
        this.m = this.l;
        gl.h.post(new xp(this));
    }

    public final void b(int i2) {
        this.g.c(i2);
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void c() {
        b("ended", new String[0]);
        q();
    }

    public final void c(int i2) {
        this.g.d(i2);
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void d() {
        b("pause", new String[0]);
        q();
        this.h = false;
    }

    public final void d(int i2) {
        this.g.e(i2);
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void e() {
        if (this.f4839b.a() != null && !this.i) {
            boolean z = (this.f4839b.a().getWindow().getAttributes().flags & 128) != 0;
            this.j = z;
            if (!z) {
                this.f4839b.a().getWindow().addFlags(128);
                this.i = true;
            }
        }
        this.h = true;
    }

    public final void e(int i2) {
        this.g.f(i2);
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void f() {
        if (this.h && p()) {
            this.f4840c.removeView(this.q);
        }
        if (this.p != null) {
            long b2 = q.j().b();
            if (this.g.getBitmap(this.p) != null) {
                this.r = true;
            }
            long b3 = q.j().b() - b2;
            if (wk.a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b3);
                sb.append("ms");
                wk.e(sb.toString());
            }
            if (b3 > this.f) {
                co.d("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.k = false;
                this.p = null;
                o oVar = this.d;
                if (oVar != null) {
                    oVar.a("spinner_jank", Long.toString(b3));
                }
            }
        }
    }

    public final void f(int i2) {
        this.g.g(i2);
    }

    @Override // java.lang.Object
    public final void finalize() {
        try {
            this.e.a();
            if (this.g != null) {
                rp rpVar = this.g;
                ko1 ko1 = jo.e;
                rpVar.getClass();
                ko1.execute(sp.a(rpVar));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void g() {
        this.e.b();
        gl.h.post(new up(this));
    }

    public final void h() {
        this.e.a();
        rp rpVar = this.g;
        if (rpVar != null) {
            rpVar.d();
        }
        q();
    }

    public final void i() {
        rp rpVar = this.g;
        if (rpVar != null) {
            rpVar.b();
        }
    }

    public final void j() {
        rp rpVar = this.g;
        if (rpVar != null) {
            rpVar.c();
        }
    }

    public final void k() {
        if (this.g != null) {
            if (!TextUtils.isEmpty(this.n)) {
                this.g.a(this.n, this.o);
            } else {
                b("no_src", new String[0]);
            }
        }
    }

    public final void l() {
        rp rpVar = this.g;
        if (rpVar != null) {
            rpVar.f4530c.a(true);
            rpVar.a();
        }
    }

    public final void m() {
        rp rpVar = this.g;
        if (rpVar != null) {
            rpVar.f4530c.a(false);
            rpVar.a();
        }
    }

    @TargetApi(14)
    public final void n() {
        rp rpVar = this.g;
        if (rpVar != null) {
            TextView textView = new TextView(rpVar.getContext());
            String valueOf = String.valueOf(this.g.e());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f4840c.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f4840c.bringChildToFront(textView);
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        rp rpVar = this.g;
        if (rpVar != null) {
            long currentPosition = (long) rpVar.getCurrentPosition();
            if (this.l != currentPosition && currentPosition > 0) {
                b("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.l = currentPosition;
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        iq iqVar = this.e;
        if (z) {
            iqVar.b();
        } else {
            iqVar.a();
            this.m = this.l;
        }
        gl.h.post(new vp(this, z));
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void onWindowVisibilityChanged(int i2) {
        boolean z;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.e.b();
            z = true;
        } else {
            this.e.a();
            this.m = this.l;
            z = false;
        }
        gl.h.post(new wp(this, z));
    }

    public final void setVolume(float f2) {
        rp rpVar = this.g;
        if (rpVar != null) {
            rpVar.f4530c.a(f2);
            rpVar.a();
        }
    }
}
