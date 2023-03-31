package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class zn0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f5782a = j0.f3156b.a();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5783b;

    /* renamed from: c  reason: collision with root package name */
    private final io f5784c;
    private final Context d;
    private final String e;
    private final Map<String, String> f = new HashMap();
    private final boolean g;
    private final String h;

    public zn0(Executor executor, io ioVar, Context context, fo foVar) {
        this.f5783b = executor;
        this.f5784c = ioVar;
        this.d = context;
        this.e = context.getPackageName();
        this.g = ((double) on2.h().nextFloat()) <= j0.f3155a.a().doubleValue();
        this.h = foVar.f2633b;
        this.f.put("s", "gmob_sdk");
        this.f.put("v", "3");
        this.f.put("os", Build.VERSION.RELEASE);
        this.f.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f;
        q.c();
        map.put("device", gl.c());
        this.f.put("app", this.e);
        Map<String, String> map2 = this.f;
        q.c();
        map2.put("is_lite_sdk", gl.k(this.d) ? "1" : "0");
        this.f.put("e", TextUtils.join(",", zr2.b()));
        this.f.put("sdkVersion", this.h);
    }

    public final Map<String, String> a() {
        return new HashMap(this.f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        this.f5784c.a(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f5782a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (this.g) {
            this.f5783b.execute(new co0(this, uri));
        }
        wk.e(uri);
    }

    public final ConcurrentHashMap<String, String> b() {
        return new ConcurrentHashMap<>(this.f);
    }
}
