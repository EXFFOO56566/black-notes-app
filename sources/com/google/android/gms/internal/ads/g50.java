package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public class g50 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2704a;

    /* renamed from: b  reason: collision with root package name */
    private final zd1 f2705b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f2706c;
    private final String d;
    private final td1 e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Context f2707a;

        /* renamed from: b  reason: collision with root package name */
        private zd1 f2708b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f2709c;
        private String d;
        private td1 e;

        public final a a(Context context) {
            this.f2707a = context;
            return this;
        }

        public final a a(Bundle bundle) {
            this.f2709c = bundle;
            return this;
        }

        public final a a(td1 td1) {
            this.e = td1;
            return this;
        }

        public final a a(zd1 zd1) {
            this.f2708b = zd1;
            return this;
        }

        public final a a(String str) {
            this.d = str;
            return this;
        }

        public final g50 a() {
            return new g50(this);
        }
    }

    private g50(a aVar) {
        this.f2704a = aVar.f2707a;
        this.f2705b = aVar.f2708b;
        this.f2706c = aVar.f2709c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    /* access modifiers changed from: package-private */
    public final Context a(Context context) {
        return this.d != null ? context : this.f2704a;
    }

    /* access modifiers changed from: package-private */
    public final a a() {
        a aVar = new a();
        aVar.a(this.f2704a);
        aVar.a(this.f2705b);
        aVar.a(this.d);
        aVar.a(this.f2706c);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final zd1 b() {
        return this.f2705b;
    }

    /* access modifiers changed from: package-private */
    public final td1 c() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final Bundle d() {
        return this.f2706c;
    }

    /* access modifiers changed from: package-private */
    public final String e() {
        return this.d;
    }
}
