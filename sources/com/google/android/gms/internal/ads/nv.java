package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.h;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;

public class nv {

    /* renamed from: a  reason: collision with root package name */
    private final fo f3892a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3893b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Context> f3894c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private fo f3895a;

        /* renamed from: b  reason: collision with root package name */
        private Context f3896b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<Context> f3897c;

        public final a a(Context context) {
            this.f3897c = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f3896b = context;
            return this;
        }

        public final a a(fo foVar) {
            this.f3895a = foVar;
            return this;
        }
    }

    private nv(a aVar) {
        this.f3892a = aVar.f3895a;
        this.f3893b = aVar.f3896b;
        this.f3894c = aVar.f3897c;
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f3893b;
    }

    /* access modifiers changed from: package-private */
    public final WeakReference<Context> b() {
        return this.f3894c;
    }

    /* access modifiers changed from: package-private */
    public final fo c() {
        return this.f3892a;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return q.c().a(this.f3893b, this.f3892a.f2633b);
    }

    public final eq1 e() {
        return new eq1(new h(this.f3893b, this.f3892a));
    }
}
