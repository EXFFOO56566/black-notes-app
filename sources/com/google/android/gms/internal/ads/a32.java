package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class a32 {

    /* renamed from: a  reason: collision with root package name */
    private static final c32 f1689a = ((!(y22.a() && y22.b()) || ay1.a()) ? new b32() : new d32());

    /* access modifiers changed from: private */
    public static int a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    public static int a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int a(int i, byte[] bArr, int i2, int i3) {
        return f1689a.a(i, bArr, i2, i3);
    }

    static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new e32(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f1689a.a(charSequence, bArr, i, i2);
    }

    public static boolean a(byte[] bArr) {
        return f1689a.a(bArr, 0, bArr.length);
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return f1689a.a(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int b(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return a(b2);
        }
        if (i3 == 1) {
            return a(b2, bArr[i]);
        }
        if (i3 == 2) {
            return a(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    static String c(byte[] bArr, int i, int i2) {
        return f1689a.b(bArr, i, i2);
    }
}
