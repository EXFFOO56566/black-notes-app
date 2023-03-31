package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import b.c.b.a.c.q.c;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class ik {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3100a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final bl f3101b = new bl();

    /* renamed from: c  reason: collision with root package name */
    private final tk f3102c = new tk(on2.f(), this.f3101b);
    private boolean d = false;
    private Context e;
    private fo f;
    private e g = null;
    private Boolean h = null;
    private final AtomicInteger i = new AtomicInteger(0);
    private final nk j = new nk(null);
    private final Object k = new Object();
    private lo1<ArrayList<String>> l;

    @TargetApi(16)
    private static ArrayList<String> a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b2 = c.a(context).b(context.getApplicationInfo().packageName, 4096);
            if (b2.requestedPermissions != null && b2.requestedPermissionsFlags != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = b2.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if ((b2.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final Context a() {
        return this.e;
    }

    @TargetApi(23)
    public final void a(Context context, fo foVar) {
        synchronized (this.f3100a) {
            if (!this.d) {
                this.e = context.getApplicationContext();
                this.f = foVar;
                q.f().a(this.f3102c);
                e eVar = null;
                this.f3101b.a(this.e, (String) null, true);
                bf.a(this.e, this.f);
                new ch2(context.getApplicationContext(), this.f);
                q.l();
                if (!j0.f3157c.a().booleanValue()) {
                    wk.e("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    eVar = new e();
                }
                this.g = eVar;
                if (eVar != null) {
                    no.a(new kk(this).b(), "AppState.registerCsiReporter");
                }
                this.d = true;
                j();
            }
        }
        q.c().a(context, foVar.f2633b);
    }

    public final void a(Boolean bool) {
        synchronized (this.f3100a) {
            this.h = bool;
        }
    }

    public final void a(Throwable th, String str) {
        bf.a(this.e, this.f).a(th, str);
    }

    public final Resources b() {
        if (this.f.e) {
            return this.e.getResources();
        }
        try {
            bo.a(this.e).getResources();
            return null;
        } catch (Cdo e2) {
            co.c("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void b(Throwable th, String str) {
        bf.a(this.e, this.f).a(th, str, w0.g.a().floatValue());
    }

    public final e c() {
        e eVar;
        synchronized (this.f3100a) {
            eVar = this.g;
        }
        return eVar;
    }

    public final Boolean d() {
        Boolean bool;
        synchronized (this.f3100a) {
            bool = this.h;
        }
        return bool;
    }

    public final void e() {
        this.j.a();
    }

    public final void f() {
        this.i.incrementAndGet();
    }

    public final void g() {
        this.i.decrementAndGet();
    }

    public final int h() {
        return this.i.get();
    }

    public final yk i() {
        bl blVar;
        synchronized (this.f3100a) {
            blVar = this.f3101b;
        }
        return blVar;
    }

    public final lo1<ArrayList<String>> j() {
        if (l.c() && this.e != null) {
            if (!((Boolean) on2.e().a(zr2.b1)).booleanValue()) {
                synchronized (this.k) {
                    if (this.l != null) {
                        return this.l;
                    }
                    lo1<ArrayList<String>> a2 = jo.f3256a.a(new lk(this));
                    this.l = a2;
                    return a2;
                }
            }
        }
        return yn1.a((Object) new ArrayList());
    }

    public final tk k() {
        return this.f3102c;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList l() {
        return a(vg.a(this.e));
    }
}
