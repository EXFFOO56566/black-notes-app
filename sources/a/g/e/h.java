package a.g.e;

import a.g.d.c.c;
import a.g.i.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Long, c.b> f128a = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    public class a implements c<b.f> {
        a(h hVar) {
        }

        public int a(b.f fVar) {
            return fVar.d();
        }

        public boolean b(b.f fVar) {
            return fVar.e();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements c<c.C0007c> {
        b(h hVar) {
        }

        public int a(c.C0007c cVar) {
            return cVar.e();
        }

        public boolean b(c.C0007c cVar) {
            return cVar.f();
        }
    }

    /* access modifiers changed from: private */
    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    h() {
    }

    private c.C0007c a(c.b bVar, int i) {
        return (c.C0007c) a(bVar.a(), i, new b(this));
    }

    private static <T> T a(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i2) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    private void a(Typeface typeface, c.b bVar) {
        long b2 = b(typeface);
        if (b2 != 0) {
            this.f128a.put(Long.valueOf(b2), bVar);
        }
    }

    private static long b(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public c.b a(Typeface typeface) {
        long b2 = b(typeface);
        if (b2 == 0) {
            return null;
        }
        return this.f128a.get(Long.valueOf(b2));
    }

    /* access modifiers changed from: protected */
    public b.f a(b.f[] fVarArr, int i) {
        return (b.f) a(fVarArr, i, new a(this));
    }

    public Typeface a(Context context, c.b bVar, Resources resources, int i) {
        c.C0007c a2 = a(bVar, i);
        if (a2 == null) {
            return null;
        }
        Typeface a3 = c.a(context, resources, a2.b(), a2.a(), i);
        a(a3, bVar);
        return a3;
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a2 = i.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!i.a(a2, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(a(fVarArr, i).c());
            try {
                Typeface a2 = a(context, inputStream);
                i.a(inputStream);
                return a2;
            } catch (IOException unused) {
                i.a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                i.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            i.a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            i.a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public Typeface a(Context context, InputStream inputStream) {
        File a2 = i.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!i.a(a2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }
}
