package com.google.android.gms.internal.ads;

public class gp0 extends Exception {

    /* renamed from: b  reason: collision with root package name */
    private final int f2794b;

    public gp0(int i) {
        this.f2794b = i;
    }

    public gp0(String str, int i) {
        super(str);
        this.f2794b = i;
    }

    public gp0(String str, Throwable th, int i) {
        super(str, th);
        this.f2794b = 0;
    }

    public static int a(Throwable th) {
        if (th instanceof gp0) {
            return ((gp0) th).f2794b;
        }
        if (th instanceof km) {
            return ((km) th).a();
        }
        return 0;
    }

    public final int a() {
        return this.f2794b;
    }
}
