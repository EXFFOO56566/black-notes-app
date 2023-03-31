package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.l;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@TargetApi(14)
public final class wh2 extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private boolean f5274b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5275c;
    private final Object d;
    private final th2 e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final String n;
    private final boolean o;
    private final boolean p;
    private final boolean q;

    public wh2() {
        this(new th2());
    }

    private wh2(th2 th2) {
        this.f5274b = false;
        this.f5275c = false;
        this.e = th2;
        this.d = new Object();
        this.g = k0.d.a().intValue();
        this.h = k0.f3300a.a().intValue();
        this.i = k0.e.a().intValue();
        this.j = k0.f3302c.a().intValue();
        this.k = ((Integer) on2.e().a(zr2.I)).intValue();
        this.l = ((Integer) on2.e().a(zr2.J)).intValue();
        this.m = ((Integer) on2.e().a(zr2.K)).intValue();
        this.f = k0.f.a().intValue();
        this.n = (String) on2.e().a(zr2.M);
        this.o = ((Boolean) on2.e().a(zr2.N)).booleanValue();
        this.p = ((Boolean) on2.e().a(zr2.O)).booleanValue();
        this.q = ((Boolean) on2.e().a(zr2.P)).booleanValue();
        setName("ContentFetchTask");
    }

    private final ai2 a(View view, qh2 qh2) {
        boolean z;
        if (view == null) {
            return new ai2(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new ai2(this, 0, 0);
            }
            qh2.b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new ai2(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof ws)) {
            WebView webView = (WebView) view;
            if (!l.f()) {
                z = false;
            } else {
                qh2.h();
                webView.post(new yh2(this, qh2, webView, globalVisibleRect));
                z = true;
            }
            return z ? new ai2(this, 0, 1) : new ai2(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new ai2(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                ai2 a2 = a(viewGroup.getChildAt(i4), qh2);
                i2 += a2.f1764a;
                i3 += a2.f1765b;
            }
            return new ai2(this, i2, i3);
        }
    }

    private static boolean e() {
        try {
            Context b2 = q.f().b();
            if (b2 == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b2.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b2.getSystemService("keyguard");
            if (activityManager == null) {
                return false;
            }
            if (keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) b2.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            q.g().a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void f() {
        synchronized (this.d) {
            this.f5275c = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            co.a(sb.toString());
        }
    }

    public final void a() {
        synchronized (this.d) {
            this.f5275c = false;
            this.d.notifyAll();
            co.a("ContentFetchThread: wakeup");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        try {
            qh2 qh2 = new qh2(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.p);
            Context b2 = q.f().b();
            if (b2 != null && !TextUtils.isEmpty(this.n)) {
                String str = (String) view.getTag(b2.getResources().getIdentifier((String) on2.e().a(zr2.L), "id", b2.getPackageName()));
                if (str != null && str.equals(this.n)) {
                    return;
                }
            }
            ai2 a2 = a(view, qh2);
            qh2.j();
            if (a2.f1764a != 0 || a2.f1765b != 0) {
                if (a2.f1765b != 0 || qh2.k() != 0) {
                    if (a2.f1765b != 0 || !this.e.a(qh2)) {
                        this.e.c(qh2);
                    }
                }
            }
        } catch (Exception e2) {
            co.b("Exception in fetchContentOnUIThread", e2);
            q.g().a(e2, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(qh2 qh2, WebView webView, String str, boolean z) {
        qh2.g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.o || TextUtils.isEmpty(webView.getTitle())) {
                    qh2.a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    qh2.a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (qh2.b()) {
                this.e.b(qh2);
            }
        } catch (JSONException unused) {
            co.a("Json string may be malformed.");
        } catch (Throwable th) {
            co.a("Failed to get webview content.", th);
            q.g().a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void b() {
        synchronized (this.d) {
            if (this.f5274b) {
                co.a("Content hash thread already started, quiting...");
                return;
            }
            this.f5274b = true;
            start();
        }
    }

    public final qh2 c() {
        return this.e.a(this.q);
    }

    public final boolean d() {
        return this.f5275c;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0082 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082 A[LOOP:1: B:29:0x0082->B:40:0x0082, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wh2.run():void");
    }
}
