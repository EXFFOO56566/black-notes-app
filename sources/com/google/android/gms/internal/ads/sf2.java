package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class sf2 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4651a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f4652b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX WARN: Type inference failed for: r10v0, types: [int, boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.vf2 a(byte[] r18, int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 383
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sf2.a(byte[], int, int):com.google.android.gms.internal.ads.vf2");
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }
}
