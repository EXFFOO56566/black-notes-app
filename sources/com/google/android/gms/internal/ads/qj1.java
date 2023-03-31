package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class qj1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4343a;

    /* renamed from: b  reason: collision with root package name */
    private final ji1 f4344b;

    public qj1(Context context, ji1 ji1) {
        this.f4343a = context;
        this.f4344b = ji1;
    }

    private final void a(byte[] bArr) {
        if (this.f4344b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("os.arch:");
            sb.append(ll1.OS_ARCH.b());
            sb.append(";");
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null) {
                    sb.append("supported_abis:");
                    sb.append(Arrays.toString(strArr));
                    sb.append(";");
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            sb.append("CPU_ABI:");
            sb.append(Build.CPU_ABI);
            sb.append(";");
            sb.append("CPU_ABI2:");
            sb.append(Build.CPU_ABI2);
            sb.append(";");
            if (bArr != null) {
                sb.append("ELF:");
                sb.append(Arrays.toString(bArr));
                sb.append(";");
            }
            this.f4344b.a(4007, sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r4 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r4.a(2024, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r4 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String b() {
        /*
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "i686"
            java.lang.String r2 = "armv71"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.google.android.gms.internal.ads.ll1 r1 = com.google.android.gms.internal.ads.ll1.OS_ARCH
            java.lang.String r1 = r1.b()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0024
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0024
            return r1
        L_0x0024:
            r0 = 0
            r2 = 2024(0x7e8, float:2.836E-42)
            java.lang.Class<android.os.Build> r3 = android.os.Build.class
            java.lang.String r4 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r3 = r3.getField(r4)     // Catch:{ NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x0040 }
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x0040 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x0040 }
            if (r3 == 0) goto L_0x004f
            int r4 = r3.length     // Catch:{ NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x0040 }
            if (r4 <= 0) goto L_0x004f
            r4 = 0
            r0 = r3[r4]     // Catch:{ NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x0040 }
            return r0
        L_0x0040:
            r3 = move-exception
            com.google.android.gms.internal.ads.ji1 r4 = r5.f4344b
            if (r4 == 0) goto L_0x004f
        L_0x0045:
            r4.a(r2, r0, r3)
            goto L_0x004f
        L_0x0049:
            r3 = move-exception
            com.google.android.gms.internal.ads.ji1 r4 = r5.f4344b
            if (r4 == 0) goto L_0x004f
            goto L_0x0045
        L_0x004f:
            java.lang.String r0 = android.os.Build.CPU_ABI
            if (r0 == 0) goto L_0x0054
            return r0
        L_0x0054:
            java.lang.String r0 = android.os.Build.CPU_ABI2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qj1.b():java.lang.String");
    }

    private final a72 c() {
        File file = new File(new File(this.f4343a.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            return a72.UNSUPPORTED;
        }
        File[] listFiles = file.listFiles(new um1(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            return a72.UNSUPPORTED;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(listFiles[0]);
            try {
                byte[] bArr = new byte[20];
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        a(bArr);
                        a72 a72 = a72.UNSUPPORTED;
                        fileInputStream.close();
                        return a72;
                    }
                    bArr2[0] = bArr[19];
                    bArr2[1] = bArr[18];
                    short s = ByteBuffer.wrap(bArr2).getShort();
                    if (s == 3) {
                        a72 a722 = a72.X86;
                        fileInputStream.close();
                        return a722;
                    } else if (s == 40) {
                        a72 a723 = a72.ARM7;
                        fileInputStream.close();
                        return a723;
                    } else if (s == 62) {
                        a72 a724 = a72.X86_64;
                        fileInputStream.close();
                        return a724;
                    } else if (s != 183) {
                        a72 a725 = a72.UNSUPPORTED;
                        fileInputStream.close();
                        return a725;
                    } else {
                        a72 a726 = a72.ARM64;
                        fileInputStream.close();
                        return a726;
                    }
                } else {
                    fileInputStream.close();
                    return a72.UNSUPPORTED;
                }
            } catch (Throwable th) {
                kx1.a(th, th);
            }
        } catch (IOException unused) {
        }
        throw th;
    }

    public final a72 a() {
        a72 c2 = c();
        if (c2 != a72.UNSUPPORTED) {
            return c2;
        }
        String b2 = b();
        if (!TextUtils.isEmpty(b2)) {
            if (b2.equalsIgnoreCase("i686") || b2.equalsIgnoreCase("x86")) {
                return a72.X86;
            }
            if (b2.equalsIgnoreCase("x86_64")) {
                return a72.X86_64;
            }
            if (b2.equalsIgnoreCase("arm64-v8a")) {
                return a72.ARM64;
            }
            if (b2.equalsIgnoreCase("armeabi-v7a") || b2.equalsIgnoreCase("armv71")) {
                return a72.ARM7;
            }
        }
        a(null);
        return a72.UNSUPPORTED;
    }
}
