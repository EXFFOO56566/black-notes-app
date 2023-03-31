package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

public abstract class kr2<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f3440a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3441b;

    /* renamed from: c  reason: collision with root package name */
    private final T f3442c;

    private kr2(int i, String str, T t) {
        this.f3440a = i;
        this.f3441b = str;
        this.f3442c = t;
        on2.d().a(this);
    }

    /* synthetic */ kr2(int i, String str, Object obj, nr2 nr2) {
        this(i, str, obj);
    }

    public static kr2<String> a(int i, String str) {
        kr2<String> a2 = a(1, str, (String) null);
        on2.d().c(a2);
        return a2;
    }

    public static kr2<Float> a(int i, String str, float f) {
        return new or2(1, str, Float.valueOf(0.0f));
    }

    public static kr2<Integer> a(int i, String str, int i2) {
        return new mr2(1, str, Integer.valueOf(i2));
    }

    public static kr2<Long> a(int i, String str, long j) {
        return new pr2(1, str, Long.valueOf(j));
    }

    public static kr2<Boolean> a(int i, String str, Boolean bool) {
        return new nr2(1, str, bool);
    }

    public static kr2<String> a(int i, String str, String str2) {
        return new rr2(1, str, str2);
    }

    /* access modifiers changed from: protected */
    public abstract T a(SharedPreferences sharedPreferences);

    public abstract T a(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract T a(JSONObject jSONObject);

    public final String a() {
        return this.f3441b;
    }

    public abstract void a(SharedPreferences.Editor editor, T t);

    public final int b() {
        return this.f3440a;
    }

    public final T c() {
        return this.f3442c;
    }
}
