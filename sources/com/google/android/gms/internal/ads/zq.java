package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.j;
import java.io.IOException;
import java.io.InputStream;

public final class zq implements ye2 {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f5792a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5793b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5794c;
    private final ye2 d;
    private final nf2<ye2> e;
    private final cr f;
    private Uri g;

    public zq(Context context, ye2 ye2, nf2<ye2> nf2, cr crVar) {
        this.f5794c = context;
        this.d = ye2;
        this.e = nf2;
        this.f = crVar;
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final int a(byte[] bArr, int i, int i2) {
        if (this.f5793b) {
            InputStream inputStream = this.f5792a;
            int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.d.a(bArr, i, i2);
            nf2<ye2> nf2 = this.e;
            if (nf2 != null) {
                nf2.a(this, read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0095 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011e  */
    @Override // com.google.android.gms.internal.ads.ye2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.ze2 r21) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zq.a(com.google.android.gms.internal.ads.ze2):long");
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final void close() {
        if (this.f5793b) {
            this.f5793b = false;
            this.g = null;
            InputStream inputStream = this.f5792a;
            if (inputStream != null) {
                j.a(inputStream);
                this.f5792a = null;
            } else {
                this.d.close();
            }
            nf2<ye2> nf2 = this.e;
            if (nf2 != null) {
                nf2.a(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final Uri l0() {
        return this.g;
    }
}
