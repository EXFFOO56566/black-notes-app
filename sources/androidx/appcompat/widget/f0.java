package androidx.appcompat.widget;

import a.a.l.a.c;
import a.g.l.y;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.f;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public class f0 extends ListView {

    /* renamed from: b  reason: collision with root package name */
    private final Rect f622b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private int f623c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g;
    private Field h;
    private a i;
    private boolean j;
    private boolean k;
    private boolean l;
    private y m;
    private f n;
    b o;

    /* access modifiers changed from: private */
    public static class a extends c {

        /* renamed from: c  reason: collision with root package name */
        private boolean f624c = true;

        a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            this.f624c = z;
        }

        @Override // a.a.l.a.c
        public void draw(Canvas canvas) {
            if (this.f624c) {
                super.draw(canvas);
            }
        }

        @Override // a.a.l.a.c
        public void setHotspot(float f, float f2) {
            if (this.f624c) {
                super.setHotspot(f, f2);
            }
        }

        @Override // a.a.l.a.c
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f624c) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // a.a.l.a.c
        public boolean setState(int[] iArr) {
            if (this.f624c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // a.a.l.a.c
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f624c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        b() {
        }

        public void a() {
            f0 f0Var = f0.this;
            f0Var.o = null;
            f0Var.removeCallbacks(this);
        }

        public void b() {
            f0.this.post(this);
        }

        public void run() {
            f0 f0Var = f0.this;
            f0Var.o = null;
            f0Var.drawableStateChanged();
        }
    }

    f0(Context context, boolean z) {
        super(context, null, a.a.a.dropDownListViewStyle);
        this.k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void a() {
        this.l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        y yVar = this.m;
        if (yVar != null) {
            yVar.a();
            this.m = null;
        }
    }

    private void a(int i2, View view) {
        Rect rect = this.f622b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f623c;
        rect.top -= this.d;
        rect.right += this.e;
        rect.bottom += this.f;
        try {
            boolean z = this.h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.h.set(this, Boolean.valueOf(!z));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void a(int i2, View view, float f2, float f3) {
        b(i2, view);
        Drawable selector = getSelector();
        if (selector != null && i2 != -1) {
            androidx.core.graphics.drawable.a.a(selector, f2, f3);
        }
    }

    private void a(Canvas canvas) {
        Drawable selector;
        if (!this.f622b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f622b);
            selector.draw(canvas);
        }
    }

    private void a(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void a(View view, int i2, float f2, float f3) {
        View childAt;
        this.l = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.g;
        if (!(i3 == -1 || (childAt = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.g = i2;
        float left = f2 - ((float) view.getLeft());
        float top = f3 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        a(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private void b(int i2, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i2 == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        a(i2, view);
        if (z2) {
            Rect rect = this.f622b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            androidx.core.graphics.drawable.a.a(selector, exactCenterX, exactCenterY);
        }
    }

    private boolean b() {
        return this.l;
    }

    private void c() {
        Drawable selector = getSelector();
        if (selector != null && b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i7 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i7;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i2, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i5) {
                return (i6 < 0 || i8 <= i6 || i10 <= 0 || i7 == i5) ? i5 : i10;
            }
            if (i6 >= 0 && i8 >= i6) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MotionEvent r8, int r9) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.a(android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.o == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    public boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.k && this.j) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.o = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.o == null) {
            b bVar = new b();
            this.o = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.o;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f623c = rect.left;
        this.d = rect.top;
        this.e = rect.right;
        this.f = rect.bottom;
    }
}
