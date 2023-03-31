package a.m;

import a.m.a;
import a.m.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class j0 extends m {
    private static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    private int K = 3;

    /* access modifiers changed from: package-private */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f328b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f329c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f327a = viewGroup;
            this.f328b = view;
            this.f329c = view2;
        }

        @Override // a.m.m.f, a.m.n
        public void c(m mVar) {
            x.a(this.f327a).b(this.f328b);
        }

        @Override // a.m.m.f, a.m.n
        public void d(m mVar) {
            if (this.f328b.getParent() == null) {
                x.a(this.f327a).a(this.f328b);
            } else {
                j0.this.a();
            }
        }

        @Override // a.m.m.f
        public void e(m mVar) {
            this.f329c.setTag(j.save_overlay_view, null);
            x.a(this.f327a).b(this.f328b);
            mVar.b(this);
        }
    }

    /* access modifiers changed from: private */
    public static class b extends AnimatorListenerAdapter implements m.f, a.AbstractC0031a {

        /* renamed from: a  reason: collision with root package name */
        private final View f330a;

        /* renamed from: b  reason: collision with root package name */
        private final int f331b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f332c;
        private final boolean d;
        private boolean e;
        boolean f = false;

        b(View view, int i, boolean z) {
            this.f330a = view;
            this.f331b = i;
            this.f332c = (ViewGroup) view.getParent();
            this.d = z;
            a(true);
        }

        private void a() {
            if (!this.f) {
                c0.a(this.f330a, this.f331b);
                ViewGroup viewGroup = this.f332c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            ViewGroup viewGroup;
            if (this.d && this.e != z && (viewGroup = this.f332c) != null) {
                this.e = z;
                x.b(viewGroup, z);
            }
        }

        @Override // a.m.m.f
        public void a(m mVar) {
        }

        @Override // a.m.m.f
        public void b(m mVar) {
        }

        @Override // a.m.m.f
        public void c(m mVar) {
            a(false);
        }

        @Override // a.m.m.f
        public void d(m mVar) {
            a(true);
        }

        @Override // a.m.m.f
        public void e(m mVar) {
            a();
            mVar.b(this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // a.m.a.AbstractC0031a
        public void onAnimationPause(Animator animator) {
            if (!this.f) {
                c0.a(this.f330a, this.f331b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        @Override // a.m.a.AbstractC0031a
        public void onAnimationResume(Animator animator) {
            if (!this.f) {
                c0.a(this.f330a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* access modifiers changed from: private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f333a;

        /* renamed from: b  reason: collision with root package name */
        boolean f334b;

        /* renamed from: c  reason: collision with root package name */
        int f335c;
        int d;
        ViewGroup e;
        ViewGroup f;

        c() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r9 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r0.e == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r0.f335c == 0) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a.m.j0.c b(a.m.s r8, a.m.s r9) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.j0.b(a.m.s, a.m.s):a.m.j0$c");
    }

    private void d(s sVar) {
        sVar.f361a.put("android:visibility:visibility", Integer.valueOf(sVar.f362b.getVisibility()));
        sVar.f361a.put("android:visibility:parent", sVar.f362b.getParent());
        int[] iArr = new int[2];
        sVar.f362b.getLocationOnScreen(iArr);
        sVar.f361a.put("android:visibility:screenLocation", iArr);
    }

    public Animator a(ViewGroup viewGroup, s sVar, int i, s sVar2, int i2) {
        if ((this.K & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f362b.getParent();
            if (b(a(view, false), b(view, false)).f333a) {
                return null;
            }
        }
        return a(viewGroup, sVar2.f362b, sVar, sVar2);
    }

    @Override // a.m.m
    public Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        c b2 = b(sVar, sVar2);
        if (!b2.f333a) {
            return null;
        }
        if (b2.e == null && b2.f == null) {
            return null;
        }
        return b2.f334b ? a(viewGroup, sVar, b2.f335c, sVar2, b2.d) : b(viewGroup, sVar, b2.f335c, sVar2, b2.d);
    }

    public abstract Animator a(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public void a(int i) {
        if ((i & -4) == 0) {
            this.K = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // a.m.m
    public void a(s sVar) {
        d(sVar);
    }

    @Override // a.m.m
    public boolean a(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f361a.containsKey("android:visibility:visibility") != sVar.f361a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c b2 = b(sVar, sVar2);
        if (b2.f333a) {
            return b2.f335c == 0 || b2.d == 0;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r10.w != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator b(android.view.ViewGroup r11, a.m.s r12, int r13, a.m.s r14, int r15) {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.j0.b(android.view.ViewGroup, a.m.s, int, a.m.s, int):android.animation.Animator");
    }

    public abstract Animator b(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // a.m.m
    public void c(s sVar) {
        d(sVar);
    }

    @Override // a.m.m
    public String[] q() {
        return L;
    }
}
