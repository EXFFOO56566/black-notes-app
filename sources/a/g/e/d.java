package a.g.e;

import a.g.d.c.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class d extends h {

    /* renamed from: b  reason: collision with root package name */
    private static Class f124b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor f125c = null;
    private static Method d = null;
    private static Method e = null;
    private static boolean f = false;

    d() {
    }

    private static Typeface a(Object obj) {
        a();
        try {
            Object newInstance = Array.newInstance(f124b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f) {
            f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            f125c = constructor;
            f124b = cls;
            d = method;
            e = method2;
        }
    }

    private static boolean a(Object obj, String str, int i, boolean z) {
        a();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Object b() {
        a();
        try {
            return f125c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // a.g.e.h
    public Typeface a(Context context, c.b bVar, Resources resources, int i) {
        Object b2 = b();
        c.C0007c[] a2 = bVar.a();
        for (c.C0007c cVar : a2) {
            File a3 = i.a(context);
            if (a3 == null) {
                return null;
            }
            try {
                if (!i.a(a3, resources, cVar.b())) {
                    a3.delete();
                    return null;
                }
                if (!a(b2, a3.getPath(), cVar.e(), cVar.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a3.delete();
            }
        }
        return a(b2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0054, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0055, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0058, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005c, code lost:
        if (r5 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0062, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0063, code lost:
        r4.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0066, code lost:
        throw r6;
     */
    @Override // a.g.e.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r4, android.os.CancellationSignal r5, a.g.i.b.f[] r6, int r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.e.d.a(android.content.Context, android.os.CancellationSignal, a.g.i.b$f[], int):android.graphics.Typeface");
    }
}
