package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.util.Map;

public final class sd extends wd implements d5<ws> {

    /* renamed from: c  reason: collision with root package name */
    private final ws f4637c;
    private final Context d;
    private final WindowManager e;
    private final gr2 f;
    private DisplayMetrics g;
    private float h;
    private int i = -1;
    private int j = -1;
    private int k;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int o = -1;

    public sd(ws wsVar, Context context, gr2 gr2) {
        super(wsVar);
        this.f4637c = wsVar;
        this.d = context;
        this.f = gr2;
        this.e = (WindowManager) context.getSystemService("window");
    }

    public final void a(int i2, int i3) {
        int i4 = 0;
        if (this.d instanceof Activity) {
            i4 = q.c().b((Activity) this.d)[0];
        }
        if (this.f4637c.f() == null || !this.f4637c.f().b()) {
            int width = this.f4637c.getWidth();
            int height = this.f4637c.getHeight();
            if (((Boolean) on2.e().a(zr2.H)).booleanValue()) {
                if (width == 0 && this.f4637c.f() != null) {
                    width = this.f4637c.f().f3605c;
                }
                if (height == 0 && this.f4637c.f() != null) {
                    height = this.f4637c.f().f3604b;
                }
            }
            this.n = on2.a().a(this.d, width);
            this.o = on2.a().a(this.d, height);
        }
        b(i2, i3 - i4, this.n, this.o);
        this.f4637c.P().a(i2, i3);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        int i2;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        on2.a();
        DisplayMetrics displayMetrics = this.g;
        this.i = sn.b(displayMetrics, displayMetrics.widthPixels);
        on2.a();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = sn.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity a2 = this.f4637c.a();
        if (a2 == null || a2.getWindow() == null) {
            this.l = this.i;
            i2 = this.j;
        } else {
            q.c();
            int[] c2 = gl.c(a2);
            on2.a();
            this.l = sn.b(this.g, c2[0]);
            on2.a();
            i2 = sn.b(this.g, c2[1]);
        }
        this.m = i2;
        if (this.f4637c.f().b()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            this.f4637c.measure(0, 0);
        }
        a(this.i, this.j, this.l, this.m, this.h, this.k);
        td tdVar = new td();
        tdVar.b(this.f.a());
        tdVar.a(this.f.b());
        tdVar.c(this.f.d());
        tdVar.d(this.f.c());
        tdVar.e(true);
        this.f4637c.a("onDeviceFeaturesReceived", new rd(tdVar).a());
        int[] iArr = new int[2];
        this.f4637c.getLocationOnScreen(iArr);
        a(on2.a().a(this.d, iArr[0]), on2.a().a(this.d, iArr[1]));
        if (co.a(2)) {
            co.c("Dispatching Ready Event.");
        }
        b(this.f4637c.b().f2633b);
    }
}
