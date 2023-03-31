package a.g.l;

import a.g.l.a;
import a.g.l.d0.c;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private static Field f235a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f236b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f237c;
    private static boolean d;
    private static WeakHashMap<View, String> e;
    private static WeakHashMap<View, y> f = null;
    private static Field g;
    private static boolean h = false;
    private static ThreadLocal<Rect> i;

    static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f238a;

        a(r rVar) {
            this.f238a = rVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) c0.a(this.f238a.a(view, c0.a(windowInsets)));
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends f<Boolean> {
        b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        @Override // a.g.l.u.f
        public Boolean a(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: package-private */
        public void a(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean a(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends f<CharSequence> {
        c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        @Override // a.g.l.u.f
        public CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: package-private */
        public void a(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends f<Boolean> {
        d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        @Override // a.g.l.u.f
        public Boolean a(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: package-private */
        public void a(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean a(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f239b = new WeakHashMap<>();

        e() {
        }

        private void a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    u.c(view, 16);
                }
                this.f239b.put(view, Boolean.valueOf(z2));
            }
        }

        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.f239b.entrySet()) {
                a(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            a(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f240a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f241b;

        /* renamed from: c  reason: collision with root package name */
        private final int f242c;

        f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        f(int i, Class<T> cls, int i2, int i3) {
            this.f240a = i;
            this.f241b = cls;
            this.f242c = i3;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f242c;
        }

        /* access modifiers changed from: package-private */
        public abstract T a(View view);

        /* access modifiers changed from: package-private */
        public abstract void a(View view, T t);

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(T t, T t2);

        /* access modifiers changed from: package-private */
        public T b(View view) {
            if (b()) {
                return a(view);
            }
            if (!a()) {
                return null;
            }
            T t = (T) view.getTag(this.f240a);
            if (this.f241b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void b(View view, T t) {
            if (b()) {
                a(view, (Object) t);
            } else if (a() && a((Object) b(view), (Object) t)) {
                u.r(view);
                view.setTag(this.f240a, t);
                u.c(view, 0);
            }
        }
    }

    public interface g {
        boolean a(View view, KeyEvent keyEvent);
    }

    static class h {
        private static final ArrayList<WeakReference<View>> d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f243a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f244b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f245c = null;

        h() {
        }

        static h a(View view) {
            h hVar = (h) view.getTag(a.g.b.tag_unhandled_key_event_manager);
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h();
            view.setTag(a.g.b.tag_unhandled_key_event_manager, hVar2);
            return hVar2;
        }

        private SparseArray<WeakReference<View>> a() {
            if (this.f244b == null) {
                this.f244b = new SparseArray<>();
            }
            return this.f244b;
        }

        private View b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f243a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b2 = b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                if (c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private void b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f243a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!d.isEmpty()) {
                synchronized (d) {
                    if (this.f243a == null) {
                        this.f243a = new WeakHashMap<>();
                    }
                    for (int size = d.size() - 1; size >= 0; size--) {
                        View view = d.get(size).get();
                        if (view == null) {
                            d.remove(size);
                        } else {
                            this.f243a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f243a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        private boolean c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.g.b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((g) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f245c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f245c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> a2 = a();
            if (keyEvent.getAction() == 1 && (indexOfKey = a2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = a2.valueAt(indexOfKey);
                a2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = a2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && u.B(view)) {
                c(view, keyEvent);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                b();
            }
            View b2 = b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    a().put(keyCode, new WeakReference<>(b2));
                }
            }
            return b2 != null;
        }
    }

    static {
        new AtomicInteger(1);
        new e();
    }

    public static boolean A(View view) {
        Boolean b2 = a().b(view);
        if (b2 == null) {
            return false;
        }
        return b2.booleanValue();
    }

    public static boolean B(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    public static boolean C(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean D(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof l) {
            return ((l) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean E(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean F(View view) {
        Boolean b2 = d().b(view);
        if (b2 == null) {
            return false;
        }
        return b2.booleanValue();
    }

    public static void G(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void H(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static void I(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof l) {
            ((l) view).stopNestedScroll();
        }
    }

    private static void J(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static c0 a(View view, c0 c0Var) {
        if (Build.VERSION.SDK_INT < 21) {
            return c0Var;
        }
        WindowInsets windowInsets = (WindowInsets) c0.a(c0Var);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return c0.a(windowInsets);
    }

    private static f<Boolean> a() {
        return new d(a.g.b.tag_accessibility_heading, Boolean.class, 28);
    }

    public static y a(View view) {
        if (f == null) {
            f = new WeakHashMap<>();
        }
        y yVar = f.get(view);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(view);
        f.put(view, yVar2);
        return yVar2;
    }

    private static void a(int i2, View view) {
        List<c.a> f2 = f(view);
        for (int i3 = 0; i3 < f2.size(); i3++) {
            if (f2.get(i3).a() == i2) {
                f2.remove(i3);
                return;
            }
        }
    }

    public static void a(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    private static void a(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            J(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                J((View) parent);
            }
        }
    }

    public static void a(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static void a(View view, a aVar) {
        if (aVar == null && (c(view) instanceof a.C0016a)) {
            aVar = new a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.a());
    }

    private static void a(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            r(view);
            a(aVar.a(), view);
            f(view).add(aVar);
            c(view, 0);
        }
    }

    public static void a(View view, c.a aVar, CharSequence charSequence, a.g.l.d0.f fVar) {
        a(view, aVar.a(charSequence, fVar));
    }

    public static void a(View view, a.g.l.d0.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.u());
    }

    public static void a(View view, r rVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (rVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(rVar));
        }
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof t) {
            ((t) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof t) {
            ((t) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    public static void a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (e == null) {
            e = new WeakHashMap<>();
        }
        e.put(view, str);
    }

    public static void a(View view, boolean z) {
        a().b(view, Boolean.valueOf(z));
    }

    public static boolean a(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).a(view, keyEvent);
    }

    public static a b(View view) {
        View.AccessibilityDelegate c2 = c(view);
        if (c2 == null) {
            return null;
        }
        return c2 instanceof a.C0016a ? ((a.C0016a) c2).f202a : new a(c2);
    }

    private static Rect b() {
        if (i == null) {
            i = new ThreadLocal<>();
        }
        Rect rect = i.get();
        if (rect == null) {
            rect = new Rect();
            i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    private static void b(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            J(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                J((View) parent);
            }
        }
    }

    public static void b(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).a(keyEvent);
    }

    private static f<CharSequence> c() {
        return new c(a.g.b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    private static View.AccessibilityDelegate c(View view) {
        if (h) {
            return null;
        }
        if (g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                h = true;
                return null;
            }
        }
        try {
            Object obj = g.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            h = true;
            return null;
        }
    }

    static void c(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = e(view) != null;
            if (d(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static int d(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    private static f<Boolean> d() {
        return new b(a.g.b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static void d(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 >= 21) {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            a(view, i2);
            if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b2);
            }
        } else {
            a(view, i2);
        }
    }

    public static CharSequence e(View view) {
        return c().b(view);
    }

    public static void e(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 >= 21) {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            b(view, i2);
            if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b2);
            }
        } else {
            b(view, i2);
        }
    }

    private static List<c.a> f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(a.g.b.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(a.g.b.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void f(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            a(i2, view);
            c(view, 0);
        }
    }

    public static ColorStateList g(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof t) {
            return ((t) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void g(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    public static PorterDuff.Mode h(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof t) {
            return ((t) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void h(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 19) {
            if (i3 < 16) {
                return;
            }
            if (i2 == 4) {
                i2 = 2;
            }
        }
        view.setImportantForAccessibility(i2);
    }

    public static Rect i(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static void i(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    public static Display j(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (B(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static float k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static boolean l(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static int m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    public static int n(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f237c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            d = true;
        }
        Field field = f237c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f236b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f235a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f236b = true;
        }
        Field field = f235a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    static a r(View view) {
        a b2 = b(view);
        if (b2 == null) {
            b2 = new a();
        }
        a(view, b2);
        return b2;
    }

    public static int s(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    public static int t(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    public static String u(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static float w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean x(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }
}
