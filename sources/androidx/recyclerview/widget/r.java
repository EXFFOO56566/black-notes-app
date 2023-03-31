package androidx.recyclerview.widget;

import android.view.View;

/* access modifiers changed from: package-private */
public class r {

    /* renamed from: a  reason: collision with root package name */
    final b f1101a;

    /* renamed from: b  reason: collision with root package name */
    a f1102b = new a();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1103a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f1104b;

        /* renamed from: c  reason: collision with root package name */
        int f1105c;
        int d;
        int e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public int a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            this.f1103a = i | this.f1103a;
        }

        /* access modifiers changed from: package-private */
        public void a(int i, int i2, int i3, int i4) {
            this.f1104b = i;
            this.f1105c = i2;
            this.d = i3;
            this.e = i4;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            int i = this.f1103a;
            if ((i & 7) != 0 && (i & (a(this.d, this.f1104b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f1103a;
            if ((i2 & 112) != 0 && (i2 & (a(this.d, this.f1105c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f1103a;
            if ((i3 & 1792) != 0 && (i3 & (a(this.e, this.f1104b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f1103a;
            return (i4 & 28672) == 0 || (i4 & (a(this.e, this.f1105c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1103a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
        int a();

        int a(View view);

        View a(int i);

        int b();

        int b(View view);
    }

    r(b bVar) {
        this.f1101a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i, int i2, int i3, int i4) {
        int b2 = this.f1101a.b();
        int a2 = this.f1101a.a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a3 = this.f1101a.a(i);
            this.f1102b.a(b2, a2, this.f1101a.a(a3), this.f1101a.b(a3));
            if (i3 != 0) {
                this.f1102b.b();
                this.f1102b.a(i3);
                if (this.f1102b.a()) {
                    return a3;
                }
            }
            if (i4 != 0) {
                this.f1102b.b();
                this.f1102b.a(i4);
                if (this.f1102b.a()) {
                    view = a3;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, int i) {
        this.f1102b.a(this.f1101a.b(), this.f1101a.a(), this.f1101a.a(view), this.f1101a.b(view));
        if (i == 0) {
            return false;
        }
        this.f1102b.b();
        this.f1102b.a(i);
        return this.f1102b.a();
    }
}
