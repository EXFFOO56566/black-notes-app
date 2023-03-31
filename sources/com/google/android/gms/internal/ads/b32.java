package com.google.android.gms.internal.ads;

final class b32 extends c32 {
    b32() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r13[r14] > -65) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
        if (r13[r14] > -65) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r13[r14] > -65) goto L_0x0022;
     */
    @Override // com.google.android.gms.internal.ads.c32
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r12, byte[] r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b32.a(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.c32
    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                i4 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
                i7++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i4 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            } else if (i8 <= i6 - 4) {
                int i12 = i7 + 1;
                if (i12 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i12);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i13 = i8 + 1;
                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i8 = i15 + 1;
                        bArr[i15] = (byte) ((codePoint & 63) | 128);
                        i7 = i12;
                        i7++;
                    } else {
                        i7 = i12;
                    }
                }
                throw new e32(i7 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i8);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new e32(i7, length);
            }
            i8 = i4;
            i7++;
        }
        return i8;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.c32
    public final String b(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (!z22.e(b2)) {
                    break;
                }
                i++;
                z22.b(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                if (z22.e(b3)) {
                    int i7 = i5 + 1;
                    z22.b(b3, cArr, i5);
                    while (i6 < i3) {
                        byte b4 = bArr[i6];
                        if (!z22.e(b4)) {
                            break;
                        }
                        i6++;
                        z22.b(b4, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (z22.f(b3)) {
                    if (i6 < i3) {
                        z22.b(b3, bArr[i6], cArr, i5);
                        i = i6 + 1;
                        i5++;
                    } else {
                        throw b02.i();
                    }
                } else if (z22.g(b3)) {
                    if (i6 < i3 - 1) {
                        int i8 = i6 + 1;
                        z22.b(b3, bArr[i6], bArr[i8], cArr, i5);
                        i = i8 + 1;
                        i5++;
                    } else {
                        throw b02.i();
                    }
                } else if (i6 < i3 - 2) {
                    int i9 = i6 + 1;
                    byte b5 = bArr[i6];
                    int i10 = i9 + 1;
                    z22.b(b3, b5, bArr[i9], bArr[i10], cArr, i5);
                    i = i10 + 1;
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
