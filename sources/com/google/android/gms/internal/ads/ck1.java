package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public final class ck1 {
    public static File a(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File a(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        a(file2, false);
        return file2;
    }

    public static File a(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(a(str, file), str2);
    }

    public static boolean a(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        return file.delete();
    }

    public static boolean a(File file, byte[] bArr) {
        Throwable th;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                j.a(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                j.a(fileOutputStream);
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                j.a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            j.a(fileOutputStream);
            return false;
        } catch (Throwable th3) {
            th = th3;
            j.a(fileOutputStream);
            throw th;
        }
    }

    public static byte[] b(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] a2 = dy1.a(fileInputStream).a();
                j.a(fileInputStream);
                return a2;
            } catch (IOException unused) {
                j.a(fileInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                j.a(fileInputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            fileInputStream = null;
            j.a(fileInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            j.a(fileInputStream2);
            throw th;
        }
    }
}
