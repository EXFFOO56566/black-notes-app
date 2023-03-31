package androidx.recyclerview.widget;

import a.e.d;
import a.e.g;
import a.g.k.e;
import a.g.k.f;
import androidx.recyclerview.widget.RecyclerView;

class s {

    /* renamed from: a  reason: collision with root package name */
    final g<RecyclerView.d0, a> f1106a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    final d<RecyclerView.d0> f1107b = new d<>();

    /* access modifiers changed from: package-private */
    public static class a {
        static e<a> d = new f(20);

        /* renamed from: a  reason: collision with root package name */
        int f1108a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.l.c f1109b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.l.c f1110c;

        private a() {
        }

        static void a() {
            do {
            } while (d.a() != null);
        }

        static void a(a aVar) {
            aVar.f1108a = 0;
            aVar.f1109b = null;
            aVar.f1110c = null;
            d.a(aVar);
        }

        static a b() {
            a a2 = d.a();
            return a2 == null ? new a() : a2;
        }
    }

    interface b {
        void a(RecyclerView.d0 d0Var);

        void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    s() {
    }

    private RecyclerView.l.c a(RecyclerView.d0 d0Var, int i) {
        a d;
        RecyclerView.l.c cVar;
        int a2 = this.f1106a.a(d0Var);
        if (a2 >= 0 && (d = this.f1106a.d(a2)) != null) {
            int i2 = d.f1108a;
            if ((i2 & i) != 0) {
                d.f1108a = (~i) & i2;
                if (i == 4) {
                    cVar = d.f1109b;
                } else if (i == 8) {
                    cVar = d.f1110c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((d.f1108a & 12) == 0) {
                    this.f1106a.c(a2);
                    a.a(d);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.d0 a(long j) {
        return this.f1107b.b(j);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f1106a.clear();
        this.f1107b.a();
    }

    /* access modifiers changed from: package-private */
    public void a(long j, RecyclerView.d0 d0Var) {
        this.f1107b.c(j, d0Var);
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var) {
        a aVar = this.f1106a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1106a.put(d0Var, aVar);
        }
        aVar.f1108a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1106a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1106a.put(d0Var, aVar);
        }
        aVar.f1108a |= 2;
        aVar.f1109b = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        RecyclerView.l.c cVar;
        RecyclerView.l.c cVar2;
        for (int size = this.f1106a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 b2 = this.f1106a.b(size);
            a c2 = this.f1106a.c(size);
            int i = c2.f1108a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = c2.f1109b;
                    if (cVar != null) {
                        cVar2 = c2.f1110c;
                    }
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.c(b2, c2.f1109b, c2.f1110c);
                        } else if ((i & 4) != 0) {
                            cVar = c2.f1109b;
                            cVar2 = null;
                        } else if ((i & 8) == 0) {
                        }
                        a.a(c2);
                    }
                    bVar.a(b2, c2.f1109b, c2.f1110c);
                    a.a(c2);
                }
                bVar.b(b2, cVar, cVar2);
                a.a(c2);
            }
            bVar.a(b2);
            a.a(c2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a.a();
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1106a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1106a.put(d0Var, aVar);
        }
        aVar.f1110c = cVar;
        aVar.f1108a |= 8;
    }

    /* access modifiers changed from: package-private */
    public boolean b(RecyclerView.d0 d0Var) {
        a aVar = this.f1106a.get(d0Var);
        return (aVar == null || (aVar.f1108a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1106a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1106a.put(d0Var, aVar);
        }
        aVar.f1109b = cVar;
        aVar.f1108a |= 4;
    }

    /* access modifiers changed from: package-private */
    public boolean c(RecyclerView.d0 d0Var) {
        a aVar = this.f1106a.get(d0Var);
        return (aVar == null || (aVar.f1108a & 4) == 0) ? false : true;
    }

    public void d(RecyclerView.d0 d0Var) {
        g(d0Var);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c e(RecyclerView.d0 d0Var) {
        return a(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c f(RecyclerView.d0 d0Var) {
        return a(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    public void g(RecyclerView.d0 d0Var) {
        a aVar = this.f1106a.get(d0Var);
        if (aVar != null) {
            aVar.f1108a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void h(RecyclerView.d0 d0Var) {
        int c2 = this.f1107b.c() - 1;
        while (true) {
            if (c2 < 0) {
                break;
            } else if (d0Var == this.f1107b.c(c2)) {
                this.f1107b.b(c2);
                break;
            } else {
                c2--;
            }
        }
        a remove = this.f1106a.remove(d0Var);
        if (remove != null) {
            a.a(remove);
        }
    }
}
