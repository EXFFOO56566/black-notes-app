package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class ly1 {

    /* renamed from: a  reason: collision with root package name */
    private final xy1 f3623a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f3624b;

    private ly1(int i) {
        byte[] bArr = new byte[i];
        this.f3624b = bArr;
        this.f3623a = xy1.a(bArr);
    }

    /* synthetic */ ly1(int i, gy1 gy1) {
        this(i);
    }

    public final dy1 a() {
        this.f3623a.b();
        return new oy1(this.f3624b);
    }

    public final xy1 b() {
        return this.f3623a;
    }
}
