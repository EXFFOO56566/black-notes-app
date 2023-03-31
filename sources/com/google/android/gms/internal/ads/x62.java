package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class x62 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    protected final l52 f5373a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5374b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5375c;
    protected final ba0.a d;
    protected Method e;
    private final int f;
    private final int g;

    public x62(l52 l52, String str, String str2, ba0.a aVar, int i, int i2) {
        getClass().getSimpleName();
        this.f5373a = l52;
        this.f5374b = str;
        this.f5375c = str2;
        this.d = aVar;
        this.f = i;
        this.g = i2;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* renamed from: b */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            Method a2 = this.f5373a.a(this.f5374b, this.f5375c);
            this.e = a2;
            if (a2 == null) {
                return null;
            }
            a();
            ud1 j = this.f5373a.j();
            if (!(j == null || this.f == Integer.MIN_VALUE)) {
                j.a(this.g, this.f, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
