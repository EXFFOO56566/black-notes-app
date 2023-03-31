package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Base64;
import b.c.b.a.h.f;
import b.c.b.a.h.i;
import com.google.android.gms.ads.t.a;
import com.google.android.gms.internal.ads.ba0;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aj1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1772a;

    /* renamed from: b  reason: collision with root package name */
    private final ji1 f1773b;

    /* renamed from: c  reason: collision with root package name */
    private final ni1 f1774c;
    private final f<ba0> d;
    private final f<ba0> e;

    public aj1(Context context, Executor executor, ji1 ji1, ni1 ni1) {
        this(context, executor, ji1, ni1, new gj1(), new dj1());
    }

    private aj1(Context context, Executor executor, ji1 ji1, ni1 ni1, gj1 gj1, dj1 dj1) {
        this.f1772a = context;
        this.f1773b = ji1;
        this.f1774c = ni1;
        f<ba0> a2 = i.a(executor, new yi1(this));
        a2.a(new cj1(this));
        this.d = a2;
        f<ba0> a3 = i.a(executor, new bj1(this));
        a3.a(new ej1(this));
        this.e = a3;
    }

    private final synchronized ba0 a(f<ba0> fVar) {
        if (!fVar.d()) {
            try {
                i.a(fVar, 200, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                b(e2);
            }
        }
        if (!fVar.e()) {
            ba0.a x = ba0.x();
            x.d("E");
            return (ba0) ((rz1) x.e());
        }
        return fVar.b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void b(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f1773b.a(2025, -1, exc);
    }

    private final synchronized ba0 g() {
        return a(this.d);
    }

    private final synchronized ba0 h() {
        return a(this.e);
    }

    public final String a() {
        return h().p();
    }

    public final String b() {
        return g().r();
    }

    public final boolean c() {
        return g().t();
    }

    public final int d() {
        return g().s().a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ba0 e() {
        PackageInfo packageInfo = this.f1772a.getPackageManager().getPackageInfo(this.f1772a.getPackageName(), 0);
        Context context = this.f1772a;
        return ti1.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ba0 f() {
        if (!this.f1774c.b()) {
            return ba0.y();
        }
        Context context = this.f1772a;
        ba0.a x = ba0.x();
        a aVar = new a(context);
        aVar.c();
        a.C0067a b2 = aVar.b();
        String a2 = b2.a();
        if (a2 != null && a2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(a2);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            a2 = Base64.encodeToString(bArr, 11);
        }
        if (a2 != null) {
            x.a(a2);
            x.a(b2.b());
            x.a(ba0.c.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return (ba0) ((rz1) x.e());
    }
}
