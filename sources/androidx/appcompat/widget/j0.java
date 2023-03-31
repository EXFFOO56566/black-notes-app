package androidx.appcompat.widget;

import a.a.j;
import a.g.l.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import androidx.core.widget.h;
import com.github.ajalt.reprint.module.spass.SpassReprintModule;
import java.lang.reflect.Method;

public class j0 implements p {
    private static Method G;
    private static Method H;
    private static Method I;
    private final c A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* renamed from: b  reason: collision with root package name */
    private Context f647b;

    /* renamed from: c  reason: collision with root package name */
    private ListAdapter f648c;
    f0 d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    int p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    final g x;
    private final f y;
    private final e z;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            View f = j0.this.f();
            if (f != null && f.getWindowToken() != null) {
                j0.this.P();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            f0 f0Var;
            if (i != -1 && (f0Var = j0.this.d) != null) {
                f0Var.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public class c implements Runnable {
        c() {
        }

        public void run() {
            j0.this.e();
        }
    }

    /* access modifiers changed from: private */
    public class d extends DataSetObserver {
        d() {
        }

        public void onChanged() {
            if (j0.this.Q()) {
                j0.this.P();
            }
        }

        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !j0.this.h() && j0.this.F.getContentView() != null) {
                j0 j0Var = j0.this;
                j0Var.B.removeCallbacks(j0Var.x);
                j0.this.x.run();
            }
        }
    }

    /* access modifiers changed from: private */
    public class f implements View.OnTouchListener {
        f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.F) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.F.getWidth() && y >= 0 && y < j0.this.F.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.B.postDelayed(j0Var.x, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                j0 j0Var2 = j0.this;
                j0Var2.B.removeCallbacks(j0Var2.x);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    public class g implements Runnable {
        g() {
        }

        public void run() {
            f0 f0Var = j0.this.d;
            if (f0Var != null && u.B(f0Var) && j0.this.d.getCount() > j0.this.d.getChildCount()) {
                int childCount = j0.this.d.getChildCount();
                j0 j0Var = j0.this;
                if (childCount <= j0Var.p) {
                    j0Var.F.setInputMethodMode(2);
                    j0.this.P();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.e = -2;
        this.f = -2;
        this.i = SpassReprintModule.STATUS_HW_UNAVAILABLE;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.r = 0;
        this.x = new g();
        this.y = new f();
        this.z = new e();
        this.A = new c();
        this.C = new Rect();
        this.f647b = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ListPopupWindow, i2, i3);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i2, i3);
        this.F = qVar;
        qVar.setInputMethodMode(1);
    }

    private int a(View view, int i2, boolean z2) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.F.getMaxAvailableHeight(view, i2, z2);
        }
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, view, Integer.valueOf(i2), Boolean.valueOf(z2))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i2);
    }

    private void c(boolean z2) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = G;
            if (method != null) {
                try {
                    method.invoke(this.F, Boolean.valueOf(z2));
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.F.setIsClippedToScreen(z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int j() {
        /*
        // Method dump skipped, instructions count: 354
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.j():int");
    }

    private void k() {
        View view = this.q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void P() {
        int j2 = j();
        boolean h2 = h();
        h.a(this.F, this.i);
        boolean z2 = true;
        if (!this.F.isShowing()) {
            int i2 = this.f;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = f().getWidth();
            }
            int i3 = this.e;
            if (i3 == -1) {
                j2 = -1;
            } else if (i3 != -2) {
                j2 = i3;
            }
            this.F.setWidth(i2);
            this.F.setHeight(j2);
            c(true);
            this.F.setOutsideTouchable(!this.o && !this.n);
            this.F.setTouchInterceptor(this.y);
            if (this.l) {
                h.a(this.F, this.k);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = I;
                if (method != null) {
                    try {
                        method.invoke(this.F, this.D);
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.F.setEpicenterBounds(this.D);
            }
            h.a(this.F, f(), this.g, this.h, this.m);
            this.d.setSelection(-1);
            if (!this.E || this.d.isInTouchMode()) {
                e();
            }
            if (!this.E) {
                this.B.post(this.A);
            }
        } else if (u.B(f())) {
            int i4 = this.f;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = f().getWidth();
            }
            int i5 = this.e;
            if (i5 == -1) {
                if (!h2) {
                    j2 = -1;
                }
                if (h2) {
                    this.F.setWidth(this.f == -1 ? -1 : 0);
                    this.F.setHeight(0);
                } else {
                    this.F.setWidth(this.f == -1 ? -1 : 0);
                    this.F.setHeight(-1);
                }
            } else if (i5 != -2) {
                j2 = i5;
            }
            PopupWindow popupWindow = this.F;
            if (this.o || this.n) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.F.update(f(), this.g, this.h, i4 < 0 ? -1 : i4, j2 < 0 ? -1 : j2);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean Q() {
        return this.F.isShowing();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView R() {
        return this.d;
    }

    public int a() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public f0 a(Context context, boolean z2) {
        return new f0(context, z2);
    }

    public void a(int i2) {
        this.h = i2;
        this.j = true;
    }

    public void a(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void a(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void a(View view) {
        this.t = view;
    }

    public void a(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new d();
        } else {
            ListAdapter listAdapter2 = this.f648c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f648c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.setAdapter(this.f648c);
        }
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void a(boolean z2) {
        this.E = z2;
        this.F.setFocusable(z2);
    }

    public Drawable b() {
        return this.F.getBackground();
    }

    public void b(boolean z2) {
        this.l = true;
        this.k = z2;
    }

    public int c() {
        if (!this.j) {
            return 0;
        }
        return this.h;
    }

    public void c(int i2) {
        this.g = i2;
    }

    public void d(int i2) {
        this.F.setAnimationStyle(i2);
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.F.dismiss();
        k();
        this.F.setContentView(null);
        this.d = null;
        this.B.removeCallbacks(this.x);
    }

    public void e() {
        f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    public void e(int i2) {
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            this.f = rect.left + rect.right + i2;
            return;
        }
        j(i2);
    }

    public View f() {
        return this.t;
    }

    public void f(int i2) {
        this.m = i2;
    }

    public int g() {
        return this.f;
    }

    public void g(int i2) {
        this.F.setInputMethodMode(i2);
    }

    public void h(int i2) {
        this.r = i2;
    }

    public boolean h() {
        return this.F.getInputMethodMode() == 2;
    }

    public void i(int i2) {
        f0 f0Var = this.d;
        if (Q() && f0Var != null) {
            f0Var.setListSelectionHidden(false);
            f0Var.setSelection(i2);
            if (f0Var.getChoiceMode() != 0) {
                f0Var.setItemChecked(i2, true);
            }
        }
    }

    public boolean i() {
        return this.E;
    }

    public void j(int i2) {
        this.f = i2;
    }
}
