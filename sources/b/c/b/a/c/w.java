package b.c.b.a.c;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class w extends u {

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f1183c;

    w(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f1183c = bArr;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.c.u
    public final byte[] r0() {
        return this.f1183c;
    }
}
