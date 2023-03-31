package b.b.a.b.a;

import b.b.a.b.a.c;

public class f {

    /* access modifiers changed from: package-private */
    public static class a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private int f1132a = 0;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1133b;

        a(int i) {
            this.f1133b = i;
        }

        @Override // b.b.a.b.a.c.b
        public boolean a(a aVar, int i) {
            if (aVar == a.TIMEOUT) {
                int i2 = this.f1132a;
                this.f1132a = i2 + 1;
                return i2 < this.f1133b;
            }
        }
    }

    public static c.b a() {
        return a(5);
    }

    public static c.b a(int i) {
        return new a(i);
    }
}
