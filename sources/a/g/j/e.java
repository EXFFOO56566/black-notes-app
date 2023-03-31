package a.g.j;

import java.util.Locale;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f180a = new C0015e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f181b = new C0015e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f182c = new C0015e(b.f185a, false);
    public static final d d = new C0015e(b.f185a, true);

    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f183b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f184a;

        private a(boolean z) {
            this.f184a = z;
        }

        @Override // a.g.j.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = e.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.f184a) {
                        return 1;
                    }
                } else if (this.f184a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f184a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f185a = new b();

        private b() {
        }

        @Override // a.g.j.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = e.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* access modifiers changed from: private */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    private static abstract class d implements d {

        /* renamed from: a  reason: collision with root package name */
        private final c f186a;

        d(c cVar) {
            this.f186a = cVar;
        }

        private boolean b(CharSequence charSequence, int i, int i2) {
            int a2 = this.f186a.a(charSequence, i, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public abstract boolean a();

        @Override // a.g.j.d
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f186a == null ? a() : b(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a.g.j.e$e  reason: collision with other inner class name */
    private static class C0015e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f187b;

        C0015e(c cVar, boolean z) {
            super(cVar);
            this.f187b = z;
        }

        /* access modifiers changed from: protected */
        @Override // a.g.j.e.d
        public boolean a() {
            return this.f187b;
        }
    }

    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f188b = new f();

        f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // a.g.j.e.d
        public boolean a() {
            return f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        new C0015e(a.f183b, false);
        f fVar = f.f188b;
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
