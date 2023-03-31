package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class ic2 {

    /* renamed from: a  reason: collision with root package name */
    private static final fc2 f3060a = fc2.b("OMX.google.raw.decoder");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f3061b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<a, List<fc2>> f3062c = new HashMap<>();
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    private static final Map<String, Integer> f;
    private static int g = -1;

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f3063a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3064b;

        public a(String str, boolean z) {
            this.f3063a = str;
            this.f3064b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                return TextUtils.equals(this.f3063a, aVar.f3063a) && this.f3064b == aVar.f3064b;
            }
        }

        public final int hashCode() {
            String str = this.f3063a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f3064b ? 1231 : 1237);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(66, 1);
        d.put(77, 2);
        d.put(88, 4);
        d.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        e.put(11, 4);
        e.put(12, 8);
        e.put(13, 16);
        e.put(20, 32);
        e.put(21, 64);
        e.put(22, 128);
        e.put(30, 256);
        e.put(31, 512);
        e.put(32, 1024);
        e.put(40, 2048);
        e.put(41, 4096);
        e.put(42, 8192);
        e.put(50, 16384);
        e.put(51, 32768);
        e.put(52, 65536);
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("L30", 1);
        f.put("L60", 4);
        f.put("L63", 16);
        f.put("L90", 64);
        f.put("L93", 256);
        f.put("L120", 1024);
        f.put("L123", 4096);
        f.put("L150", 16384);
        f.put("L153", 65536);
        f.put("L156", 262144);
        f.put("L180", 1048576);
        f.put("L183", 4194304);
        f.put("L186", 16777216);
        f.put("H30", 2);
        f.put("H60", 8);
        f.put("H63", 32);
        f.put("H90", 128);
        f.put("H93", 512);
        f.put("H120", 2048);
        f.put("H123", 8192);
        f.put("H150", 32768);
        f.put("H153", 131072);
        f.put("H156", 524288);
        f.put("H180", 2097152);
        f.put("H183", 8388608);
        f.put("H186", 33554432);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r3.equals("hev1") != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ic2.a(java.lang.String):android.util.Pair");
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        Integer num;
        Integer num2;
        String valueOf;
        StringBuilder sb;
        String str2;
        if (strArr.length < 2) {
            String valueOf2 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf3 = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
                num2 = valueOf3;
            } else {
                String valueOf4 = String.valueOf(str);
                Log.w("MediaCodecUtil", valueOf4.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf4) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            Integer valueOf5 = Integer.valueOf(d.get(num2.intValue()));
            if (valueOf5 == null) {
                valueOf = String.valueOf(num2);
                sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                str2 = "Unknown AVC profile: ";
            } else {
                Integer valueOf6 = Integer.valueOf(e.get(num.intValue()));
                if (valueOf6 != null) {
                    return new Pair<>(valueOf5, valueOf6);
                }
                valueOf = String.valueOf(num);
                sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                str2 = "Unknown AVC level: ";
            }
            sb.append(str2);
            sb.append(valueOf);
            Log.w("MediaCodecUtil", sb.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf7 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf7.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf7) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    public static fc2 a() {
        return f3060a;
    }

    public static fc2 a(String str, boolean z) {
        List<fc2> b2 = b(str, z);
        if (b2.isEmpty()) {
            return null;
        }
        return b2.get(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01fd A[Catch:{ Exception -> 0x01f8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.google.android.gms.internal.ads.fc2> a(com.google.android.gms.internal.ads.ic2.a r17, com.google.android.gms.internal.ads.lc2 r18) {
        /*
        // Method dump skipped, instructions count: 694
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ic2.a(com.google.android.gms.internal.ads.ic2$a, com.google.android.gms.internal.ads.lc2):java.util.List");
    }

    public static int b() {
        if (g == -1) {
            int i = 0;
            fc2 a2 = a("video/avc", false);
            if (a2 != null) {
                MediaCodecInfo.CodecProfileLevel[] a3 = a2.a();
                int length = a3.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = a3[i].level;
                    int i4 = 9437184;
                    if (i3 == 1 || i3 == 2) {
                        i4 = 25344;
                    } else {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                continue;
                            case 64:
                                i4 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i4 = 414720;
                                continue;
                            case 512:
                                i4 = 921600;
                                continue;
                            case 1024:
                                i4 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                continue;
                            case 8192:
                                i4 = 2228224;
                                continue;
                            case 16384:
                                i4 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                continue;
                        }
                    }
                    i2 = Math.max(i4, i2);
                    i++;
                }
                i = Math.max(i2, ag2.f1751a >= 21 ? 345600 : 172800);
            }
            g = i;
        }
        return g;
    }

    private static synchronized List<fc2> b(String str, boolean z) {
        synchronized (ic2.class) {
            a aVar = new a(str, z);
            List<fc2> list = f3062c.get(aVar);
            if (list != null) {
                return list;
            }
            List<fc2> a2 = a(aVar, ag2.f1751a >= 21 ? new nc2(z) : new oc2());
            if (z && a2.isEmpty() && 21 <= ag2.f1751a && ag2.f1751a <= 23) {
                a2 = a(aVar, new oc2());
                if (!a2.isEmpty()) {
                    String str2 = a2.get(0).f2572a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<fc2> unmodifiableList = Collections.unmodifiableList(a2);
            f3062c.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }
}
