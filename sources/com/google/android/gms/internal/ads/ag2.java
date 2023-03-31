package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public final class ag2 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f1751a = ((Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') ? 26 : Build.VERSION.SDK_INT);

    /* renamed from: b  reason: collision with root package name */
    public static final String f1752b = Build.DEVICE;

    /* renamed from: c  reason: collision with root package name */
    public static final String f1753c = Build.MANUFACTURER;
    public static final String d;
    public static final String e;

    static {
        String str = Build.MODEL;
        d = str;
        String str2 = f1752b;
        String str3 = f1753c;
        int i = f1751a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        e = sb.toString();
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static float a(float f, float f2, float f3) {
        return Math.max(0.1f, Math.min(f, 8.0f));
    }

    public static int a(int i) {
        if (i == 8) {
            return 3;
        }
        if (i != 16) {
            return i != 24 ? i != 32 ? 0 : 1073741824 : RecyclerView.UNDEFINED_DURATION;
        }
        return 2;
    }

    public static int a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static int a(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = binarySearch + 1;
        }
        return z2 ? Math.max(0, i) : i;
    }

    public static long a(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    public static String a(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static ExecutorService a(String str) {
        return Executors.newSingleThreadExecutor(new dg2(str));
    }

    public static void a(ye2 ye2) {
        if (ye2 != null) {
            try {
                ye2.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(long[] jArr, long j, long j2) {
        int i = 0;
        int i2 = (j2 > 1000000 ? 1 : (j2 == 1000000 ? 0 : -1));
        if (i2 >= 0 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (i2 >= 0 || 1000000 % j2 != 0) {
            double d2 = 1000000.0d / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d2);
                i++;
            }
        } else {
            long j4 = 1000000 / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(int i) {
        if (i == 0) {
            return 16777216;
        }
        if (i == 1) {
            return 3538944;
        }
        if (i == 2) {
            return 13107200;
        }
        if (i == 3 || i == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    public static int b(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i == 1073741824) {
            return i2 << 2;
        }
        if (i == 2) {
            return i2 << 1;
        }
        if (i == 3) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static int b(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return new Locale(str).getLanguage();
    }

    public static byte[] c(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static int d(String str) {
        int length = str.length();
        mf2.a(length <= 4);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i << 8) | str.charAt(i2);
        }
        return i;
    }

    public static byte[] e(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }
}
