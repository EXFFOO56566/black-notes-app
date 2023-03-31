package a.g.e;

import a.g.d.c.c;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class f extends d {
    protected final Class g;
    protected final Constructor h;
    protected final Method i;
    protected final Method j;
    protected final Method k;
    protected final Method l;
    protected final Method m;

    public f() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class a2 = a();
            constructor = e(a2);
            method4 = b(a2);
            method3 = c(a2);
            method2 = f(a2);
            method = a(a2);
            method5 = d(a2);
            cls = a2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method4;
        this.j = method3;
        this.k = method2;
        this.l = method;
        this.m = method5;
    }

    private boolean a(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean a(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private void b(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean b() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    private Object c() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean c(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // a.g.e.h, a.g.e.d
    public Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        if (!b()) {
            return super.a(context, bVar, resources, i2);
        }
        Object c2 = c();
        if (c2 == null) {
            return null;
        }
        c.C0007c[] a2 = bVar.a();
        for (c.C0007c cVar : a2) {
            if (!a(context, c2, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                b(c2);
                return null;
            }
        }
        if (!c(c2)) {
            return null;
        }
        return a(c2);
    }

    @Override // a.g.e.h
    public Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        if (!b()) {
            return super.a(context, resources, i2, str, i3);
        }
        Object c2 = c();
        if (c2 == null) {
            return null;
        }
        if (!a(context, c2, str, 0, -1, -1, null)) {
            b(c2);
            return null;
        } else if (!c(c2)) {
            return null;
        } else {
            return a(c2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r11 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r12.addSuppressed(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        throw r13;
     */
    @Override // a.g.e.h, a.g.e.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r11, android.os.CancellationSignal r12, a.g.i.b.f[] r13, int r14) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.e.f.a(android.content.Context, android.os.CancellationSignal, a.g.i.b$f[], int):android.graphics.Typeface");
    }

    /* access modifiers changed from: protected */
    public Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Class a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Method a(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method b(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* access modifiers changed from: protected */
    public Method c(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* access modifiers changed from: protected */
    public Method d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Constructor e(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method f(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
