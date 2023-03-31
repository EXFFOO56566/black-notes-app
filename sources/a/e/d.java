package a.e;

public class d<E> implements Cloneable {
    private static final Object f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f81b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f82c;
    private Object[] d;
    private int e;

    public d() {
        this(10);
    }

    public d(int i) {
        this.f81b = false;
        if (i == 0) {
            this.f82c = c.f79b;
            this.d = c.f80c;
            return;
        }
        int c2 = c.c(i);
        this.f82c = new long[c2];
        this.d = new Object[c2];
    }

    private void d() {
        int i = this.e;
        long[] jArr = this.f82c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f81b = false;
        this.e = i2;
    }

    public long a(int i) {
        if (this.f81b) {
            d();
        }
        return this.f82c[i];
    }

    public void a() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f81b = false;
    }

    @Deprecated
    public void a(long j) {
        d(j);
    }

    public void a(long j, E e2) {
        int i = this.e;
        if (i == 0 || j > this.f82c[i - 1]) {
            if (this.f81b && this.e >= this.f82c.length) {
                d();
            }
            int i2 = this.e;
            if (i2 >= this.f82c.length) {
                int c2 = c.c(i2 + 1);
                long[] jArr = new long[c2];
                Object[] objArr = new Object[c2];
                long[] jArr2 = this.f82c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f82c = jArr;
                this.d = objArr;
            }
            this.f82c[i2] = j;
            this.d[i2] = e2;
            this.e = i2 + 1;
            return;
        }
        c(j, e2);
    }

    public E b(long j) {
        return b(j, null);
    }

    public E b(long j, E e2) {
        int a2 = c.a(this.f82c, this.e, j);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != f) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public void b(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        Object obj2 = f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f81b = true;
        }
    }

    public int c() {
        if (this.f81b) {
            d();
        }
        return this.e;
    }

    public int c(long j) {
        if (this.f81b) {
            d();
        }
        return c.a(this.f82c, this.e, j);
    }

    public E c(int i) {
        if (this.f81b) {
            d();
        }
        return (E) this.d[i];
    }

    public void c(long j, E e2) {
        int a2 = c.a(this.f82c, this.e, j);
        if (a2 >= 0) {
            this.d[a2] = e2;
            return;
        }
        int i = ~a2;
        if (i < this.e) {
            Object[] objArr = this.d;
            if (objArr[i] == f) {
                this.f82c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f81b && this.e >= this.f82c.length) {
            d();
            i = ~c.a(this.f82c, this.e, j);
        }
        int i2 = this.e;
        if (i2 >= this.f82c.length) {
            int c2 = c.c(i2 + 1);
            long[] jArr = new long[c2];
            Object[] objArr2 = new Object[c2];
            long[] jArr2 = this.f82c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f82c = jArr;
            this.d = objArr2;
        }
        int i3 = this.e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f82c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
        }
        this.f82c[i] = j;
        this.d[i] = e2;
        this.e++;
    }

    @Override // java.lang.Object
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f82c = (long[]) this.f82c.clone();
            dVar.d = (Object[]) this.d.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public void d(long j) {
        Object[] objArr;
        Object obj;
        int a2 = c.a(this.f82c, this.e, j);
        if (a2 >= 0 && (objArr = this.d)[a2] != (obj = f)) {
            objArr[a2] = obj;
            this.f81b = true;
        }
    }

    public String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            E c2 = c(i);
            if (c2 != this) {
                sb.append((Object) c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
