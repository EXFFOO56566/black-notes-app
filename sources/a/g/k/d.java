package a.g.k;

public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f192a;

    /* renamed from: b  reason: collision with root package name */
    public final S f193b;

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f192a, this.f192a) && c.a(dVar.f193b, this.f193b);
    }

    public int hashCode() {
        F f = this.f192a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f193b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f192a) + " " + String.valueOf(this.f193b) + "}";
    }
}
