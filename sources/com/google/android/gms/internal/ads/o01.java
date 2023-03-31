package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.b11;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.k90;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class o01 extends xj {
    private static final List<String> l = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));
    private static final List<String> m = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    private static final List<String> n = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    private static final List<String> o = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: b  reason: collision with root package name */
    private kv f3926b;

    /* renamed from: c  reason: collision with root package name */
    private Context f3927c;
    private eq1 d;
    private fo e;
    private ke1<jj0> f;
    private final ko1 g;
    private final ScheduledExecutorService h;
    private xe i;
    private Point j = new Point();
    private Point k = new Point();

    public o01(kv kvVar, Context context, eq1 eq1, fo foVar, ke1<jj0> ke1, ko1 ko1, ScheduledExecutorService scheduledExecutorService) {
        this.f3926b = kvVar;
        this.f3927c = context;
        this.d = eq1;
        this.e = foVar;
        this.f = ke1;
        this.g = ko1;
        this.h = scheduledExecutorService;
    }

    private final lo1<String> A(String str) {
        jj0[] jj0Arr = new jj0[1];
        lo1 a2 = yn1.a(this.f.a(), new v01(this, jj0Arr, str), this.g);
        a2.a(new y01(this, jj0Arr), this.g);
        return tn1.b(a2).a((long) ((Integer) on2.e().a(zr2.F3)).intValue(), TimeUnit.MILLISECONDS, this.h).a(t01.f4734a, this.g).a(Exception.class, w01.f5191a, this.g);
    }

    static /* synthetic */ Uri a(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? a(uri, "nas", str) : uri;
    }

    private static Uri a(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i2 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i2) + str + "=" + str2 + "&" + uri2.substring(i2));
    }

    static /* synthetic */ ArrayList a(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (b(uri) && !TextUtils.isEmpty(str)) {
                uri = a(uri, "nas", str);
            }
            arrayList.add(uri);
        }
        return arrayList;
    }

    private static boolean a(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            for (String str : list) {
                if (path.contains(str)) {
                    for (String str2 : list2) {
                        if (host.endsWith(str2)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Uri a(Uri uri, a aVar) {
        try {
            uri = this.d.a(uri, this.f3927c, (View) b.Q(aVar), null);
        } catch (ht1 e2) {
            co.c(BuildConfig.FLAVOR, e2);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    private static boolean b(Uri uri) {
        return a(uri, n, o);
    }

    private final boolean b2() {
        Map<String, WeakReference<View>> map;
        xe xeVar = this.i;
        return (xeVar == null || (map = xeVar.f5414c) == null || map.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.vj
    public final void G(a aVar) {
        if (((Boolean) on2.e().a(zr2.E3)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) b.Q(aVar);
            xe xeVar = this.i;
            this.j = gn.a(motionEvent, xeVar == null ? null : xeVar.f5413b);
            if (motionEvent.getAction() == 0) {
                this.k = this.j;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.j;
            obtain.setLocation((float) point.x, (float) point.y);
            this.d.a(obtain);
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(Uri uri) {
        return yn1.a(A("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new u01(this, uri), this.g);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(ArrayList arrayList) {
        return yn1.a(A("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new r01(this, arrayList), this.g);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(jj0[] jj0Arr, String str, jj0 jj0) {
        jj0Arr[0] = jj0;
        Context context = this.f3927c;
        xe xeVar = this.i;
        Map<String, WeakReference<View>> map = xeVar.f5414c;
        JSONObject a2 = gn.a(context, map, map, xeVar.f5413b);
        JSONObject a3 = gn.a(this.f3927c, this.i.f5413b);
        JSONObject a4 = gn.a(this.i.f5413b);
        JSONObject b2 = gn.b(this.f3927c, this.i.f5413b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", a2);
        jSONObject.put("ad_view_signal", a3);
        jSONObject.put("scroll_view_signal", a4);
        jSONObject.put("lock_screen_signal", b2);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", gn.a((String) null, this.f3927c, this.k, this.j));
        }
        return jj0.a(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList a(List list, a aVar) {
        String a2 = this.d.a() != null ? this.d.a().a(this.f3927c, (View) b.Q(aVar), (Activity) null) : BuildConfig.FLAVOR;
        if (!TextUtils.isEmpty(a2)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!b(uri)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    co.d(sb.toString());
                } else {
                    uri = a(uri, "ms", a2);
                }
                arrayList.add(uri);
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    @Override // com.google.android.gms.internal.ads.vj
    public final void a(a aVar, yj yjVar, uj ujVar) {
        Context context = (Context) b.Q(aVar);
        this.f3927c = context;
        String str = yjVar.f5603b;
        String str2 = yjVar.f5604c;
        um2 um2 = yjVar.d;
        rm2 rm2 = yjVar.e;
        l01 o2 = this.f3926b.o();
        g50.a aVar2 = new g50.a();
        aVar2.a(context);
        be1 be1 = new be1();
        if (str == null) {
            str = "adUnitId";
        }
        be1.a(str);
        if (rm2 == null) {
            rm2 = new qm2().a();
        }
        be1.a(rm2);
        if (um2 == null) {
            um2 = new um2();
        }
        be1.a(um2);
        aVar2.a(be1.d());
        o2.a(aVar2.a());
        b11.a aVar3 = new b11.a();
        aVar3.a(str2);
        o2.a(new b11(aVar3));
        o2.a(new k90.a().a());
        yn1.a(o2.a().a(), new x01(this, ujVar), this.f3926b.a());
    }

    @Override // com.google.android.gms.internal.ads.vj
    public final void a(xe xeVar) {
        this.i = xeVar;
        this.f.a(1);
    }

    @Override // com.google.android.gms.internal.ads.vj
    public final void a(List<Uri> list, a aVar, se seVar) {
        if (!((Boolean) on2.e().a(zr2.E3)).booleanValue()) {
            try {
                seVar.d("The updating URL feature is not enabled.");
            } catch (RemoteException e2) {
                co.b(BuildConfig.FLAVOR, e2);
            }
        } else {
            lo1 a2 = this.g.a(new n01(this, list, aVar));
            if (b2()) {
                a2 = yn1.a(a2, new q01(this), this.g);
            } else {
                co.c("Asset view map is empty.");
            }
            yn1.a(a2, new a11(this, seVar), this.f3926b.a());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(jj0[] jj0Arr) {
        if (jj0Arr[0] != null) {
            this.f.a(yn1.a(jj0Arr[0]));
        }
    }

    @Override // com.google.android.gms.internal.ads.vj
    public final void b(List<Uri> list, a aVar, se seVar) {
        try {
            if (!((Boolean) on2.e().a(zr2.E3)).booleanValue()) {
                seVar.d("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                seVar.d("There should be only 1 click URL.");
            } else {
                Uri uri = list.get(0);
                if (!a(uri, l, m)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    co.d(sb.toString());
                    seVar.b(list);
                    return;
                }
                lo1 a2 = this.g.a(new p01(this, uri, aVar));
                if (b2()) {
                    a2 = yn1.a(a2, new s01(this), this.g);
                } else {
                    co.c("Asset view map is empty.");
                }
                yn1.a(a2, new z01(this, seVar), this.f3926b.a());
            }
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.vj
    public final a c(a aVar, a aVar2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vj
    public final a f(a aVar) {
        return null;
    }
}
