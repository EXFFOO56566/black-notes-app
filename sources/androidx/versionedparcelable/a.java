package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final a.e.a<String, Method> f1119a;

    /* renamed from: b  reason: collision with root package name */
    protected final a.e.a<String, Method> f1120b;

    /* renamed from: c  reason: collision with root package name */
    protected final a.e.a<String, Class> f1121c;

    public a(a.e.a<String, Method> aVar, a.e.a<String, Method> aVar2, a.e.a<String, Class> aVar3) {
        this.f1119a = aVar;
        this.f1120b = aVar2;
        this.f1121c = aVar3;
    }

    private Class a(Class<? extends c> cls) {
        Class cls2 = this.f1121c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f1121c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method b(Class cls) {
        Method method = this.f1120b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class a2 = a(cls);
        System.currentTimeMillis();
        Method declaredMethod = a2.getDeclaredMethod("write", cls, a.class);
        this.f1120b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Method b(String str) {
        Method method = this.f1119a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f1119a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.versionedparcelable.a */
    /* JADX WARN: Multi-variable type inference failed */
    private void b(c cVar) {
        try {
            a(a((Class<? extends c>) cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public int a(int i, int i2) {
        return !a(i2) ? i : g();
    }

    public <T extends Parcelable> T a(T t, int i) {
        return !a(i) ? t : (T) h();
    }

    public <T extends c> T a(T t, int i) {
        return !a(i) ? t : (T) j();
    }

    /* access modifiers changed from: protected */
    public <T extends c> T a(String str, a aVar) {
        try {
            return (T) ((c) b(str).invoke(null, aVar));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public CharSequence a(CharSequence charSequence, int i) {
        return !a(i) ? charSequence : f();
    }

    public String a(String str, int i) {
        return !a(i) ? str : i();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    public void a(c cVar) {
        if (cVar == null) {
            a((String) null);
            return;
        }
        b(cVar);
        a b2 = b();
        a(cVar, b2);
        b2.a();
    }

    /* access modifiers changed from: protected */
    public <T extends c> void a(T t, a aVar) {
        try {
            b(t.getClass()).invoke(null, t, aVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    public void a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract boolean a(int i);

    public boolean a(boolean z, int i) {
        return !a(i) ? z : d();
    }

    public byte[] a(byte[] bArr, int i) {
        return !a(i) ? bArr : e();
    }

    /* access modifiers changed from: protected */
    public abstract a b();

    /* access modifiers changed from: protected */
    public abstract void b(int i);

    public void b(int i, int i2) {
        b(i2);
        c(i);
    }

    public void b(Parcelable parcelable, int i) {
        b(i);
        a(parcelable);
    }

    public void b(c cVar, int i) {
        b(i);
        a(cVar);
    }

    public void b(CharSequence charSequence, int i) {
        b(i);
        a(charSequence);
    }

    public void b(String str, int i) {
        b(i);
        a(str);
    }

    public void b(boolean z, int i) {
        b(i);
        a(z);
    }

    public void b(byte[] bArr, int i) {
        b(i);
        a(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void c(int i);

    public boolean c() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean d();

    /* access modifiers changed from: protected */
    public abstract byte[] e();

    /* access modifiers changed from: protected */
    public abstract CharSequence f();

    /* access modifiers changed from: protected */
    public abstract int g();

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T h();

    /* access modifiers changed from: protected */
    public abstract String i();

    /* access modifiers changed from: protected */
    public <T extends c> T j() {
        String i = i();
        if (i == null) {
            return null;
        }
        return (T) a(i, b());
    }
}
