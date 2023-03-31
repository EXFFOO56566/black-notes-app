package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.TimeUnit;

public final class kq {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3432a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3433b;

    /* renamed from: c  reason: collision with root package name */
    private final fo f3434c;
    private final m d;
    private final o e;
    private final pm f;
    private final long[] g;
    private final String[] h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m;
    private rp n;
    private boolean o;
    private boolean p;
    private long q = -1;

    public kq(Context context, fo foVar, String str, o oVar, m mVar) {
        qm qmVar = new qm();
        qmVar.a("min_1", Double.MIN_VALUE, 1.0d);
        qmVar.a("1_5", 1.0d, 5.0d);
        qmVar.a("5_10", 5.0d, 10.0d);
        qmVar.a("10_20", 10.0d, 20.0d);
        qmVar.a("20_30", 20.0d, 30.0d);
        qmVar.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f = qmVar.a();
        this.f3432a = context;
        this.f3434c = foVar;
        this.f3433b = str;
        this.e = oVar;
        this.d = mVar;
        String str2 = (String) on2.e().a(zr2.r);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.h = new String[split.length];
        this.g = new long[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                this.g[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException e2) {
                co.c("Unable to parse frame hash target time number.", e2);
                this.g[i2] = -1;
            }
        }
    }

    public final void a() {
        if (z0.f5674a.a().booleanValue() && !this.o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f3433b);
            bundle.putString("player", this.n.e());
            for (rm rmVar : this.f.a()) {
                String valueOf = String.valueOf(rmVar.f4517a);
                bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(rmVar.e));
                String valueOf2 = String.valueOf(rmVar.f4517a);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(rmVar.d));
            }
            int i2 = 0;
            while (true) {
                long[] jArr = this.g;
                if (i2 < jArr.length) {
                    String str = this.h[i2];
                    if (str != null) {
                        String valueOf3 = String.valueOf(Long.valueOf(jArr[i2]));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                        sb.append("fh_");
                        sb.append(valueOf3);
                        bundle.putString(sb.toString(), str);
                    }
                    i2++;
                } else {
                    q.c().a(this.f3432a, this.f3434c.f2633b, "gmob-apps", bundle, true);
                    this.o = true;
                    return;
                }
            }
        }
    }

    public final void a(rp rpVar) {
        j.a(this.e, this.d, "vpc2");
        this.i = true;
        o oVar = this.e;
        if (oVar != null) {
            oVar.a("vpn", rpVar.e());
        }
        this.n = rpVar;
    }

    public final void b() {
        if (this.i && !this.j) {
            j.a(this.e, this.d, "vfr2");
            this.j = true;
        }
    }

    public final void b(rp rpVar) {
        if (this.k && !this.l) {
            if (wk.a() && !this.l) {
                wk.e("VideoMetricsMixin first frame");
            }
            j.a(this.e, this.d, "vff2");
            this.l = true;
        }
        long c2 = q.j().c();
        if (this.m && this.p && this.q != -1) {
            this.f.a(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c2 - this.q)));
        }
        this.p = this.m;
        this.q = c2;
        long longValue = ((Long) on2.e().a(zr2.s)).longValue();
        long currentPosition = (long) rpVar.getCurrentPosition();
        int i2 = 0;
        while (true) {
            String[] strArr = this.h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] != null || longValue <= Math.abs(currentPosition - this.g[i2])) {
                i2++;
            } else {
                String[] strArr2 = this.h;
                int i3 = 8;
                Bitmap bitmap = rpVar.getBitmap(8, 8);
                long j2 = 63;
                int i4 = 0;
                long j3 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j3 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j2);
                        i5++;
                        j2--;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr2[i2] = String.format("%016X", Long.valueOf(j3));
                return;
            }
        }
    }

    public final void c() {
        this.m = true;
        if (this.j && !this.k) {
            j.a(this.e, this.d, "vfp2");
            this.k = true;
        }
    }

    public final void d() {
        this.m = false;
    }
}
