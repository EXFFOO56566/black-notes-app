package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.common.util.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class ci1 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2120a;

    /* renamed from: b  reason: collision with root package name */
    private final io f2121b;

    /* renamed from: c  reason: collision with root package name */
    private final lw0 f2122c;
    private final String d;
    private final String e;
    private final String f;
    private final Context g;
    private final td1 h;
    private final d i;
    private final eq1 j;

    public ci1(Executor executor, io ioVar, lw0 lw0, fo foVar, String str, String str2, Context context, td1 td1, d dVar, eq1 eq1) {
        this.f2120a = executor;
        this.f2121b = ioVar;
        this.f2122c = lw0;
        this.d = foVar.f2633b;
        this.e = str;
        this.f = str2;
        this.g = context;
        this.h = td1;
        this.i = dVar;
        this.j = eq1;
    }

    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = BuildConfig.FLAVOR;
        }
        return str.replaceAll(str2, str3);
    }

    private static String c(String str) {
        return (TextUtils.isEmpty(str) || !wn.a()) ? str : "fakeForAdDebugLog";
    }

    public final void a(vd1 vd1, id1 id1, List<String> list) {
        a(vd1, id1, false, BuildConfig.FLAVOR, list);
    }

    public final void a(vd1 vd1, id1 id1, List<String> list, ug ugVar) {
        long a2 = this.i.a();
        try {
            String m = ugVar.m();
            String num = Integer.toString(ugVar.I());
            ArrayList arrayList = new ArrayList();
            td1 td1 = this.h;
            String str = BuildConfig.FLAVOR;
            String c2 = td1 == null ? str : c(td1.f4792a);
            td1 td12 = this.h;
            if (td12 != null) {
                str = c(td12.f4793b);
            }
            for (String str2 : list) {
                arrayList.add(sj.a(a(a(a(a(a(a(str2, "@gw_rwd_userid@", Uri.encode(c2)), "@gw_rwd_custom_data@", Uri.encode(str)), "@gw_tmstmp@", Long.toString(a2)), "@gw_rwd_itm@", Uri.encode(m)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.d), this.g, id1.M));
            }
            a(arrayList);
        } catch (RemoteException unused) {
        }
    }

    public final void a(vd1 vd1, id1 id1, boolean z, String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str2 = z ? "1" : "0";
        for (String str3 : list) {
            String a2 = a(a(a(str3, "@gw_adlocid@", vd1.f5092a.f4150a.f), "@gw_adnetrefresh@", str2), "@gw_sdkver@", this.d);
            if (id1 != null) {
                a2 = sj.a(a(a(a(a2, "@gw_qdata@", id1.v), "@gw_adnetid@", id1.u), "@gw_allocid@", id1.t), this.g, id1.M);
            }
            String a3 = a(a(a(a2, "@gw_adnetstatus@", this.f2122c.a()), "@gw_seqnum@", this.e), "@gw_sessid@", this.f);
            if (((Boolean) on2.e().a(zr2.p1)).booleanValue() && !TextUtils.isEmpty(str)) {
                if (this.j.a(Uri.parse(a3))) {
                    a3 = Uri.parse(a3).buildUpon().appendQueryParameter("ms", str).build().toString();
                }
            }
            arrayList.add(a3);
        }
        a(arrayList);
    }

    public final void a(String str) {
        this.f2120a.execute(new fi1(this, str));
    }

    public final void a(List<String> list) {
        for (String str : list) {
            a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        this.f2121b.a(str);
    }
}
