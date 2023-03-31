package b.c.b.a.c;

import java.lang.ref.WeakReference;

abstract class v extends u {
    private static final WeakReference<byte[]> d = new WeakReference<>(null);

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<byte[]> f1182c = d;

    v(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.c.u
    public final byte[] r0() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f1182c.get();
            if (bArr == null) {
                bArr = t0();
                this.f1182c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] t0();
}
