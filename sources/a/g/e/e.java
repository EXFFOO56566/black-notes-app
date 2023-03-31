package a.g.e;

import a.e.g;
import a.g.d.c.c;
import a.g.i.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class e extends h {

    /* renamed from: b  reason: collision with root package name */
    private static final Class f126b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor f127c;
    private static final Method d;
    private static final Method e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        f127c = constructor;
        f126b = cls;
        d = method;
        e = method2;
    }

    e() {
    }

    private static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f126b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean a() {
        if (d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return d != null;
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Object b() {
        try {
            return f127c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.g.e.h
    public Typeface a(Context context, c.b bVar, Resources resources, int i) {
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        c.C0007c[] a2 = bVar.a();
        for (c.C0007c cVar : a2) {
            ByteBuffer a3 = i.a(context, resources, cVar.b());
            if (a3 == null || !a(b2, a3, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return a(b2);
    }

    @Override // a.g.e.h
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        g gVar = new g();
        for (b.f fVar : fVarArr) {
            Uri c2 = fVar.c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c2);
            if (byteBuffer == null) {
                byteBuffer = i.a(context, cancellationSignal, c2);
                gVar.put(c2, byteBuffer);
            }
            if (byteBuffer == null || !a(b2, byteBuffer, fVar.b(), fVar.d(), fVar.e())) {
                return null;
            }
        }
        Typeface a2 = a(b2);
        if (a2 == null) {
            return null;
        }
        return Typeface.create(a2, i);
    }
}
