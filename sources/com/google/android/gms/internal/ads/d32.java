package com.google.android.gms.internal.ads;

final class d32 extends c32 {
    d32() {
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return a32.b(i);
        }
        if (i2 == 1) {
            return a32.b(i, y22.a(bArr, j));
        }
        if (i2 == 2) {
            return a32.b(i, y22.a(bArr, j), y22.a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (com.google.android.gms.internal.ads.y22.a(r23, r8) > -65) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (com.google.android.gms.internal.ads.y22.a(r23, r8) > -65) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00f9, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0120, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.ads.c32
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r22, byte[] r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 375
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d32.a(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00fb, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v3 char) = (r3v2 char), (r3v4 char) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.c32
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d32.a(java.lang.CharSequence, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.c32
    public final String b(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte a2 = y22.a(bArr, (long) i);
                if (!z22.e(a2)) {
                    break;
                }
                i++;
                z22.b(a2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte a3 = y22.a(bArr, (long) i);
                if (z22.e(a3)) {
                    int i7 = i5 + 1;
                    z22.b(a3, cArr, i5);
                    while (i6 < i3) {
                        byte a4 = y22.a(bArr, (long) i6);
                        if (!z22.e(a4)) {
                            break;
                        }
                        i6++;
                        z22.b(a4, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (z22.f(a3)) {
                    if (i6 < i3) {
                        int i8 = i6 + 1;
                        z22.b(a3, y22.a(bArr, (long) i6), cArr, i5);
                        i = i8;
                        i5++;
                    } else {
                        throw b02.i();
                    }
                } else if (z22.g(a3)) {
                    if (i6 < i3 - 1) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        z22.b(a3, y22.a(bArr, (long) i6), y22.a(bArr, (long) i9), cArr, i5);
                        i = i10;
                        i5++;
                    } else {
                        throw b02.i();
                    }
                } else if (i6 < i3 - 2) {
                    int i11 = i6 + 1;
                    int i12 = i11 + 1;
                    z22.b(a3, y22.a(bArr, (long) i6), y22.a(bArr, (long) i11), y22.a(bArr, (long) i12), cArr, i5);
                    i = i12 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw b02.i();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
