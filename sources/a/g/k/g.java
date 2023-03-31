package a.g.k;

public class g<T> extends f<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f196c = new Object();

    public g(int i) {
        super(i);
    }

    @Override // a.g.k.f, a.g.k.e
    public T a() {
        T t;
        synchronized (this.f196c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // a.g.k.f, a.g.k.e
    public boolean a(T t) {
        boolean a2;
        synchronized (this.f196c) {
            a2 = super.a(t);
        }
        return a2;
    }
}
