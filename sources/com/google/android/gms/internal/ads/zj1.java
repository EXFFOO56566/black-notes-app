package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Arrays;

public final class zj1 {

    /* renamed from: a  reason: collision with root package name */
    private final g72 f5768a;

    /* renamed from: b  reason: collision with root package name */
    private final File f5769b;

    /* renamed from: c  reason: collision with root package name */
    private final File f5770c;
    private final File d;
    private byte[] e;

    public zj1(g72 g72, File file, File file2, File file3) {
        this.f5768a = g72;
        this.f5769b = file;
        this.f5770c = file3;
        this.d = file2;
    }

    public final boolean a() {
        return System.currentTimeMillis() / 1000 > this.f5768a.r();
    }

    public final boolean a(long j) {
        return this.f5768a.r() - (System.currentTimeMillis() / 1000) < 3600;
    }

    public final g72 b() {
        return this.f5768a;
    }

    public final File c() {
        return this.f5769b;
    }

    public final File d() {
        return this.f5770c;
    }

    public final byte[] e() {
        if (this.e == null) {
            this.e = ck1.b(this.d);
        }
        byte[] bArr = this.e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
