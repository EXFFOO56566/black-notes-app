package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.q00;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ud1 {

    /* renamed from: c  reason: collision with root package name */
    private static final ConditionVariable f4931c = new ConditionVariable();
    protected static volatile ak2 d = null;
    private static volatile Random e = null;

    /* renamed from: a  reason: collision with root package name */
    private l52 f4932a;

    /* renamed from: b  reason: collision with root package name */
    protected volatile Boolean f4933b;

    public ud1(l52 l52) {
        this.f4932a = l52;
        l52.e().execute(new xg1(this));
    }

    public static int a() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : b().nextInt();
        } catch (RuntimeException unused) {
            return b().nextInt();
        }
    }

    private static Random b() {
        if (e == null) {
            synchronized (ud1.class) {
                if (e == null) {
                    e = new Random();
                }
            }
        }
        return e;
    }

    public final void a(int i, int i2, long j) {
        a(i, i2, j, null, null);
    }

    public final void a(int i, int i2, long j, String str) {
        a(i, -1, j, str, null);
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            f4931c.block();
            if (this.f4933b.booleanValue() && d != null) {
                q00.a p = q00.p();
                p.a(this.f4932a.f3499a.getPackageName());
                p.a(j);
                if (str != null) {
                    p.d(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    kx1.a(exc, new PrintWriter(stringWriter));
                    p.b(stringWriter.toString());
                    p.c(exc.getClass().getName());
                }
                fk2 a2 = d.a(((q00) ((rz1) p.e())).f());
                a2.b(i);
                if (i2 != -1) {
                    a2.a(i2);
                }
                a2.a();
            }
        } catch (Exception unused) {
        }
    }
}
