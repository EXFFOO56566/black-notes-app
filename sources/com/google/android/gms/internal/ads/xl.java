package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.List;

public final class xl {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5438a;

    /* renamed from: b  reason: collision with root package name */
    private String f5439b;

    /* renamed from: c  reason: collision with root package name */
    private String f5440c;
    private String d;
    private String e;
    private int f;
    private int g;
    private PointF h;
    private PointF i;
    private Handler j;
    private Runnable k;

    public xl(Context context) {
        this.f = 0;
        this.k = new am(this);
        this.f5438a = context;
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        q.q().b();
        this.j = q.q().a();
    }

    public xl(Context context, String str) {
        this(context);
        this.f5439b = str;
    }

    private static int a(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    private final boolean a(float f2, float f3, float f4, float f5) {
        return Math.abs(this.h.x - f2) < ((float) this.g) && Math.abs(this.h.y - f3) < ((float) this.g) && Math.abs(this.i.x - f4) < ((float) this.g) && Math.abs(this.i.y - f5) < ((float) this.g);
    }

    public final void a() {
        try {
            if (!(this.f5438a instanceof Activity)) {
                co.c("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(q.m().a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = q.m().b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a2 = a((List<String>) arrayList, "Ad Information", true);
            int a3 = a((List<String>) arrayList, str, true);
            int a4 = a((List<String>) arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f5438a, q.e().c());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new zl(this, a2, a3, a4));
            builder.create().show();
        } catch (WindowManager.BadTokenException e2) {
            wk.e(BuildConfig.FLAVOR, e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xl.a(int, int, int, android.content.DialogInterface, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xl.a(android.view.MotionEvent):void");
    }

    public final void a(String str) {
        this.f5440c = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, DialogInterface dialogInterface, int i2) {
        q.c();
        gl.a(this.f5438a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        q.m().a(this.f5438a, this.f5440c, this.d, this.e);
    }

    public final void b(String str) {
        this.d = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        q.m().a(this.f5438a, this.f5440c, this.d);
    }

    public final void c(String str) {
        this.f5439b = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f = 4;
        a();
    }

    public final void d(String str) {
        this.e = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f5439b);
        sb.append(",DebugSignal: ");
        sb.append(this.e);
        sb.append(",AFMA Version: ");
        sb.append(this.d);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f5440c);
        sb.append("}");
        return sb.toString();
    }
}
