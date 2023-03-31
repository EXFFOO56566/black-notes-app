package androidx.appcompat.app;

import a.a.n.b;
import a.a.n.f;
import a.g.l.a0;
import a.g.l.e;
import a.g.l.r;
import a.g.l.u;
import a.g.l.y;
import a.g.l.z;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.w0;
import androidx.lifecycle.e;
import com.github.ajalt.reprint.module.spass.SpassReprintModule;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
public class f extends e implements g.a, LayoutInflater.Factory2 {
    private static final Map<Class<?>, Integer> b0 = new a.e.a();
    private static final boolean c0 = (Build.VERSION.SDK_INT < 21);
    private static final int[] d0 = {16842836};
    private static boolean e0 = true;
    private static final boolean f0;
    private boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    private boolean G;
    private o[] H;
    private o I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    boolean N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private l S;
    private l T;
    boolean U;
    int V;
    private final Runnable W;
    private boolean X;
    private Rect Y;
    private Rect Z;
    private AppCompatViewInflater a0;
    final Object e;
    final Context f;
    Window g;
    private j h;
    final d i;
    a j;
    MenuInflater k;
    private CharSequence l;
    private c0 m;
    private h n;
    private p o;
    a.a.n.b p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    y t;
    private boolean u;
    private boolean v;
    private ViewGroup w;
    private TextView x;
    private View y;
    private boolean z;

    static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f454a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f454a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f454a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f454a.uncaughtException(thread, th);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            f fVar = f.this;
            if ((fVar.V & 1) != 0) {
                fVar.f(0);
            }
            f fVar2 = f.this;
            if ((fVar2.V & 4096) != 0) {
                fVar2.f(108);
            }
            f fVar3 = f.this;
            fVar3.U = false;
            fVar3.V = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements r {
        c() {
        }

        @Override // a.g.l.r
        public a.g.l.c0 a(View view, a.g.l.c0 c0Var) {
            int d = c0Var.d();
            int j = f.this.j(d);
            if (d != j) {
                c0Var = c0Var.a(c0Var.b(), j, c0Var.c(), c0Var.a());
            }
            return u.a(view, c0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements g0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = f.this.j(rect.top);
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$f  reason: collision with other inner class name */
    public class RunnableC0037f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        class a extends a0 {
            a() {
            }

            @Override // a.g.l.z
            public void b(View view) {
                f.this.q.setAlpha(1.0f);
                f.this.t.a((z) null);
                f.this.t = null;
            }

            @Override // a.g.l.a0, a.g.l.z
            public void c(View view) {
                f.this.q.setVisibility(0);
            }
        }

        RunnableC0037f() {
        }

        public void run() {
            f fVar = f.this;
            fVar.r.showAtLocation(fVar.q, 55, 0, 0);
            f.this.m();
            if (f.this.u()) {
                f.this.q.setAlpha(0.0f);
                f fVar2 = f.this;
                y a2 = u.a(fVar2.q);
                a2.a(1.0f);
                fVar2.t = a2;
                f.this.t.a(new a());
                return;
            }
            f.this.q.setAlpha(1.0f);
            f.this.q.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends a0 {
        g() {
        }

        @Override // a.g.l.z
        public void b(View view) {
            f.this.q.setAlpha(1.0f);
            f.this.t.a((z) null);
            f.this.t = null;
        }

        @Override // a.g.l.a0, a.g.l.z
        public void c(View view) {
            f.this.q.setVisibility(0);
            f.this.q.sendAccessibilityEvent(32);
            if (f.this.q.getParent() instanceof View) {
                u.H((View) f.this.q.getParent());
            }
        }
    }

    /* access modifiers changed from: private */
    public final class h implements m.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            f.this.b(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            Window.Callback q = f.this.q();
            if (q == null) {
                return true;
            }
            q.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f463a;

        class a extends a0 {
            a() {
            }

            @Override // a.g.l.z
            public void b(View view) {
                f.this.q.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.q.getParent() instanceof View) {
                    u.H((View) f.this.q.getParent());
                }
                f.this.q.removeAllViews();
                f.this.t.a((z) null);
                f.this.t = null;
            }
        }

        public i(b.a aVar) {
            this.f463a = aVar;
        }

        @Override // a.a.n.b.a
        public void a(a.a.n.b bVar) {
            this.f463a.a(bVar);
            f fVar = f.this;
            if (fVar.r != null) {
                fVar.g.getDecorView().removeCallbacks(f.this.s);
            }
            f fVar2 = f.this;
            if (fVar2.q != null) {
                fVar2.m();
                f fVar3 = f.this;
                y a2 = u.a(fVar3.q);
                a2.a(0.0f);
                fVar3.t = a2;
                f.this.t.a(new a());
            }
            f fVar4 = f.this;
            d dVar = fVar4.i;
            if (dVar != null) {
                dVar.b(fVar4.p);
            }
            f.this.p = null;
        }

        @Override // a.a.n.b.a
        public boolean a(a.a.n.b bVar, Menu menu) {
            return this.f463a.a(bVar, menu);
        }

        @Override // a.a.n.b.a
        public boolean a(a.a.n.b bVar, MenuItem menuItem) {
            return this.f463a.a(bVar, menuItem);
        }

        @Override // a.a.n.b.a
        public boolean b(a.a.n.b bVar, Menu menu) {
            return this.f463a.b(bVar, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public class j extends a.a.n.i {
        j(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(f.this.f, callback);
            a.a.n.b a2 = f.this.a(aVar);
            if (a2 != null) {
                return aVar.b(a2);
            }
            return null;
        }

        @Override // a.a.n.i
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // a.a.n.i
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        @Override // a.a.n.i
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // a.a.n.i
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            f.this.h(i);
            return true;
        }

        @Override // a.a.n.i
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            f.this.i(i);
        }

        @Override // a.a.n.i
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.c(false);
            }
            return onPreparePanel;
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.g gVar;
            o a2 = f.this.a(0, true);
            if (a2 == null || (gVar = a2.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        @Override // a.a.n.i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.r() ? a(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // a.a.n.i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!f.this.r() || i != 0) ? super.onWindowStartingActionMode(callback, i) : a(callback);
        }
    }

    /* access modifiers changed from: private */
    public class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f467c;

        k(Context context) {
            super();
            this.f467c = (PowerManager) context.getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.app.f.l
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.l
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f467c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.f.l
        public void d() {
            f.this.k();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract class l {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f468a;

        /* access modifiers changed from: package-private */
        public class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        l() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f468a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f468a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.f468a == null) {
                    this.f468a = new a();
                }
                f.this.f.registerReceiver(this.f468a, b2);
            }
        }
    }

    /* access modifiers changed from: private */
    public class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final j f471c;

        m(j jVar) {
            super();
            this.f471c = jVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.app.f.l
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.l
        public int c() {
            return this.f471c.a() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.l
        public void d() {
            f.this.k();
        }
    }

    /* access modifiers changed from: private */
    public class n extends ContentFrameLayout {
        public n(Context context) {
            super(context);
        }

        private boolean a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.e(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(a.a.k.a.a.c(getContext(), i));
        }
    }

    /* access modifiers changed from: protected */
    public static final class o {

        /* renamed from: a  reason: collision with root package name */
        int f472a;

        /* renamed from: b  reason: collision with root package name */
        int f473b;

        /* renamed from: c  reason: collision with root package name */
        int f474c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.g j;
        androidx.appcompat.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        o(int i2) {
            this.f472a = i2;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.l, a.a.g.abc_list_menu_item_layout);
                this.k = eVar;
                eVar.a(aVar);
                this.j.a(this.k);
            }
            return this.k.a(this.g);
        }

        /* access modifiers changed from: package-private */
        public void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(a.a.a.actionBarPopupTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(a.a.a.panelMenuListTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = a.a.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i3, true);
            a.a.n.d dVar = new a.a.n.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(a.a.j.AppCompatTheme);
            this.f473b = obtainStyledAttributes.getResourceId(a.a.j.AppCompatTheme_panelBackground, 0);
            this.f = obtainStyledAttributes.getResourceId(a.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.b(this.k);
                }
                this.j = gVar;
                if (gVar != null && (eVar = this.k) != null) {
                    gVar.a(eVar);
                }
            }
        }

        public boolean a() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.b().getCount() > 0;
        }
    }

    /* access modifiers changed from: private */
    public final class p implements m.a {
        p() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g m = gVar.m();
            boolean z2 = m != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = m;
            }
            o a2 = fVar.a((Menu) gVar);
            if (a2 == null) {
                return;
            }
            if (z2) {
                f.this.a(a2.f472a, a2, m);
                f.this.a(a2, true);
                return;
            }
            f.this.a(a2, z);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            Window.Callback q;
            if (gVar != null) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.B || (q = fVar.q()) == null || f.this.N) {
                return true;
            }
            q.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        boolean z2 = false;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 && i2 <= 25) {
            z2 = true;
        }
        f0 = z2;
        if (c0 && !e0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    f(Activity activity, d dVar) {
        this(activity, null, dVar, activity);
    }

    f(Dialog dialog, d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    private f(Context context, Window window, d dVar, Object obj) {
        Integer num;
        c F2;
        this.t = null;
        this.u = true;
        this.O = -100;
        this.W = new b();
        this.f = context;
        this.i = dVar;
        this.e = obj;
        if (this.O == -100 && (obj instanceof Dialog) && (F2 = F()) != null) {
            this.O = F2.k().a();
        }
        if (this.O == -100 && (num = b0.get(this.e.getClass())) != null) {
            this.O = num.intValue();
            b0.remove(this.e.getClass());
        }
        if (window != null) {
            a(window);
        }
        androidx.appcompat.widget.j.c();
    }

    private void A() {
        if (this.g == null) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private l B() {
        if (this.T == null) {
            this.T = new k(this.f);
        }
        return this.T;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C() {
        /*
            r3 = this;
            r3.z()
            boolean r0 = r3.B
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.k r0 = new androidx.appcompat.app.k
            java.lang.Object r1 = r3.e
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.C
            r0.<init>(r1, r2)
        L_0x001d:
            r3.j = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.k r0 = new androidx.appcompat.app.k
            java.lang.Object r1 = r3.e
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.X
            r0.c(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.C():void");
    }

    private boolean D() {
        if (!this.R && (this.e instanceof Activity)) {
            PackageManager packageManager = this.f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f, this.e.getClass()), 0);
                this.Q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    private void E() {
        if (this.v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private c F() {
        for (Context context = this.f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof c) {
                return (c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void a(Window window) {
        if (this.g == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof j)) {
                j jVar = new j(callback);
                this.h = jVar;
                window.setCallback(jVar);
                w0 a2 = w0.a(this.f, (AttributeSet) null, d0);
                Drawable c2 = a2.c(0);
                if (c2 != null) {
                    window.setBackgroundDrawable(c2);
                }
                a2.a();
                this.g = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void a(o oVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!oVar.o && !this.N) {
            if (oVar.f472a == 0) {
                if ((this.f.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback q2 = q();
            if (q2 == null || q2.onMenuOpened(oVar.f472a, oVar.j)) {
                WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
                if (windowManager != null && b(oVar, keyEvent)) {
                    if (oVar.g == null || oVar.q) {
                        ViewGroup viewGroup = oVar.g;
                        if (viewGroup == null) {
                            if (!b(oVar) || oVar.g == null) {
                                return;
                            }
                        } else if (oVar.q && viewGroup.getChildCount() > 0) {
                            oVar.g.removeAllViews();
                        }
                        if (a(oVar) && oVar.a()) {
                            ViewGroup.LayoutParams layoutParams2 = oVar.h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            oVar.g.setBackgroundResource(oVar.f473b);
                            ViewParent parent = oVar.h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(oVar.h);
                            }
                            oVar.g.addView(oVar.h, layoutParams2);
                            if (!oVar.h.hasFocus()) {
                                oVar.h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = oVar.i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i2 = -1;
                            oVar.n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, oVar.d, oVar.e, SpassReprintModule.STATUS_HW_UNAVAILABLE, 8519680, -3);
                            layoutParams3.gravity = oVar.f474c;
                            layoutParams3.windowAnimations = oVar.f;
                            windowManager.addView(oVar.g, layoutParams3);
                            oVar.o = true;
                            return;
                        }
                    }
                    i2 = -2;
                    oVar.n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, oVar.d, oVar.e, SpassReprintModule.STATUS_HW_UNAVAILABLE, 8519680, -3);
                    layoutParams32.gravity = oVar.f474c;
                    layoutParams32.windowAnimations = oVar.f;
                    windowManager.addView(oVar.g, layoutParams32);
                    oVar.o = true;
                    return;
                }
                return;
            }
            a(oVar, true);
        }
    }

    private void a(androidx.appcompat.view.menu.g gVar, boolean z2) {
        c0 c0Var = this.m;
        if (c0Var == null || !c0Var.f() || (ViewConfiguration.get(this.f).hasPermanentMenuKey() && !this.m.c())) {
            o a2 = a(0, true);
            a2.q = true;
            a(a2, false);
            a(a2, (KeyEvent) null);
            return;
        }
        Window.Callback q2 = q();
        if (this.m.a() && z2) {
            this.m.d();
            if (!this.N) {
                q2.onPanelClosed(108, a(0, true).j);
            }
        } else if (q2 != null && !this.N) {
            if (this.U && (this.V & 1) != 0) {
                this.g.getDecorView().removeCallbacks(this.W);
                this.W.run();
            }
            o a3 = a(0, true);
            androidx.appcompat.view.menu.g gVar2 = a3.j;
            if (gVar2 != null && !a3.r && q2.onPreparePanel(0, a3.i, gVar2)) {
                q2.onMenuOpened(108, a3.j);
                this.m.e();
            }
        }
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || u.B((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean a(o oVar) {
        View view = oVar.i;
        if (view != null) {
            oVar.h = view;
            return true;
        } else if (oVar.j == null) {
            return false;
        } else {
            if (this.o == null) {
                this.o = new p();
            }
            View view2 = (View) oVar.a(this.o);
            oVar.h = view2;
            return view2 != null;
        }
    }

    private boolean a(o oVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.m || b(oVar, keyEvent)) && (gVar = oVar.j) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.m == null) {
            a(oVar, true);
        }
        return z2;
    }

    private boolean a(boolean z2) {
        if (this.N) {
            return false;
        }
        int w2 = w();
        boolean b2 = b(g(w2), z2);
        if (w2 == 0) {
            o().e();
        } else {
            l lVar = this.S;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (w2 == 3) {
            B().e();
        } else {
            l lVar2 = this.T;
            if (lVar2 != null) {
                lVar2.a();
            }
        }
        return b2;
    }

    private boolean b(int i2, boolean z2) {
        int i3 = this.f.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z3 = true;
        int i4 = i2 != 1 ? i2 != 2 ? i3 : 32 : 16;
        boolean D2 = D();
        boolean z4 = false;
        if ((f0 || i4 != i3) && !D2 && Build.VERSION.SDK_INT >= 17 && !this.K && (this.e instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i4;
            try {
                ((ContextThemeWrapper) this.e).applyOverrideConfiguration(configuration);
                z4 = true;
            } catch (IllegalStateException e2) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e2);
            }
        }
        int i5 = this.f.getResources().getConfiguration().uiMode & 48;
        if (!z4 && i5 != i4 && z2 && !D2 && this.K && (Build.VERSION.SDK_INT >= 17 || this.L)) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                androidx.core.app.a.b((Activity) obj);
                z4 = true;
            }
        }
        if (z4 || i5 == i4) {
            z3 = z4;
        } else {
            c(i4, D2);
        }
        if (z3) {
            Object obj2 = this.e;
            if (obj2 instanceof c) {
                ((c) obj2).b(i2);
            }
        }
        return z3;
    }

    private boolean b(o oVar) {
        oVar.a(n());
        oVar.g = new n(oVar.l);
        oVar.f474c = 81;
        return true;
    }

    private boolean b(o oVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.N) {
            return false;
        }
        if (oVar.m) {
            return true;
        }
        o oVar2 = this.I;
        if (!(oVar2 == null || oVar2 == oVar)) {
            a(oVar2, false);
        }
        Window.Callback q2 = q();
        if (q2 != null) {
            oVar.i = q2.onCreatePanelView(oVar.f472a);
        }
        int i2 = oVar.f472a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (c0Var3 = this.m) != null) {
            c0Var3.b();
        }
        if (oVar.i == null) {
            if (z2) {
                t();
            }
            if (oVar.j == null || oVar.r) {
                if (oVar.j == null && (!c(oVar) || oVar.j == null)) {
                    return false;
                }
                if (z2 && this.m != null) {
                    if (this.n == null) {
                        this.n = new h();
                    }
                    this.m.a(oVar.j, this.n);
                }
                oVar.j.s();
                if (!q2.onCreatePanelMenu(oVar.f472a, oVar.j)) {
                    oVar.a((androidx.appcompat.view.menu.g) null);
                    if (z2 && (c0Var2 = this.m) != null) {
                        c0Var2.a(null, this.n);
                    }
                    return false;
                }
                oVar.r = false;
            }
            oVar.j.s();
            Bundle bundle = oVar.s;
            if (bundle != null) {
                oVar.j.a(bundle);
                oVar.s = null;
            }
            if (!q2.onPreparePanel(0, oVar.i, oVar.j)) {
                if (z2 && (c0Var = this.m) != null) {
                    c0Var.a(null, this.n);
                }
                oVar.j.r();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.p = z3;
            oVar.j.setQwertyMode(z3);
            oVar.j.r();
        }
        oVar.m = true;
        oVar.n = false;
        this.I = oVar;
        return true;
    }

    private void c(int i2, boolean z2) {
        Resources resources = this.f.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i2 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, null);
        if (Build.VERSION.SDK_INT < 26) {
            h.a(resources);
        }
        int i3 = this.P;
        if (i3 != 0) {
            this.f.setTheme(i3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f.getTheme().applyStyle(this.P, true);
            }
        }
        if (z2) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.h) {
                    if (!((androidx.lifecycle.h) activity).a().a().a(e.b.STARTED)) {
                        return;
                    }
                } else if (!this.M) {
                    return;
                }
                activity.onConfigurationChanged(configuration);
            }
        }
    }

    private boolean c(o oVar) {
        Context context = this.f;
        int i2 = oVar.f472a;
        if ((i2 == 0 || i2 == 108) && this.m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(a.a.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                a.a.n.d dVar = new a.a.n.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.a(this);
        oVar.a(gVar);
        return true;
    }

    private boolean d(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        o a2 = a(i2, true);
        if (!a2.o) {
            return b(a2, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e(int r4, android.view.KeyEvent r5) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.e(int, android.view.KeyEvent):boolean");
    }

    private void k(int i2) {
        this.V = (1 << i2) | this.V;
        if (!this.U) {
            u.a(this.g.getDecorView(), this.W);
            this.U = true;
        }
    }

    private int l(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private void v() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.w.findViewById(16908290);
        View decorView = this.g.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f.obtainStyledAttributes(a.a.j.AppCompatTheme);
        obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private int w() {
        int i2 = this.O;
        return i2 != -100 ? i2 : e.j();
    }

    private void x() {
        l lVar = this.S;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.T;
        if (lVar2 != null) {
            lVar2.a();
        }
    }

    private ViewGroup y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f.obtainStyledAttributes(a.a.j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowNoTitle, false)) {
                b(1);
            } else if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionBar, false)) {
                b(108);
            }
            if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
                b(109);
            }
            if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
                b(10);
            }
            this.E = obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            A();
            this.g.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f);
            if (this.F) {
                viewGroup = (ViewGroup) from.inflate(this.D ? a.a.g.abc_screen_simple_overlay_action_mode : a.a.g.abc_screen_simple, (ViewGroup) null);
                if (Build.VERSION.SDK_INT >= 21) {
                    u.a(viewGroup, new c());
                } else {
                    ((g0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
            } else if (this.E) {
                viewGroup = (ViewGroup) from.inflate(a.a.g.abc_dialog_title_material, (ViewGroup) null);
                this.C = false;
                this.B = false;
            } else if (this.B) {
                TypedValue typedValue = new TypedValue();
                this.f.getTheme().resolveAttribute(a.a.a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new a.a.n.d(this.f, typedValue.resourceId) : this.f).inflate(a.a.g.abc_screen_toolbar, (ViewGroup) null);
                c0 c0Var = (c0) viewGroup.findViewById(a.a.f.decor_content_parent);
                this.m = c0Var;
                c0Var.setWindowCallback(q());
                if (this.C) {
                    this.m.a(109);
                }
                if (this.z) {
                    this.m.a(2);
                }
                if (this.A) {
                    this.m.a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.m == null) {
                    this.x = (TextView) viewGroup.findViewById(a.a.f.title);
                }
                c1.b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.a.f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.g.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.g.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void z() {
        if (!this.v) {
            this.w = y();
            CharSequence p2 = p();
            if (!TextUtils.isEmpty(p2)) {
                c0 c0Var = this.m;
                if (c0Var != null) {
                    c0Var.setWindowTitle(p2);
                } else if (t() != null) {
                    t().a(p2);
                } else {
                    TextView textView = this.x;
                    if (textView != null) {
                        textView.setText(p2);
                    }
                }
            }
            v();
            a(this.w);
            this.v = true;
            o a2 = a(0, false);
            if (this.N) {
                return;
            }
            if (a2 == null || a2.j == null) {
                k(108);
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public int a() {
        return this.O;
    }

    public a.a.n.b a(b.a aVar) {
        d dVar;
        if (aVar != null) {
            a.a.n.b bVar = this.p;
            if (bVar != null) {
                bVar.a();
            }
            i iVar = new i(aVar);
            a c2 = c();
            if (c2 != null) {
                a.a.n.b a2 = c2.a(iVar);
                this.p = a2;
                if (!(a2 == null || (dVar = this.i) == null)) {
                    dVar.a(a2);
                }
            }
            if (this.p == null) {
                this.p = b(iVar);
            }
            return this.p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // androidx.appcompat.app.e
    public <T extends View> T a(int i2) {
        z();
        return (T) this.g.findViewById(i2);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        AppCompatViewInflater appCompatViewInflater;
        boolean z3 = false;
        if (this.a0 == null) {
            String string = this.f.obtainStyledAttributes(a.a.j.AppCompatTheme).getString(a.a.j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.a0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.a0 = appCompatViewInflater;
        }
        if (c0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z3 = a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        return this.a0.createView(view, str, context, attributeSet, z2, c0, true, b1.b());
    }

    /* access modifiers changed from: protected */
    public o a(int i2, boolean z2) {
        o[] oVarArr = this.H;
        if (oVarArr == null || oVarArr.length <= i2) {
            o[] oVarArr2 = new o[(i2 + 1)];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.H = oVarArr2;
            oVarArr = oVarArr2;
        }
        o oVar = oVarArr[i2];
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(i2);
        oVarArr[i2] = oVar2;
        return oVar2;
    }

    /* access modifiers changed from: package-private */
    public o a(Menu menu) {
        o[] oVarArr = this.H;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            o oVar = oVarArr[i2];
            if (oVar != null && oVar.j == menu) {
                return oVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i2 >= 0) {
                o[] oVarArr = this.H;
                if (i2 < oVarArr.length) {
                    oVar = oVarArr[i2];
                }
            }
            if (oVar != null) {
                menu = oVar.j;
            }
        }
        if ((oVar == null || oVar.o) && !this.N) {
            this.h.a().onPanelClosed(i2, menu);
        }
    }

    @Override // androidx.appcompat.app.e
    public void a(Context context) {
        a(false);
        this.K = true;
    }

    @Override // androidx.appcompat.app.e
    public void a(Configuration configuration) {
        a c2;
        if (this.B && this.v && (c2 = c()) != null) {
            c2.a(configuration);
        }
        androidx.appcompat.widget.j.b().a(this.f);
        a(false);
    }

    @Override // androidx.appcompat.app.e
    public void a(Bundle bundle) {
        this.K = true;
        a(false);
        A();
        Object obj = this.e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.f.b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a t2 = t();
                if (t2 == null) {
                    this.X = true;
                } else {
                    t2.c(true);
                }
            }
        }
        this.L = true;
    }

    @Override // androidx.appcompat.app.e
    public void a(View view) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ((ViewGroup) this.w.findViewById(16908290)).addView(view, layoutParams);
        this.h.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    public void a(o oVar, boolean z2) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (!z2 || oVar.f472a != 0 || (c0Var = this.m) == null || !c0Var.a()) {
            WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
            if (!(windowManager == null || !oVar.o || (viewGroup = oVar.g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    a(oVar.f472a, oVar, null);
                }
            }
            oVar.m = false;
            oVar.n = false;
            oVar.o = false;
            oVar.h = null;
            oVar.q = true;
            if (this.I == oVar) {
                this.I = null;
                return;
            }
            return;
        }
        b(oVar.j);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void a(androidx.appcompat.view.menu.g gVar) {
        a(gVar, true);
    }

    @Override // androidx.appcompat.app.e
    public final void a(CharSequence charSequence) {
        this.l = charSequence;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (t() != null) {
            t().a(charSequence);
        } else {
            TextView textView = this.x;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, KeyEvent keyEvent) {
        boolean z2 = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.J = z2;
        } else if (i2 == 82) {
            d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean a(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.e;
        boolean z2 = true;
        if (((obj instanceof e.a) || (obj instanceof g)) && (decorView = this.g.getDecorView()) != null && a.g.l.e.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.h.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z2 = false;
        }
        return z2 ? a(keyCode, keyEvent) : c(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        o a2;
        Window.Callback q2 = q();
        if (q2 == null || this.N || (a2 = a((Menu) gVar.m())) == null) {
            return false;
        }
        return q2.onMenuItemSelected(a2.f472a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a.a.n.b b(a.a.n.b.a r8) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.b(a.a.n.b$a):a.a.n.b");
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater b() {
        if (this.k == null) {
            C();
            a aVar = this.j;
            this.k = new a.a.n.g(aVar != null ? aVar.h() : this.f);
        }
        return this.k;
    }

    @Override // androidx.appcompat.app.e
    public void b(Bundle bundle) {
        z();
    }

    @Override // androidx.appcompat.app.e
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.h.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public void b(androidx.appcompat.view.menu.g gVar) {
        if (!this.G) {
            this.G = true;
            this.m.g();
            Window.Callback q2 = q();
            if (q2 != null && !this.N) {
                q2.onPanelClosed(108, gVar);
            }
            this.G = false;
        }
    }

    @Override // androidx.appcompat.app.e
    public boolean b(int i2) {
        int l2 = l(i2);
        if (this.F && l2 == 108) {
            return false;
        }
        if (this.B && l2 == 1) {
            this.B = false;
        }
        if (l2 == 1) {
            E();
            this.F = true;
            return true;
        } else if (l2 == 2) {
            E();
            this.z = true;
            return true;
        } else if (l2 == 5) {
            E();
            this.A = true;
            return true;
        } else if (l2 == 10) {
            E();
            this.D = true;
            return true;
        } else if (l2 == 108) {
            E();
            this.B = true;
            return true;
        } else if (l2 != 109) {
            return this.g.requestFeature(l2);
        } else {
            E();
            this.C = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2, KeyEvent keyEvent) {
        a c2 = c();
        if (c2 != null && c2.a(i2, keyEvent)) {
            return true;
        }
        o oVar = this.I;
        if (oVar == null || !a(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.I == null) {
                o a2 = a(0, true);
                b(a2, keyEvent);
                boolean a3 = a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        o oVar2 = this.I;
        if (oVar2 != null) {
            oVar2.n = true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.e
    public a c() {
        C();
        return this.j;
    }

    @Override // androidx.appcompat.app.e
    public void c(int i2) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f).inflate(i2, viewGroup);
        this.h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void c(Bundle bundle) {
        if (this.O != -100) {
            b0.put(this.e.getClass(), Integer.valueOf(this.O));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.J;
            this.J = false;
            o a2 = a(0, false);
            if (a2 != null && a2.o) {
                if (!z2) {
                    a(a2, true);
                }
                return true;
            } else if (s()) {
                return true;
            }
        } else if (i2 == 82) {
            e(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void d() {
        LayoutInflater from = LayoutInflater.from(this.f);
        if (from.getFactory() == null) {
            a.g.l.f.b(from, this);
        } else if (!(from.getFactory2() instanceof f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.e
    public void d(int i2) {
        this.P = i2;
    }

    @Override // androidx.appcompat.app.e
    public void e() {
        a c2 = c();
        if (c2 == null || !c2.j()) {
            k(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int i2) {
        a(a(i2, true), true);
    }

    @Override // androidx.appcompat.app.e
    public void f() {
        e.b(this);
        if (this.U) {
            this.g.getDecorView().removeCallbacks(this.W);
        }
        this.M = false;
        this.N = true;
        a aVar = this.j;
        if (aVar != null) {
            aVar.k();
        }
        x();
    }

    /* access modifiers changed from: package-private */
    public void f(int i2) {
        o a2;
        o a3 = a(i2, true);
        if (a3.j != null) {
            Bundle bundle = new Bundle();
            a3.j.b(bundle);
            if (bundle.size() > 0) {
                a3.s = bundle;
            }
            a3.j.s();
            a3.j.clear();
        }
        a3.r = true;
        a3.q = true;
        if ((i2 == 108 || i2 == 0) && this.m != null && (a2 = a(0, false)) != null) {
            a2.m = false;
            b(a2, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public int g(int i2) {
        l o2;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        o2 = B();
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                o2 = o();
            }
            return o2.c();
        }
        return i2;
    }

    @Override // androidx.appcompat.app.e
    public void g() {
        a c2 = c();
        if (c2 != null) {
            c2.d(true);
        }
    }

    @Override // androidx.appcompat.app.e
    public void h() {
        this.M = true;
        k();
        e.a(this);
    }

    /* access modifiers changed from: package-private */
    public void h(int i2) {
        a c2;
        if (i2 == 108 && (c2 = c()) != null) {
            c2.b(true);
        }
    }

    @Override // androidx.appcompat.app.e
    public void i() {
        this.M = false;
        e.b(this);
        a c2 = c();
        if (c2 != null) {
            c2.d(false);
        }
        if (this.e instanceof Dialog) {
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public void i(int i2) {
        if (i2 == 108) {
            a c2 = c();
            if (c2 != null) {
                c2.b(false);
            }
        } else if (i2 == 0) {
            o a2 = a(i2, true);
            if (a2.o) {
                a(a2, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int j(int i2) {
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.q;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            boolean z4 = true;
            if (this.q.isShown()) {
                if (this.Y == null) {
                    this.Y = new Rect();
                    this.Z = new Rect();
                }
                Rect rect = this.Y;
                Rect rect2 = this.Z;
                rect.set(0, i2, 0, 0);
                c1.a(this.w, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.y;
                    if (view == null) {
                        View view2 = new View(this.f);
                        this.y = view2;
                        view2.setBackgroundColor(this.f.getResources().getColor(a.a.c.abc_input_method_navigation_guard));
                        this.w.addView(this.y, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.y.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.y == null) {
                    z4 = false;
                }
                if (!this.D && z4) {
                    i2 = 0;
                }
                z4 = z3;
                z2 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.q.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.y;
        if (view3 != null) {
            if (!z2) {
                i3 = 8;
            }
            view3.setVisibility(i3);
        }
        return i2;
    }

    public boolean k() {
        return a(true);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        androidx.appcompat.view.menu.g gVar;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.g();
        }
        if (this.r != null) {
            this.g.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.r = null;
        }
        m();
        o a2 = a(0, false);
        if (a2 != null && (gVar = a2.j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        y yVar = this.t;
        if (yVar != null) {
            yVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final Context n() {
        a c2 = c();
        Context h2 = c2 != null ? c2.h() : null;
        return h2 == null ? this.f : h2;
    }

    /* access modifiers changed from: package-private */
    public final l o() {
        if (this.S == null) {
            this.S = new m(j.a(this.f));
        }
        return this.S;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public final CharSequence p() {
        Object obj = this.e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.l;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback q() {
        return this.g.getCallback();
    }

    public boolean r() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        a.a.n.b bVar = this.p;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        a c2 = c();
        return c2 != null && c2.f();
    }

    /* access modifiers changed from: package-private */
    public final a t() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && u.C(viewGroup);
    }
}
