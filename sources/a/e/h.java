package a.e;

public class h<E> implements Cloneable {
    private static final Object f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f98b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f99c;
    private Object[] d;
    private int e;

    public h() {
        this(10);
    }

    public h(int i) {
        this.f98b = false;
        if (i == 0) {
            this.f99c = c.f78a;
            this.d = c.f80c;
            return;
        }
        int b2 = c.b(i);
        this.f99c = new int[b2];
        this.d = new Object[b2];
    }

    private void d() {
        int i = this.e;
        int[] iArr = this.f99c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f98b = false;
        this.e = i2;
    }

    public int a(E e2) {
        if (this.f98b) {
            d();
        }
        for (int i = 0; i < this.e; i++) {
            if (this.d[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public E a(int i) {
        return b(i, null);
    }

    public void a() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f98b = false;
    }

    public void a(int i, E e2) {
        int i2 = this.e;
        if (i2 == 0 || i > this.f99c[i2 - 1]) {
            if (this.f98b && this.e >= this.f99c.length) {
                d();
            }
            int i3 = this.e;
            if (i3 >= this.f99c.length) {
                int b2 = c.b(i3 + 1);
                int[] iArr = new int[b2];
                Object[] objArr = new Object[b2];
                int[] iArr2 = this.f99c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f99c = iArr;
                this.d = objArr;
            }
            this.f99c[i3] = i;
            this.d[i3] = e2;
            this.e = i3 + 1;
            return;
        }
        c(i, e2);
    }

    public int b(int i) {
        if (this.f98b) {
            d();
        }
        return this.f99c[i];
    }

    public E b(int i, E e2) {
        int a2 = c.a(this.f99c, this.e, i);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != f) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public int c() {
        if (this.f98b) {
            d();
        }
        return this.e;
    }

    public void c(int i) {
        Object[] objArr;
        Object obj;
        int a2 = c.a(this.f99c, this.e, i);
        if (a2 >= 0 && (objArr = this.d)[a2] != (obj = f)) {
            objArr[a2] = obj;
            this.f98b = true;
        }
    }

    public void c(int i, E e2) {
        int a2 = c.a(this.f99c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = e2;
            return;
        }
        int i2 = ~a2;
        if (i2 < this.e) {
            Object[] objArr = this.d;
            if (objArr[i2] == f) {
                this.f99c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f98b && this.e >= this.f99c.length) {
            d();
            i2 = ~c.a(this.f99c, this.e, i);
        }
        int i3 = this.e;
        if (i3 >= this.f99c.length) {
            int b2 = c.b(i3 + 1);
            int[] iArr = new int[b2];
            Object[] objArr2 = new Object[b2];
            int[] iArr2 = this.f99c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f99c = iArr;
            this.d = objArr2;
        }
        int i4 = this.e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f99c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.e - i2);
        }
        this.f99c[i2] = i;
        this.d[i2] = e2;
        this.e++;
    }

    @Override // java.lang.Object
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f99c = (int[]) this.f99c.clone();
            hVar.d = (Object[]) this.d.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E d(int i) {
        if (this.f98b) {
            d();
        }
        return (E) this.d[i];
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
            sb.append(b(i));
            sb.append('=');
            E d2 = d(i);
            if (d2 != this) {
                sb.append((Object) d2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
