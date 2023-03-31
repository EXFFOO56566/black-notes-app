package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class t92 implements u82 {

    /* renamed from: b  reason: collision with root package name */
    private int f4771b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f4772c = -1;
    private int d = 0;
    private ByteBuffer e;
    private ByteBuffer f;
    private boolean g;

    public t92() {
        ByteBuffer byteBuffer = u82.f4914a;
        this.e = byteBuffer;
        this.f = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final boolean E() {
        return this.g && this.f == u82.f4914a;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void a() {
        flush();
        this.e = u82.f4914a;
        this.f4771b = -1;
        this.f4772c = -1;
        this.d = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.u82
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.nio.ByteBuffer r8) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t92.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final boolean a(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new t82(i, i2, i3);
        } else if (this.f4771b == i && this.f4772c == i2 && this.d == i3) {
            return false;
        } else {
            this.f4771b = i;
            this.f4772c = i2;
            this.d = i3;
            if (i3 != 2) {
                return true;
            }
            this.e = u82.f4914a;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final int b() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final boolean c() {
        int i = this.d;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void d() {
        this.g = true;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.f;
        this.f = u82.f4914a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final int f() {
        return this.f4772c;
    }

    @Override // com.google.android.gms.internal.ads.u82
    public final void flush() {
        this.f = u82.f4914a;
        this.g = false;
    }
}
