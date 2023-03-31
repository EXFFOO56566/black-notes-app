package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;

public final class jh0 {

    /* renamed from: a  reason: collision with root package name */
    private final d f3226a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3227b;

    public jh0(tm tmVar, d dVar, Executor executor) {
        this.f3226a = dVar;
        this.f3227b = executor;
    }

    /* access modifiers changed from: private */
    public final Bitmap a(byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) on2.e().a(zr2.W2)).booleanValue()) {
            options.inJustDecodeBounds = true;
            a(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                int i2 = i - 1;
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros(i2 / ((Integer) on2.e().a(zr2.X2)).intValue())) / 2);
            }
        }
        return a(bArr, options);
    }

    private final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        long b2 = this.f3226a.b();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b3 = this.f3226a.b();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = b3 - b2;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            wk.e(sb.toString());
        }
        return decodeByteArray;
    }

    public final lo1<Bitmap> a(String str, double d, boolean z) {
        return yn1.a(tm.a(str), new ih0(this, d, z), this.f3227b);
    }
}
