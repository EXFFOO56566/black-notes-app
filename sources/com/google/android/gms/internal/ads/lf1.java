package com.google.android.gms.internal.ads;

final class lf1 {

    /* renamed from: a  reason: collision with root package name */
    private final of1 f3540a = new of1();

    /* renamed from: b  reason: collision with root package name */
    private int f3541b;

    /* renamed from: c  reason: collision with root package name */
    private int f3542c;
    private int d;
    private int e;
    private int f;

    lf1() {
    }

    public final void a() {
        this.d++;
    }

    public final void b() {
        this.e++;
    }

    public final void c() {
        this.f3541b++;
        this.f3540a.f3985b = true;
    }

    public final void d() {
        this.f3542c++;
        this.f3540a.f3986c = true;
    }

    public final void e() {
        this.f++;
    }

    public final of1 f() {
        of1 of1 = (of1) this.f3540a.clone();
        of1 of12 = this.f3540a;
        of12.f3985b = false;
        of12.f3986c = false;
        return of1;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.d + "\n\tNew pools created: " + this.f3541b + "\n\tPools removed: " + this.f3542c + "\n\tEntries added: " + this.f + "\n\tNo entries retrieved: " + this.e + "\n";
    }
}
