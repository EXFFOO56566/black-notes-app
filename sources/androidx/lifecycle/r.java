package androidx.lifecycle;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final a f941a;

    /* renamed from: b  reason: collision with root package name */
    private final s f942b;

    public interface a {
        <T extends q> T a(Class<T> cls);
    }

    /* access modifiers changed from: package-private */
    public static abstract class b implements a {
        b() {
        }

        @Override // androidx.lifecycle.r.a
        public <T extends q> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends q> T a(String str, Class<T> cls);
    }

    public r(s sVar, a aVar) {
        this.f941a = aVar;
        this.f942b = sVar;
    }

    public <T extends q> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends q> T a(String str, Class<T> cls) {
        T t = (T) this.f942b.a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        a aVar = this.f941a;
        T t2 = aVar instanceof b ? (T) ((b) aVar).a(str, cls) : (T) aVar.a(cls);
        this.f942b.a(str, t2);
        return t2;
    }
}
