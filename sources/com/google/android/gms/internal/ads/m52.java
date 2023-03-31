package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class m52 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3666b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f3667c;
    private final /* synthetic */ l52 d;

    m52(l52 l52, int i, boolean z) {
        this.d = l52;
        this.f3666b = i;
        this.f3667c = z;
    }

    public final void run() {
        ba0 b2 = this.d.b(this.f3666b, this.f3667c);
        this.d.j = b2;
        if (l52.a(this.f3666b, b2)) {
            this.d.a(this.f3666b + 1, this.f3667c);
        }
    }
}
