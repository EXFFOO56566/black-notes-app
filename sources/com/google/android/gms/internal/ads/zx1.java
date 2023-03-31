package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;

/* access modifiers changed from: package-private */
public final class zx1 {
    static int a(int i, byte[] bArr, int i2, int i3, cy1 cy1) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, cy1);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, cy1) + cy1.f2185a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = a(bArr, i2, cy1);
                    i6 = cy1.f2185a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, cy1);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw b02.h();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw b02.d();
            }
        } else {
            throw b02.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, r22 r22, cy1 cy1) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b2 = b(bArr, i2, cy1);
                r22.a(i, Long.valueOf(cy1.f2186b));
                return b2;
            } else if (i4 == 1) {
                r22.a(i, Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a2 = a(bArr, i2, cy1);
                int i5 = cy1.f2185a;
                if (i5 < 0) {
                    throw b02.b();
                } else if (i5 <= bArr.length - a2) {
                    r22.a(i, i5 == 0 ? dy1.f2334c : dy1.a(bArr, a2, i5));
                    return a2 + i5;
                } else {
                    throw b02.a();
                }
            } else if (i4 == 3) {
                r22 e = r22.e();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a3 = a(bArr, i2, cy1);
                    int i8 = cy1.f2185a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a3;
                        break;
                    }
                    int a4 = a(i7, bArr, a3, i3, e, cy1);
                    i7 = i8;
                    i2 = a4;
                }
                if (i2 > i3 || i7 != i6) {
                    throw b02.h();
                }
                r22.a(i, e);
                return i2;
            } else if (i4 == 5) {
                r22.a(i, Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                throw b02.d();
            }
        } else {
            throw b02.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, yz1<?> yz1, cy1 cy1) {
        sz1 sz1 = (sz1) yz1;
        int a2 = a(bArr, i2, cy1);
        while (true) {
            sz1.a(cy1.f2185a);
            if (a2 >= i3) {
                break;
            }
            int a3 = a(bArr, a2, cy1);
            if (i != cy1.f2185a) {
                break;
            }
            a2 = a(bArr, a3, cy1);
        }
        return a2;
    }

    static int a(int i, byte[] bArr, int i2, cy1 cy1) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            i4 = b2 << 7;
        } else {
            int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b3 = bArr[i6];
            if (b3 >= 0) {
                i3 = b3 << 14;
            } else {
                i5 = i7 | ((b3 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b4 = bArr[i8];
                if (b4 >= 0) {
                    i4 = b4 << 21;
                } else {
                    i7 = i5 | ((b4 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b5 = bArr[i6];
                    if (b5 >= 0) {
                        i3 = b5 << 28;
                    } else {
                        int i9 = i7 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                cy1.f2185a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            cy1.f2185a = i7 | i3;
            return i8;
        }
        cy1.f2185a = i5 | i4;
        return i6;
    }

    static int a(z12<?> z12, int i, byte[] bArr, int i2, int i3, yz1<?> yz1, cy1 cy1) {
        int a2 = a(z12, bArr, i2, i3, cy1);
        while (true) {
            yz1.add(cy1.f2187c);
            if (a2 >= i3) {
                break;
            }
            int a3 = a(bArr, a2, cy1);
            if (i != cy1.f2185a) {
                break;
            }
            a2 = a(z12, bArr, a3, i3, cy1);
        }
        return a2;
    }

    static int a(z12 z12, byte[] bArr, int i, int i2, int i3, cy1 cy1) {
        g12 g12 = (g12) z12;
        Object a2 = g12.a();
        int a3 = g12.a(a2, bArr, i, i2, i3, cy1);
        g12.b(a2);
        cy1.f2187c = a2;
        return a3;
    }

    static int a(z12 z12, byte[] bArr, int i, int i2, cy1 cy1) {
        int i3 = i + 1;
        byte b2 = bArr[i];
        byte b3 = b2;
        if (b2 < 0) {
            i3 = a(b2, bArr, i3, cy1);
            b3 = cy1.f2185a;
        }
        if (b3 < 0 || b3 > i2 - i3) {
            throw b02.a();
        }
        Object a2 = z12.a();
        int i4 = (b3 == 1 ? 1 : 0) + i3;
        z12.a(a2, bArr, i3, i4, cy1);
        z12.b(a2);
        cy1.f2187c = a2;
        return i4;
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int a(byte[] bArr, int i, cy1 cy1) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return a(b2, bArr, i2, cy1);
        }
        cy1.f2185a = b2;
        return i2;
    }

    static int a(byte[] bArr, int i, yz1<?> yz1, cy1 cy1) {
        sz1 sz1 = (sz1) yz1;
        int a2 = a(bArr, i, cy1);
        int i2 = cy1.f2185a + a2;
        while (a2 < i2) {
            a2 = a(bArr, a2, cy1);
            sz1.a(cy1.f2185a);
        }
        if (a2 == i2) {
            return a2;
        }
        throw b02.a();
    }

    static int b(byte[] bArr, int i, cy1 cy1) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            cy1.f2186b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & Byte.MAX_VALUE)) << i4;
            b2 = b3;
            i3 = i5;
        }
        cy1.f2186b = j2;
        return i3;
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static int c(byte[] bArr, int i, cy1 cy1) {
        int a2 = a(bArr, i, cy1);
        int i2 = cy1.f2185a;
        if (i2 < 0) {
            throw b02.b();
        } else if (i2 == 0) {
            cy1.f2187c = BuildConfig.FLAVOR;
            return a2;
        } else {
            cy1.f2187c = new String(bArr, a2, i2, uz1.f5029a);
            return a2 + i2;
        }
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int d(byte[] bArr, int i, cy1 cy1) {
        int a2 = a(bArr, i, cy1);
        int i2 = cy1.f2185a;
        if (i2 < 0) {
            throw b02.b();
        } else if (i2 == 0) {
            cy1.f2187c = BuildConfig.FLAVOR;
            return a2;
        } else {
            cy1.f2187c = a32.c(bArr, a2, i2);
            return a2 + i2;
        }
    }

    static int e(byte[] bArr, int i, cy1 cy1) {
        int a2 = a(bArr, i, cy1);
        int i2 = cy1.f2185a;
        if (i2 < 0) {
            throw b02.b();
        } else if (i2 > bArr.length - a2) {
            throw b02.a();
        } else if (i2 == 0) {
            cy1.f2187c = dy1.f2334c;
            return a2;
        } else {
            cy1.f2187c = dy1.a(bArr, a2, i2);
            return a2 + i2;
        }
    }
}
